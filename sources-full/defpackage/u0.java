package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements m62 {
    public static final boolean l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger m = Logger.getLogger(u0.class.getName());
    public static final kr1 n;
    public static final Object o;
    public volatile Object c;
    public volatile q0 d;
    public volatile t0 h;

    static {
        kr1 s0Var;
        try {
            s0Var = new r0(AtomicReferenceFieldUpdater.newUpdater(t0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(t0.class, t0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(u0.class, t0.class, "h"), AtomicReferenceFieldUpdater.newUpdater(u0.class, q0.class, "d"), AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            s0Var = new s0();
        }
        n = s0Var;
        if (th != null) {
            m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        o = new Object();
    }

    public static void d(u0 u0Var) {
        t0 t0Var;
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        do {
            t0Var = u0Var.h;
        } while (!n.v(u0Var, t0Var, t0.c));
        while (true) {
            q0Var = null;
            if (t0Var == null) {
                break;
            }
            Thread thread = t0Var.a;
            if (thread != null) {
                t0Var.a = null;
                LockSupport.unpark(thread);
            }
            t0Var = t0Var.b;
        }
        do {
            q0Var2 = u0Var.d;
        } while (!n.t(u0Var, q0Var2, q0.d));
        while (true) {
            q0Var3 = q0Var;
            q0Var = q0Var2;
            if (q0Var == null) {
                break;
            }
            q0Var2 = q0Var.c;
            q0Var.c = q0Var3;
        }
        while (q0Var3 != null) {
            q0 q0Var4 = q0Var3.c;
            e(q0Var3.a, q0Var3.b);
            q0Var3 = q0Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof n0) {
            Throwable th = ((n0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p0) {
            throw new ExecutionException(((p0) obj).a);
        }
        if (obj == o) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.m62
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        q0 q0Var = this.d;
        q0 q0Var2 = q0.d;
        if (q0Var != q0Var2) {
            q0 q0Var3 = new q0(runnable, executor);
            do {
                q0Var3.c = q0Var;
                if (n.t(this, q0Var, q0Var3)) {
                    return;
                } else {
                    q0Var = this.d;
                }
            } while (q0Var != q0Var2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        n0 n0Var;
        Object obj = this.c;
        if (obj != null) {
            return false;
        }
        if (l) {
            n0Var = new n0(new CancellationException("Future.cancel() was called."), z);
        } else {
            n0Var = z ? n0.b : n0.c;
        }
        if (!n.u(this, obj, n0Var)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        t0 t0Var = t0.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            return f(obj2);
        }
        t0 t0Var2 = this.h;
        if (t0Var2 != t0Var) {
            t0 t0Var3 = new t0();
            do {
                kr1 kr1Var = n;
                kr1Var.d0(t0Var3, t0Var2);
                if (kr1Var.v(this, t0Var2, t0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(t0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (obj == null);
                    return f(obj);
                }
                t0Var2 = this.h;
            } while (t0Var2 != t0Var);
        }
        return f(this.c);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        t0 t0Var = t0.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            t0 t0Var2 = this.h;
            if (t0Var2 != t0Var) {
                t0 t0Var3 = new t0();
                while (true) {
                    kr1 kr1Var = n;
                    kr1Var.d0(t0Var3, t0Var2);
                    if (kr1Var.v(this, t0Var2, t0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(t0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(t0Var3);
                        break;
                    }
                    t0Var2 = this.h;
                    if (t0Var2 == t0Var) {
                    }
                }
            }
            return f(this.c);
        }
        while (nanos > 0) {
            Object obj3 = this.c;
            if (obj3 != null) {
                return f(obj3);
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
            boolean z = jConvert == 0 || nanos2 > 1000;
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

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(t0 t0Var) {
        t0Var.a = null;
        while (true) {
            t0 t0Var2 = this.h;
            if (t0Var2 == t0.c) {
                return;
            }
            t0 t0Var3 = null;
            while (t0Var2 != null) {
                t0 t0Var4 = t0Var2.b;
                if (t0Var2.a != null) {
                    t0Var3 = t0Var2;
                } else if (t0Var3 != null) {
                    t0Var3.b = t0Var4;
                    if (t0Var3.a == null) {
                    }
                } else if (!n.v(this, t0Var2, t0Var4)) {
                }
                t0Var2 = t0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof n0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c != null;
    }

    public boolean j(Throwable th) {
        if (!n.u(this, null, new p0(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.c instanceof n0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e) {
                strH = "Exception thrown from implementation: " + e.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
