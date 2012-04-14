package emacs.frame;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : dispextern.h:73</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("frame") 
public class glyph_slice extends StructObject {
	public glyph_slice() {
		super();
	}
	@Field(0) 
	@Bits(16) 
	public int x() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	@Bits(16) 
	public glyph_slice x(int x) {
		this.io.setIntField(this, 0, x);
		return this;
	}
	@Field(1) 
	@Bits(16) 
	public int y() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	@Bits(16) 
	public glyph_slice y(int y) {
		this.io.setIntField(this, 1, y);
		return this;
	}
	@Field(2) 
	@Bits(16) 
	public int width() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	@Bits(16) 
	public glyph_slice width(int width) {
		this.io.setIntField(this, 2, width);
		return this;
	}
	@Field(3) 
	@Bits(16) 
	public int height() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	@Bits(16) 
	public glyph_slice height(int height) {
		this.io.setIntField(this, 3, height);
		return this;
	}
}
