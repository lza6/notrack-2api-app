package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class TextStyleAtom extends Atom {
    private Atom at;
    private String style;

    public TextStyleAtom(Atom atom, String str) {
        this.style = str;
        this.at = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        String textStyle = teXEnvironment.getTextStyle();
        teXEnvironment.setTextStyle(this.style);
        Box boxCreateBox = this.at.createBox(teXEnvironment);
        teXEnvironment.setTextStyle(textStyle);
        return boxCreateBox;
    }
}
