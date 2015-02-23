/*jslint node: true, stupid: true, nomen: true */
/*globals Promise */
/*jshint node: true */
/*eslint-env node */
/*eslint quotes: [2, "single"] */

'use strict';

function LRU(max) {
    this.cache = [].constructor(max);
    this.index = [].constructor(max);
    this.max = max;
}

LRU.prototype.set = function (key, value) {
    var idx = this.index.indexOf(key);
    if (idx === 0) {
        this.cache[0] = value;
        return value;
    }
    if (idx > 0) {
        this.index.splice(idx, 1);
        this.cache.splice(idx, 1);
    }
    this.index.unshift(key);
    this.cache.unshift(value);
    this.index = this.index.slice(0, this.max);
    this.cache = this.cache.slice(0, this.max);
    return value;
};

LRU.prototype.get = function (key, orElse) {
    var value = this.cache[this.index.indexOf(key)];
    if (value === undefined) {
        if (orElse) {
            return this.set(key, orElse.call ? orElse(key) : orElse);
        }
    } else {
        return this.set(key, value);
    }
};

// client

function RemoteBuffer(ws, name, length, options) {
    this.ws = ws;
    this.name = name;
    this.length = length;
    this.cache = new LRU(options.cacheSize || 10);
    this.notFound = options.notFound || 'x';
    this.pageSize = options.pageSize || 8 * 1024;
    this.pages = Math.round(length / this.pageSize);
    this.pageRequests = {};
    this.missingPage = [].constructor(this.pageSize + 1).join(this.notFound);
}

RemoteBuffer.prototype.onpage = function (message) {
    this.cache.set(message.page, message.content);
    this.pageRequests[message.page].forEach(function (callback) {
        callback();
    });
    delete this.pageRequests[message.page];
};

RemoteBuffer.prototype.request = function (message) {
    var data = JSON.stringify(message);
    console.log('client buffer request:', data);
    this.ws.send(data);
};

RemoteBuffer.prototype.pageIndex = function (index) {
    return Math.floor(index / this.pageSize);
};

RemoteBuffer.prototype.pageAt = function (index, callback) {
    var pageIndex = this.pageIndex(index),
        page = this.cache.get(pageIndex),
        requests = this.pageRequests[pageIndex];
    if (!page) {
        if (!requests) {
            this.pageRequests[pageIndex] = callback ? [callback] : [];
            this.request({type: 'page', name: this.name, scope: 'buffer',
                          page: pageIndex, pageSize: this.pageSize});

        } else if (callback) {
            requests.push(callback);
        }
    } else if (callback) {
        callback();
    }
    return page || this.missingPage;
};

RemoteBuffer.prototype.charAt = function (index, callback) {
    if (index < 0 || index >= this.length) {
        return '';
    }
    var that = this,
        page = this.pageAt(index, callback && function () { callback(that.charAt(index)); });
    return page[index - this.pageIndex(index) * this.pageSize];
};


RemoteBuffer.prototype.charAtAsync = function (index) {
    return new Promise(this.charAt.bind(this, index));
};

RemoteBuffer.prototype.slice = function (beginSlice, endSlice, callback) {
    beginSlice = beginSlice || 0;
    if (beginSlice < 0) {
        return '';
    }
    endSlice = endSlice === undefined ? this.length : endSlice;
    if (endSlice < 0) {
        endSlice += this.length;
    }
    endSlice = Math.min(endSlice, this.length);
    var i, s = '', that = this,
        lastPageCallback = function (index) {
            return that.pageIndex(index) === that.pageIndex(endSlice - 1) && callback && function () {
                callback(that.slice(beginSlice, endSlice));
            };
        },
        firstPageSize = this.pageSize - beginSlice % this.pageSize;
    s = this.pageAt(beginSlice, lastPageCallback(beginSlice)).slice(this.pageSize - firstPageSize);
    for (i = beginSlice + s.length; i < endSlice + this.pageSize % endSlice; i += this.pageSize) {
        s += this.pageAt(i, lastPageCallback(i));
    }
    return s.slice(0, endSlice - beginSlice);
};

