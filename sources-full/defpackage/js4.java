package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class js4 implements mo4 {
    public static final boolean l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger m = Logger.getLogger(js4.class.getName());
    public static final rh4 n;
    public static final Object o;
    public volatile Object c;
    public volatile xp4 d;
    public volatile ds4 h;

    static {
        rh4 ur4Var;
        try {
            ur4Var = new tq4(AtomicReferenceFieldUpdater.newUpdater(ds4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ds4.class, ds4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(js4.class, ds4.class, "h"), AtomicReferenceFieldUpdater.newUpdater(js4.class, xp4.class, "d"), AtomicReferenceFieldUpdater.newUpdater(js4.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            ur4Var = new ur4();
        }
        Throwable th2 = th;
        n = ur4Var;
        if (th2 != null) {
            m.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        o = new Object();
    }

    public static void d(js4 js4Var) {
        ds4 ds4Var;
        rh4 rh4Var;
        xp4 xp4Var;
        xp4 xp4Var2;
        xp4 xp4Var3;
        do {
            ds4Var = js4Var.h;
            rh4Var = n;
        } while (!rh4Var.f(js4Var, ds4Var, ds4.c));
        while (true) {
            xp4Var = null;
            if (ds4Var == null) {
                break;
            }
            Thread thread = ds4Var.a;
            if (thread != null) {
                ds4Var.a = null;
                LockSupport.unpark(thread);
            }
            ds4Var = ds4Var.b;
        }
        do {
            xp4Var2 = js4Var.d;
        } while (!rh4Var.d(js4Var, xp4Var2, xp4.d));
        while (true) {
            xp4Var3 = xp4Var;
            xp4Var = xp4Var2;
            if (xp4Var == null) {
                break;
            }
            xp4Var2 = xp4Var.c;
            xp4Var.c = xp4Var3;
        }
        while (xp4Var3 != null) {
            Runnable runnable = xp4Var3.a;
            xp4 xp4Var4 = xp4Var3.c;
            f(runnable, xp4Var3.b);
            xp4Var3 = xp4Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            m.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof qo4) {
            Throwable th = ((qo4) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof mp4) {
            throw new ExecutionException(((mp4) obj).a);
        }
        if (obj == o) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.mo4
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        xp4 xp4Var = this.d;
        xp4 xp4Var2 = xp4.d;
        if (xp4Var != xp4Var2) {
            xp4 xp4Var3 = new xp4(runnable, executor);
            do {
                xp4Var3.c = xp4Var;
                if (n.d(this, xp4Var, xp4Var3)) {
                    return;
                } else {
                    xp4Var = this.d;
                }
            } while (xp4Var != xp4Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        qo4 qo4Var;
        Object obj = this.c;
        if (obj != null) {
            return false;
        }
        if (l) {
            qo4Var = new qo4(new CancellationException("Future.cancel() was called."));
        } else {
            qo4Var = z ? qo4.b : qo4.c;
        }
        if (!n.e(this, obj, qo4Var)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(ds4 ds4Var) {
        ds4Var.a = null;
        while (true) {
            ds4 ds4Var2 = this.h;
            if (ds4Var2 != ds4.c) {
                ds4 ds4Var3 = null;
                while (ds4Var2 != null) {
                    ds4 ds4Var4 = ds4Var2.b;
                    if (ds4Var2.a != null) {
                        ds4Var3 = ds4Var2;
                    } else if (ds4Var3 != null) {
                        ds4Var3.b = ds4Var4;
                        if (ds4Var3.a == null) {
                        }
                    } else if (!n.f(this, ds4Var2, ds4Var4)) {
                    }
                    ds4Var2 = ds4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            return h(obj2);
        }
        ds4 ds4Var = this.h;
        ds4 ds4Var2 = ds4.c;
        if (ds4Var != ds4Var2) {
            ds4 ds4Var3 = new ds4();
            do {
                rh4 rh4Var = n;
                rh4Var.b(ds4Var3, ds4Var);
                if (rh4Var.f(this, ds4Var, ds4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(ds4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (obj == null);
                    return h(obj);
                }
                ds4Var = this.h;
            } while (ds4Var != ds4Var2);
        }
        return h(this.c);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ds4 ds4Var = this.h;
            ds4 ds4Var2 = ds4.c;
            if (ds4Var != ds4Var2) {
                ds4 ds4Var3 = new ds4();
                while (true) {
                    rh4 rh4Var = n;
                    rh4Var.b(ds4Var3, ds4Var);
                    if (rh4Var.f(this, ds4Var, ds4Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(ds4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(ds4Var3);
                        break;
                    }
                    ds4Var = this.h;
                    if (ds4Var == ds4Var2) {
                    }
                }
            }
            return h(this.c);
        }
        while (nanos > 0) {
            Object obj3 = this.c;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        j93.c(strConcat, string);
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof qo4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.c instanceof qo4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
