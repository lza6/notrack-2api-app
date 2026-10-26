package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n84 extends zp0 {
    public static final n84 c = new n84();

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        pj4 pj4Var = (pj4) xp0Var.get(pj4.d);
        if (pj4Var != null) {
            pj4Var.c = true;
        } else {
            j93.k("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.zp0
    public final boolean isDispatchNeeded(xp0 xp0Var) {
        return false;
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
