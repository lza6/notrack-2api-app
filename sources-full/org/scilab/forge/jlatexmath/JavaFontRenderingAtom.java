package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Font;

/* JADX INFO: loaded from: classes.dex */
public class JavaFontRenderingAtom extends Atom {
    private TeXFormula.FontInfos fontInfos;
    private String str;
    private int type;

    public JavaFontRenderingAtom(String str, int i) {
        this.str = str;
        this.type = i;
    }

    public JavaFontRenderingAtom(String str, TeXFormula.FontInfos fontInfos) {
        this(str, 0);
        this.fontInfos = fontInfos;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Font font;
        Font font2;
        Font font3;
        if (this.fontInfos == null) {
            return new JavaFontRenderingBox(this.str, this.type, DefaultTeXFont.getSizeFactor(teXEnvironment.getStyle()));
        }
        DefaultTeXFont defaultTeXFont = (DefaultTeXFont) teXEnvironment.getTeXFont();
        int i = (defaultTeXFont.isIt ? 2 : 0) | (defaultTeXFont.isBold ? 1 : 0);
        boolean z = defaultTeXFont.isRoman;
        boolean z2 = defaultTeXFont.isSs;
        TeXFormula.FontInfos fontInfos = this.fontInfos;
        if (z2) {
            String str = fontInfos.sansserif;
            if (str == null) {
                font2 = new Font(fontInfos.serif, 0, 10);
                font3 = font2;
            } else {
                font = new Font(str, 0, 10);
                font3 = font;
            }
        } else {
            String str2 = fontInfos.serif;
            if (str2 == null) {
                font2 = new Font(fontInfos.sansserif, 0, 10);
                font3 = font2;
            } else {
                font = new Font(str2, 0, 10);
                font3 = font;
            }
        }
        return new JavaFontRenderingBox(this.str, i, DefaultTeXFont.getSizeFactor(teXEnvironment.getStyle()), font3, z);
    }
}
