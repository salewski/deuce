package emacs.frame;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * <i>native declaration : dispextern.h:228</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("frame") 
public class glyph extends StructObject {
	public glyph() {
		super();
	}
	/// Width in pixels.
	@Field(2) 
	public short pixel_width() {
		return this.io.getShortField(this, 2);
	}
	/// Width in pixels.
	@Field(2) 
	public glyph pixel_width(short pixel_width) {
		this.io.setShortField(this, 2, pixel_width);
		return this;
	}
	/// Ascent and descent in pixels.
	@Field(3) 
	public short ascent() {
		return this.io.getShortField(this, 3);
	}
	/// Ascent and descent in pixels.
	@Field(3) 
	public glyph ascent(short ascent) {
		this.io.setShortField(this, 3, ascent);
		return this;
	}
	/// Ascent and descent in pixels.
	@Field(4) 
	public short descent() {
		return this.io.getShortField(this, 4);
	}
	/// Ascent and descent in pixels.
	@Field(4) 
	public glyph descent(short descent) {
		this.io.setShortField(this, 4, descent);
		return this;
	}
	/**
	 * Vertical offset.  If < 0, the glyph is displayed raised, if > 0<br>
	 * the glyph is displayed lowered.
	 */
	@Field(5) 
	public short voffset() {
		return this.io.getShortField(this, 5);
	}
	/**
	 * Vertical offset.  If < 0, the glyph is displayed raised, if > 0<br>
	 * the glyph is displayed lowered.
	 */
	@Field(5) 
	public glyph voffset(short voffset) {
		this.io.setShortField(this, 5, voffset);
		return this;
	}
	/**
	 * Which kind of glyph this is---character, image etc.  Value<br>
	 * should be an enumerator of type enum glyph_type.
	 */
	@Field(6) 
	@Bits(3) 
	public int type() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * Which kind of glyph this is---character, image etc.  Value<br>
	 * should be an enumerator of type enum glyph_type.
	 */
	@Field(6) 
	@Bits(3) 
	public glyph type(int type) {
		this.io.setIntField(this, 6, type);
		return this;
	}
	/**
	 * 1 means this glyph was produced from multibyte text.  Zero<br>
	 * means it was produced from unibyte text, i.e. charsets aren't<br>
	 * applicable, and encoding is not performed.
	 */
	@Field(7) 
	@Bits(1) 
	public int multibyte_p() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * 1 means this glyph was produced from multibyte text.  Zero<br>
	 * means it was produced from unibyte text, i.e. charsets aren't<br>
	 * applicable, and encoding is not performed.
	 */
	@Field(7) 
	@Bits(1) 
	public glyph multibyte_p(int multibyte_p) {
		this.io.setIntField(this, 7, multibyte_p);
		return this;
	}
	/**
	 * Non-zero means draw a box line at the left or right side of this<br>
	 * glyph.  This is part of the implementation of the face attribute<br>
	 * `:box'.
	 */
	@Field(8) 
	@Bits(1) 
	public int left_box_line_p() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * Non-zero means draw a box line at the left or right side of this<br>
	 * glyph.  This is part of the implementation of the face attribute<br>
	 * `:box'.
	 */
	@Field(8) 
	@Bits(1) 
	public glyph left_box_line_p(int left_box_line_p) {
		this.io.setIntField(this, 8, left_box_line_p);
		return this;
	}
	@Field(9) 
	@Bits(1) 
	public int right_box_line_p() {
		return this.io.getIntField(this, 9);
	}
	@Field(9) 
	@Bits(1) 
	public glyph right_box_line_p(int right_box_line_p) {
		this.io.setIntField(this, 9, right_box_line_p);
		return this;
	}
	/**
	 * Non-zero means this glyph's physical ascent or descent is greater<br>
	 * than its logical ascent/descent, i.e. it may potentially overlap<br>
	 * glyphs above or below it.
	 */
	@Field(10) 
	@Bits(1) 
	public int overlaps_vertically_p() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * Non-zero means this glyph's physical ascent or descent is greater<br>
	 * than its logical ascent/descent, i.e. it may potentially overlap<br>
	 * glyphs above or below it.
	 */
	@Field(10) 
	@Bits(1) 
	public glyph overlaps_vertically_p(int overlaps_vertically_p) {
		this.io.setIntField(this, 10, overlaps_vertically_p);
		return this;
	}
	/**
	 * For terminal frames, 1 means glyph is a padding glyph.  Padding<br>
	 * glyphs are used for characters whose visual shape consists of<br>
	 * more than one glyph (e.g. Asian characters).  All but the first<br>
	 * glyph of such a glyph sequence have the padding_p flag set.  This<br>
	 * flag is used only to minimize code changes.  A better way would<br>
	 * probably be to use the width field of glyphs to express padding.<br>
	 * For graphic frames, 1 means the pixel width of the glyph in a<br>
	 * font is 0, but 1-pixel is padded on displaying for correct cursor<br>
	 * displaying.  The member `pixel_width' above is set to 1.
	 */
	@Field(11) 
	@Bits(1) 
	public int padding_p() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * For terminal frames, 1 means glyph is a padding glyph.  Padding<br>
	 * glyphs are used for characters whose visual shape consists of<br>
	 * more than one glyph (e.g. Asian characters).  All but the first<br>
	 * glyph of such a glyph sequence have the padding_p flag set.  This<br>
	 * flag is used only to minimize code changes.  A better way would<br>
	 * probably be to use the width field of glyphs to express padding.<br>
	 * For graphic frames, 1 means the pixel width of the glyph in a<br>
	 * font is 0, but 1-pixel is padded on displaying for correct cursor<br>
	 * displaying.  The member `pixel_width' above is set to 1.
	 */
	@Field(11) 
	@Bits(1) 
	public glyph padding_p(int padding_p) {
		this.io.setIntField(this, 11, padding_p);
		return this;
	}
	/**
	 * 1 means the actual glyph is not available, draw using `struct<br>
	 * glyphless' below instead.  This can happen when a font couldn't<br>
	 * be loaded, or a character doesn't have a glyph in a font.
	 */
	@Field(12) 
	@Bits(1) 
	public int glyph_not_available_p() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * 1 means the actual glyph is not available, draw using `struct<br>
	 * glyphless' below instead.  This can happen when a font couldn't<br>
	 * be loaded, or a character doesn't have a glyph in a font.
	 */
	@Field(12) 
	@Bits(1) 
	public glyph glyph_not_available_p(int glyph_not_available_p) {
		this.io.setIntField(this, 12, glyph_not_available_p);
		return this;
	}
	/// Non-zero means don't display cursor here.
	@Field(13) 
	@Bits(1) 
	public int avoid_cursor_p() {
		return this.io.getIntField(this, 13);
	}
	/// Non-zero means don't display cursor here.
	@Field(13) 
	@Bits(1) 
	public glyph avoid_cursor_p(int avoid_cursor_p) {
		this.io.setIntField(this, 13, avoid_cursor_p);
		return this;
	}
	/// Resolved bidirectional level of this character [0..63].
	@Field(14) 
	@Bits(5) 
	public int resolved_level() {
		return this.io.getIntField(this, 14);
	}
	/// Resolved bidirectional level of this character [0..63].
	@Field(14) 
	@Bits(5) 
	public glyph resolved_level(int resolved_level) {
		this.io.setIntField(this, 14, resolved_level);
		return this;
	}
	/**
	 * Resolved bidirectional type of this character, see enum<br>
	 * bidi_type_t below.  Note that according to UAX#9, only some<br>
	 * values (STRONG_L, STRONG_R, WEAK_AN, WEAK_EN, WEAK_BN, and<br>
	 * NEUTRAL_B) can appear in the resolved type, so we only reserve<br>
	 * space for those that can.
	 */
	@Field(15) 
	@Bits(3) 
	public int bidi_type() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * Resolved bidirectional type of this character, see enum<br>
	 * bidi_type_t below.  Note that according to UAX#9, only some<br>
	 * values (STRONG_L, STRONG_R, WEAK_AN, WEAK_EN, WEAK_BN, and<br>
	 * NEUTRAL_B) can appear in the resolved type, so we only reserve<br>
	 * space for those that can.
	 */
	@Field(15) 
	@Bits(3) 
	public glyph bidi_type(int bidi_type) {
		this.io.setIntField(this, 15, bidi_type);
		return this;
	}
	/**
	 * Face of the glyph.  This is a realized face ID,<br>
	 * an index in the face cache of the frame.
	 */
	@Field(16) 
	@Bits(20) 
	public int face_id() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * Face of the glyph.  This is a realized face ID,<br>
	 * an index in the face cache of the frame.
	 */
	@Field(16) 
	@Bits(20) 
	public glyph face_id(int face_id) {
		this.io.setIntField(this, 16, face_id);
		return this;
	}
	/**
	 * Type of font used to display the character glyph.  May be used to<br>
	 * determine which set of functions to use to obtain font metrics<br>
	 * for the glyph.  On W32, value should be an enumerator of the type<br>
	 * w32_char_font_type.  Otherwise it equals FONT_TYPE_UNKNOWN.
	 */
	@Field(17) 
	@Bits(3) 
	public int font_type() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * Type of font used to display the character glyph.  May be used to<br>
	 * determine which set of functions to use to obtain font metrics<br>
	 * for the glyph.  On W32, value should be an enumerator of the type<br>
	 * w32_char_font_type.  Otherwise it equals FONT_TYPE_UNKNOWN.
	 */
	@Field(17) 
	@Bits(3) 
	public glyph font_type(int font_type) {
		this.io.setIntField(this, 17, font_type);
		return this;
	}
	/**
	 * A union of sub-structures for different glyph types.<br>
	 * C type : slice_union
	 */
	@Field(18) 
	public glyph.slice_union slice() {
		return this.io.getNativeObjectField(this, 18);
	}
	/**
	 * A union of sub-structures for different glyph types.<br>
	 * C type : slice_union
	 */
	@Field(18) 
	public glyph slice(glyph.slice_union slice) {
		this.io.setNativeObjectField(this, 18, slice);
		return this;
	}
	/**
	 * A union of sub-structures for different glyph types.<br>
	 * C type : u_union
	 */
	@Field(19) 
	public glyph.u_union u() {
		return this.io.getNativeObjectField(this, 19);
	}
	/**
	 * A union of sub-structures for different glyph types.<br>
	 * C type : u_union
	 */
	@Field(19) 
	public glyph u(glyph.u_union u) {
		this.io.setNativeObjectField(this, 19, u);
		return this;
	}
	/// <i>native declaration : dispextern.h:191</i>
	/// <i>native declaration : dispextern.h:191</i>
	@Union 
	public static class slice_union extends StructObject {
		public slice_union() {
			super();
		}
		/**
		 * Metrics of a partial glyph of an image (type == IMAGE_GLYPH).<br>
		 * C type : glyph_slice
		 */
		@Field(0) 
		public glyph_slice img() {
			return this.io.getNativeObjectField(this, 0);
		}
		/**
		 * Metrics of a partial glyph of an image (type == IMAGE_GLYPH).<br>
		 * C type : glyph_slice
		 */
		@Field(0) 
		public slice_union img(glyph_slice img) {
			this.io.setNativeObjectField(this, 0, img);
			return this;
		}
		/**
		 * Start and end indices of glyphs of a grapheme cluster of a<br>
		 * composition (type == COMPOSITE_GLYPH).<br>
		 * C type : cmp_struct
		 */
		@Field(1) 
		public glyph.slice_union.cmp_struct cmp() {
			return this.io.getNativeObjectField(this, 1);
		}
		/**
		 * Start and end indices of glyphs of a grapheme cluster of a<br>
		 * composition (type == COMPOSITE_GLYPH).<br>
		 * C type : cmp_struct
		 */
		@Field(1) 
		public slice_union cmp(glyph.slice_union.cmp_struct cmp) {
			this.io.setNativeObjectField(this, 1, cmp);
			return this;
		}
		/**
		 * Pixel offsets for upper and lower part of the acronym.<br>
		 * C type : glyphless_struct
		 */
		@Field(2) 
		public glyph.slice_union.glyphless_struct glyphless() {
			return this.io.getNativeObjectField(this, 2);
		}
		/**
		 * Pixel offsets for upper and lower part of the acronym.<br>
		 * C type : glyphless_struct
		 */
		@Field(2) 
		public slice_union glyphless(glyph.slice_union.glyphless_struct glyphless) {
			this.io.setNativeObjectField(this, 2, glyphless);
			return this;
		}
		/// <i>native declaration : dispextern.h:184</i>
		/// <i>native declaration : dispextern.h:184</i>
		public static class cmp_struct extends StructObject {
			public cmp_struct() {
				super();
			}
			@Field(0) 
			public int from() {
				return this.io.getIntField(this, 0);
			}
			@Field(0) 
			public cmp_struct from(int from) {
				this.io.setIntField(this, 0, from);
				return this;
			}
			@Field(1) 
			public int to() {
				return this.io.getIntField(this, 1);
			}
			@Field(1) 
			public cmp_struct to(int to) {
				this.io.setIntField(this, 1, to);
				return this;
			}
		};
		/// <i>native declaration : dispextern.h:190</i>
		/// <i>native declaration : dispextern.h:190</i>
		public static class glyphless_struct extends StructObject {
			public glyphless_struct() {
				super();
			}
			@Field(0) 
			public short upper_xoff() {
				return this.io.getShortField(this, 0);
			}
			@Field(0) 
			public glyphless_struct upper_xoff(short upper_xoff) {
				this.io.setShortField(this, 0, upper_xoff);
				return this;
			}
			@Field(1) 
			public short upper_yoff() {
				return this.io.getShortField(this, 1);
			}
			@Field(1) 
			public glyphless_struct upper_yoff(short upper_yoff) {
				this.io.setShortField(this, 1, upper_yoff);
				return this;
			}
			@Field(2) 
			public short lower_xoff() {
				return this.io.getShortField(this, 2);
			}
			@Field(2) 
			public glyphless_struct lower_xoff(short lower_xoff) {
				this.io.setShortField(this, 2, lower_xoff);
				return this;
			}
			@Field(3) 
			public short lower_yoff() {
				return this.io.getShortField(this, 3);
			}
			@Field(3) 
			public glyphless_struct lower_yoff(short lower_yoff) {
				this.io.setShortField(this, 3, lower_yoff);
				return this;
			}
		};
	};
	/// <i>native declaration : dispextern.h:227</i>
	/// <i>native declaration : dispextern.h:227</i>
	@Union 
	public static class u_union extends StructObject {
		public u_union() {
			super();
		}
		/// Character code for character glyphs (type == CHAR_GLYPH).
		@Field(0) 
		public int ch() {
			return this.io.getIntField(this, 0);
		}
		/// Character code for character glyphs (type == CHAR_GLYPH).
		@Field(0) 
		public u_union ch(int ch) {
			this.io.setIntField(this, 0, ch);
			return this;
		}
		/**
		 * Sub-structures for type == COMPOSITE_GLYPH.<br>
		 * C type : cmp_struct
		 */
		@Field(1) 
		public glyph.slice_union.cmp_struct cmp() {
			return this.io.getNativeObjectField(this, 1);
		}
		/**
		 * Sub-structures for type == COMPOSITE_GLYPH.<br>
		 * C type : cmp_struct
		 */
		@Field(1) 
		public u_union cmp(glyph.slice_union.cmp_struct cmp) {
			this.io.setNativeObjectField(this, 1, cmp);
			return this;
		}
		/// Image ID for image glyphs (type == IMAGE_GLYPH).
		@Field(2) 
		public int img_id() {
			return this.io.getIntField(this, 2);
		}
		/// Image ID for image glyphs (type == IMAGE_GLYPH).
		@Field(2) 
		public u_union img_id(int img_id) {
			this.io.setIntField(this, 2, img_id);
			return this;
		}
		/**
		 * Sub-structure for type == STRETCH_GLYPH.<br>
		 * C type : stretch_struct
		 */
		@Field(3) 
		public glyph.u_union.stretch_struct stretch() {
			return this.io.getNativeObjectField(this, 3);
		}
		/**
		 * Sub-structure for type == STRETCH_GLYPH.<br>
		 * C type : stretch_struct
		 */
		@Field(3) 
		public u_union stretch(glyph.u_union.stretch_struct stretch) {
			this.io.setNativeObjectField(this, 3, stretch);
			return this;
		}
		/**
		 * Sub-stretch for type == GLYPHLESS_GLYPH.<br>
		 * C type : glyphless_struct
		 */
		@Field(4) 
		public glyph.slice_union.glyphless_struct glyphless() {
			return this.io.getNativeObjectField(this, 4);
		}
		/**
		 * Sub-stretch for type == GLYPHLESS_GLYPH.<br>
		 * C type : glyphless_struct
		 */
		@Field(4) 
		public u_union glyphless(glyph.slice_union.glyphless_struct glyphless) {
			this.io.setNativeObjectField(this, 4, glyphless);
			return this;
		}
		/// Used to compare all bit-fields above in one step.
		@Field(5) 
		public int val() {
			return this.io.getIntField(this, 5);
		}
		/// Used to compare all bit-fields above in one step.
		@Field(5) 
		public u_union val(int val) {
			this.io.setIntField(this, 5, val);
			return this;
		}
		/// <i>native declaration : dispextern.h:210</i>
		/// <i>native declaration : dispextern.h:210</i>
		public static class cmp_struct extends StructObject {
			public cmp_struct() {
				super();
			}
			/// Flag to tell if the composition is automatic or not.
			@Field(0) 
			@Bits(1) 
			public int automatic() {
				return this.io.getIntField(this, 0);
			}
			/// Flag to tell if the composition is automatic or not.
			@Field(0) 
			@Bits(1) 
			public cmp_struct automatic(int automatic) {
				this.io.setIntField(this, 0, automatic);
				return this;
			}
		};
		/// <i>native declaration : dispextern.h:216</i>
		/// <i>native declaration : dispextern.h:216</i>
		public static class stretch_struct extends StructObject {
			public stretch_struct() {
				super();
			}
			/// The height of the glyph.
			@Field(0) 
			@Bits(16) 
			public int height() {
				return this.io.getIntField(this, 0);
			}
			/// The height of the glyph.
			@Field(0) 
			@Bits(16) 
			public stretch_struct height(int height) {
				this.io.setIntField(this, 0, height);
				return this;
			}
			/// The ascent of the glyph.
			@Field(1) 
			@Bits(16) 
			public int ascent() {
				return this.io.getIntField(this, 1);
			}
			/// The ascent of the glyph.
			@Field(1) 
			@Bits(16) 
			public stretch_struct ascent(int ascent) {
				this.io.setIntField(this, 1, ascent);
				return this;
			}
		};
		/// <i>native declaration : dispextern.h:226</i>
		/// <i>native declaration : dispextern.h:226</i>
		public static class glyphless_struct extends StructObject {
			public glyphless_struct() {
				super();
			}
			/// Value is an enum of the type glyphless_display_method.
			@Field(0) 
			@Bits(2) 
			public int method() {
				return this.io.getIntField(this, 0);
			}
			/// Value is an enum of the type glyphless_display_method.
			@Field(0) 
			@Bits(2) 
			public glyphless_struct method(int method) {
				this.io.setIntField(this, 0, method);
				return this;
			}
			/// 1 iff this glyph is for a character of no font.
			@Field(1) 
			@Bits(1) 
			public int for_no_font() {
				return this.io.getIntField(this, 1);
			}
			/// 1 iff this glyph is for a character of no font.
			@Field(1) 
			@Bits(1) 
			public glyphless_struct for_no_font(int for_no_font) {
				this.io.setIntField(this, 1, for_no_font);
				return this;
			}
			/// Length of acronym or hexadecimal code string (at most 8).
			@Field(2) 
			@Bits(4) 
			public int len() {
				return this.io.getIntField(this, 2);
			}
			/// Length of acronym or hexadecimal code string (at most 8).
			@Field(2) 
			@Bits(4) 
			public glyphless_struct len(int len) {
				this.io.setIntField(this, 2, len);
				return this;
			}
			/// Character to display.  Actually we need only 22 bits.
			@Field(3) 
			@Bits(25) 
			public int ch() {
				return this.io.getIntField(this, 3);
			}
			/// Character to display.  Actually we need only 22 bits.
			@Field(3) 
			@Bits(25) 
			public glyphless_struct ch(int ch) {
				this.io.setIntField(this, 3, ch);
				return this;
			}
		};
	};
}
