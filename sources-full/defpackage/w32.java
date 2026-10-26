package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class w32 extends zp0 implements du0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(w32.class, "runningWorkers$volatile");
    public final /* synthetic */ du0 c;
    public final zp0 d;
    public final int h;
    public final String l;
    public final m72 m;
    public final Object n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public w32(zp0 zp0Var, int i, String str) {
        du0 du0Var = zp0Var instanceof du0 ? (du0) zp0Var : null;
        this.c = du0Var == null ? ts0.a : du0Var;
        this.d = zp0Var;
        this.h = i;
        this.l = str;
        this.m = new m72();
        this.n = new Object();
    }

    public final Runnable Q() {
        while (true) {
            Runnable runnable = (Runnable) this.m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean R() {
        synchronized (this.n) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
            if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        Runnable runnableQ;
        this.m.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
        if (atomicIntegerFieldUpdater.get(this) >= this.h || !R() || (runnableQ = Q()) == null) {
            return;
        }
        try {
            xp1.C(this.d, this, new io4(8, this, runnableQ, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        Runnable runnableQ;
        this.m.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
        if (atomicIntegerFieldUpdater.get(this) >= this.h || !R() || (runnableQ = Q()) == null) {
            return;
        }
        try {
            this.d.dispatchYield(this, new io4(8, this, runnableQ, false));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.du0
    public final yw0 h(long j, w04 w04Var, xp0 xp0Var) {
        return this.c.h(j, w04Var, xp0Var);
    }

    @Override // defpackage.du0
    public final void l(long j, t00 t00Var) {
        this.c.l(j, t00Var);
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        if (i >= this.h) {
            return str != null ? new aj2(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }

    @Override // defpackage.zp0
    public final String toString() {
        String str = this.l;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return fq2.p(sb, this.h, ')');
    }
}