RemoteBuffer.prototype.sliceAsync = function (beginSlice, endSlice) {
    return new Promise(this.slice.bind(this, beginSlice, endSlice));
};

var WebSocket = require('ws');
var Rope = require('./rope').Rope;
var RopeBuffer = require('./rope').RopeBuffer;

function Buffer(remoteBuffer) {
    this.remoteBuffer = remoteBuffer;
    this.text = new RopeBuffer(remoteBuffer, 0, remoteBuffer.length);
}

Buffer.prototype.onpage = function (message) {
    this.remoteBuffer.onpage(message);
};

function Window() { return; }

function Frame(url, onopen, options) {
    this.ws = new WebSocket(url);
    this.onopen = onopen;
    this.options = options;
    this.ws.on('message', this.onmessage.bind(this))
        .on('close', this.onclose.bind(this))
        .on('error', this.onerror.bind(this));
}

Frame.prototype.onerror = function (e) {
    console.log('client frame error:', this.name, e);
};

Frame.prototype.onclose = function () {
    console.log('client frame closed:', this.name);
};

Frame.prototype.onmessage = function (data) {
    var message = JSON.parse(data),
        handler = 'on' + message.type;
    console.log('client received:', data);
    if (message.scope === 'frame') {
        this[handler](message);
    }
    if (message.scope === 'window') {
        this.windows[message.sequenceNumber][handler](message);
    }
    if (message.scope === 'buffer') {
        this.buffers[message.name][handler](message);
    }
};

Frame.prototype.oninit = function (message) {
    var that = this;
    this.name = message.name;
    this.buffers = Object.keys(message.buffers).reduce(function (acc, k) {
        var buffer = message.buffers[k];
        acc[k] = Object.setPrototypeOf(buffer, new Buffer(new RemoteBuffer(that.ws, k, buffer.size, that.options)));
        return acc;
    }, {});
    this.onlayout(message);
    this.onopen(this);
};

Frame.prototype.onlayout = function (message) {
    var windows = {};
    function toWindow(w) {
        if (w) {
            if (windows[w.sequenceNumber]) {
                return windows[w.sequenceNumber];
            }
            var window = Object.setPrototypeOf(w, new Window());
            window.next = toWindow(window.next);
            window.prev = toWindow(window.prev);
            window.hchild = toWindow(window.hchild);
            window.vchild = toWindow(window.vchild);
            window.parent = toWindow(window.parent);
            windows[window.sequenceNumber] = window;
            return window;
        }
    }
    this.rootWindow = toWindow(message.rootWindow);
    this.minibufferWindow = toWindow(message.minibufferWindow);
    this.selectedWindow = toWindow(message.selectedWindow);
    this.windows = windows;
};

// server

function ServerWindow(buffer, isMini, next, prev, hchild, vchild, parent, leftCol, topLine,
                      normalLines, normalCols, start, pointm) {
    this.sequenceNumber = ServerWindow.nextSequenceNumber();
    this.buffer = buffer;
    this.isMini = isMini || false;
    this.next = next;
    this.prev = prev;
    this.hchild = hchild;
    this.vchild = vchild;
    this.parent = parent;
    this.leftCol = leftCol || 0;
    this.topLine = topLine || 0;
    this.normalLines = normalLines;
    this.normalCols = normalCols;
    this.start = start || 0;
    this.pointm = pointm || 0;
}

ServerWindow.nextSequenceNumber = (function () {
    var sequenceNumber = 0;
    return function () {
        sequenceNumber += 1;
        return sequenceNumber;
    };
}());

function ServerFrame(ws, name, editor) {
    this.ws = ws;
    this.name = name;
    this.editor = editor;
    this.rootWindow = new ServerWindow('*scratch*');
    this.minibufferWindow = new ServerWindow(' *Minibuf-0*', true);
    this.selectedWindow = this.rootWindow;
    ws.on('message', this.onmessage.bind(this))
        .on('close', this.onclose.bind(this))
        .on('error', this.onerror.bind(this));
}

