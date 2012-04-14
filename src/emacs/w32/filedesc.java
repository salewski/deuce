package emacs.w32;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : w32.h:34</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("w32") 
public class filedesc extends StructObject {
	public filedesc() {
		super();
	}
	@Field(0) 
	public int flags() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public filedesc flags(int flags) {
		this.io.setIntField(this, 0, flags);
		return this;
	}
	/// C type : child_process*
	@Field(2) 
	public Pointer<child_process > cp() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : child_process*
	@Field(2) 
	public filedesc cp(Pointer<child_process > cp) {
		this.io.setPointerField(this, 2, cp);
		return this;
	}
}
