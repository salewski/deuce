package emacs.blockinput;
import emacs.blockinput.BlockinputLibrary.atimer_callback;
import emacs.blockinput.BlockinputLibrary.atimer_type;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : atimer.h:337</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("blockinput") 
public class atimer extends StructObject {
	public atimer() {
		super();
	}
	/**
	 * The type of this timer.<br>
	 * C type : atimer_type
	 */
	@Field(0) 
	public IntValuedEnum<atimer_type > type() {
		return this.io.getEnumField(this, 0);
	}
	/**
	 * The type of this timer.<br>
	 * C type : atimer_type
	 */
	@Field(0) 
	public atimer type(IntValuedEnum<atimer_type > type) {
		this.io.setEnumField(this, 0, type);
		return this;
	}
	/// Time when this timer is ripe.
	@Field(1) 
	public int expiration() {
		return this.io.getIntField(this, 1);
	}
	/// Time when this timer is ripe.
	@Field(1) 
	public atimer expiration(int expiration) {
		this.io.setIntField(this, 1, expiration);
		return this;
	}
	/// Interval of this timer.
	@Field(2) 
	public int interval() {
		return this.io.getIntField(this, 2);
	}
	/// Interval of this timer.
	@Field(2) 
	public atimer interval(int interval) {
		this.io.setIntField(this, 2, interval);
		return this;
	}
	/**
	 * Function to call when timer is ripe.  Interrupt input is<br>
	 * guaranteed to not be blocked when this function is called.<br>
	 * C type : atimer_callback
	 */
	@Field(3) 
	public Pointer<atimer_callback > fn() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * Function to call when timer is ripe.  Interrupt input is<br>
	 * guaranteed to not be blocked when this function is called.<br>
	 * C type : atimer_callback
	 */
	@Field(3) 
	public atimer fn(Pointer<atimer_callback > fn) {
		this.io.setPointerField(this, 3, fn);
		return this;
	}
	/**
	 * Additional user-specified data to pass to FN.<br>
	 * C type : void*
	 */
	@Field(4) 
	public Pointer<? > client_data() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * Additional user-specified data to pass to FN.<br>
	 * C type : void*
	 */
	@Field(4) 
	public atimer client_data(Pointer<? > client_data) {
		this.io.setPointerField(this, 4, client_data);
		return this;
	}
	/**
	 * Next in list of active or free atimers.<br>
	 * C type : atimer*
	 */
	@Field(5) 
	public Pointer<atimer > next() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * Next in list of active or free atimers.<br>
	 * C type : atimer*
	 */
	@Field(5) 
	public atimer next(Pointer<atimer > next) {
		this.io.setPointerField(this, 5, next);
		return this;
	}
}
