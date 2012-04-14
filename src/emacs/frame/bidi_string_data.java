package emacs.frame;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Data type for storing information about a string being iterated on.<br>
 * <i>native declaration : dispextern.h:875</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("frame") 
public class bidi_string_data extends StructObject {
	public bidi_string_data() {
		super();
	}
	/**
	 * string data, or NULL if reordering buffer<br>
	 * C type : const unsigned char*
	 */
	@Field(1) 
	public Pointer<Byte > s() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * string data, or NULL if reordering buffer<br>
	 * C type : const unsigned char*
	 */
	@Field(1) 
	public bidi_string_data s(Pointer<Byte > s) {
		this.io.setPointerField(this, 1, s);
		return this;
	}
	/**
	 * 1 means the string comes from a<br>
	 * display property
	 */
	@Field(4) 
	@Bits(1) 
	public int from_disp_str() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * 1 means the string comes from a<br>
	 * display property
	 */
	@Field(4) 
	@Bits(1) 
	public bidi_string_data from_disp_str(int from_disp_str) {
		this.io.setIntField(this, 4, from_disp_str);
		return this;
	}
	/// 1 means the string is unibyte
	@Field(5) 
	@Bits(1) 
	public int unibyte() {
		return this.io.getIntField(this, 5);
	}
	/// 1 means the string is unibyte
	@Field(5) 
	@Bits(1) 
	public bidi_string_data unibyte(int unibyte) {
		this.io.setIntField(this, 5, unibyte);
		return this;
	}
}
