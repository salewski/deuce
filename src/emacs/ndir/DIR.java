package emacs.ndir;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : ndir.h:13</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ndir") 
public class DIR extends StructObject {
	public DIR() {
		super();
	}
	/// file descriptor
	@Field(0) 
	public int dd_fd() {
		return this.io.getIntField(this, 0);
	}
	/// file descriptor
	@Field(0) 
	public DIR dd_fd(int dd_fd) {
		this.io.setIntField(this, 0, dd_fd);
		return this;
	}
	/// offset in block
	@Field(1) 
	public int dd_loc() {
		return this.io.getIntField(this, 1);
	}
	/// offset in block
	@Field(1) 
	public DIR dd_loc(int dd_loc) {
		this.io.setIntField(this, 1, dd_loc);
		return this;
	}
	/// amount of valid data
	@Field(2) 
	public int dd_size() {
		return this.io.getIntField(this, 2);
	}
	/// amount of valid data
	@Field(2) 
	public DIR dd_size(int dd_size) {
		this.io.setIntField(this, 2, dd_size);
		return this;
	}
	/**
	 * directory block<br>
	 * C type : char[512]
	 */
	@Array({512}) 
	@Field(3) 
	public Pointer<Byte > dd_buf() {
		return this.io.getPointerField(this, 3);
	}
}
