package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class at0 extends j51 implements Executor {
    public static final at0 c = new at0();
    public static final zp0 d;

    static {
        a94 a94Var = a94.c;
        int i = lr3.a;
        if (64 >= i) {
            i = 64;
        }
        d = zp0.limitedParallelism$default(a94Var, xr0.t0(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        d.dispatch(xp0Var, runnable);
    }

    @Override // defpackage.zp0
    public final void dispatchYield(xp0 xp0Var, Runnable runnable) {
        d.dispatchYield(xp0Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(x21.c, runnable);
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        return a94.c.limitedParallelism(i, str);
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
