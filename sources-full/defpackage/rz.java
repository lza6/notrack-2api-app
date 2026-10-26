package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements wu0 {
    public qy c = bg1.o;
    public sz0 d;

    public final sz0 a(le1 le1Var) {
        sz0 sz0Var = new sz0();
        sz0Var.c = le1Var;
        this.d = sz0Var;
        return sz0Var;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c.getDensity().getDensity();
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.c.getDensity().l();
    }
}
