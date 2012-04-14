package emacs.keyboard;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Structure of the field `spec.iso_2022' in the structure<br>
 * `coding_system'.<br>
 * <i>native declaration : coding.h:584</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("keyboard") 
public class iso_2022_spec extends StructObject {
	public iso_2022_spec() {
		super();
	}
	/// Bit-wise-or of CODING_ISO_FLAG_XXX.
	@Field(0) 
	public int flags() {
		return this.io.getIntField(this, 0);
	}
	/// Bit-wise-or of CODING_ISO_FLAG_XXX.
	@Field(0) 
	public iso_2022_spec flags(int flags) {
		this.io.setIntField(this, 0, flags);
		return this;
	}
	/**
	 * The current graphic register invoked to each graphic plane.<br>
	 * C type : int[2]
	 */
	@Array({2}) 
	@Field(1) 
	public Pointer<Integer > current_invocation() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * The current charset designated to each graphic register.  The<br>
	 * value -1 means that not charset is designated, -2 means that<br>
	 * there was an invalid designation previously.<br>
	 * C type : int[4]
	 */
	@Array({4}) 
	@Field(2) 
	public Pointer<Integer > current_designation() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Set to 1 temporarily only when graphic register 2 or 3 is invoked<br>
	 * by single-shift while encoding.
	 */
	@Field(3) 
	public int single_shifting() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * Set to 1 temporarily only when graphic register 2 or 3 is invoked<br>
	 * by single-shift while encoding.
	 */
	@Field(3) 
	public iso_2022_spec single_shifting(int single_shifting) {
		this.io.setIntField(this, 3, single_shifting);
		return this;
	}
	/// Set to 1 temporarily only when processing at beginning of line.
	@Field(4) 
	public int bol() {
		return this.io.getIntField(this, 4);
	}
	/// Set to 1 temporarily only when processing at beginning of line.
	@Field(4) 
	public iso_2022_spec bol(int bol) {
		this.io.setIntField(this, 4, bol);
		return this;
	}
	/// If positive, we are now scanning CTEXT extended segment.
	@Field(5) 
	public int ctext_extended_segment_len() {
		return this.io.getIntField(this, 5);
	}
	/// If positive, we are now scanning CTEXT extended segment.
	@Field(5) 
	public iso_2022_spec ctext_extended_segment_len(int ctext_extended_segment_len) {
		this.io.setIntField(this, 5, ctext_extended_segment_len);
		return this;
	}
	/// If nonzero, we are now scanning embedded UTF-8 sequence.
	@Field(6) 
	public int embedded_utf_8() {
		return this.io.getIntField(this, 6);
	}
	/// If nonzero, we are now scanning embedded UTF-8 sequence.
	@Field(6) 
	public iso_2022_spec embedded_utf_8(int embedded_utf_8) {
		this.io.setIntField(this, 6, embedded_utf_8);
		return this;
	}
	/**
	 * The current composition.<br>
	 * C type : composition_status
	 */
	@Field(7) 
	public composition_status cmp_status() {
		return this.io.getNativeObjectField(this, 7);
	}
	/**
	 * The current composition.<br>
	 * C type : composition_status
	 */
	@Field(7) 
	public iso_2022_spec cmp_status(composition_status cmp_status) {
		this.io.setNativeObjectField(this, 7, cmp_status);
		return this;
	}
}
