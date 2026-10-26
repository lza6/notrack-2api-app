package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class jf3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(jf3.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final s00 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = u00.a;
        h = unsafe.objectFieldOffset(jf3.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(jf3.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(jf3.class, Object.class, "tail$volatile");
        i = unsafe.objectFieldOffset(jf3.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(jf3.class, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(jf3.class, "_availablePermits$volatile");
    }

    public jf3(int i2) {
        this.a = i2;
        if (i2 <= 0) {
            u41.h(ud2.m(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0) {
            u41.h(ud2.m(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        mf3 mf3Var = new mf3(0L, null, 2);
        this.head$volatile = mf3Var;
        this.tail$volatile = mf3Var;
        this._availablePermits$volatile = i2;
        this.b = new s00(7, this);
    }

    public final Object a(uo0 uo0Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.a;
        } while (andDecrement > i2);
        w84 w84Var = w84.a;
        if (andDecrement <= 0) {
            t00 t00VarG = gb2.G(gm4.G(uo0Var));
            try {
                if (!b(t00VarG)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i2) {
                            if (andDecrement2 > 0) {
                                t00VarG.d(w84Var, this.b);
                                break;
                            }
                            if (b(t00VarG)) {
                                break;
                            }
                        }
                    }
                }
                Object objS = t00VarG.s();
                hq0 hq0Var = hq0.c;
                if (objS != hq0Var) {
                    objS = w84Var;
                }
                if (objS == hq0Var) {
                    return objS;
                }
            } catch (Throwable th) {
                t00VarG.B();
                throw th;
            }
        }
        return w84Var;
    }

    public final boolean b(kf4 kf4Var) {
        Object objA;
        Unsafe unsafe;
        jf3 jf3Var = this;
        e.getClass();
        Unsafe unsafe2 = u00.a;
        long j = i;
        mf3 mf3Var = (mf3) unsafe2.getObjectVolatile(jf3Var, j);
        long andIncrement = f.getAndIncrement(jf3Var);
        hf3 hf3Var = hf3.c;
        long j2 = andIncrement / ((long) lf3.f);
        loop0: while (true) {
            objA = sf3.A(mf3Var, j2, hf3Var);
            if (av1.B(objA)) {
                break;
            }
            vc3 vc3VarZ = av1.z(objA);
            while (true) {
                vc3 vc3Var = (vc3) u00.a.getObjectVolatile(jf3Var, j);
                if (vc3Var.e >= vc3VarZ.e) {
                    jf3Var = this;
                    break loop0;
                }
                if (!vc3VarZ.n()) {
                    break;
                }
                do {
                    unsafe = u00.a;
                    jf3Var = this;
                    if (unsafe.compareAndSwapObject(jf3Var, i, vc3Var, vc3VarZ)) {
                        if (!vc3Var.j()) {
                            break loop0;
                        }
                        vc3Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(jf3Var, j) == vc3Var);
                if (vc3VarZ.j()) {
                    vc3VarZ.h();
                }
            }
            jf3Var = this;
        }
        mf3 mf3Var2 = (mf3) av1.z(objA);
        AtomicReferenceArray atomicReferenceArray = mf3Var2.g;
        int i2 = (int) (andIncrement % ((long) lf3.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, kf4Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                d5 d5Var = lf3.b;
                d5 d5Var2 = lf3.c;
                while (!atomicReferenceArray.compareAndSet(i2, d5Var, d5Var2)) {
                    if (atomicReferenceArray.get(i2) != d5Var) {
                        return false;
                    }
                }
                ((r00) kf4Var).d(w84.a, jf3Var.b);
                return true;
            }
        }
        kf4Var.a(mf3Var2, i2);
        return true;
    }

    public final void c() {
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object objA;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = u00.a;
        long j = h;
        mf3 mf3Var = (mf3) unsafe2.getObjectVolatile(this, j);
        long andIncrement = d.getAndIncrement(this);
        long j2 = andIncrement / ((long) lf3.f);
        if3 if3Var = if3.c;
        loop0: while (true) {
            objA = sf3.A(mf3Var, j2, if3Var);
            if (av1.B(objA)) {
                break;
            }
            vc3 vc3VarZ = av1.z(objA);
            while (true) {
                vc3 vc3Var = (vc3) u00.a.getObjectVolatile(this, j);
                if (vc3Var.e >= vc3VarZ.e) {
                    break loop0;
                }
                if (!vc3VarZ.n()) {
                    break;
                }
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(this, h, vc3Var, vc3VarZ)) {
                        if (!vc3Var.j()) {
                            break loop0;
                        }
                        vc3Var.h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == vc3Var);
                if (vc3VarZ.j()) {
                    vc3VarZ.h();
                }
            }
        }
        mf3 mf3Var2 = (mf3) av1.z(objA);
        AtomicReferenceArray atomicReferenceArray = mf3Var2.g;
        mf3Var2.a();
        boolean z = false;
        if (mf3Var2.e <= j2) {
            int i2 = (int) (andIncrement % ((long) lf3.f));
            Object andSet = atomicReferenceArray.getAndSet(i2, lf3.b);
            if (andSet == null) {
                int i3 = lf3.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == lf3.c) {
                        return true;
                    }
                }
                d5 d5Var = lf3.b;
                d5 d5Var2 = lf3.d;
                while (!atomicReferenceArray.compareAndSet(i2, d5Var, d5Var2)) {
                    if (atomicReferenceArray.get(i2) != d5Var) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != lf3.e) {
                if (!(andSet instanceof r00)) {
                    m51.u(andSet, "unexpected: ");
                    return false;
                }
                r00 r00Var = (r00) andSet;
                d5 d5VarE = r00Var.e(w84.a, this.b);
                if (d5VarE != null) {
                    r00Var.m(d5VarE);
                    return true;
                }
            }
        }
        return false;
    }
}
