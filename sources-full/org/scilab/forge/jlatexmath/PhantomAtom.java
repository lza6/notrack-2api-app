package org.scilab.forge.jlatexmath;

/* JADX INFO: loaded from: classes.dex */
public class PhantomAtom extends Atom implements Row {
    private boolean d;
    private RowAtom elements;
    private boolean h;
    private boolean w;

    public PhantomAtom(Atom atom) {
        this.w = true;
        this.h = true;
        this.d = true;
        if (atom == null) {
            this.elements = new RowAtom();
        } else {
            this.elements = new RowAtom(atom);
        }
    }

    public PhantomAtom(Atom atom, boolean z, boolean z2, boolean z3) {
        this(atom);
        this.w = z;
        this.h = z2;
        this.d = z3;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.elements.createBox(teXEnvironment);
        return new StrutBox(this.w ? boxCreateBox.getWidth() : 0.0f, this.h ? boxCreateBox.getHeight() : 0.0f, this.d ? boxCreateBox.getDepth() : 0.0f, boxCreateBox.getShift());
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.elements.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.elements.getRightType();
    }

    @Override // org.scilab.forge.jlatexmath.Row
    public void setPreviousAtom(Dummy dummy) {
        this.elements.setPreviousAtom(dummy);
    }
}
