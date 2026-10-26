package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class ItAtom extends Atom {
    private Atom base;

    public ItAtom(Atom atom) {
        this.base = atom;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.base == null) {
            return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        }
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        teXEnvironmentCopy.getTeXFont().setIt(true);
        return this.base.createBox(teXEnvironmentCopy);
    }
}
