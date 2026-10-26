package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d64 extends li2 {
    public final li2 o;
    public final boolean p;
    public final boolean q;
    public le1 r;
    public le1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public d64(li2 li2Var, le1 le1Var, le1 le1Var2, boolean z, boolean z2) {
        le1 le1VarI;
        le1 le1VarY;
        iy2 iy2Var = vk3.a;
        super(0L, uk3.m, vk3.l(le1Var, (li2Var == null || (le1VarY = li2Var.e()) == null) ? vk3.i.e : le1VarY, z), vk3.b(le1Var2, (li2Var == null || (le1VarI = li2Var.i()) == null) ? vk3.i.f : le1VarI));
        this.o = li2Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = py.A();
    }

    @Override // defpackage.li2
    public final void B(gi2 gi2Var) {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2
    public final li2 C(le1 le1Var, le1 le1Var2) {
        le1 le1VarL = vk3.l(le1Var, this.r, true);
        le1 le1VarB = vk3.b(le1Var2, this.s);
        return !this.p ? new d64(D().C(null, le1VarB), le1VarL, le1VarB, false, true) : D().C(le1VarL, le1VarB);
    }

    public final li2 D() {
        li2 li2Var = this.o;
        return li2Var == null ? vk3.i : li2Var;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void c() {
        li2 li2Var;
        this.c = true;
        if (!this.q || (li2Var = this.o) == null) {
            return;
        }
        li2Var.c();
    }

    @Override // defpackage.pk3
    public final uk3 d() {
        return D().d();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final le1 e() {
        return this.r;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.pk3
    public final long g() {
        return D().g();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final int h() {
        return D().h();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final le1 i() {
        return this.s;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void k() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void l() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void m() {
        D().m();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void n(ln3 ln3Var) {
        D().n(ln3Var);
    }

    @Override // defpackage.pk3
    public final void r(uk3 uk3Var) {
        jr1.P();
        throw null;
    }

    @Override // defpackage.pk3
    public final void s(long j) {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.li2, defpackage.pk3
    public final pk3 u(le1 le1Var) {
        le1 le1VarL = vk3.l(le1Var, this.r, true);
        return !this.p ? vk3.h(D().u(null), le1VarL, true) : D().u(le1VarL);
    }

    @Override // defpackage.li2
    public final xr0 w() {
        return D().w();
    }

    @Override // defpackage.li2
    public final gi2 x() {
        return D().x();
    }

    @Override // defpackage.li2
    /* JADX INFO: renamed from: y */
    public final le1 e() {
        return this.r;
    }
}
