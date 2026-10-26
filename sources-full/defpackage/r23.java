package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r23 extends pk3 {
    public final le1 e;
    public int f;

    public r23(long j, uk3 uk3Var, le1 le1Var) {
        super(j, uk3Var);
        this.e = le1Var;
        this.f = 1;
    }

    @Override // defpackage.pk3
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.pk3
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
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
        vk3.d(this);
        return new bk2(this.b, this.a, vk3.l(le1Var, this.e, true), this);
    }
}
