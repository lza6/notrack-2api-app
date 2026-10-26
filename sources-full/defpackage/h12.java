package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h12 implements g12 {
    public final /* synthetic */ g22 a;
    public final /* synthetic */ boolean b;

    public h12(g22 g22Var, boolean z) {
        this.a = g22Var;
        this.b = z;
    }

    @Override // defpackage.g12
    public final int a() {
        g22 g22Var = this.a;
        return (int) (g22Var.g().p == nq2.c ? g22Var.g().e() & 4294967295L : g22Var.g().e() >> 32);
    }

    @Override // defpackage.g12
    public final float b() {
        g22 g22Var = this.a;
        return (g22Var.d.b.f() * 500) + g22Var.d.c.f();
    }

    @Override // defpackage.g12
    public final he0 c() {
        return this.b ? new he0(-1, 1) : new he0(1, -1);
    }

    @Override // defpackage.g12
    public final Object d(int i, k12 k12Var) throws Throwable {
        fp1 fp1Var = g22.w;
        Object objI = this.a.i(i, 0, k12Var);
        return objI == hq0.c ? objI : w84.a;
    }

    @Override // defpackage.g12
    public final int e() {
        g22 g22Var = this.a;
        return (-g22Var.g().l) + g22Var.g().q;
    }

    @Override // defpackage.g12
    public final float f() {
        g22 g22Var = this.a;
        int iF = g22Var.d.b.f();
        int iF2 = g22Var.d.c.f();
        return g22Var.c() ? (iF * 500) + iF2 + 100.0f : (iF * 500) + iF2;
    }
}
