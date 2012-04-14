package emacs.nsterm;
import emacs.nsterm.NstermLibrary.Lisp_Object;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : font.h:2863</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("nsterm") 
public class font_entity extends StructObject {
	public font_entity() {
		super();
	}
	/// C type : Lisp_Object[FONT_ENTITY_MAX]
	@Array({(int)emacs.nsterm.NstermLibrary.font_property_index.FONT_ENTITY_MAX.value()}) 
	@Field(1) 
	public Pointer<Lisp_Object > props() {
		return this.io.getPointerField(this, 1);
	}
}
