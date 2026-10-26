package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class oo4 extends un4 implements mo4 {
    public mo4 p;
    public ScheduledFuture q;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof ln4) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((ln4) obj).b);
            throw cancellationException;
        }
        if (obj instanceof on4) {
            throw new ExecutionException(((on4) obj).a);
        }
        if (obj == un4.l) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof mn4);
    }

    public static Object h(mo4 mo4Var) {
        Object obj;
        Throwable thD;
        if (mo4Var instanceof oo4) {
            Object ln4Var = ((oo4) mo4Var).c;
            if (ln4Var instanceof ln4) {
                ln4 ln4Var2 = (ln4) ln4Var;
                if (ln4Var2.a) {
                    Throwable th = ln4Var2.b;
                    ln4Var = th != null ? new ln4(th, false) : ln4.d;
                }
            }
            Objects.requireNonNull(ln4Var);
            return ln4Var;
        }
        if ((mo4Var instanceof un4) && (thD = ((un4) mo4Var).d()) != null) {
            return new on4(thD);
        }
        boolean zIsCancelled = mo4Var.isCancelled();
        boolean z = true;
        if ((!un4.n) && zIsCancelled) {
            ln4 ln4Var3 = ln4.d;
            Objects.requireNonNull(ln4Var3);
            return ln4Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = mo4Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new on4(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new on4(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new on4(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mo4Var)), e3)) : new ln4(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new ln4(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(mo4Var)), e4), false) : new on4(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new ln4(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(mo4Var))), false);
        }
        return obj == null ? un4.l : obj;
    }

    public static void j(oo4 oo4Var) {
        pn4 pn4Var = null;
        while (true) {
            oo4Var.getClass();
            for (tn4 tn4VarC = un4.o.c(oo4Var); tn4VarC != null; tn4VarC = tn4VarC.b) {
                Thread thread = tn4VarC.a;
                if (thread != null) {
                    tn4VarC.a = null;
                    LockSupport.unpark(thread);
                }
            }
            mo4 mo4Var = oo4Var.p;
            if ((oo4Var.c instanceof ln4) & (mo4Var != null)) {
                Object obj = oo4Var.c;
                mo4Var.cancel((obj instanceof ln4) && ((ln4) obj).a);
            }
            ScheduledFuture scheduledFuture = oo4Var.q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            oo4Var.p = null;
            oo4Var.q = null;
            pn4 pn4Var2 = pn4Var;
            pn4 pn4VarB = un4.o.b(oo4Var);
            pn4 pn4Var3 = pn4Var2;
            while (pn4VarB != null) {
                pn4 pn4Var4 = pn4VarB.c;
                pn4VarB.c = pn4Var3;
                pn4Var3 = pn4VarB;
                pn4VarB = pn4Var4;
            }
            while (pn4Var3 != null) {
                Runnable runnable = pn4Var3.a;
                pn4 pn4Var5 = pn4Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof mn4) {
                    mn4 mn4Var = (mn4) runnable;
                    oo4Var = mn4Var.c;
                    if (oo4Var.c != mn4Var) {
                        continue;
                    } else if (un4.o.g(oo4Var, mn4Var, h(mn4Var.d))) {
                        pn4Var = pn4Var5;
                    }
                } else {
                    Executor executor = pn4Var3.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                pn4Var3 = pn4Var5;
            }
            return;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            un4.m.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // defpackage.mo4
    public final void b(Runnable runnable, Executor executor) {
        pn4 pn4Var;
        pn4 pn4Var2 = pn4.d;
        if (executor == null) {
            m51.x("Executor was null.");
            return;
        }
        if (!isDone() && (pn4Var = this.d) != pn4Var2) {
            pn4 pn4Var3 = new pn4(runnable, executor);
            do {
                pn4Var3.c = pn4Var;
                if (un4.o.f(this, pn4Var, pn4Var3)) {
                    return;
                } else {
                    pn4Var = this.d;
                }
            } while (pn4Var != pn4Var2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ln4 ln4Var;
        Object obj = this.c;
        if (!(obj instanceof mn4) && !(obj == null)) {
            return false;
        }
        if (un4.n) {
            ln4Var = new ln4(new CancellationException("Future.cancel() was called."), z);
        } else {
            ln4Var = z ? ln4.c : ln4.d;
            Objects.requireNonNull(ln4Var);
        }
        boolean z2 = false;
        while (true) {
            if (un4.o.g(this, obj, ln4Var)) {
                j(this);
                if (obj instanceof mn4) {
                    mo4 mo4Var = ((mn4) obj).d;
                    if (mo4Var instanceof oo4) {
                        this = (oo4) mo4Var;
                        obj = this.c;
                        if ((obj == null) | (obj instanceof mn4)) {
                            z2 = true;
                        }
                    } else {
                        mo4Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.c;
            if (g(obj)) {
                return z2;
            }
        }
    }

    @Override // defpackage.un4
    public final Throwable d() {
        if (!(this instanceof oo4)) {
            return null;
        }
        Object obj = this.c;
        if (obj instanceof on4) {
            return ((on4) obj).a;
        }
        return null;
    }

    public final String f() {
        mo4 mo4Var = this.p;
        ScheduledFuture scheduledFuture = this.q;
        if (mo4Var == null) {
            return null;
        }
        String strN = fq2.n("inputFuture=[", mo4Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strN + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strN;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        tn4 tn4Var = tn4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.c;
        if ((obj2 != null) && g(obj2)) {
            return e(obj2);
        }
        tn4 tn4Var2 = this.h;
        if (tn4Var2 != tn4Var) {
            tn4 tn4Var3 = new tn4();
            do {
                lh4 lh4Var = un4.o;
                lh4Var.d(tn4Var3, tn4Var2);
                if (lh4Var.h(this, tn4Var2, tn4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            c(tn4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.c;
                    } while (!((obj != null) & g(obj)));
                    return e(obj);
                }
                tn4Var2 = this.h;
            } while (tn4Var2 != tn4Var);
        }
        Object obj3 = this.c;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        tn4 tn4Var = tn4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            tn4 tn4Var2 = this.h;
            if (tn4Var2 != tn4Var) {
                tn4 tn4Var3 = new tn4();
                while (true) {
                    lh4 lh4Var = un4.o;
                    lh4Var.d(tn4Var3, tn4Var2);
                    if (lh4Var.h(this, tn4Var2, tn4Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(tn4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(tn4Var3);
                        break;
                    }
                    long j4 = j3;
                    tn4Var2 = this.h;
                    if (tn4Var2 != tn4Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.c;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.c;
            if ((obj4 != null) && g(obj4)) {
                return e(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    public final void i(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c instanceof ln4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.c;
        return (obj != null) & g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.c instanceof ln4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.c;
            if (obj instanceof mn4) {
                sb.append(", setFuture=[");
                mo4 mo4Var = ((mn4) obj).d;
                try {
                    if (mo4Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(mo4Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
