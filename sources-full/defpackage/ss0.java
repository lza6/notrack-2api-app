package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends a51 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ss0 r;
    public static final long s;

    static {
        Long l;
        ss0 ss0Var = new ss0();
        r = ss0Var;
        ss0Var.S(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        s = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.a51
    public final void X(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.X(runnable);
    }

    @Override // defpackage.a51
    public final Thread b0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(r.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.a51
    public final void d0(long j, y41 y41Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.a51, defpackage.du0
    public final yw0 h(long j, w04 w04Var, xp0 xp0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= DurationKt.MAX_MILLIS) {
            return dm2.c;
        }
        long jNanoTime = System.nanoTime();
        x41 x41Var = new x41(j2 + jNanoTime, w04Var);
        g0(jNanoTime, x41Var);
        return x41Var;
    }

    public final synchronized void j0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            f0();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        i04.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    j0();
                    if (c0()) {
                        return;
                    }
                    b0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jT = T();
                    if (jT == LongCompanionObject.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == LongCompanionObject.MAX_VALUE) {
                            j = s + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            j0();
                            if (c0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        if (jT > j2) {
                            jT = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jT > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            j0();
                            if (c0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        LockSupport.parkNanos(this, jT);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            j0();
            if (!c0()) {
                b0();
            }
            throw th;
        }
    }

    @Override // defpackage.a51, defpackage.v41
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.zp0
    public final String toString() {
        return "DefaultExecutor";
    }
}
