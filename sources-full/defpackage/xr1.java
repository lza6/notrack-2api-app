package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class xr1 extends js1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(xr1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final l p;

    public xr1(l lVar) {
        this.p = lVar;
    }

    @Override // defpackage.js1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        if (q.compareAndSet(this, 0, 1)) {
            this.p.invoke(th);
        }
    }
}
