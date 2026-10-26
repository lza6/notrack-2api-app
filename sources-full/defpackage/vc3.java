package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class vc3 extends il0 implements hm2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(vc3.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public vc3(long j, vc3 vc3Var, int i) {
        super(vc3Var);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.il0
    public final boolean f() {
        return f.get(this) == k() && c() != null;
    }

    public final boolean j() {
        return f.addAndGet(this, -65536) == k() && c() != null;
    }

    public abstract int k();

    public abstract void l(int i, xp0 xp0Var);

    public final void m() {
        if (f.incrementAndGet(this) == k()) {
            h();
        }
    }

    public final boolean n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == k() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
