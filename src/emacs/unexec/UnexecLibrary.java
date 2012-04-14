package emacs.unexec;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>unexec</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("unexec") 
@Runtime(CRuntime.class) 
public class UnexecLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>void unexec(const char*, const char*)</code><br>
	 * <i>native declaration : unexec.h:1</i>
	 */
	public static native void unexec(Pointer<Byte > charPtr1, Pointer<Byte > charPtr2);
}
