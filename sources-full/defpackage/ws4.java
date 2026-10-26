package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ws4 implements mo4 {
    public final WeakReference c;
    public final vs4 d = new vs4(this);

    public ws4(ms4 ms4Var) {
        this.c = new WeakReference(ms4Var);
    }

    @Override // defpackage.mo4
    public final void b(Runnable runnable, Executor executor) {
        this.d.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ms4 ms4Var = (ms4) this.c.get();
        boolean zCancel = this.d.cancel(z);
        if (!zCancel || ms4Var == null) {
            return zCancel;
        }
        ms4Var.a = null;
        ms4Var.b = null;
        ms4Var.c.i(null);
        return true;
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
        return this.d.c instanceof qo4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    public final String toString() {
        return this.d.toString();
    }
}
