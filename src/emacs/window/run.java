package emacs.window;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : dispextern.h:1599</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("window") 
public class run extends StructObject {
	public run() {
		super();
	}
	/// Source and destination y pixel position.
	@Field(0) 
	public int desired_y() {
		return this.io.getIntField(this, 0);
	}
	/// Source and destination y pixel position.
	@Field(0) 
	public run desired_y(int desired_y) {
		this.io.setIntField(this, 0, desired_y);
		return this;
	}
	/// Source and destination y pixel position.
	@Field(1) 
	public int current_y() {
		return this.io.getIntField(this, 1);
	}
	/// Source and destination y pixel position.
	@Field(1) 
	public run current_y(int current_y) {
		this.io.setIntField(this, 1, current_y);
		return this;
	}
	/// Source and destination vpos in matrix.
	@Field(2) 
	public int desired_vpos() {
		return this.io.getIntField(this, 2);
	}
	/// Source and destination vpos in matrix.
	@Field(2) 
	public run desired_vpos(int desired_vpos) {
		this.io.setIntField(this, 2, desired_vpos);
		return this;
	}
	/// Source and destination vpos in matrix.
	@Field(3) 
	public int current_vpos() {
		return this.io.getIntField(this, 3);
	}
	/// Source and destination vpos in matrix.
	@Field(3) 
	public run current_vpos(int current_vpos) {
		this.io.setIntField(this, 3, current_vpos);
		return this;
	}
	/// Height in pixels, number of glyph rows.
	@Field(4) 
	public int height() {
		return this.io.getIntField(this, 4);
	}
	/// Height in pixels, number of glyph rows.
	@Field(4) 
	public run height(int height) {
		this.io.setIntField(this, 4, height);
		return this;
	}
	/// Height in pixels, number of glyph rows.
	@Field(5) 
	public int nrows() {
		return this.io.getIntField(this, 5);
	}
	/// Height in pixels, number of glyph rows.
	@Field(5) 
	public run nrows(int nrows) {
		this.io.setIntField(this, 5, nrows);
		return this;
	}
}
