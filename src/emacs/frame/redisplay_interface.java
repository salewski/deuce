package emacs.frame;
import emacs.frame.FrameLibrary.frame_parm_handler;
import emacs.frame.FrameLibrary.glyph_row_area;
import emacs.frame.FrameLibrary.window;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : dispextern.h:1687</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("frame") 
public class redisplay_interface extends StructObject {
	public redisplay_interface() {
		super();
	}
	/**
	 * Handlers for setting frame parameters.<br>
	 * C type : frame_parm_handler*
	 */
	@Field(0) 
	public Pointer<Pointer<frame_parm_handler > > frame_parm_handlers() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Handlers for setting frame parameters.<br>
	 * C type : frame_parm_handler*
	 */
	@Field(0) 
	public redisplay_interface frame_parm_handlers(Pointer<Pointer<frame_parm_handler > > frame_parm_handlers) {
		this.io.setPointerField(this, 0, frame_parm_handlers);
		return this;
	}
	/**
	 * Produce glyphs/get display metrics for the display element IT is<br>
	 * loaded with.<br>
	 * C type : produce_glyphs_callback
	 */
	@Field(1) 
	public Pointer<redisplay_interface.produce_glyphs_callback > produce_glyphs() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Produce glyphs/get display metrics for the display element IT is<br>
	 * loaded with.<br>
	 * C type : produce_glyphs_callback
	 */
	@Field(1) 
	public redisplay_interface produce_glyphs(Pointer<redisplay_interface.produce_glyphs_callback > produce_glyphs) {
		this.io.setPointerField(this, 1, produce_glyphs);
		return this;
	}
	/**
	 * Write or insert LEN glyphs from STRING at the nominal output<br>
	 * position.<br>
	 * C type : write_glyphs_callback
	 */
	@Field(2) 
	public Pointer<redisplay_interface.write_glyphs_callback > write_glyphs() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * Write or insert LEN glyphs from STRING at the nominal output<br>
	 * position.<br>
	 * C type : write_glyphs_callback
	 */
	@Field(2) 
	public redisplay_interface write_glyphs(Pointer<redisplay_interface.write_glyphs_callback > write_glyphs) {
		this.io.setPointerField(this, 2, write_glyphs);
		return this;
	}
	/// C type : insert_glyphs_callback
	@Field(3) 
	public Pointer<redisplay_interface.insert_glyphs_callback > insert_glyphs() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : insert_glyphs_callback
	@Field(3) 
	public redisplay_interface insert_glyphs(Pointer<redisplay_interface.insert_glyphs_callback > insert_glyphs) {
		this.io.setPointerField(this, 3, insert_glyphs);
		return this;
	}
	/**
	 * Clear from nominal output position to X.  X < 0 means clear<br>
	 * to right end of display.<br>
	 * C type : clear_end_of_line_callback
	 */
	@Field(4) 
	public Pointer<redisplay_interface.clear_end_of_line_callback > clear_end_of_line() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * Clear from nominal output position to X.  X < 0 means clear<br>
	 * to right end of display.<br>
	 * C type : clear_end_of_line_callback
	 */
	@Field(4) 
	public redisplay_interface clear_end_of_line(Pointer<redisplay_interface.clear_end_of_line_callback > clear_end_of_line) {
		this.io.setPointerField(this, 4, clear_end_of_line);
		return this;
	}
	/**
	 * Function to call to scroll the display as described by RUN on<br>
	 * window W.<br>
	 * C type : scroll_run_hook_callback
	 */
	@Field(5) 
	public Pointer<redisplay_interface.scroll_run_hook_callback > scroll_run_hook() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * Function to call to scroll the display as described by RUN on<br>
	 * window W.<br>
	 * C type : scroll_run_hook_callback
	 */
	@Field(5) 
	public redisplay_interface scroll_run_hook(Pointer<redisplay_interface.scroll_run_hook_callback > scroll_run_hook) {
		this.io.setPointerField(this, 5, scroll_run_hook);
		return this;
	}
	/**
	 * Function to call after a line in a display has been completely<br>
	 * updated.  Used to draw truncation marks and alike.  DESIRED_ROW<br>
	 * is the desired row which has been updated.<br>
	 * C type : after_update_window_line_hook_callback
	 */
	@Field(6) 
	public Pointer<redisplay_interface.after_update_window_line_hook_callback > after_update_window_line_hook() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * Function to call after a line in a display has been completely<br>
	 * updated.  Used to draw truncation marks and alike.  DESIRED_ROW<br>
	 * is the desired row which has been updated.<br>
	 * C type : after_update_window_line_hook_callback
	 */
	@Field(6) 
	public redisplay_interface after_update_window_line_hook(Pointer<redisplay_interface.after_update_window_line_hook_callback > after_update_window_line_hook) {
		this.io.setPointerField(this, 6, after_update_window_line_hook);
		return this;
	}
	/**
	 * Function to call before beginning to update window W in<br>
	 * window-based redisplay.<br>
	 * C type : update_window_begin_hook_callback
	 */
	@Field(7) 
	public Pointer<redisplay_interface.update_window_begin_hook_callback > update_window_begin_hook() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * Function to call before beginning to update window W in<br>
	 * window-based redisplay.<br>
	 * C type : update_window_begin_hook_callback
	 */
	@Field(7) 
	public redisplay_interface update_window_begin_hook(Pointer<redisplay_interface.update_window_begin_hook_callback > update_window_begin_hook) {
		this.io.setPointerField(this, 7, update_window_begin_hook);
		return this;
	}
	/**
	 * Function to call after window W has been updated in window-based<br>
	 * redisplay.  CURSOR_ON_P non-zero means switch cursor on.<br>
	 * MOUSE_FACE_OVERWRITTEN_P non-zero means that some lines in W<br>
	 * that contained glyphs in mouse-face were overwritten, so we<br>
	 * have to update the mouse highlight.<br>
	 * C type : update_window_end_hook_callback
	 */
	@Field(8) 
	public Pointer<redisplay_interface.update_window_end_hook_callback > update_window_end_hook() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * Function to call after window W has been updated in window-based<br>
	 * redisplay.  CURSOR_ON_P non-zero means switch cursor on.<br>
	 * MOUSE_FACE_OVERWRITTEN_P non-zero means that some lines in W<br>
	 * that contained glyphs in mouse-face were overwritten, so we<br>
	 * have to update the mouse highlight.<br>
	 * C type : update_window_end_hook_callback
	 */
	@Field(8) 
	public redisplay_interface update_window_end_hook(Pointer<redisplay_interface.update_window_end_hook_callback > update_window_end_hook) {
		this.io.setPointerField(this, 8, update_window_end_hook);
		return this;
	}
	/**
	 * Move cursor to row/column position VPOS/HPOS, pixel coordinates<br>
	 * Y/X. HPOS/VPOS are window-relative row and column numbers and X/Y<br>
	 * are window-relative pixel positions.<br>
	 * C type : cursor_to_callback
	 */
	@Field(9) 
	public Pointer<redisplay_interface.cursor_to_callback > cursor_to() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * Move cursor to row/column position VPOS/HPOS, pixel coordinates<br>
	 * Y/X. HPOS/VPOS are window-relative row and column numbers and X/Y<br>
	 * are window-relative pixel positions.<br>
	 * C type : cursor_to_callback
	 */
	@Field(9) 
	public redisplay_interface cursor_to(Pointer<redisplay_interface.cursor_to_callback > cursor_to) {
		this.io.setPointerField(this, 9, cursor_to);
		return this;
	}
	/**
	 * Flush the display of frame F.  For X, this is XFlush.<br>
	 * C type : flush_display_callback
	 */
	@Field(10) 
	public Pointer<redisplay_interface.flush_display_callback > flush_display() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * Flush the display of frame F.  For X, this is XFlush.<br>
	 * C type : flush_display_callback
	 */
	@Field(10) 
	public redisplay_interface flush_display(Pointer<redisplay_interface.flush_display_callback > flush_display) {
		this.io.setPointerField(this, 10, flush_display);
		return this;
	}
	/**
	 * Flush the display of frame F if non-NULL.  This is called<br>
	 * during redisplay, and should be NULL on systems which flush<br>
	 * automatically before reading input.<br>
	 * C type : flush_display_optional_callback
	 */
	@Field(11) 
	public Pointer<redisplay_interface.flush_display_optional_callback > flush_display_optional() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * Flush the display of frame F if non-NULL.  This is called<br>
	 * during redisplay, and should be NULL on systems which flush<br>
	 * automatically before reading input.<br>
	 * C type : flush_display_optional_callback
	 */
	@Field(11) 
	public redisplay_interface flush_display_optional(Pointer<redisplay_interface.flush_display_optional_callback > flush_display_optional) {
		this.io.setPointerField(this, 11, flush_display_optional);
		return this;
	}
	/**
	 * Clear the mouse highlight in window W, if there is any.<br>
	 * C type : clear_window_mouse_face_callback
	 */
	@Field(12) 
	public Pointer<redisplay_interface.clear_window_mouse_face_callback > clear_window_mouse_face() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * Clear the mouse highlight in window W, if there is any.<br>
	 * C type : clear_window_mouse_face_callback
	 */
	@Field(12) 
	public redisplay_interface clear_window_mouse_face(Pointer<redisplay_interface.clear_window_mouse_face_callback > clear_window_mouse_face) {
		this.io.setPointerField(this, 12, clear_window_mouse_face);
		return this;
	}
	/**
	 * Set *LEFT and *RIGHT to the left and right overhang of GLYPH on<br>
	 * frame F.<br>
	 * C type : get_glyph_overhangs_callback
	 */
	@Field(13) 
	public Pointer<redisplay_interface.get_glyph_overhangs_callback > get_glyph_overhangs() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * Set *LEFT and *RIGHT to the left and right overhang of GLYPH on<br>
	 * frame F.<br>
	 * C type : get_glyph_overhangs_callback
	 */
	@Field(13) 
	public redisplay_interface get_glyph_overhangs(Pointer<redisplay_interface.get_glyph_overhangs_callback > get_glyph_overhangs) {
		this.io.setPointerField(this, 13, get_glyph_overhangs);
		return this;
	}
	/**
	 * Fix the display of AREA of ROW in window W for overlapping rows.<br>
	 * This function is called from redraw_overlapping_rows after<br>
	 * desired rows have been made current.<br>
	 * C type : fix_overlapping_area_callback
	 */
	@Field(14) 
	public Pointer<redisplay_interface.fix_overlapping_area_callback > fix_overlapping_area() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * Fix the display of AREA of ROW in window W for overlapping rows.<br>
	 * This function is called from redraw_overlapping_rows after<br>
	 * desired rows have been made current.<br>
	 * C type : fix_overlapping_area_callback
	 */
	@Field(14) 
	public redisplay_interface fix_overlapping_area(Pointer<redisplay_interface.fix_overlapping_area_callback > fix_overlapping_area) {
		this.io.setPointerField(this, 14, fix_overlapping_area);
		return this;
	}
	/// <i>native declaration : dispextern.h:1671</i>
	/// <i>native declaration : dispextern.h:1671</i>
	public static abstract class produce_glyphs_callback extends Callback<produce_glyphs_callback > {
		public abstract void apply(Pointer<it > it);
	};
	/// <i>native declaration : dispextern.h:1672</i>
	/// <i>native declaration : dispextern.h:1672</i>
	public static abstract class write_glyphs_callback extends Callback<write_glyphs_callback > {
		public abstract void apply(Pointer<glyph > string, int len);
	};
	/// <i>native declaration : dispextern.h:1673</i>
	/// <i>native declaration : dispextern.h:1673</i>
	public static abstract class insert_glyphs_callback extends Callback<insert_glyphs_callback > {
		public abstract void apply(Pointer<glyph > start, int len);
	};
	/// <i>native declaration : dispextern.h:1674</i>
	/// <i>native declaration : dispextern.h:1674</i>
	public static abstract class clear_end_of_line_callback extends Callback<clear_end_of_line_callback > {
		public abstract void apply(int x);
	};
	/// <i>native declaration : dispextern.h:1675</i>
	/// <i>native declaration : dispextern.h:1675</i>
	public static abstract class scroll_run_hook_callback extends Callback<scroll_run_hook_callback > {
		public abstract void apply(Pointer<window > w, Pointer<run > run);
	};
	/// <i>native declaration : dispextern.h:1676</i>
	/// <i>native declaration : dispextern.h:1676</i>
	public static abstract class after_update_window_line_hook_callback extends Callback<after_update_window_line_hook_callback > {
		public abstract void apply(Pointer<glyph_row > desired_row);
	};
	/// <i>native declaration : dispextern.h:1677</i>
	/// <i>native declaration : dispextern.h:1677</i>
	public static abstract class update_window_begin_hook_callback extends Callback<update_window_begin_hook_callback > {
		public abstract void apply(Pointer<window > w);
	};
	/// <i>native declaration : dispextern.h:1678</i>
	/// <i>native declaration : dispextern.h:1678</i>
	public static abstract class update_window_end_hook_callback extends Callback<update_window_end_hook_callback > {
		public abstract void apply(Pointer<window > w, int cursor_on_p, int mouse_face_overwritten_p);
	};
	/// <i>native declaration : dispextern.h:1679</i>
	/// <i>native declaration : dispextern.h:1679</i>
	public static abstract class cursor_to_callback extends Callback<cursor_to_callback > {
		public abstract void apply(int vpos, int hpos, int y, int x);
	};
	/// <i>native declaration : dispextern.h:1680</i>
	/// <i>native declaration : dispextern.h:1680</i>
	public static abstract class flush_display_callback extends Callback<flush_display_callback > {
		public abstract void apply(Pointer<frame > f);
	};
	/// <i>native declaration : dispextern.h:1681</i>
	/// <i>native declaration : dispextern.h:1681</i>
	public static abstract class flush_display_optional_callback extends Callback<flush_display_optional_callback > {
		public abstract void apply(Pointer<frame > f);
	};
	/// <i>native declaration : dispextern.h:1682</i>
	/// <i>native declaration : dispextern.h:1682</i>
	public static abstract class clear_window_mouse_face_callback extends Callback<clear_window_mouse_face_callback > {
		public abstract void apply(Pointer<window > w);
	};
	/// <i>native declaration : dispextern.h:1683</i>
	/// <i>native declaration : dispextern.h:1683</i>
	public static abstract class get_glyph_overhangs_callback extends Callback<get_glyph_overhangs_callback > {
		public abstract void apply(Pointer<glyph > glyph, Pointer<frame > f, Pointer<Integer > left, Pointer<Integer > right);
	};
	/// <i>native declaration : dispextern.h:1686</i>
	/// <i>native declaration : dispextern.h:1686</i>
	public static abstract class fix_overlapping_area_callback extends Callback<fix_overlapping_area_callback > {
		public abstract void apply(Pointer<window > w, Pointer<glyph_row > row, IntValuedEnum<glyph_row_area > area, int int1);
	};
}
