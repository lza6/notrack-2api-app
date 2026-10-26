package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k51 extends j51 implements du0 {
    public final Executor c;

    public k51(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = hl0.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = hl0.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            yo4.k(xp0Var, cancellationException);
            jt0 jt0Var = sw0.a;
            at0.c.dispatch(xp0Var, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k51) && ((k51) obj).c == this.c;
    }

    @Override // defpackage.du0
    public final yw0 h(long j, w04 w04Var, xp0 xp0Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(w04Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                yo4.k(xp0Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new xw0(scheduledFutureSchedule) : ss0.r.h(j, w04Var, xp0Var);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.du0
    public final void l(long j, t00 t00Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            io4 io4Var = new io4(this, 10, t00Var);
            xp0 xp0Var = t00Var.m;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(io4Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                yo4.k(xp0Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            t00Var.x(new m00(0, scheduledFutureSchedule));
        } else {
            ss0.r.l(j, t00Var);
        }
    }

    @Override // defpackage.zp0
    public final String toString() {
        return this.c.toString();
    }
}
