package emacs.w32;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : w32.h:2</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("w32") 
public class fd_set extends StructObject {
	public fd_set() {
		super();
	}
	/// C type : unsigned int[64 / 32]
	@Array({64 / 32}) 
	@Field(0) 
	public Pointer<Integer > bits() {
		return this.io.getPointerField(this, 0);
	}
}
