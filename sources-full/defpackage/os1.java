package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class os1 implements gs1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(os1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = u00.a;
        l = unsafe.objectFieldOffset(os1.class.getDeclaredField("_state$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(os1.class, Object.class, "_parentHandle$volatile");
        h = unsafe.objectFieldOffset(os1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public os1(boolean z) {
        this._state$volatile = z ? py.q : py.p;
    }

    public static vb0 Q(l72 l72Var) {
        while (l72Var.m()) {
            l72Var = l72Var.l();
        }
        while (true) {
            l72Var = l72Var.k();
            if (!l72Var.m()) {
                if (l72Var instanceof vb0) {
                    return (vb0) l72Var;
                }
                if (l72Var instanceof yl2) {
                    return null;
                }
            }
        }
    }

    public static String Z(Object obj) {
        if (!(obj instanceof ns1)) {
            if (obj instanceof nn1) {
                return ((nn1) obj).a() ? "Active" : "New";
            }
            return obj instanceof dg0 ? "Cancelled" : "Completed";
        }
        ns1 ns1Var = (ns1) obj;
        if (ns1Var.f()) {
            return "Cancelling";
        }
        return ns1.d.get(ns1Var) == 1 ? "Completing" : "Active";
    }

    @Override // defpackage.gs1
    public final yw0 A(le1 le1Var) {
        return I(true, new yr1(le1Var));
    }

    public boolean B() {
        return this instanceof ag0;
    }

    public final yl2 C(nn1 nn1Var) {
        yl2 yl2VarC = nn1Var.c();
        if (yl2VarC != null) {
            return yl2VarC;
        }
        if (nn1Var instanceof u21) {
            return new yl2();
        }
        if (nn1Var instanceof js1) {
            V((js1) nn1Var);
            return null;
        }
        m51.u(nn1Var, "State should have list: ");
        return null;
    }

    public final ub0 D() {
        d.getClass();
        return (ub0) u00.a.getObjectVolatile(this, h);
    }

    public final Object E() {
        c.getClass();
        return u00.a.getObjectVolatile(this, l);
    }

    public boolean F(Throwable th) {
        return false;
    }

    public void G(eg0 eg0Var) {
        throw eg0Var;
    }

    public final void H(gs1 gs1Var) {
        dm2 dm2Var = dm2.c;
        if (gs1Var == null) {
            X(dm2Var);
            return;
        }
        gs1Var.start();
        ub0 ub0VarP = gs1Var.p(this);
        X(ub0VarP);
        if (E() instanceof nn1) {
            return;
        }
        ub0VarP.dispose();
        X(dm2Var);
    }

    public final yw0 I(boolean z, js1 js1Var) {
        os1 os1Var;
        js1 js1Var2;
        boolean zD;
        js1Var.o = this;
        loop0: while (true) {
            Object objE = this.E();
            if (!(objE instanceof u21)) {
                os1Var = this;
                js1Var2 = js1Var;
                boolean z2 = objE instanceof nn1;
                dm2 dm2Var = dm2.c;
                if (z2) {
                    nn1 nn1Var = (nn1) objE;
                    yl2 yl2VarC = nn1Var.c();
                    if (yl2VarC == null) {
                        os1Var.V((js1) objE);
                    } else {
                        if (js1Var2.q()) {
                            ns1 ns1Var = nn1Var instanceof ns1 ? (ns1) nn1Var : null;
                            Throwable thE = ns1Var != null ? ns1Var.e() : null;
                            if (thE == null) {
                                zD = yl2VarC.d(js1Var2, 5);
                            } else if (z) {
                                js1Var2.r(thE);
                                return dm2Var;
                            }
                        } else {
                            zD = yl2VarC.d(js1Var2, 1);
                        }
                        if (zD) {
                            break;
                        }
                    }
                    this = os1Var;
                    js1Var = js1Var2;
                } else if (z) {
                    Object objE2 = os1Var.E();
                    dg0 dg0Var = objE2 instanceof dg0 ? (dg0) objE2 : null;
                    js1Var2.r(dg0Var != null ? dg0Var.a : null);
                }
                return dm2Var;
            }
            u21 u21Var = (u21) objE;
            if (u21Var.c) {
                while (true) {
                    c.getClass();
                    Unsafe unsafe = u00.a;
                    long j = l;
                    os1Var = this;
                    js1Var2 = js1Var;
                    if (unsafe.compareAndSwapObject(os1Var, j, objE, js1Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(os1Var, j) != objE) {
                        break;
                    }
                    this = os1Var;
                    js1Var = js1Var2;
                }
            } else {
                os1Var = this;
                js1Var2 = js1Var;
                os1Var.U(u21Var);
            }
            this = os1Var;
            js1Var = js1Var2;
        }
        return js1Var2;
    }

    public boolean J() {
        return this instanceof tv;
    }

    @Override // defpackage.gs1
    public final Object K(uo0 uo0Var) {
        Object objE;
        w84 w84Var;
        do {
            objE = E();
            boolean z = objE instanceof nn1;
            w84Var = w84.a;
            if (!z) {
                yo4.v(uo0Var.getContext());
                return w84Var;
            }
        } while (Y(objE) < 0);
        t00 t00Var = new t00(1, gm4.G(uo0Var));
        t00Var.u();
        t00Var.x(new m00(2, yo4.D(this, true, new l63(t00Var))));
        Object objS = t00Var.s();
        hq0 hq0Var = hq0.c;
        if (objS != hq0Var) {
            objS = w84Var;
        }
        return objS == hq0Var ? objS : w84Var;
    }

    public final boolean M(Object obj) {
        Object objC0;
        do {
            objC0 = c0(E(), obj);
            if (objC0 == py.h) {
                return false;
            }
            if (objC0 == py.l) {
                return true;
            }
        } while (objC0 == py.m);
        k(objC0);
        return true;
    }

    public final Object N(Object obj) {
        Object objC0;
        do {
            objC0 = c0(E(), obj);
            if (objC0 == py.h) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                dg0 dg0Var = obj instanceof dg0 ? (dg0) obj : null;
                throw new IllegalStateException(str, dg0Var != null ? dg0Var.a : null);
            }
        } while (objC0 == py.m);
        return objC0;
    }

    @Override // defpackage.gs1
    public final yw0 O(boolean z, boolean z2, l lVar) {
        return I(z2, z ? new xr1(lVar) : new yr1(lVar));
    }

    public String P() {
        return getClass().getSimpleName();
    }

    public final void R(yl2 yl2Var, Throwable th) {
        yl2Var.d(new d52(4), 4);
        Object objJ = yl2Var.j();
        objJ.getClass();
        eg0 eg0Var = null;
        for (l72 l72VarK = (l72) objJ; !l72VarK.equals(yl2Var); l72VarK = l72VarK.k()) {
            if ((l72VarK instanceof js1) && ((js1) l72VarK).q()) {
                try {
                    ((js1) l72VarK).r(th);
                } catch (Throwable th2) {
                    if (eg0Var != null) {
                        gb2.l(eg0Var, th2);
                    } else {
                        eg0Var = new eg0("Exception in completion handler " + l72VarK + " for " + this, th2);
                    }
                }
            }
        }
        if (eg0Var != null) {
            G(eg0Var);
        }
        r(th);
    }

    public void S(Object obj) {
    }

    public void T() {
    }

    public final void U(u21 u21Var) {
        yl2 yl2Var = new yl2();
        Object mn1Var = u21Var.c ? yl2Var : new mn1(yl2Var);
        while (true) {
            c.getClass();
            Unsafe unsafe = u00.a;
            long j = l;
            os1 os1Var = this;
            u21 u21Var2 = u21Var;
            if (unsafe.compareAndSwapObject(os1Var, j, u21Var2, mn1Var) || unsafe.getObjectVolatile(os1Var, j) != u21Var2) {
                return;
            }
            this = os1Var;
            u21Var = u21Var2;
        }
    }

    public final void V(js1 js1Var) {
        js1Var.f(new yl2());
        l72 l72VarK = js1Var.k();
        while (true) {
            c.getClass();
            Unsafe unsafe = u00.a;
            long j = l;
            os1 os1Var = this;
            js1 js1Var2 = js1Var;
            if (unsafe.compareAndSwapObject(os1Var, j, js1Var2, l72VarK) || unsafe.getObjectVolatile(os1Var, j) != js1Var2) {
                return;
            }
            this = os1Var;
            js1Var = js1Var2;
        }
    }

    public final void W(js1 js1Var) {
        os1 os1Var;
        while (true) {
            Object objE = this.E();
            if (!(objE instanceof js1)) {
                if (!(objE instanceof nn1) || ((nn1) objE).c() == null) {
                    return;
                }
                js1Var.n();
                return;
            }
            if (objE != js1Var) {
                return;
            }
            u21 u21Var = py.q;
            while (true) {
                c.getClass();
                Unsafe unsafe = u00.a;
                long j = l;
                os1Var = this;
                if (unsafe.compareAndSwapObject(os1Var, j, objE, u21Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(os1Var, j) != objE) {
                    break;
                } else {
                    this = os1Var;
                }
            }
            this = os1Var;
        }
    }

    public final void X(ub0 ub0Var) {
        d.getClass();
        u00.a.putObjectVolatile(this, h, ub0Var);
    }

    public final int Y(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof u21;
        long j = l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (z) {
            if (((u21) obj).c) {
                return 0;
            }
            u21 u21Var = py.q;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = u00.a;
                if (unsafe2.compareAndSwapObject(this, l, obj, u21Var)) {
                    T();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof mn1)) {
            return 0;
        }
        yl2 yl2Var = ((mn1) obj).c;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = u00.a;
            if (unsafe.compareAndSwapObject(this, l, obj, yl2Var)) {
                T();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // defpackage.gs1
    public boolean a() {
        Object objE = E();
        return (objE instanceof nn1) && ((nn1) objE).a();
    }

    public final boolean a0(nn1 nn1Var, Object obj) {
        Object on1Var = obj instanceof nn1 ? new on1((nn1) obj) : obj;
        while (true) {
            c.getClass();
            Unsafe unsafe = u00.a;
            long j = l;
            os1 os1Var = this;
            nn1 nn1Var2 = nn1Var;
            if (unsafe.compareAndSwapObject(os1Var, j, nn1Var2, on1Var)) {
                os1Var.S(obj);
                os1Var.u(nn1Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(os1Var, j) != nn1Var2) {
                return false;
            }
            this = os1Var;
            nn1Var = nn1Var2;
        }
    }

    public final boolean b0(nn1 nn1Var, Throwable th) {
        yl2 yl2VarC = C(nn1Var);
        if (yl2VarC == null) {
            return false;
        }
        ns1 ns1Var = new ns1(yl2VarC, th);
        while (true) {
            c.getClass();
            Unsafe unsafe = u00.a;
            long j = l;
            os1 os1Var = this;
            nn1 nn1Var2 = nn1Var;
            if (unsafe.compareAndSwapObject(os1Var, j, nn1Var2, ns1Var)) {
                os1Var.R(yl2VarC, th);
                return true;
            }
            if (unsafe.getObjectVolatile(os1Var, j) != nn1Var2) {
                return false;
            }
            this = os1Var;
            nn1Var = nn1Var2;
        }
    }

    @Override // defpackage.gs1
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new hs1(s(), null, this);
        }
        q(cancellationException);
    }

    public final Object c0(Object obj, Object obj2) {
        if (!(obj instanceof nn1)) {
            return py.h;
        }
        if (((obj instanceof u21) || (obj instanceof js1)) && !(obj instanceof vb0) && !(obj2 instanceof dg0)) {
            return a0((nn1) obj, obj2) ? obj2 : py.m;
        }
        nn1 nn1Var = (nn1) obj;
        yl2 yl2VarC = C(nn1Var);
        if (yl2VarC == null) {
            return py.m;
        }
        ns1 ns1Var = nn1Var instanceof ns1 ? (ns1) nn1Var : null;
        if (ns1Var == null) {
            ns1Var = new ns1(yl2VarC, null);
        }
        synchronized (ns1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ns1.d;
            if (atomicIntegerFieldUpdater.get(ns1Var) == 1) {
                return py.h;
            }
            atomicIntegerFieldUpdater.set(ns1Var, 1);
            if (ns1Var != nn1Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nn1Var, ns1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != nn1Var) {
                        return py.m;
                    }
                }
            }
            boolean zF = ns1Var.f();
            dg0 dg0Var = obj2 instanceof dg0 ? (dg0) obj2 : null;
            if (dg0Var != null) {
                ns1Var.b(dg0Var.a);
            }
            Throwable thE = zF ? null : ns1Var.e();
            if (thE != null) {
                R(yl2VarC, thE);
            }
            vb0 vb0VarQ = Q(yl2VarC);
            if (vb0VarQ != null && d0(ns1Var, vb0VarQ, obj2)) {
                return py.l;
            }
            yl2VarC.d(new d52(2), 2);
            vb0 vb0VarQ2 = Q(yl2VarC);
            return (vb0VarQ2 == null || !d0(ns1Var, vb0VarQ2, obj2)) ? w(ns1Var, obj2) : py.l;
        }
    }

    public final boolean d0(ns1 ns1Var, vb0 vb0Var, Object obj) {
        while (yo4.D(vb0Var.p, false, new ms1(this, ns1Var, vb0Var, obj)) == dm2.c) {
            vb0Var = Q(vb0Var);
            if (vb0Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return ne1Var.invoke(obj, this);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        return y64.w(this, wp0Var);
    }

    @Override // defpackage.vp0
    public final wp0 getKey() {
        return bg1.s;
    }

    @Override // defpackage.gs1
    public final boolean isCancelled() {
        Object objE = E();
        if (objE instanceof dg0) {
            return true;
        }
        return (objE instanceof ns1) && ((ns1) objE).f();
    }

    public void k(Object obj) {
    }

    public void l(Object obj) {
        k(obj);
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    public final Object n(uo0 uo0Var) throws Throwable {
        Object objE;
        do {
            objE = E();
            if (!(objE instanceof nn1)) {
                if (objE instanceof dg0) {
                    throw ((dg0) objE).a;
                }
                return py.W(objE);
            }
        } while (Y(objE) < 0);
        ls1 ls1Var = new ls1(gm4.G(uo0Var), this);
        ls1Var.u();
        ls1Var.x(new m00(2, yo4.D(this, true, new k63(ls1Var))));
        return ls1Var.s();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean o(Object obj) {
        Throwable thV;
        Object objE;
        Throwable thE;
        d5 d5Var;
        nn1 nn1Var;
        Object objC0;
        Object objC1 = py.h;
        if (B()) {
            do {
                Object objE2 = E();
                if (objE2 instanceof nn1) {
                    if (objE2 instanceof ns1) {
                        if (ns1.d.get((ns1) objE2) == 1) {
                        }
                    }
                    objC1 = c0(objE2, new dg0(v(obj), false));
                }
                objC1 = py.h;
                break;
            } while (objC1 == py.m);
            if (objC1 != py.l) {
                if (objC1 == py.h) {
                    thV = null;
                    while (true) {
                        objE = E();
                        if (objE instanceof ns1) {
                            synchronized (objE) {
                                if (((ns1) objE).d() == py.o) {
                                    d5Var = py.n;
                                } else {
                                    boolean zF = ((ns1) objE).f();
                                    if (thV == null) {
                                        thV = v(obj);
                                    }
                                    ((ns1) objE).b(thV);
                                    thE = zF ? null : ((ns1) objE).e();
                                    if (thE != null) {
                                        R(((ns1) objE).c, thE);
                                    }
                                    d5Var = py.h;
                                }
                            }
                        } else if (objE instanceof nn1) {
                            if (thV == null) {
                                thV = v(obj);
                            }
                            nn1Var = (nn1) objE;
                            if (nn1Var.a()) {
                                objC0 = c0(objE, new dg0(thV, false));
                                if (objC0 != py.h) {
                                    m51.u(objE, "Cannot happen in ");
                                    return false;
                                }
                                if (objC0 != py.m) {
                                    objC1 = objC0;
                                    break;
                                }
                            } else if (b0(nn1Var, thV)) {
                                d5Var = py.h;
                            }
                        } else {
                            d5Var = py.n;
                        }
                        objC1 = d5Var;
                        break;
                    }
                }
                if (objC1 != py.h && objC1 != py.l) {
                    if (objC1 == py.n) {
                        return false;
                    }
                    k(objC1);
                    return true;
                }
            }
        } else {
            if (objC1 == py.h) {
                thV = null;
                while (true) {
                    objE = E();
                    if (objE instanceof ns1) {
                        synchronized (objE) {
                            if (((ns1) objE).d() == py.o) {
                                d5Var = py.n;
                            } else {
                                boolean zF2 = ((ns1) objE).f();
                                if (thV == null) {
                                    thV = v(obj);
                                }
                                ((ns1) objE).b(thV);
                                if (zF2) {
                                }
                                if (thE != null) {
                                    R(((ns1) objE).c, thE);
                                }
                                d5Var = py.h;
                            }
                        }
                    } else if (objE instanceof nn1) {
                        if (thV == null) {
                            thV = v(obj);
                        }
                        nn1Var = (nn1) objE;
                        if (nn1Var.a()) {
                            objC0 = c0(objE, new dg0(thV, false));
                            if (objC0 != py.h) {
                                m51.u(objE, "Cannot happen in ");
                                return false;
                            }
                            if (objC0 != py.m) {
                                objC1 = objC0;
                                break;
                            }
                        } else if (b0(nn1Var, thV)) {
                            d5Var = py.h;
                        }
                    } else {
                        d5Var = py.n;
                    }
                    objC1 = d5Var;
                    break;
                }
            }
            if (objC1 != py.h) {
                if (objC1 == py.n) {
                    return false;
                }
                k(objC1);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.gs1
    public final ub0 p(os1 os1Var) {
        os1 os1Var2;
        vb0 vb0Var = new vb0(os1Var);
        vb0Var.o = this;
        loop0: while (true) {
            Object objE = this.E();
            if (objE instanceof u21) {
                u21 u21Var = (u21) objE;
                if (u21Var.c) {
                    while (true) {
                        c.getClass();
                        Unsafe unsafe = u00.a;
                        long j = l;
                        os1Var2 = this;
                        if (unsafe.compareAndSwapObject(os1Var2, j, objE, vb0Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(os1Var2, j) != objE) {
                            break;
                        }
                        this = os1Var2;
                    }
                } else {
                    os1Var2 = this;
                    os1Var2.U(u21Var);
                }
                this = os1Var2;
            } else {
                os1Var2 = this;
                boolean z = objE instanceof nn1;
                dm2 dm2Var = dm2.c;
                Throwable thE = null;
                if (!z) {
                    Object objE2 = os1Var2.E();
                    dg0 dg0Var = objE2 instanceof dg0 ? (dg0) objE2 : null;
                    vb0Var.r(dg0Var != null ? dg0Var.a : null);
                    return dm2Var;
                }
                yl2 yl2VarC = ((nn1) objE).c();
                if (yl2VarC != null) {
                    if (yl2VarC.d(vb0Var, 7)) {
                        break;
                    }
                    boolean zD = yl2VarC.d(vb0Var, 3);
                    Object objE3 = os1Var2.E();
                    if (objE3 instanceof ns1) {
                        thE = ((ns1) objE3).e();
                    } else {
                        dg0 dg0Var2 = objE3 instanceof dg0 ? (dg0) objE3 : null;
                        if (dg0Var2 != null) {
                            thE = dg0Var2.a;
                        }
                    }
                    vb0Var.r(thE);
                    if (zD) {
                        break;
                    }
                    return dm2Var;
                }
                os1Var2.V((js1) objE);
                this = os1Var2;
            }
        }
        return vb0Var;
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }

    public void q(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ub0 ub0VarD = D();
        if (ub0VarD == null || ub0VarD == dm2.c) {
            return z;
        }
        return ub0VarD.b(th) || z;
    }

    public String s() {
        return "Job was cancelled";
    }

    @Override // defpackage.gs1
    public final boolean start() {
        int iY;
        do {
            iY = Y(E());
            if (iY == 0) {
                return false;
            }
        } while (iY != 1);
        return true;
    }

    public boolean t(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && z();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P() + '{' + Z(E()) + '}');
        sb.append('@');
        sb.append(xr0.a0(this));
        return sb.toString();
    }

    public final void u(nn1 nn1Var, Object obj) {
        ub0 ub0VarD = D();
        if (ub0VarD != null) {
            ub0VarD.dispose();
            X(dm2.c);
        }
        eg0 eg0Var = null;
        dg0 dg0Var = obj instanceof dg0 ? (dg0) obj : null;
        Throwable th = dg0Var != null ? dg0Var.a : null;
        if (nn1Var instanceof js1) {
            try {
                ((js1) nn1Var).r(th);
                return;
            } catch (Throwable th2) {
                G(new eg0("Exception in completion handler " + nn1Var + " for " + this, th2));
                return;
            }
        }
        yl2 yl2VarC = nn1Var.c();
        if (yl2VarC != null) {
            yl2VarC.d(new d52(1), 1);
            Object objJ = yl2VarC.j();
            objJ.getClass();
            for (l72 l72VarK = (l72) objJ; !l72VarK.equals(yl2VarC); l72VarK = l72VarK.k()) {
                if (l72VarK instanceof js1) {
                    try {
                        ((js1) l72VarK).r(th);
                    } catch (Throwable th3) {
                        if (eg0Var != null) {
                            gb2.l(eg0Var, th3);
                        } else {
                            eg0Var = new eg0("Exception in completion handler " + l72VarK + " for " + this, th3);
                        }
                    }
                }
            }
            if (eg0Var != null) {
                G(eg0Var);
            }
        }
    }

    public final Throwable v(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        os1 os1Var = (os1) obj;
        Object objE = os1Var.E();
        if (objE instanceof ns1) {
            thE = ((ns1) objE).e();
        } else if (objE instanceof dg0) {
            thE = ((dg0) objE).a;
        } else {
            if (objE instanceof nn1) {
                m51.u(objE, "Cannot be cancelling child in this state: ");
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new hs1("Parent job is ".concat(Z(objE)), thE, os1Var) : cancellationException;
    }

    public final Object w(ns1 ns1Var, Object obj) throws Throwable {
        Throwable th;
        os1 os1Var;
        ns1 ns1Var2;
        dg0 dg0Var = obj instanceof dg0 ? (dg0) obj : null;
        Throwable th2 = dg0Var != null ? dg0Var.a : null;
        synchronized (ns1Var) {
            try {
                ns1Var.f();
                ArrayList arrayListG = ns1Var.g(th2);
                Throwable thY = y(ns1Var, arrayListG);
                if (thY != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thY && th3 != thY && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    gb2.l(thY, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thY != null && thY != th2) {
                    obj = new dg0(thY, false);
                }
                if (thY != null && (r(thY) || F(thY))) {
                    obj.getClass();
                    dg0.b.compareAndSet((dg0) obj, 0, 1);
                }
                S(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                Object on1Var = obj instanceof nn1 ? new on1((nn1) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = u00.a;
                    long j = l;
                    os1Var = this;
                    ns1Var2 = ns1Var;
                    if (unsafe.compareAndSwapObject(os1Var, j, ns1Var2, on1Var) || unsafe.getObjectVolatile(os1Var, j) != ns1Var2) {
                        break;
                    }
                    this = os1Var;
                    ns1Var = ns1Var2;
                }
                os1Var.u(ns1Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // defpackage.gs1
    public final CancellationException x() {
        CancellationException cancellationException;
        Object objE = E();
        if (objE instanceof ns1) {
            Throwable thE = ((ns1) objE).e();
            if (thE == null) {
                m51.u(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new hs1(strConcat, thE, this) : cancellationException;
        }
        if (objE instanceof nn1) {
            m51.u(this, "Job is still new or active: ");
            return null;
        }
        if (!(objE instanceof dg0)) {
            return new hs1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((dg0) objE).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new hs1(s(), th, this) : cancellationException;
    }

    public final Throwable y(ns1 ns1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ns1Var.f()) {
                return new hs1(s(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof v04) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof v04)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean z() {
        return true;
    }
}