ServerFrame.prototype.onerror = function (e) {
    console.log('server frame error:', this.name, e);
};

ServerFrame.prototype.onclose = function () {
    delete this.editor.frames[this.name];
    console.log('server frame closed:', this.name);
};

ServerFrame.prototype.onmessage = function (data) {
    var message = JSON.parse(data);
    console.log('server received:', data);
    message = this['on' + message.type](message);
    if (message) {
        data = JSON.stringify(message);
        console.log('server reply:', data);
        this.ws.send(data);
    }
};

ServerFrame.prototype.onpage = function (message) {
    var pageSize = message.pageSize,
        beginSlice = message.page * pageSize,
        text = this.editor.buffers[message.name].text;
    message.content = text.slice(beginSlice, beginSlice + pageSize).toString();
    return message;
};

function ServerBuffer(name, text, point, mark) {
    this.name = name;
    this.text = text;
    this.point = point || 0;
    this.mark = mark || 0;
}

var WebSocketServer = require('ws').Server;

function EditorServer(buffers, options) {
    this.wss = new WebSocketServer(options);
    this.buffers = buffers.reduce(function (acc, buffer) {
        acc[buffer.name] = buffer;
        return acc;
    }, {});
    this.url = 'ws://' + this.wss.options.host + ':' + this.wss.options.port + (this.wss.options.path || '');
    this.frames = [];
    this.wss.on('connection', this.onconnection.bind(this))
        .on('error', this.onerror.bind(this));
}

EditorServer.prototype.onconnection = function (ws) {
    var name = this.frames.length, buffers = this.buffers,
        frame = new ServerFrame(ws, name, this),
        bufferMeta = Object.keys(buffers).reduce(function (acc, k) {
            var buffer = buffers[k];
            acc[k] = {name: buffer.name, size: buffer.text.length,
                      point: buffer.point, mark: buffer.mark};
            return acc;
        }, {}),
        data = JSON.stringify({type: 'init', name: name, scope: 'frame',
                               buffers: bufferMeta,
                               rootWindow: frame.rootWindow,
                               minibufferWindow: frame.minibufferWindow,
                               selectedWindow: frame.selectedWindow});
    console.log('server frame connection:', data);
    ws.send(data);
    this.frames[name] = frame;
};

EditorServer.prototype.onerror = function (e) {
    console.log('server error:', e);
};

var assert = require('assert'),
    path = require('path');

var tutorial = require('fs').readFileSync(path.join(__dirname, '/../etc/tutorials/TUTORIAL'), {encoding: 'utf8'});
var scratch = ';; This buffer is for notes you don\'t want to save, and for Lisp evaluation.\n;; If you want to create a file, visit that file with C-x C-f,\n\n;; then enter the text in that file\'s own buffer.\n';

var server = new EditorServer([new ServerBuffer('TUTORIAL', Rope.toRope(tutorial)),
                               new ServerBuffer('*scratch*', Rope.toRope(scratch)),
                               new ServerBuffer(' *Minibuf-0*', Rope.EMPTY)], {port: 8080, path: '/ws'});
