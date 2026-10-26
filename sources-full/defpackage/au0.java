package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class au0 extends zp0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(au0.class, "d");
    public final zp0 c;
    public volatile /* synthetic */ int d = 1;

    public au0(zp0 zp0Var) {
        this.c = zp0Var;
    }

    public final zp0 Q() {
        return h.get(this) == 1 ? sw0.b : this.c;
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        Q().dispatch(xp0Var, runnable);
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        Q().dispatchYield(xp0Var, runnable);
    }

    @Override // defpackage.zp0
    public final boolean isDispatchNeeded(xp0 xp0Var) {
        return Q().isDispatchNeeded(xp0Var);
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        return Q().limitedParallelism(i, str);
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }
}
