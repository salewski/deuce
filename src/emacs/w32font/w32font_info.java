package emacs.w32font;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * The actual structure for a w32 font, that can be cast to struct font.<br>
 * The Uniscribe backend extends this.<br>
 * <i>native declaration : w32font.h:21</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("w32font") 
public class w32font_info extends StructObject {
	public w32font_info() {
		super();
	}
	@Field(2) 
	public int glyph_idx() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public w32font_info glyph_idx(int glyph_idx) {
		this.io.setIntField(this, 2, glyph_idx);
		return this;
	}
	/// C type : w32_metric_cache**
	@Field(3) 
	public Pointer<Pointer<w32_metric_cache > > cached_metrics() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : w32_metric_cache**
	@Field(3) 
	public w32font_info cached_metrics(Pointer<Pointer<w32_metric_cache > > cached_metrics) {
		this.io.setPointerField(this, 3, cached_metrics);
		return this;
	}
	@Field(4) 
	public int n_cache_blocks() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public w32font_info n_cache_blocks(int n_cache_blocks) {
		this.io.setIntField(this, 4, n_cache_blocks);
		return this;
	}
}
