package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(fq0.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(fq0.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(fq0.class, "_isTerminated$volatile");
    public static final d5 s = new d5("NOT_IN_STACK", 16);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int c;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final long h;
    public final String l;
    public final of1 m;
    public final of1 n;
    public final s53 o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public fq0(int i, int i2, long j, String str) {
        this.c = i;
        this.d = i2;
        this.h = j;
        this.l = str;
        if (i < 1) {
            u41.h(ud2.q("Core pool size ", " should be at least 1", i));
            throw null;
        }
        if (i2 < i) {
            u41.h(ud2.l(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            u41.h(ud2.q("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.m = new of1();
        this.n = new of1();
        this.o = new s53((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void h(fq0 fq0Var, Runnable runnable, int i) {
        fq0Var.c(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.o) {
            try {
                if (r.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = q;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.c) {
                    return 0;
                }
                if (i >= this.d) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.o.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                dq0 dq0Var = new dq0(this, i3);
                this.o.c(i3, dq0Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                dq0Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        ts3 ws3Var;
        eq0 eq0Var;
        ft3.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ts3) {
            ws3Var = (ts3) runnable;
            ws3Var.c = jNanoTime;
            ws3Var.d = z;
        } else {
            ws3Var = new ws3(runnable, jNanoTime, z);
        }
        boolean z3 = ws3Var.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = q;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        dq0 dq0Var = null;
        dq0 dq0Var2 = threadCurrentThread instanceof dq0 ? (dq0) threadCurrentThread : null;
        if (dq0Var2 != null && dq0Var2.p == this) {
            dq0Var = dq0Var2;
        }
        if (dq0Var != null && (eq0Var = dq0Var.h) != eq0.m && (ws3Var.d || eq0Var != eq0.d)) {
            dq0Var.o = true;
            ws3Var = dq0Var.c.a(ws3Var, z2);
        }
        if (ws3Var != null) {
            if (!(ws3Var.d ? this.n.a(ws3Var) : this.m.a(ws3Var))) {
                throw new RejectedExecutionException(fq2.r(new StringBuilder(), this.l, " was terminated"));
            }
        }
        if (z3) {
            if (x() || p(jAddAndGet)) {
                return;
            }
            x();
            return;
        }
        if (x() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        x();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        ts3 ts3VarA;
        if (r.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            dq0 dq0Var = null;
            dq0 dq0Var2 = threadCurrentThread instanceof dq0 ? (dq0) threadCurrentThread : null;
            if (dq0Var2 != null && dq0Var2.p == this) {
                dq0Var = dq0Var2;
            }
            synchronized (this.o) {
                i = (int) (q.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.o.b(i2);
                    objB.getClass();
                    dq0 dq0Var3 = (dq0) objB;
                    if (dq0Var3 != dq0Var) {
                        while (dq0Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(dq0Var3);
                            dq0Var3.join(10000L);
                        }
                        dq0Var3.c.d(this.n);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.n.b();
            this.m.b();
            while (true) {
                if (dq0Var != null) {
                    ts3VarA = dq0Var.a(true);
                    if (ts3VarA == null) {
                        ts3VarA = (ts3) this.m.d();
                        if (ts3VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    ts3VarA = (ts3) this.m.d();
                    if (ts3VarA == null && (ts3VarA = (ts3) this.n.d()) == null) {
                        break;
                    }
                }
                try {
                    ts3VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (dq0Var != null) {
                dq0Var.h(eq0.m);
            }
            p.set(this, 0L);
            q.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, 6);
    }

    public final void l(dq0 dq0Var, int i, int i2) {
        while (true) {
            long j = p.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = dq0Var.c();
                    while (true) {
                        if (objC == s) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        dq0 dq0Var2 = (dq0) objC;
                        int iB = dq0Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = dq0Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                fq0 fq0Var = this;
                if (p.compareAndSet(fq0Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = fq0Var;
                }
            }
        }
    }

    public final boolean p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.c;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s53 s53Var = this.o;
        int iA = s53Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            dq0 dq0Var = (dq0) s53Var.b(i6);
            if (dq0Var != null) {
                int iC = dq0Var.c.c();
                int iOrdinal = dq0Var.h.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        u41.e();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = q.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.l);
        sb4.append('@');
        sb4.append(xr0.a0(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.c;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.d);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.m.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.n.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean x() {
        fq0 fq0Var;
        d5 d5Var;
        int iB;
        while (true) {
            long j = p.get(this);
            dq0 dq0Var = (dq0) this.o.b((int) (2097151 & j));
            if (dq0Var == null) {
                dq0Var = null;
                fq0Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = dq0Var.c();
                while (true) {
                    d5Var = s;
                    if (objC == d5Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    dq0 dq0Var2 = (dq0) objC;
                    iB = dq0Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = dq0Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    fq0 fq0Var2 = this;
                    boolean zCompareAndSet = p.compareAndSet(fq0Var2, j, ((long) iB) | j2);
                    fq0Var = fq0Var2;
                    if (zCompareAndSet) {
                        dq0Var.g(d5Var);
                    }
                    this = fq0Var;
                } else {
                    continue;
                }
            }
            if (dq0Var == null) {
                return false;
            }
            if (dq0.q.compareAndSet(dq0Var, -1, 0)) {
                LockSupport.unpark(dq0Var);
                return true;
            }
            this = fq0Var;
        }
    }
}
