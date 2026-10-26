package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class ko4 implements mo4 {
    public static final lo4 d = new lo4(ko4.class);
    public final Object c;

    public ko4(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.mo4
    public final void b(Runnable runnable, Executor executor) {
        if (executor == null) {
            m51.x("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            d.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.c.toString() + "]]";
    }
}
