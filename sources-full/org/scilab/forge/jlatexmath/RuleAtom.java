package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class RuleAtom extends Atom {
    private float h;
    private int hunit;
    private float r;
    private int runit;
    private float w;
    private int wunit;

    public RuleAtom(int i, float f, int i2, float f2, int i3, float f3) {
        this.wunit = i;
        this.hunit = i2;
        this.runit = i3;
        this.w = f;
        this.h = f2;
        this.r = f3;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return new HorizontalRule(SpaceAtom.getFactor(this.hunit, teXEnvironment) * this.h, SpaceAtom.getFactor(this.wunit, teXEnvironment) * this.w, SpaceAtom.getFactor(this.runit, teXEnvironment) * this.r);
    }
}
