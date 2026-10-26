package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class dq0 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(dq0.class, "workerCtl$volatile");
    public final ei4 c;
    public final q43 d;
    public eq0 h;
    private volatile int indexInArray;
    public long l;
    public long m;
    public int n;
    private volatile Object nextParkedWorker;
    public boolean o;
    public final /* synthetic */ fq0 p;
    private volatile /* synthetic */ int workerCtl$volatile;

    public dq0(fq0 fq0Var, int i) {
        this.p = fq0Var;
        setDaemon(true);
        setContextClassLoader(fq0.class.getClassLoader());
        this.c = new ei4();
        this.d = new q43();
        this.h = eq0.l;
        this.nextParkedWorker = fq0.s;
        int iNanoTime = (int) System.nanoTime();
        this.n = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final ts3 a(boolean z) {
        ts3 ts3VarE;
        ts3 ts3VarE2;
        long j;
        eq0 eq0Var = this.h;
        fq0 fq0Var = this.p;
        ei4 ei4Var = this.c;
        eq0 eq0Var2 = eq0.c;
        if (eq0Var != eq0Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = fq0.q;
            do {
                j = atomicLongFieldUpdater.get(fq0Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ts3 ts3VarG = ei4Var.g();
                    return (ts3VarG == null && (ts3VarG = (ts3) fq0Var.n.d()) == null) ? i(1) : ts3VarG;
                }
            } while (!fq0.q.compareAndSet(fq0Var, j, j - 4398046511104L));
            this.h = eq0Var2;
        }
        if (z) {
            boolean z2 = d(fq0Var.c * 2) == 0;
            if (z2 && (ts3VarE2 = e()) != null) {
                return ts3VarE2;
            }
            ts3 ts3VarE3 = ei4Var.e();
            if (ts3VarE3 != null) {
                return ts3VarE3;
            }
            if (!z2 && (ts3VarE = e()) != null) {
                return ts3VarE;
            }
        } else {
            ts3 ts3VarE4 = e();
            if (ts3VarE4 != null) {
                return ts3VarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.n;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.n = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final ts3 e() {
        int iD = d(2);
        fq0 fq0Var = this.p;
        of1 of1Var = fq0Var.n;
        of1 of1Var2 = fq0Var.m;
        if (iD == 0) {
            ts3 ts3Var = (ts3) of1Var2.d();
            return ts3Var != null ? ts3Var : (ts3) of1Var.d();
        }
        ts3 ts3Var2 = (ts3) of1Var.d();
        return ts3Var2 != null ? ts3Var2 : (ts3) of1Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.l);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(eq0 eq0Var) {
        eq0 eq0Var2 = this.h;
        boolean z = eq0Var2 == eq0.c;
        if (z) {
            fq0.q.addAndGet(this.p, 4398046511104L);
        }
        if (eq0Var2 != eq0Var) {
            this.h = eq0Var;
        }
        return z;
    }

    public final ts3 i(int i) {
        ts3 ts3VarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = fq0.q;
        fq0 fq0Var = this.p;
        int i2 = (int) (atomicLongFieldUpdater.get(fq0Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = LongCompanionObject.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            dq0 dq0Var = (dq0) fq0Var.o.b(iD);
            if (dq0Var != null && dq0Var != this) {
                ei4 ei4Var = dq0Var.c;
                if (i != 3) {
                    ei4Var.getClass();
                    int i4 = ei4.d.get(ei4Var);
                    int i5 = ei4.c.get(ei4Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5 || (z && ei4.e.get(ei4Var) == 0)) {
                            ts3VarH = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        ts3VarH = ei4Var.h(i4, z);
                        if (ts3VarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    ts3VarH = ei4Var.f();
                }
                q43 q43Var = this.d;
                if (ts3VarH != null) {
                    q43Var.c = ts3VarH;
                    jI = -1;
                } else {
                    jI = ei4Var.i(i, q43Var);
                }
                if (jI == -1) {
                    ts3 ts3Var = (ts3) q43Var.c;
                    q43Var.c = null;
                    return ts3Var;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            jMin = 0;
        }
        this.m = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (fq0.r.get(this.p) != 1) {
                    eq0 eq0Var = this.h;
                    eq0 eq0Var2 = eq0.m;
                    if (eq0Var == eq0Var2) {
                        break loop0;
                    }
                    ts3 ts3VarA = a(this.o);
                    if (ts3VarA != null) {
                        this.m = 0L;
                        fq0 fq0Var = this.p;
                        this.l = 0L;
                        if (this.h == eq0.h) {
                            this.h = eq0.d;
                        }
                        if (!ts3VarA.d) {
                            try {
                                ts3VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(eq0.d) && !fq0Var.x() && !fq0Var.p(fq0.q.get(fq0Var))) {
                            fq0Var.x();
                        }
                        try {
                            ts3VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        fq0.q.addAndGet(fq0Var, -2097152L);
                        if (this.h == eq0Var2) {
                            break;
                        }
                        this.h = eq0.l;
                        break;
                    }
                    this.o = false;
                    if (this.m == 0) {
                        Object obj = this.nextParkedWorker;
                        d5 d5Var = fq0.s;
                        if (obj != d5Var) {
                            q.set(this, -1);
                            while (this.nextParkedWorker != fq0.s) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                fq0 fq0Var2 = this.p;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = fq0.r;
                                if (atomicIntegerFieldUpdater2.get(fq0Var2) == 1) {
                                    break;
                                }
                                eq0 eq0Var3 = this.h;
                                eq0 eq0Var4 = eq0.m;
                                if (eq0Var3 == eq0Var4) {
                                    break;
                                }
                                h(eq0.h);
                                Thread.interrupted();
                                if (this.l == 0) {
                                    j = 2097151;
                                    this.l = System.nanoTime() + this.p.h;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.p.h);
                                if (System.nanoTime() - this.l >= 0) {
                                    this.l = 0L;
                                    fq0 fq0Var3 = this.p;
                                    synchronized (fq0Var3.o) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(fq0Var3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = fq0.q;
                                                if (((int) (atomicLongFieldUpdater.get(fq0Var3) & j)) > fq0Var3.c) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        fq0Var3.l(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(fq0Var3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = fq0Var3.o.b(andDecrement);
                                                            objB.getClass();
                                                            dq0 dq0Var = (dq0) objB;
                                                            fq0Var3.o.c(i, dq0Var);
                                                            dq0Var.f(i);
                                                            fq0Var3.l(dq0Var, andDecrement, i);
                                                        }
                                                        fq0Var3.o.c(andDecrement, null);
                                                        this.h = eq0Var4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            fq0 fq0Var4 = this.p;
                            if (this.nextParkedWorker == d5Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = fq0.p;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(fq0Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = fq0Var4.o.b((int) (j2 & 2097151));
                                    fq0 fq0Var5 = fq0Var4;
                                    if (fq0.p.compareAndSet(fq0Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        fq0Var4 = fq0Var5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(eq0.h);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.m);
                            this.m = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(eq0.m);
    }
}
