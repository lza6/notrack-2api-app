package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class nw0 extends pw0 implements iq0, so0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(nw0.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long q = u00.a.objectFieldOffset(nw0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final zp0 l;
    public final so0 m;
    public Object n;
    public final Object o;

    public nw0(zp0 zp0Var, so0 so0Var) {
        super(-1);
        this.l = zp0Var;
        this.m = so0Var;
        this.n = xp1.g;
        this.o = yh4.Z(so0Var.getContext());
    }

    @Override // defpackage.pw0
    public final so0 c() {
        return this;
    }

    @Override // defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.m;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.m.getContext();
    }

    @Override // defpackage.pw0
    public final Object j() {
        Object obj = this.n;
        this.n = xp1.g;
        return obj;
    }

    public final void k() {
        do {
            p.getClass();
        } while (u00.a.getObjectVolatile(this, q) == xp1.h);
    }

    public final t00 l() {
        nw0 nw0Var;
        d5 d5Var = xp1.h;
        while (true) {
            p.getClass();
            Unsafe unsafe = u00.a;
            long j = q;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, d5Var);
                return null;
            }
            if (objectVolatile instanceof t00) {
                while (true) {
                    Unsafe unsafe2 = u00.a;
                    nw0 nw0Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(nw0Var2, q, objectVolatile, d5Var);
                    nw0Var = nw0Var2;
                    if (zCompareAndSwapObject) {
                        return (t00) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(nw0Var, j) != objectVolatile) {
                        break;
                    }
                    this = nw0Var;
                }
            } else {
                nw0Var = this;
                if (objectVolatile != d5Var && !(objectVolatile instanceof Throwable)) {
                    m51.u(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = nw0Var;
        }
    }

    public final t00 n() {
        p.getClass();
        Object objectVolatile = u00.a.getObjectVolatile(this, q);
        if (objectVolatile instanceof t00) {
            return (t00) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        p.getClass();
        return u00.a.getObjectVolatile(this, q) != null;
    }

    public final boolean p(Throwable th) {
        nw0 nw0Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            p.getClass();
            Unsafe unsafe2 = u00.a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            d5 d5Var = xp1.h;
            if (kr1.n(objectVolatile, d5Var)) {
                while (true) {
                    Unsafe unsafe3 = u00.a;
                    nw0 nw0Var2 = this;
                    th2 = th;
                    nw0Var = nw0Var2;
                    if (unsafe3.compareAndSwapObject(nw0Var2, q, d5Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(nw0Var, j) != d5Var) {
                        break;
                    }
                    this = nw0Var;
                    th = th2;
                }
            } else {
                nw0Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(nw0Var, q, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(nw0Var, j) == objectVolatile);
            }
            this = nw0Var;
            th = th2;
        }
    }

    public final Throwable q(t00 t00Var) {
        Unsafe unsafe;
        nw0 nw0Var;
        t00 t00Var2;
        while (true) {
            p.getClass();
            Unsafe unsafe2 = u00.a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            d5 d5Var = xp1.h;
            if (objectVolatile != d5Var) {
                nw0 nw0Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    m51.u(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(nw0Var2, q, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(nw0Var2, j) == objectVolatile);
                u41.k("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = u00.a;
                nw0Var = this;
                t00Var2 = t00Var;
                if (unsafe3.compareAndSwapObject(nw0Var, q, d5Var, t00Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(nw0Var, j) != d5Var) {
                    break;
                }
                this = nw0Var;
                t00Var = t00Var2;
            }
            this = nw0Var;
            t00Var = t00Var2;
        }
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        Throwable thA = j63.a(obj);
        Object dg0Var = thA == null ? obj : new dg0(thA, false);
        so0 so0Var = this.m;
        xp0 context = so0Var.getContext();
        zp0 zp0Var = this.l;
        if (xp1.D(zp0Var, context)) {
            this.n = dg0Var;
            this.h = 0;
            xp1.C(zp0Var, so0Var.getContext(), this);
            return;
        }
        v41 v41VarA = i04.a();
        if (v41VarA.c >= 4294967296L) {
            this.n = dg0Var;
            this.h = 0;
            v41VarA.R(this);
            return;
        }
        v41VarA.S(true);
        try {
            xp0 context2 = so0Var.getContext();
            Object objD0 = yh4.d0(context2, this.o);
            try {
                so0Var.resumeWith(obj);
                yh4.R(context2, objD0);
                while (v41VarA.U()) {
                }
            } catch (Throwable th) {
                yh4.R(context2, objD0);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                v41VarA.Q(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.l + ", " + xr0.A0(this.m) + ']';
    }
}
