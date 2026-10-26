package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends bz0 {
    public nz0 s;
    public nq2 t;
    public boolean u;
    public oe1 v;
    public oe1 w;
    public boolean x;

    @Override // defpackage.bz0
    public final Object C0(az0 az0Var, az0 az0Var2) {
        Object objA = this.s.a(new q8(az0Var, this, (so0) null, 19), az0Var2);
        return objA == hq0.c ? objA : w84.a;
    }

    @Override // defpackage.bz0
    public final void D0(long j) {
        if (!isAttached() || kr1.n(this.v, kz0.a)) {
            return;
        }
        py.F(getCoroutineScope(), null, jq0.l, new lz0(this, j, (so0) null, 0), 1);
    }

    @Override // defpackage.bz0
    public final void E0(long j) {
        if (!isAttached() || kr1.n(this.w, kz0.b)) {
            return;
        }
        py.F(getCoroutineScope(), null, jq0.l, new lz0(this, j, (so0) null, 1), 1);
    }

    @Override // defpackage.bz0
    public final boolean F0() {
        return this.u;
    }
}
