package emacs.coding;
import emacs.coding.CodingLibrary.utf_16_endian_type;
import emacs.coding.CodingLibrary.utf_bom_type;
import org.bridj.IntValuedEnum;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : coding.h:298</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("coding") 
public class utf_16_spec extends StructObject {
	public utf_16_spec() {
		super();
	}
	/// C type : utf_bom_type
	@Field(0) 
	public IntValuedEnum<utf_bom_type > bom() {
		return this.io.getEnumField(this, 0);
	}
	/// C type : utf_bom_type
	@Field(0) 
	public utf_16_spec bom(IntValuedEnum<utf_bom_type > bom) {
		this.io.setEnumField(this, 0, bom);
		return this;
	}
	/// C type : utf_16_endian_type
	@Field(1) 
	public IntValuedEnum<utf_16_endian_type > endian() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : utf_16_endian_type
	@Field(1) 
	public utf_16_spec endian(IntValuedEnum<utf_16_endian_type > endian) {
		this.io.setEnumField(this, 1, endian);
		return this;
	}
	@Field(2) 
	public int surrogate() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public utf_16_spec surrogate(int surrogate) {
		this.io.setIntField(this, 2, surrogate);
		return this;
	}
}
