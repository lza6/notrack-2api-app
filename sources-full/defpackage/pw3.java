package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw3 implements gc3 {
    public final /* synthetic */ gc3 a;
    public final fv0 b;
    public final fv0 c;

    public pw3(gc3 gc3Var, rw3 rw3Var) {
        this.a = gc3Var;
        this.b = cl3.b(new ow3(rw3Var, 1));
        this.c = cl3.b(new ow3(rw3Var, 0));
    }

    @Override // defpackage.gc3
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.gc3
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final Object d(ri2 ri2Var, ne1 ne1Var, uo0 uo0Var) {
        return this.a.d(ri2Var, ne1Var, uo0Var);
    }

    @Override // defpackage.gc3
    public final float e(float f) {
        return this.a.e(f);
    }
}
