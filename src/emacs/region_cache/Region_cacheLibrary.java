package emacs.region_cache;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>region_cache</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("region_cache") 
@Runtime(CRuntime.class) 
public class Region_cacheLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Allocate, initialize and return a new, empty region cache.<br>
	 * Original signature : <code>region_cache* new_region_cache()</code><br>
	 * <i>native declaration : region_cache.h:4</i>
	 */
	public static native Pointer<Region_cacheLibrary.region_cache > new_region_cache();
	/**
	 * Free a region cache.<br>
	 * Original signature : <code>void free_region_cache(region_cache*)</code><br>
	 * <i>native declaration : region_cache.h:9</i>
	 */
	public static native void free_region_cache(Pointer<Region_cacheLibrary.region_cache > region_cachePtr1);
	/**
	 * Assert that the region of BUF between START and END (absolute<br>
	 * buffer positions) is "known," for the purposes of CACHE (e.g. "has<br>
	 * no newlines", in the case of the line cache).<br>
	 * Original signature : <code>void know_region_cache(buffer*, region_cache*, ptrdiff_t, ptrdiff_t)</code><br>
	 * <i>native declaration : region_cache.h:16</i>
	 */
	public static native void know_region_cache(Pointer<Region_cacheLibrary.buffer > BUF, Pointer<Region_cacheLibrary.region_cache > CACHE, @Ptr long START, @Ptr long END);
	/**
	 * Indicate that a section of BUF has changed, to invalidate CACHE.<br>
	 * HEAD is the number of chars unchanged at the beginning of the buffer.<br>
	 * TAIL is the number of chars unchanged at the end of the buffer.<br>
	 * NOTE: this is *not* the same as the ending position of modified<br>
	 * region.<br>
	 * (This way of specifying regions makes more sense than absolute<br>
	 * buffer positions in the presence of insertions and deletions; the<br>
	 * args to pass are the same before and after such an operation.)<br>
	 * Original signature : <code>void invalidate_region_cache(buffer*, region_cache*, ptrdiff_t, ptrdiff_t)</code><br>
	 * <i>native declaration : region_cache.h:28</i>
	 */
	public static native void invalidate_region_cache(Pointer<Region_cacheLibrary.buffer > BUF, Pointer<Region_cacheLibrary.region_cache > CACHE, @Ptr long HEAD, @Ptr long TAIL);
	/**
	 * Return true if the text immediately after POS in BUF is known, for<br>
	 * the purposes of CACHE.  If NEXT is non-zero, set *NEXT to the nearest<br>
	 * position after POS where the knowledge changes.<br>
	 * Original signature : <code>int region_cache_forward(buffer*, region_cache*, ptrdiff_t, ptrdiff_t*)</code><br>
	 * <i>native declaration : region_cache.h:35</i>
	 */
	public static native int region_cache_forward(Pointer<Region_cacheLibrary.buffer > BUF, Pointer<Region_cacheLibrary.region_cache > CACHE, @Ptr long POS, Pointer<SizeT > NEXT);
	/**
	 * Return true if the text immediately before POS in BUF is known, for<br>
	 * the purposes of CACHE.  If NEXT is non-zero, set *NEXT to the nearest<br>
	 * position before POS where the knowledge changes.<br>
	 * Original signature : <code>int region_cache_backward(buffer*, region_cache*, ptrdiff_t, ptrdiff_t*)</code><br>
	 * <i>native declaration : region_cache.h:42</i>
	 */
	public static native int region_cache_backward(Pointer<Region_cacheLibrary.buffer > BUF, Pointer<Region_cacheLibrary.region_cache > CACHE, @Ptr long POS, Pointer<SizeT > NEXT);
	/// Undefined type
	/// Undefined type
	public static interface buffer {
		
	};
	/// Undefined type
	/// Undefined type
	public static interface region_cache {
		
	};
}
