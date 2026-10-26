package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n12 implements h02 {
    public final g22 a;
    public final int b;

    public n12(g22 g22Var, int i) {
        this.a = g22Var;
        this.b = i;
    }

    @Override // defpackage.h02
    public final int a() {
        return this.a.g().n;
    }

    @Override // defpackage.h02
    public final int b() {
        return Math.min(a() - 1, ((a22) ke0.E0(this.a.g().k)).a + this.b);
    }

    @Override // defpackage.h02
    public final boolean c() {
        return !this.a.g().k.isEmpty();
    }

    @Override // defpackage.h02
    public final int d() {
        int i;
        g22 g22Var = this.a;
        if (g22Var.g().k.isEmpty()) {
            return 0;
        }
        z12 z12VarG = g22Var.g();
        int iE = (int) (z12VarG.p == nq2.c ? z12VarG.e() & 4294967295L : z12VarG.e() >> 32);
        int iP0 = kr1.p0(g22Var.g());
        if (iP0 != 0 && (i = iE / iP0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.h02
    public final int e() {
        return Math.max(0, this.a.d.b.f() - this.b);
    }
}
