package emacs.w32term;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : w32term.h:353</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("w32term") 
public class w32_bitmap_record extends StructObject {
	public w32_bitmap_record() {
		super();
	}
	/// C type : char*
	@Field(1) 
	public Pointer<Byte > file() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : char*
	@Field(1) 
	public w32_bitmap_record file(Pointer<Byte > file) {
		this.io.setPointerField(this, 1, file);
		return this;
	}
	@Field(3) 
	public int refcount() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public w32_bitmap_record refcount(int refcount) {
		this.io.setIntField(this, 3, refcount);
		return this;
	}
	/// Record some info about this pixmap.
	@Field(4) 
	public int height() {
		return this.io.getIntField(this, 4);
	}
	/// Record some info about this pixmap.
	@Field(4) 
	public w32_bitmap_record height(int height) {
		this.io.setIntField(this, 4, height);
		return this;
	}
	/// Record some info about this pixmap.
	@Field(5) 
	public int width() {
		return this.io.getIntField(this, 5);
	}
	/// Record some info about this pixmap.
	@Field(5) 
	public w32_bitmap_record width(int width) {
		this.io.setIntField(this, 5, width);
		return this;
	}
	/// Record some info about this pixmap.
	@Field(6) 
	public int depth() {
		return this.io.getIntField(this, 6);
	}
	/// Record some info about this pixmap.
	@Field(6) 
	public w32_bitmap_record depth(int depth) {
		this.io.setIntField(this, 6, depth);
		return this;
	}
}
