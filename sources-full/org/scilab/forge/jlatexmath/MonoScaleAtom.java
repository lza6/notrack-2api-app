package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class MonoScaleAtom extends ScaleAtom {
    private float factor;

    /* JADX WARN: Illegal instructions before constructor call */
    public MonoScaleAtom(Atom atom, float f) {
        double d = f;
        super(atom, d, d);
        this.factor = f;
    }

    @Override // org.scilab.forge.jlatexmath.ScaleAtom, org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment teXEnvironmentCopy = teXEnvironment.copy();
        float scaleFactor = teXEnvironmentCopy.getScaleFactor();
        teXEnvironmentCopy.setScaleFactor(this.factor);
        return new ScaleBox(this.base.createBox(teXEnvironmentCopy), this.factor / scaleFactor);
    }
}
