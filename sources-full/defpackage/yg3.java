package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg3 implements yw0 {
    public final ah3 c;
    public final long d;
    public final Object h;
    public final t00 l;

    public yg3(ah3 ah3Var, long j, Object obj, t00 t00Var) {
        this.c = ah3Var;
        this.d = j;
        this.h = obj;
        this.l = t00Var;
    }

    @Override // defpackage.yw0
    public final void dispose() {
        ah3 ah3Var = this.c;
        synchronized (ah3Var) {
            if (this.d < ah3Var.t()) {
                return;
            }
            Object[] objArr = ah3Var.p;
            objArr.getClass();
            long j = this.d;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            xr0.I(objArr, j, xr0.d);
            ah3Var.o();
        }
    }
}
