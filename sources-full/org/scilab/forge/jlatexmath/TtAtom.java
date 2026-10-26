package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class TtAtom extends Atom {
    private Atom base;

    public TtAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setTt(true);
        Box boxCreateBox = this.base.createBox(teXEnvironmentCopy);
        teXEnvironmentCopy.getTeXFont().setTt(false);
        return boxCreateBox;
    }
}
