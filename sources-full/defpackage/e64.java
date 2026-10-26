package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e64 extends pk3 {
    public final pk3 e;
    public final boolean f;
    public le1 g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e64(pk3 pk3Var, le1 le1Var, boolean z) {
        le1 le1VarE;
        super(0L, uk3.m);
        iy2 iy2Var = vk3.a;
        this.e = pk3Var;
        this.f = z;
        this.g = vk3.l(le1Var, (pk3Var == null || (le1VarE = pk3Var.e()) == null) ? vk3.i.e : le1VarE, false);
        this.h = py.A();
    }

    @Override // defpackage.pk3
    public final void c() {
        pk3 pk3Var;
        this.c = true;
        if (!this.f || (pk3Var = this.e) == null) {
            return;
        }
        pk3Var.c();
    }

    @Override // defpackage.pk3
    public final uk3 d() {
        return v().d();
    }

    @Override // defpackage.pk3
    public final le1 e() {
        return this.g;
    }

    @Override // defpackage.pk3
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.pk3
    public final long g() {
        return v().g();
    }

    @Override // defpackage.pk3
    public final le1 i() {
        return null;
    }

    @Override // defpackage.pk3
    public final void k() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.pk3
    public final void l() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.pk3
    public final void m() {
        v().m();
    }

    @Override // defpackage.pk3
    public final void n(ln3 ln3Var) {
        v().n(ln3Var);
    }

    @Override // defpackage.pk3
    public final pk3 u(le1 le1Var) {
        return vk3.h(v().u(null), vk3.l(le1Var, this.g, true), true);
    }

    public final pk3 v() {
        pk3 pk3Var = this.e;
        return pk3Var == null ? vk3.i : pk3Var;
    }
}
