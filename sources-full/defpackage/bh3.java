package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh3 extends y0 {
    public long a;
    public t00 b;

    @Override // defpackage.y0
    public final boolean a(x0 x0Var) {
        ah3 ah3Var = (ah3) x0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ah3Var.q;
        if (j < ah3Var.r) {
            ah3Var.r = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.y0
    public final so0[] b(x0 x0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ah3) x0Var).z(j);
    }
}
