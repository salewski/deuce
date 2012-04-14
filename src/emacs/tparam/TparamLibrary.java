package emacs.tparam;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.util.DefaultParameterizedType;
/**
 * Wrapper for library <b>tparam</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("tparam") 
@Runtime(CRuntime.class) 
public class TparamLibrary {
	static {
		BridJ.register();
	}
	/// <i>native declaration : tparam.h:17</i>
	/// <i>native declaration : tparam.h:17</i>
	public static abstract class tputs_arg1_callback extends Callback<tputs_arg1_callback > {
		public abstract int apply(int int1);
	};
	/**
	 * Original signature : <code>void tputs(const char*, int, tputs_arg1_callback)</code><br>
	 * <i>native declaration : tparam.h:1</i>
	 */
	public static native void tputs(Pointer<Byte > charPtr1, int int1, Pointer<TparamLibrary.tputs_arg1_callback > arg1);
	/**
	 * Original signature : <code>int tgetent(char*, const char*)</code><br>
	 * <i>native declaration : tparam.h:3</i>
	 */
	public static native int tgetent(Pointer<Byte > charPtr1, Pointer<Byte > charPtr2);
	/**
	 * Original signature : <code>int tgetflag(const char*)</code><br>
	 * <i>native declaration : tparam.h:5</i>
	 */
	public static native int tgetflag(Pointer<Byte > charPtr1);
	/**
	 * Original signature : <code>int tgetnum(const char*)</code><br>
	 * <i>native declaration : tparam.h:7</i>
	 */
	public static native int tgetnum(Pointer<Byte > charPtr1);
	/**
	 * Original signature : <code>char* tgetstr(const char*, char**)</code><br>
	 * <i>native declaration : tparam.h:9</i>
	 */
	public static native Pointer<Byte > tgetstr(Pointer<Byte > charPtr1, Pointer<Pointer<Byte > > charPtrPtr1);
	/**
	 * Original signature : <code>char* tgoto(const char*, int, int)</code><br>
	 * <i>native declaration : tparam.h:11</i>
	 */
	public static native Pointer<Byte > tgoto(Pointer<Byte > charPtr1, int int1, int int2);
	/**
	 * Original signature : <code>char* tparam(const char*, char*, int, int, int, int, int)</code><br>
	 * <i>native declaration : tparam.h:13</i>
	 */
	public static native Pointer<Byte > tparam(Pointer<Byte > charPtr1, Pointer<Byte > charPtr2, int int1, int int2, int int3, int int4, int int5);
	public byte PC() {
		try {
			return (byte)BridJ.getNativeLibrary("tparam").getSymbolPointer("PC").as(byte.class).get();
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	public TparamLibrary PC(byte PC) {
		try {
			{
				BridJ.getNativeLibrary("tparam").getSymbolPointer("PC").as(byte.class).set(PC);
				return this;
			}
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	/// C type : extern char*
	public Pointer<Byte > BC() {
		try {
			return (Pointer<Byte >)BridJ.getNativeLibrary("tparam").getSymbolPointer("BC").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).get();
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	/// C type : extern char*
	public TparamLibrary BC(Pointer<Byte > BC) {
		try {
			{
				BridJ.getNativeLibrary("tparam").getSymbolPointer("BC").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).set(BC);
				return this;
			}
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	/// C type : extern char*
	public Pointer<Byte > UP() {
		try {
			return (Pointer<Byte >)BridJ.getNativeLibrary("tparam").getSymbolPointer("UP").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).get();
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	/// C type : extern char*
	public TparamLibrary UP(Pointer<Byte > UP) {
		try {
			{
				BridJ.getNativeLibrary("tparam").getSymbolPointer("UP").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).set(UP);
				return this;
			}
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
}
