package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class FixedCharAtom extends CharSymbol {
    private final CharFont cf;

    public FixedCharAtom(CharFont charFont) {
        this.cf = charFont;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new CharBox(teXEnvironment.getTeXFont().getChar(this.cf, teXEnvironment.getStyle()));
    }

    @Override // org.scilab.forge.jlatexmath.CharSymbol
    public CharFont getCharFont(TeXFont teXFont) {
        return this.cf;
    }
}
