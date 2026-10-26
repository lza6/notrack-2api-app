package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class SsAtom extends Atom {
    private Atom base;

    public SsAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setSs(true);
        Box boxCreateBox = this.base.createBox(teXEnvironmentCopy);
        teXEnvironmentCopy.getTeXFont().setSs(false);
        return boxCreateBox;
    }
}
