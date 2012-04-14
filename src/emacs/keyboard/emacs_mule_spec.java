package emacs.keyboard;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : coding.h:588</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("keyboard") 
public class emacs_mule_spec extends StructObject {
	public emacs_mule_spec() {
		super();
	}
	@Field(0) 
	public int full_support() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public emacs_mule_spec full_support(int full_support) {
		this.io.setIntField(this, 0, full_support);
		return this;
	}
	/// C type : composition_status
	@Field(1) 
	public composition_status cmp_status() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : composition_status
	@Field(1) 
	public emacs_mule_spec cmp_status(composition_status cmp_status) {
		this.io.setNativeObjectField(this, 1, cmp_status);
		return this;
	}
}
