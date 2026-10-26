package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class BreakMarkAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
