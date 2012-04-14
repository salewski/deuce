package emacs.dispextern;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : dispextern.h:238</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("dispextern") 
public class glyph_pool extends StructObject {
	public glyph_pool() {
		super();
	}
	/**
	 * Vector of glyphs allocated from the heap.<br>
	 * C type : glyph*
	 */
	@Field(0) 
	public Pointer<glyph > glyphs() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Vector of glyphs allocated from the heap.<br>
	 * C type : glyph*
	 */
	@Field(0) 
	public glyph_pool glyphs(Pointer<glyph > glyphs) {
		this.io.setPointerField(this, 0, glyphs);
		return this;
	}
	/// Allocated size of `glyphs'.
	@Ptr 
	@Field(1) 
	public long nglyphs() {
		return this.io.getSizeTField(this, 1);
	}
	/// Allocated size of `glyphs'.
	@Ptr 
	@Field(1) 
	public glyph_pool nglyphs(long nglyphs) {
		this.io.setSizeTField(this, 1, nglyphs);
		return this;
	}
	/// Number of rows and columns in a matrix.
	@Field(2) 
	public int nrows() {
		return this.io.getIntField(this, 2);
	}
	/// Number of rows and columns in a matrix.
	@Field(2) 
	public glyph_pool nrows(int nrows) {
		this.io.setIntField(this, 2, nrows);
		return this;
	}
	/// Number of rows and columns in a matrix.
	@Field(3) 
	public int ncolumns() {
		return this.io.getIntField(this, 3);
	}
	/// Number of rows and columns in a matrix.
	@Field(3) 
	public glyph_pool ncolumns(int ncolumns) {
		this.io.setIntField(this, 3, ncolumns);
		return this;
	}
}
