package emacs.ccl;
import emacs.ccl.CclLibrary.Lisp_Object;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * Structure to hold information about running CCL code.  Read<br>
 * comments in the file ccl.c for the detail of each field.<br>
 * <i>native declaration : ccl.h:51</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ccl") 
public class ccl_program extends StructObject {
	public ccl_program() {
		super();
	}
	/**
	 * Index number of the CCL program.<br>
	 * -1 means that the program was given<br>
	 * by a vector, not by a program<br>
	 * name.
	 */
	@Field(0) 
	public int idx() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * Index number of the CCL program.<br>
	 * -1 means that the program was given<br>
	 * by a vector, not by a program<br>
	 * name.
	 */
	@Field(0) 
	public ccl_program idx(int idx) {
		this.io.setIntField(this, 0, idx);
		return this;
	}
	/// Size of the compiled code.
	@Field(1) 
	public int size() {
		return this.io.getIntField(this, 1);
	}
	/// Size of the compiled code.
	@Field(1) 
	public ccl_program size(int size) {
		this.io.setIntField(this, 1, size);
		return this;
	}
	/**
	 * Pointer into the compiled code.<br>
	 * C type : Lisp_Object*
	 */
	@Field(2) 
	public Pointer<Lisp_Object > prog() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Pointer into the compiled code.<br>
	 * C type : Lisp_Object*
	 */
	@Field(2) 
	public ccl_program prog(Pointer<Lisp_Object > prog) {
		this.io.setPointerField(this, 2, prog);
		return this;
	}
	/// Instruction Counter (index for PROG).
	@Field(3) 
	public int ic() {
		return this.io.getIntField(this, 3);
	}
	/// Instruction Counter (index for PROG).
	@Field(3) 
	public ccl_program ic(int ic) {
		this.io.setIntField(this, 3, ic);
		return this;
	}
	/**
	 * Instruction Counter for end-of-file<br>
	 * processing code.
	 */
	@Field(4) 
	public int eof_ic() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * Instruction Counter for end-of-file<br>
	 * processing code.
	 */
	@Field(4) 
	public ccl_program eof_ic(int eof_ic) {
		this.io.setIntField(this, 4, eof_ic);
		return this;
	}
	/**
	 * CCL registers, reg[7] is used for<br>
	 * condition flag of relational<br>
	 * operations.<br>
	 * C type : int[8]
	 */
	@Array({8}) 
	@Field(5) 
	public Pointer<Integer > reg() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * CCL instruction may use this<br>
	 * for private use, mainly for saving<br>
	 * internal states on suspending.<br>
	 * This variable is set to 0 when ccl is<br>
	 * set up.
	 */
	@Field(6) 
	public int private_state() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * CCL instruction may use this<br>
	 * for private use, mainly for saving<br>
	 * internal states on suspending.<br>
	 * This variable is set to 0 when ccl is<br>
	 * set up.
	 */
	@Field(6) 
	public ccl_program private_state(int private_state) {
		this.io.setIntField(this, 6, private_state);
		return this;
	}
	/**
	 * Set to 1 while processing the last<br>
	 * block.
	 */
	@Field(7) 
	public int last_block() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * Set to 1 while processing the last<br>
	 * block.
	 */
	@Field(7) 
	public ccl_program last_block(int last_block) {
		this.io.setIntField(this, 7, last_block);
		return this;
	}
	/// Exit status of the CCL program.
	@Field(8) 
	public int status() {
		return this.io.getIntField(this, 8);
	}
	/// Exit status of the CCL program.
	@Field(8) 
	public ccl_program status(int status) {
		this.io.setIntField(this, 8, status);
		return this;
	}
	/**
	 * Output buffer magnification.  How<br>
	 * many times bigger the output buffer<br>
	 * should be than the input buffer.
	 */
	@Field(9) 
	public int buf_magnification() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * Output buffer magnification.  How<br>
	 * many times bigger the output buffer<br>
	 * should be than the input buffer.
	 */
	@Field(9) 
	public ccl_program buf_magnification(int buf_magnification) {
		this.io.setIntField(this, 9, buf_magnification);
		return this;
	}
	/// How deep the call of CCL_Call is nested.
	@Field(10) 
	public int stack_idx() {
		return this.io.getIntField(this, 10);
	}
	/// How deep the call of CCL_Call is nested.
	@Field(10) 
	public ccl_program stack_idx(int stack_idx) {
		this.io.setIntField(this, 10, stack_idx);
		return this;
	}
	/// 1 if the input buffer is multibyte.
	@Field(11) 
	public int src_multibyte() {
		return this.io.getIntField(this, 11);
	}
	/// 1 if the input buffer is multibyte.
	@Field(11) 
	public ccl_program src_multibyte(int src_multibyte) {
		this.io.setIntField(this, 11, src_multibyte);
		return this;
	}
	/// 1 if the output buffer is multibyte.
	@Field(12) 
	public int dst_multibyte() {
		return this.io.getIntField(this, 12);
	}
	/// 1 if the output buffer is multibyte.
	@Field(12) 
	public ccl_program dst_multibyte(int dst_multibyte) {
		this.io.setIntField(this, 12, dst_multibyte);
		return this;
	}
	/**
	 * Flag for encoding DOS-like EOL<br>
	 * format when the CCL program is used<br>
	 * for encoding by a coding<br>
	 * system.
	 */
	@Field(13) 
	public int cr_consumed() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * Flag for encoding DOS-like EOL<br>
	 * format when the CCL program is used<br>
	 * for encoding by a coding<br>
	 * system.
	 */
	@Field(13) 
	public ccl_program cr_consumed(int cr_consumed) {
		this.io.setIntField(this, 13, cr_consumed);
		return this;
	}
	@Field(14) 
	public int consumed() {
		return this.io.getIntField(this, 14);
	}
	@Field(14) 
	public ccl_program consumed(int consumed) {
		this.io.setIntField(this, 14, consumed);
		return this;
	}
	@Field(15) 
	public int produced() {
		return this.io.getIntField(this, 15);
	}
	@Field(15) 
	public ccl_program produced(int produced) {
		this.io.setIntField(this, 15, produced);
		return this;
	}
	/**
	 * If nonzero, don't insert error<br>
	 * message in the output.
	 */
	@Field(16) 
	public int suppress_error() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * If nonzero, don't insert error<br>
	 * message in the output.
	 */
	@Field(16) 
	public ccl_program suppress_error(int suppress_error) {
		this.io.setIntField(this, 16, suppress_error);
		return this;
	}
	/**
	 * If nonzero, ccl_driver counts all<br>
	 * eight-bit-control bytes written by<br>
	 * CCL_WRITE_CHAR.  After execution,<br>
	 * if no such byte is written, set<br>
	 * this value to zero.
	 */
	@Field(17) 
	public int eight_bit_control() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * If nonzero, ccl_driver counts all<br>
	 * eight-bit-control bytes written by<br>
	 * CCL_WRITE_CHAR.  After execution,<br>
	 * if no such byte is written, set<br>
	 * this value to zero.
	 */
	@Field(17) 
	public ccl_program eight_bit_control(int eight_bit_control) {
		this.io.setIntField(this, 17, eight_bit_control);
		return this;
	}
	/**
	 * If nonzero, don't append "CCL:<br>
	 * Quitted" to the generated text when<br>
	 * CCL program is quitted.
	 */
	@Field(18) 
	public int quit_silently() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * If nonzero, don't append "CCL:<br>
	 * Quitted" to the generated text when<br>
	 * CCL program is quitted.
	 */
	@Field(18) 
	public ccl_program quit_silently(int quit_silently) {
		this.io.setIntField(this, 18, quit_silently);
		return this;
	}
}