var client = new Frame(server.url, function (frame) {
    var buffers = frame.buffers, TUTORIAL = buffers.TUTORIAL.remoteBuffer, error, callbacksCalled = 0;
    assert.equal(frame.name, 0);
    assert.equal(Object.keys(frame.windows).length, 2);
    assert.equal(frame.selectedWindow, frame.windows[1]);
    assert.equal(frame.rootWindow, frame.windows[1]);
    assert.deepEqual(Object.keys(buffers), ['TUTORIAL', '*scratch*', ' *Minibuf-0*']);
    assert.equal(buffers.TUTORIAL.point, 0);
    assert.equal(TUTORIAL.charAt(-1), '');
    assert.equal(TUTORIAL.charAt(TUTORIAL.length), '');
    assert.equal(TUTORIAL.notFound, 'x');
    assert.equal(TUTORIAL.charAt(0), TUTORIAL.notFound, 'charAt page miss');
    TUTORIAL.charAt(0, function (x) {
        callbacksCalled += 1;
        assert.equal(x, tutorial.charAt(0), 'charAt callback no cache');
        assert.equal(TUTORIAL.charAt(0), 'E', 'charAtSync within cache');
        TUTORIAL.charAt(0, function (y) {
            callbacksCalled += 1;
            assert.equal(y, tutorial.charAt(0), 'charAtSync with cache using callback');
        });
        TUTORIAL.charAtAsync(10000).then(function (y) {
            callbacksCalled += 1;
            assert.equal(y, tutorial.charAt(10000), 'charAtAsync no cache');
        }).catch(function (e) {
            error = e;
        });
    });
    TUTORIAL.slice(0, 256, function (x) {
        callbacksCalled += 1;
        assert.equal(x, tutorial.slice(0, 256), 'slice callback, partial cache');
        assert.equal(TUTORIAL.slice(64, 128), tutorial.slice(64, 128), 'sliceSync within cache');
        assert.equal(TUTORIAL.slice(64, 128 - TUTORIAL.length), tutorial.slice(64, 128 - TUTORIAL.length), 'sliceSync within cache, negative end');
        assert.equal(TUTORIAL.slice(0, 0), '', 'sliceSync within cache empty');
        assert.equal(TUTORIAL.slice(-1, -1), '', 'sliceSync within cache both negative');
        assert.equal(TUTORIAL.slice(64, 0), '', 'sliceSync within cache begin larger than end');
        assert.equal(TUTORIAL.slice(64, -TUTORIAL.length), '', 'sliceSync within cache begin larger than negative end');
        TUTORIAL.slice(0, 128, function (y) {
            callbacksCalled += 1;
            assert.equal(y, tutorial.slice(0, 128), 'sliceSync within cache using callback');
        });
        TUTORIAL.sliceAsync(20000, 20128).then(function (y) {
            callbacksCalled += 1;
            assert.equal(y, tutorial.slice(20000, 20128), 'sliceAsync no cache');
        }).catch(function (e) {
            error = e;
        });
    });
    setTimeout(function () {
        server.wss.close();
        assert.equal(callbacksCalled, 6);
        if (error) {
            throw error;
        }
    }, 100);
}, {pageSize: 128});
assert(client.ws.url, server.url);

var lru = new LRU(3);

lru.set(1, 'foo');
lru.set(2, 'bar');
lru.set(3, 'baz');

assert.deepEqual(lru, {cache: ['baz', 'bar', 'foo'], index: [3, 2, 1], max: 3});
assert.equal('foo', lru.get(1));
assert.deepEqual(lru, {cache: ['foo', 'baz', 'bar'], index: [1, 3, 2], max: 3});

lru.set(4, 'quux');
assert.deepEqual(lru, {cache: ['quux', 'foo', 'baz'], index: [4, 1, 3], max: 3});

lru.set(2, 'woz');
assert.deepEqual(lru, {cache: ['woz', 'quux', 'foo'], index: [2, 4, 1], max: 3});
assert(!lru.get(5));

assert.equal('KEY 5', lru.get(5, function (k) { return 'KEY ' + k; }));
assert.deepEqual(lru, {cache: ['KEY 5', 'woz', 'quux'], index: [5, 2, 4], max: 3});

assert.equal('KEY 5', lru.get(5));
assert.deepEqual(lru, {cache: ['KEY 5', 'woz', 'quux'], index: [5, 2, 4], max: 3});

assert.equal('jobs', lru.set(5, 'jobs'));
assert.deepEqual(lru, {cache: ['jobs', 'woz', 'quux'], index: [5, 2, 4], max: 3});
