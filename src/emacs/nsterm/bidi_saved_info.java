package emacs.nsterm;
import emacs.nsterm.NstermLibrary.bidi_type_t;
import org.bridj.IntValuedEnum;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Data type for storing information about characters we need to<br>
 * remember.<br>
 * <i>native declaration : dispextern.h:851</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("nsterm") 
public class bidi_saved_info extends StructObject {
	public bidi_saved_info() {
		super();
	}
	/**
	 * character's resolved bidi type<br>
	 * C type : bidi_type_t
	 */
	@Field(2) 
	public IntValuedEnum<bidi_type_t > type() {
		return this.io.getEnumField(this, 2);
	}
	/**
	 * character's resolved bidi type<br>
	 * C type : bidi_type_t
	 */
	@Field(2) 
	public bidi_saved_info type(IntValuedEnum<bidi_type_t > type) {
		this.io.setEnumField(this, 2, type);
		return this;
	}
	/**
	 * original type of the character, after W1<br>
	 * C type : bidi_type_t
	 */
	@Field(3) 
	public IntValuedEnum<bidi_type_t > type_after_w1() {
		return this.io.getEnumField(this, 3);
	}
	/**
	 * original type of the character, after W1<br>
	 * C type : bidi_type_t
	 */
	@Field(3) 
	public bidi_saved_info type_after_w1(IntValuedEnum<bidi_type_t > type_after_w1) {
		this.io.setEnumField(this, 3, type_after_w1);
		return this;
	}
	/**
	 * type as we found it in the buffer<br>
	 * C type : bidi_type_t
	 */
	@Field(4) 
	public IntValuedEnum<bidi_type_t > orig_type() {
		return this.io.getEnumField(this, 4);
	}
	/**
	 * type as we found it in the buffer<br>
	 * C type : bidi_type_t
	 */
	@Field(4) 
	public bidi_saved_info orig_type(IntValuedEnum<bidi_type_t > orig_type) {
		this.io.setEnumField(this, 4, orig_type);
		return this;
	}
}
