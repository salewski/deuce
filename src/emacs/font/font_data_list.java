package emacs.font;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : font.h:593</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("font") 
public class font_data_list extends StructObject {
	public font_data_list() {
		super();
	}
	/**
	 * Pointer to the font driver.<br>
	 * C type : font_driver*
	 */
	@Field(0) 
	public Pointer<font_driver > driver() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Pointer to the font driver.<br>
	 * C type : font_driver*
	 */
	@Field(0) 
	public font_data_list driver(Pointer<font_driver > driver) {
		this.io.setPointerField(this, 0, driver);
		return this;
	}
	/**
	 * Data specific to the font driver.<br>
	 * C type : void*
	 */
	@Field(1) 
	public Pointer<? > data() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Data specific to the font driver.<br>
	 * C type : void*
	 */
	@Field(1) 
	public font_data_list data(Pointer<? > data) {
		this.io.setPointerField(this, 1, data);
		return this;
	}
	/**
	 * Pointer to the next element of the chain.<br>
	 * C type : font_data_list*
	 */
	@Field(2) 
	public Pointer<font_data_list > next() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Pointer to the next element of the chain.<br>
	 * C type : font_data_list*
	 */
	@Field(2) 
	public font_data_list next(Pointer<font_data_list > next) {
		this.io.setPointerField(this, 2, next);
		return this;
	}
}
