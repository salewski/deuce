package emacs.ccl;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>ccl</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ccl") 
@Runtime(CRuntime.class) 
public class CclLibrary {
	static {
		BridJ.register();
	}
	/// <i>native declaration : ccl.h</i>
	public static final int CCL_STAT_SUSPEND_BY_SRC = (int)1;
	/// <i>native declaration : ccl.h</i>
	public static final int CCL_STAT_SUCCESS = (int)0;
	/// <i>native declaration : ccl.h</i>
	public static final int CCL_STAT_SUSPEND_BY_DST = (int)2;
	/// <i>native declaration : ccl.h</i>
	public static final int CCL_STAT_INVALID_CMD = (int)3;
	/// <i>native declaration : ccl.h</i>
	public static final int CCL_STAT_QUIT = (int)4;
	/**
	 * Setup fields of the structure pointed by CCL appropriately for the<br>
	 * execution of ccl program CCL_PROG (symbol or vector).<br>
	 * Original signature : <code>int setup_ccl_program(ccl_program*)</code><br>
	 * <i>native declaration : ccl.h:62</i>
	 */
	public static native int setup_ccl_program(Pointer<ccl_program > ccl_programPtr1);
	/**
	 * Original signature : <code>void ccl_driver(ccl_program*, int*, int*, int, int)</code><br>
	 * <i>native declaration : ccl.h:64</i>
	 */
	public static native void ccl_driver(Pointer<ccl_program > ccl_programPtr1, Pointer<Integer > intPtr1, Pointer<Integer > intPtr2, int int1, int int2);
	/// Undefined type
	/// Undefined type
	public static interface Lisp_Object {
		
	};
}
