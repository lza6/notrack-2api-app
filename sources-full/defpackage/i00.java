package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements m62 {
    public final WeakReference c;
    public final h00 d = new h00(this);

    public i00(f00 f00Var) {
        this.c = new WeakReference(f00Var);
    }

    @Override // defpackage.m62
    public final void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        f00 f00Var = (f00) this.c.get();
        boolean zCancel = this.d.cancel(z);
        if (zCancel && f00Var != null) {
            f00Var.a = null;
            f00Var.b = null;
            f00Var.c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.c instanceof n0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    public final String toString() {
        return this.d.toString();
    }
}
