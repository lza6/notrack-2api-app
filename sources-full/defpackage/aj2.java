package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aj2 extends zp0 implements du0 {
    public final /* synthetic */ du0 c;
    public final zp0 d;
    public final String h;

    /* JADX WARN: Multi-variable type inference failed */
    public aj2(zp0 zp0Var, String str) {
        du0 du0Var = zp0Var instanceof du0 ? (du0) zp0Var : null;
        this.c = du0Var == null ? ts0.a : du0Var;
        this.d = zp0Var;
        this.h = str;
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        this.d.dispatch(xp0Var, runnable);
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        this.d.dispatchYield(xp0Var, runnable);
    }

    @Override // defpackage.du0
    public final yw0 h(long j, w04 w04Var, xp0 xp0Var) {
        return this.c.h(j, w04Var, xp0Var);
    }

    @Override // defpackage.zp0
    public final boolean isDispatchNeeded(xp0 xp0Var) {
        return this.d.isDispatchNeeded(xp0Var);
    }

    @Override // defpackage.du0
    public final void l(long j, t00 t00Var) {
        this.c.l(j, t00Var);
    }

    @Override // defpackage.zp0
    public final String toString() {
        return this.h;
    }
}
