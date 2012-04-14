package emacs.frame;
import emacs.frame.FrameLibrary.bidi_dir_t;
import org.bridj.IntValuedEnum;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Data type for keeping track of saved embedding levels and override<br>
 * status information.<br>
 * <i>native declaration : dispextern.h:863</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("frame") 
public class bidi_stack extends StructObject {
	public bidi_stack() {
		super();
	}
	@Field(0) 
	public int level() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public bidi_stack level(int level) {
		this.io.setIntField(this, 0, level);
		return this;
	}
	/// C type : bidi_dir_t
	@Field(1) 
	public IntValuedEnum<bidi_dir_t > override() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : bidi_dir_t
	@Field(1) 
	public bidi_stack override(IntValuedEnum<bidi_dir_t > override) {
		this.io.setEnumField(this, 1, override);
		return this;
	}
}
