package emacs.ftfont;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>ftfont</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ftfont") 
@Runtime(CRuntime.class) 
public class FtfontLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>Lisp_Object ftfont_font_format(FcPattern*, Lisp_Object)</code><br>
	 * <i>native declaration : ftfont.h:1</i>
	 */
	public static native FtfontLibrary.Lisp_Object ftfont_font_format(Pointer<FtfontLibrary.FcPattern > FcPatternPtr1, FtfontLibrary.Lisp_Object Lisp_Object1);
	/**
	 * Original signature : <code>FcCharSet* ftfont_get_fc_charset()</code><br>
	 * <i>native declaration : ftfont.h:3</i>
	 */
	public static native Pointer<FtfontLibrary.FcCharSet > ftfont_get_fc_charset();
	/// Undefined type
	/// Undefined type
	public static interface FcCharSet {
		
	};
	/// Undefined type
	/// Undefined type
	public static interface FcPattern {
		
	};
	/// Undefined type
	/// Undefined type
	public static interface Lisp_Object {
		
	};
}
