package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m04 extends js1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(m04.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread p = Thread.currentThread();
    public yw0 q;

    public static void t(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.js1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = r;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                t(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.p.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void s() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        t(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                yw0 yw0Var = this.q;
                if (yw0Var != null) {
                    yw0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
