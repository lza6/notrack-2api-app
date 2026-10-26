package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class t00 extends pw0 implements r00, iq0, kf4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(t00.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(t00.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final so0 l;
    public final xp0 m;

    static {
        Unsafe unsafe = u00.a;
        r = unsafe.objectFieldOffset(t00.class.getDeclaredField("_state$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(t00.class, Object.class, "_parentHandle$volatile");
        q = unsafe.objectFieldOffset(t00.class.getDeclaredField("_parentHandle$volatile"));
    }

    public t00(int i, so0 so0Var) {
        super(i);
        this.l = so0Var;
        this.m = so0Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = l3.a;
    }

    public static Object F(hm2 hm2Var, Object obj, int i, oe1 oe1Var) {
        if (obj instanceof dg0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (oe1Var != null || (hm2Var instanceof m00)) {
            return new bg0(obj, hm2Var instanceof m00 ? (m00) hm2Var : null, oe1Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thQ;
        so0 so0Var = this.l;
        nw0 nw0Var = so0Var instanceof nw0 ? (nw0) so0Var : null;
        if (nw0Var == null || (thQ = nw0Var.q(this)) == null) {
            return;
        }
        o();
        g(thQ);
    }

    public final boolean C() {
        o.getClass();
        Unsafe unsafe = u00.a;
        long j = r;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof bg0) && ((bg0) objectVolatile).d != null) {
            o();
            return false;
        }
        n.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, l3.a);
        return true;
    }

    public final void D(Object obj, int i, oe1 oe1Var) {
        t00 t00Var;
        while (true) {
            o.getClass();
            Unsafe unsafe = u00.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof hm2)) {
                t00 t00Var2 = this;
                if (objectVolatile instanceof w00) {
                    w00 w00Var = (w00) objectVolatile;
                    if (w00.c.compareAndSet(w00Var, 0, 1)) {
                        if (oe1Var != null) {
                            t00Var2.l(oe1Var, w00Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                m51.u(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((hm2) objectVolatile, obj, i, oe1Var);
            while (true) {
                Unsafe unsafe2 = u00.a;
                t00Var = this;
                if (unsafe2.compareAndSwapObject(t00Var, r, objectVolatile, objF)) {
                    if (!t00Var.y()) {
                        t00Var.o();
                    }
                    t00Var.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(t00Var, j) != objectVolatile) {
                    break;
                } else {
                    this = t00Var;
                }
            }
            this = t00Var;
        }
    }

    public final void E(zp0 zp0Var) {
        so0 so0Var = this.l;
        nw0 nw0Var = so0Var instanceof nw0 ? (nw0) so0Var : null;
        D(w84.a, (nw0Var != null ? nw0Var.l : null) == zp0Var ? 4 : this.h, null);
    }

    public final d5 G(Object obj, oe1 oe1Var) {
        t00 t00Var;
        d5 d5Var = y64.a;
        while (true) {
            o.getClass();
            Unsafe unsafe = u00.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof hm2)) {
                return null;
            }
            Object objF = F((hm2) objectVolatile, obj, this.h, oe1Var);
            while (true) {
                Unsafe unsafe2 = u00.a;
                t00Var = this;
                if (unsafe2.compareAndSwapObject(t00Var, r, objectVolatile, objF)) {
                    if (!t00Var.y()) {
                        t00Var.o();
                    }
                    return d5Var;
                }
                if (unsafe2.getObjectVolatile(t00Var, j) != objectVolatile) {
                    break;
                }
                this = t00Var;
            }
            this = t00Var;
        }
    }

    @Override // defpackage.kf4
    public final void a(vc3 vc3Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = n;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                u41.r("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(vc3Var);
    }

    @Override // defpackage.pw0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        t00 t00Var;
        while (true) {
            o.getClass();
            Unsafe unsafe = u00.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof hm2) {
                u41.r("Not completed");
                return;
            }
            if (objectVolatile instanceof dg0) {
                return;
            }
            if (objectVolatile instanceof bg0) {
                bg0 bg0Var = (bg0) objectVolatile;
                if (bg0Var.e != null) {
                    u41.r("Must be called at most once");
                    return;
                }
                bg0 bg0VarA = bg0.a(bg0Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = u00.a;
                    t00 t00Var2 = this;
                    if (unsafe2.compareAndSwapObject(t00Var2, r, objectVolatile, bg0VarA)) {
                        m00 m00Var = bg0Var.b;
                        if (m00Var != null) {
                            t00Var2.k(m00Var, cancellationException);
                        }
                        oe1 oe1Var = bg0Var.c;
                        if (oe1Var != null) {
                            t00Var2.l(oe1Var, cancellationException, bg0Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(t00Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        t00Var = t00Var2;
                        break;
                    }
                    this = t00Var2;
                }
            } else {
                t00 t00Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                bg0 bg0Var2 = new bg0(objectVolatile, (m00) null, (oe1) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    bg0 bg0Var3 = bg0Var2;
                    Unsafe unsafe3 = u00.a;
                    t00Var = t00Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(t00Var, r, objectVolatile, bg0Var3);
                    bg0Var2 = bg0Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(t00Var, j) != objectVolatile) {
                        break;
                    } else {
                        t00Var3 = t00Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = t00Var;
        }
    }

    @Override // defpackage.pw0
    public final so0 c() {
        return this.l;
    }

    @Override // defpackage.r00
    public final void d(Object obj, oe1 oe1Var) {
        D(obj, this.h, oe1Var);
    }

    @Override // defpackage.r00
    public final d5 e(Object obj, oe1 oe1Var) {
        return G(obj, oe1Var);
    }

    @Override // defpackage.pw0
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.r00
    public final boolean g(Throwable th) {
        Throwable cancellationException;
        t00 t00Var;
        while (true) {
            o.getClass();
            Unsafe unsafe = u00.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof hm2)) {
                return false;
            }
            boolean z = (objectVolatile instanceof m00) || (objectVolatile instanceof vc3);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            w00 w00Var = new w00(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = u00.a;
                t00Var = this;
                if (unsafe2.compareAndSwapObject(t00Var, r, objectVolatile, w00Var)) {
                    hm2 hm2Var = (hm2) objectVolatile;
                    if (hm2Var instanceof m00) {
                        t00Var.k((m00) objectVolatile, th);
                    } else if (hm2Var instanceof vc3) {
                        t00Var.n((vc3) objectVolatile, th);
                    }
                    if (!t00Var.y()) {
                        t00Var.o();
                    }
                    t00Var.p(t00Var.h);
                    return true;
                }
                if (unsafe2.getObjectVolatile(t00Var, j) != objectVolatile) {
                    break;
                }
                this = t00Var;
            }
            this = t00Var;
        }
    }

    @Override // defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.l;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.m;
    }

    @Override // defpackage.pw0
    public final Object h(Object obj) {
        return obj instanceof bg0 ? ((bg0) obj).a : obj;
    }

    @Override // defpackage.pw0
    public final Object j() {
        return t();
    }

    public final void k(m00 m00Var, Throwable th) {
        try {
            switch (m00Var.a) {
                case 0:
                    ((ScheduledFuture) m00Var.b).cancel(false);
                    break;
                case 1:
                    ((le1) m00Var.b).invoke(th);
                    break;
                default:
                    ((yw0) m00Var.b).dispose();
                    break;
            }
        } catch (Throwable th2) {
            gm4.E(this.m, new eg0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(oe1 oe1Var, Throwable th, Object obj) {
        xp0 xp0Var = this.m;
        try {
            oe1Var.invoke(th, obj, xp0Var);
        } catch (Throwable th2) {
            gm4.E(xp0Var, new eg0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.r00
    public final void m(Object obj) {
        p(this.h);
    }

    public final void n(vc3 vc3Var, Throwable th) {
        xp0 xp0Var = this.m;
        int i = n.get(this) & 536870911;
        if (i == 536870911) {
            u41.r("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            vc3Var.l(i, xp0Var);
        } catch (Throwable th2) {
            gm4.E(xp0Var, new eg0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        yw0 yw0VarR = r();
        if (yw0VarR == null) {
            return;
        }
        yw0VarR.dispose();
        p.getClass();
        u00.a.putObjectVolatile(this, q, dm2.c);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = n;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    u41.r("Already resumed");
                    return;
                }
                boolean z = i == 4;
                so0 so0Var = this.l;
                if (!z && (so0Var instanceof nw0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.h;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        nw0 nw0Var = (nw0) so0Var;
                        zp0 zp0Var = nw0Var.l;
                        xp0 context = nw0Var.m.getContext();
                        if (xp1.D(zp0Var, context)) {
                            xp1.C(zp0Var, context, this);
                            return;
                        }
                        v41 v41VarA = i04.a();
                        if (v41VarA.c >= 4294967296L) {
                            v41VarA.R(this);
                            return;
                        }
                        v41VarA.S(true);
                        try {
                            py.N(this, so0Var, true);
                            do {
                            } while (v41VarA.U());
                        } catch (Throwable th) {
                            try {
                                i(th);
                            } finally {
                                v41VarA.Q(true);
                            }
                        }
                        return;
                    }
                }
                py.N(this, so0Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(os1 os1Var) {
        return os1Var.x();
    }

    public final yw0 r() {
        p.getClass();
        return (yw0) u00.a.getObjectVolatile(this, q);
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        Throwable thA = j63.a(obj);
        if (thA != null) {
            obj = new dg0(thA, false);
        }
        D(obj, this.h, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        gs1 gs1Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = n;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    u41.r("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objT = t();
                if (objT instanceof dg0) {
                    throw ((dg0) objT).a;
                }
                int i3 = this.h;
                if ((i3 != 1 && i3 != 2) || (gs1Var = (gs1) this.m.get(bg1.s)) == null || gs1Var.a()) {
                    return h(objT);
                }
                CancellationException cancellationExceptionX = gs1Var.x();
                b(cancellationExceptionX);
                throw cancellationExceptionX;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            v();
        }
        if (zY) {
            B();
        }
        return hq0.c;
    }

    public final Object t() {
        o.getClass();
        return u00.a.getObjectVolatile(this, r);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(xr0.A0(this.l));
        sb.append("){");
        Object objT = t();
        if (objT instanceof hm2) {
            str = "Active";
        } else {
            str = objT instanceof w00 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(xr0.a0(this));
        return sb.toString();
    }

    public final void u() {
        yw0 yw0VarV = v();
        if (yw0VarV == null || (t() instanceof hm2)) {
            return;
        }
        yw0VarV.dispose();
        p.getClass();
        u00.a.putObjectVolatile(this, q, dm2.c);
    }

    public final yw0 v() {
        gs1 gs1Var = (gs1) this.m.get(bg1.s);
        if (gs1Var == null) {
            return null;
        }
        yw0 yw0VarD = yo4.D(gs1Var, true, new tb0(this));
        while (true) {
            p.getClass();
            Unsafe unsafe = u00.a;
            long j = q;
            t00 t00Var = this;
            if (unsafe.compareAndSwapObject(t00Var, j, (Object) null, yw0VarD) || unsafe.getObjectVolatile(t00Var, j) != null) {
                break;
            }
            this = t00Var;
        }
        return yw0VarD;
    }

    public final void w(le1 le1Var) {
        x(new m00(1, le1Var));
    }

    public final void x(hm2 hm2Var) {
        t00 t00Var;
        Unsafe unsafe;
        t00 t00Var2;
        while (true) {
            o.getClass();
            Unsafe unsafe2 = u00.a;
            long j = r;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof l3) {
                while (true) {
                    Unsafe unsafe3 = u00.a;
                    t00Var = this;
                    if (unsafe3.compareAndSwapObject(t00Var, r, objectVolatile, hm2Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(t00Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = t00Var;
                    }
                }
            } else {
                t00Var = this;
                if ((objectVolatile instanceof m00) || (objectVolatile instanceof vc3)) {
                    z(hm2Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof dg0) {
                    dg0 dg0Var = (dg0) objectVolatile;
                    if (!dg0.b.compareAndSet(dg0Var, 0, 1)) {
                        z(hm2Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof w00) {
                        Throwable th = dg0Var.a;
                        if (hm2Var instanceof m00) {
                            t00Var.k((m00) hm2Var, th);
                            return;
                        } else {
                            hm2Var.getClass();
                            t00Var.n((vc3) hm2Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof bg0) {
                    bg0 bg0Var = (bg0) objectVolatile;
                    if (bg0Var.b != null) {
                        z(hm2Var, objectVolatile);
                        throw null;
                    }
                    if (hm2Var instanceof vc3) {
                        return;
                    }
                    hm2Var.getClass();
                    m00 m00Var = (m00) hm2Var;
                    Throwable th2 = bg0Var.e;
                    if (th2 != null) {
                        t00Var.k(m00Var, th2);
                        return;
                    }
                    bg0 bg0VarA = bg0.a(bg0Var, m00Var, null, 29);
                    do {
                        unsafe = u00.a;
                        t00Var2 = t00Var;
                        if (unsafe.compareAndSwapObject(t00Var, r, objectVolatile, bg0VarA)) {
                            return;
                        } else {
                            t00Var = t00Var2;
                        }
                    } while (unsafe.getObjectVolatile(t00Var2, j) == objectVolatile);
                } else {
                    t00 t00Var3 = t00Var;
                    if (hm2Var instanceof vc3) {
                        return;
                    }
                    hm2Var.getClass();
                    bg0 bg0Var2 = new bg0(objectVolatile, (m00) hm2Var, (oe1) null, (Throwable) null, 28);
                    while (true) {
                        bg0 bg0Var3 = bg0Var2;
                        Unsafe unsafe4 = u00.a;
                        t00Var = t00Var3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(t00Var, r, objectVolatile, bg0Var3);
                        bg0Var2 = bg0Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(t00Var, j) != objectVolatile) {
                            break;
                        } else {
                            t00Var3 = t00Var;
                        }
                    }
                }
            }
            this = t00Var;
        }
    }

    public final boolean y() {
        return this.h == 2 && ((nw0) this.l).o();
    }
}
