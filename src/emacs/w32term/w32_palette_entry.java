package emacs.w32term;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : w32term.h:357</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("w32term") 
public class w32_palette_entry extends StructObject {
	public w32_palette_entry() {
		super();
	}
	/// C type : w32_palette_entry*
	@Field(0) 
	public Pointer<w32_palette_entry > next() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : w32_palette_entry*
	@Field(0) 
	public w32_palette_entry next(Pointer<w32_palette_entry > next) {
		this.io.setPointerField(this, 0, next);
		return this;
	}
}
