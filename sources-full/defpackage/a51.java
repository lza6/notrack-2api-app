package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class a51 extends v41 implements du0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(a51.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicIntegerFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = u00.a;
        q = unsafe.objectFieldOffset(a51.class.getDeclaredField("_queue$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(a51.class, Object.class, "_delayed$volatile");
        p = unsafe.objectFieldOffset(a51.class.getDeclaredField("_delayed$volatile"));
        o = AtomicIntegerFieldUpdater.newUpdater(a51.class, "_isCompleted$volatile");
    }

    @Override // defpackage.v41
    public final long T() {
        if (U()) {
            return 0L;
        }
        Y();
        Runnable runnableW = W();
        if (runnableW == null) {
            return a0();
        }
        runnableW.run();
        return 0L;
    }

    public final void V() {
        a51 a51Var;
        Unsafe unsafe;
        d5 d5Var = gb2.c;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = u00.a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = u00.a;
                    a51Var = this;
                    if (unsafe3.compareAndSwapObject(a51Var, q, (Object) null, d5Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(a51Var, j) != null) {
                        break;
                    } else {
                        this = a51Var;
                    }
                }
            } else {
                a51Var = this;
                if (objectVolatile instanceof o72) {
                    ((o72) objectVolatile).c();
                    return;
                }
                if (objectVolatile == d5Var) {
                    return;
                }
                o72 o72Var = new o72(8, true);
                o72Var.a((Runnable) objectVolatile);
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(a51Var, q, objectVolatile, o72Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(a51Var, j) == objectVolatile);
            }
            this = a51Var;
        }
    }

    public final Runnable W() {
        a51 a51Var;
        Unsafe unsafe;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = u00.a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof o72) {
                o72 o72Var = (o72) objectVolatile;
                Object objE = o72Var.e();
                if (objE == o72.g) {
                    o72 o72VarD = o72Var.d();
                    while (true) {
                        Unsafe unsafe3 = u00.a;
                        a51Var = this;
                        if (unsafe3.compareAndSwapObject(a51Var, q, objectVolatile, o72VarD) || unsafe3.getObjectVolatile(a51Var, j) != objectVolatile) {
                            break;
                        }
                        this = a51Var;
                    }
                } else {
                    return (Runnable) objE;
                }
            } else {
                a51Var = this;
                if (objectVolatile == gb2.c) {
                    return null;
                }
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(a51Var, q, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(a51Var, j) == objectVolatile);
            }
            this = a51Var;
        }
    }

    public void X(Runnable runnable) {
        Y();
        if (!Z(runnable)) {
            ss0.r.X(runnable);
            return;
        }
        Thread threadB0 = b0();
        if (Thread.currentThread() != threadB0) {
            LockSupport.unpark(threadB0);
        }
    }

    public final void Y() {
        y41 y41VarB;
        n.getClass();
        z41 z41Var = (z41) u00.a.getObjectVolatile(this, p);
        if (z41Var == null || k04.b.get(z41Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (z41Var) {
                try {
                    y41[] y41VarArr = z41Var.a;
                    y41VarB = null;
                    y41 y41Var = y41VarArr != null ? y41VarArr[0] : null;
                    if (y41Var != null) {
                        y41VarB = ((jNanoTime - y41Var.c) > 0L ? 1 : ((jNanoTime - y41Var.c) == 0L ? 0 : -1)) >= 0 ? Z(y41Var) : false ? z41Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (y41VarB != null);
    }

    public final boolean Z(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            m.getClass();
            Unsafe unsafe4 = u00.a;
            long j = q;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (o.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(this, q, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof o72) {
                o72 o72Var = (o72) objectVolatile;
                int iA = o72Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    o72 o72VarD = o72Var.d();
                    do {
                        unsafe2 = u00.a;
                        if (unsafe2.compareAndSwapObject(this, q, objectVolatile, o72VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == gb2.c) {
                    return false;
                }
                o72 o72Var2 = new o72(8, true);
                o72Var2.a((Runnable) objectVolatile);
                o72Var2.a(runnable);
                do {
                    unsafe3 = u00.a;
                    if (unsafe3.compareAndSwapObject(this, q, objectVolatile, o72Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final long a0() {
        y41 y41Var;
        kl klVar = this.h;
        if (((klVar == null || klVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            m.getClass();
            Unsafe unsafe = u00.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, q);
            if (objectVolatile != null) {
                if (objectVolatile instanceof o72) {
                    long j = o72.f.get((o72) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == gb2.c) {
                    return LongCompanionObject.MAX_VALUE;
                }
            }
            n.getClass();
            z41 z41Var = (z41) unsafe.getObjectVolatile(this, p);
            if (z41Var != null) {
                synchronized (z41Var) {
                    y41[] y41VarArr = z41Var.a;
                    y41Var = y41VarArr != null ? y41VarArr[0] : null;
                }
                if (y41Var != null) {
                    long jNanoTime = y41Var.c - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread b0();

    public final boolean c0() {
        kl klVar = this.h;
        if (klVar != null ? klVar.isEmpty() : true) {
            n.getClass();
            Unsafe unsafe = u00.a;
            z41 z41Var = (z41) unsafe.getObjectVolatile(this, p);
            if (z41Var != null && k04.b.get(z41Var) != 0) {
                return false;
            }
            m.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, q);
            if (objectVolatile != null) {
                if (objectVolatile instanceof o72) {
                    long j = o72.f.get((o72) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == gb2.c) {
                }
            }
            return true;
        }
        return false;
    }

    public void d0(long j, y41 y41Var) {
        ss0.r.g0(j, y41Var);
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        X(runnable);
    }

    public final void e0() {
        y41 y41VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            n.getClass();
            z41 z41Var = (z41) u00.a.getObjectVolatile(this, p);
            if (z41Var == null) {
                return;
            }
            synchronized (z41Var) {
                y41VarB = k04.b.get(z41Var) > 0 ? z41Var.b(0) : null;
            }
            if (y41VarB == null) {
                return;
            } else {
                d0(jNanoTime, y41VarB);
            }
        }
    }

    public final void f0() {
        m.getClass();
        Unsafe unsafe = u00.a;
        unsafe.putObjectVolatile(this, q, (Object) null);
        n.getClass();
        unsafe.putObjectVolatile(this, p, (Object) null);
    }

    public final void g0(long j, y41 y41Var) {
        Thread threadB0;
        int iH0 = h0(j, y41Var);
        if (iH0 == 0) {
            if (!i0(y41Var) || Thread.currentThread() == (threadB0 = b0())) {
                return;
            }
            LockSupport.unpark(threadB0);
            return;
        }
        if (iH0 == 1) {
            d0(j, y41Var);
        } else {
            if (iH0 == 2) {
                return;
            }
            u41.r("unexpected result");
        }
    }

    @Override // defpackage.du0
    public yw0 h(long j, w04 w04Var, xp0 xp0Var) {
        return ts0.a.h(j, w04Var, xp0Var);
    }

    public final int h0(long j, y41 y41Var) {
        a51 a51Var;
        Unsafe unsafe;
        if (o.get(this) == 1) {
            return 1;
        }
        n.getClass();
        Unsafe unsafe2 = u00.a;
        long j2 = p;
        z41 z41Var = (z41) unsafe2.getObjectVolatile(this, j2);
        if (z41Var == null) {
            z41 z41Var2 = new z41();
            z41Var2.c = j;
            while (true) {
                unsafe = u00.a;
                a51Var = this;
                if (unsafe.compareAndSwapObject(a51Var, p, (Object) null, z41Var2) || unsafe.getObjectVolatile(a51Var, j2) != null) {
                    break;
                }
                this = a51Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(a51Var, j2);
            objectVolatile.getClass();
            z41Var = (z41) objectVolatile;
        } else {
            a51Var = this;
        }
        return y41Var.a(j, z41Var, a51Var);
    }

    public final boolean i0(y41 y41Var) {
        n.getClass();
        z41 z41Var = (z41) u00.a.getObjectVolatile(this, p);
        y41 y41Var2 = null;
        if (z41Var != null) {
            synchronized (z41Var) {
                y41[] y41VarArr = z41Var.a;
                y41Var2 = y41VarArr != null ? y41VarArr[0] : null;
            }
        }
        return y41Var2 == y41Var;
    }

    @Override // defpackage.du0
    public final void l(long j, t00 t00Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
        }
        if (j2 < DurationKt.MAX_MILLIS) {
            long jNanoTime = System.nanoTime();
            w41 w41Var = new w41(this, j2 + jNanoTime, t00Var);
            g0(jNanoTime, w41Var);
            t00Var.x(new m00(2, w41Var));
        }
    }

    @Override // defpackage.v41
    public void shutdown() {
        i04.a.set(null);
        o.set(this, 1);
        V();
        while (T() <= 0) {
        }
        e0();
    }
}
