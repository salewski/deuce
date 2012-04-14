package emacs.xsettings;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>xsettings</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("xsettings") 
@Runtime(CRuntime.class) 
public class XsettingsLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>void xsettings_initialize(x_display_info*)</code><br>
	 * <i>native declaration : xsettings.h:1</i>
	 */
	public static native void xsettings_initialize(Pointer<XsettingsLibrary.x_display_info > dpyinfo);
	/**
	 * Original signature : <code>void xft_settings_event(x_display_info*, XEvent*)</code><br>
	 * <i>native declaration : xsettings.h:3</i>
	 */
	public static native void xft_settings_event(Pointer<XsettingsLibrary.x_display_info > dpyinfo, Pointer<XsettingsLibrary.XEvent > XEventPtr1);
	/**
	 * Original signature : <code>char* xsettings_get_system_font()</code><br>
	 * <i>native declaration : xsettings.h:5</i>
	 */
	public static native Pointer<Byte > xsettings_get_system_font();
	/// Undefined type
	/// Undefined type
	public static interface x_display_info {
		
	};
	/// Undefined type
	/// Undefined type
	public static interface XEvent {
		
	};
}
