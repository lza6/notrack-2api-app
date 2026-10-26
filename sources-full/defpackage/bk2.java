package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bk2 extends pk3 {
    public final le1 e;
    public final pk3 f;

    public bk2(long j, uk3 uk3Var, le1 le1Var, pk3 pk3Var) {
        super(j, uk3Var);
        this.e = le1Var;
        this.f = pk3Var;
        pk3Var.k();
    }

    @Override // defpackage.pk3
    public final void c() {
        pk3 pk3Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != pk3Var.g()) {
            a();
        }
        pk3Var.l();
        this.c = true;
        synchronized (vk3.b) {
            o();
        }
    }

    @Override // defpackage.pk3
    public final le1 e() {
        return this.e;
    }

    @Override // defpackage.pk3
    public final boolean f() {
        return true;
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
    }

    @Override // defpackage.pk3
    public final void n(ln3 ln3Var) {
        iy2 iy2Var = vk3.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.pk3
    public final pk3 u(le1 le1Var) {
        return new bk2(this.b, this.a, vk3.l(le1Var, this.e, true), this.f);
    }
}
