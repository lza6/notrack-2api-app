package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class jy implements w20 {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(jy.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(jy.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(jy.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(jy.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(jy.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ AtomicReferenceFieldUpdater p;
    public static final /* synthetic */ AtomicReferenceFieldUpdater q;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final int c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = u00.a;
        w = unsafe.objectFieldOffset(jy.class.getDeclaredField("sendSegment$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(jy.class, Object.class, "receiveSegment$volatile");
        v = unsafe.objectFieldOffset(jy.class.getDeclaredField("receiveSegment$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(jy.class, Object.class, "bufferEndSegment$volatile");
        t = unsafe.objectFieldOffset(jy.class.getDeclaredField("bufferEndSegment$volatile"));
        q = AtomicReferenceFieldUpdater.newUpdater(jy.class, Object.class, "_closeCause$volatile");
        s = unsafe.objectFieldOffset(jy.class.getDeclaredField("_closeCause$volatile"));
        r = AtomicReferenceFieldUpdater.newUpdater(jy.class, Object.class, "closeHandler$volatile");
        u = unsafe.objectFieldOffset(jy.class.getDeclaredField("closeHandler$volatile"));
    }

    public jy(int i) {
        this.c = i;
        if (i < 0) {
            u41.h(ud2.q("Invalid channel capacity: ", ", should be >=0", i));
            throw null;
        }
        i30 i30Var = ly.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : LongCompanionObject.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = l.get(this);
        i30 i30Var2 = new i30(0L, null, this, 3);
        this.sendSegment$volatile = i30Var2;
        this.receiveSegment$volatile = i30Var2;
        if (E()) {
            i30Var2 = ly.a;
            i30Var2.getClass();
        }
        this.bufferEndSegment$volatile = i30Var2;
        this._closeCause$volatile = ly.s;
    }

    public static Object H(jy jyVar, mq3 mq3Var) throws Throwable {
        i30 i30Var;
        Throwable th;
        i30 i30Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        atomicReferenceFieldUpdater.getClass();
        if (jyVar == null) {
            m51.t();
            return null;
        }
        i30 i30Var3 = (i30) u00.a.getObjectVolatile(jyVar, v);
        while (!jyVar.B()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(jyVar);
            long j = ly.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (i30Var3.e != j2) {
                i30 i30VarQ = jyVar.q(j2, i30Var3);
                if (i30VarQ == null) {
                    continue;
                } else {
                    i30Var = i30VarQ;
                }
            } else {
                i30Var = i30Var3;
            }
            jy jyVar2 = jyVar;
            Object objP = jyVar2.P(i30Var, i, andIncrement, null);
            d5 d5Var = ly.m;
            if (objP == d5Var) {
                u41.r("unexpected");
                return null;
            }
            d5 d5Var2 = ly.o;
            if (objP == d5Var2) {
                if (andIncrement < jyVar2.v()) {
                    i30Var.a();
                }
                jyVar = jyVar2;
                i30Var3 = i30Var;
            } else {
                if (objP != ly.n) {
                    i30Var.a();
                    return objP;
                }
                t00 t00VarG = gb2.G(gm4.G(mq3Var));
                try {
                    Object objP2 = jyVar2.P(i30Var, i, andIncrement, t00VarG);
                    if (objP2 != d5Var) {
                        if (objP2 == d5Var2) {
                            if (andIncrement < jyVar2.v()) {
                                i30Var.a();
                            }
                            i30 i30Var4 = (i30) atomicReferenceFieldUpdater.get(jyVar2);
                            while (true) {
                                if (jyVar2.B()) {
                                    t00VarG.resumeWith(new i63(jyVar2.t()));
                                    break;
                                }
                                t00 t00Var = t00VarG;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(jyVar2);
                                    long j3 = ly.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (i30Var4.e != j4) {
                                        try {
                                            i30 i30VarQ2 = jyVar2.q(j4, i30Var4);
                                            if (i30VarQ2 == null) {
                                                t00VarG = t00Var;
                                            } else {
                                                i30Var2 = i30VarQ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            t00VarG = t00Var;
                                            t00VarG.B();
                                            throw th;
                                        }
                                    } else {
                                        i30Var2 = i30Var4;
                                    }
                                    jy jyVar3 = jyVar2;
                                    objP2 = jyVar3.P(i30Var2, i2, andIncrement2, t00Var);
                                    jyVar2 = jyVar3;
                                    i30 i30Var5 = i30Var2;
                                    t00VarG = t00Var;
                                    if (objP2 == ly.m) {
                                        t00VarG.a(i30Var5, i2);
                                        break;
                                    }
                                    if (objP2 == ly.o) {
                                        if (andIncrement2 < jyVar2.v()) {
                                            i30Var5.a();
                                        }
                                        i30Var4 = i30Var5;
                                    } else {
                                        if (objP2 == ly.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        i30Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    t00VarG = t00Var;
                                    th = th;
                                    t00VarG.B();
                                    throw th;
                                }
                            }
                        } else {
                            i30Var.a();
                        }
                        t00VarG.d(objP2, null);
                        break;
                    }
                    t00VarG.a(i30Var, i);
                    return t00VarG.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thT = jyVar.t();
        int i3 = vm3.a;
        throw thT;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object I(jy jyVar, uo0 uo0Var) throws Throwable {
        hy hyVar;
        i30 i30Var;
        if (uo0Var instanceof hy) {
            hyVar = (hy) uo0Var;
            int i = hyVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hyVar.h = i - Integer.MIN_VALUE;
            } else {
                hyVar = new hy(jyVar, uo0Var);
            }
        } else {
            hyVar = new hy(jyVar, uo0Var);
        }
        hy hyVar2 = hyVar;
        Object obj = hyVar2.c;
        int i2 = hyVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                g13.O(obj);
                return ((h30) obj).a;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        o.getClass();
        i30 i30Var2 = (i30) u00.a.getObjectVolatile(jyVar, v);
        while (!jyVar.B()) {
            long andIncrement = h.getAndIncrement(jyVar);
            long j = ly.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (i30Var2.e != j2) {
                i30 i30VarQ = jyVar.q(j2, i30Var2);
                if (i30VarQ == null) {
                    continue;
                } else {
                    i30Var = i30VarQ;
                }
            } else {
                i30Var = i30Var2;
            }
            jy jyVar2 = jyVar;
            Object objP = jyVar2.P(i30Var, i3, andIncrement, null);
            if (objP == ly.m) {
                u41.r("unexpected");
                return null;
            }
            if (objP != ly.o) {
                if (objP != ly.n) {
                    i30Var.a();
                    return objP;
                }
                hyVar2.h = 1;
                Object objJ = jyVar2.J(i30Var, i3, andIncrement, hyVar2);
                hq0 hq0Var = hq0.c;
                return objJ == hq0Var ? hq0Var : objJ;
            }
            if (andIncrement < jyVar2.v()) {
                i30Var.a();
            }
            jyVar = jyVar2;
            i30Var2 = i30Var;
        }
        return new f30(jyVar.s());
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158 A[RETURN] */
    public static Object L(jy jyVar, Object obj, so0 so0Var) {
        w84 w84Var;
        Object objS;
        hq0 hq0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        atomicReferenceFieldUpdater.getClass();
        i30 i30Var = (i30) u00.a.getObjectVolatile(jyVar, w);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(jyVar);
            long j = andIncrement & 1152921504606846975L;
            boolean zA = jyVar.A(andIncrement, false);
            int i = ly.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = i30Var.e;
            hq0 hq0Var2 = hq0.c;
            w84Var = w84.a;
            if (j4 != j3) {
                i30 i30VarR = jyVar.r(j3, i30Var);
                if (i30VarR != null) {
                    i30Var = i30VarR;
                } else if (zA) {
                    Object objG = jyVar.G(so0Var, obj);
                    if (objG == hq0Var2) {
                        return objG;
                    }
                }
            }
            int iD = d(jyVar, i30Var, i2, obj, j, null, zA);
            if (iD == 0) {
                i30Var.a();
                return w84Var;
            }
            if (iD != 1) {
                if (iD == 2) {
                    if (!zA) {
                        break;
                    }
                    i30Var.m();
                    Object objG2 = jyVar.G(so0Var, obj);
                    if (objG2 == hq0Var2) {
                        return objG2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
                    if (iD == 3) {
                        t00 t00VarG = gb2.G(gm4.G(so0Var));
                        try {
                            int iD2 = d(jyVar, i30Var, i2, obj, j, t00VarG, false);
                            if (iD2 != 0) {
                                if (iD2 == 1) {
                                    hq0Var2 = hq0Var2;
                                    t00VarG.resumeWith(w84Var);
                                } else if (iD2 != 2) {
                                    if (iD2 == 4) {
                                        hq0Var2 = hq0Var2;
                                        if (j < atomicLongFieldUpdater2.get(jyVar)) {
                                            i30Var.a();
                                        }
                                    } else {
                                        if (iD2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        i30Var.a();
                                        i30 i30Var2 = (i30) atomicReferenceFieldUpdater.get(jyVar);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(jyVar);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zA2 = jyVar.A(andIncrement2, false);
                                            int i3 = ly.b;
                                            long j6 = i3;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j7 = j5 / j6;
                                            int i4 = (int) (j5 % j6);
                                            hq0Var2 = hq0Var2;
                                            if (i30Var2.e != j7) {
                                                i30 i30VarR2 = jyVar.r(j7, i30Var2);
                                                if (i30VarR2 != null) {
                                                    i30Var2 = i30VarR2;
                                                } else if (zA2) {
                                                }
                                            }
                                            int iD3 = d(jyVar, i30Var2, i4, obj, j5, t00VarG, zA2);
                                            if (iD3 == 0) {
                                                i30Var2.a();
                                            } else if (iD3 != 1) {
                                                if (iD3 == 2) {
                                                    if (!zA2) {
                                                        t00VarG.a(i30Var2, i4 + i3);
                                                        break;
                                                    }
                                                    i30Var2.m();
                                                } else {
                                                    if (iD3 == 3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    if (iD3 != 4) {
                                                        if (iD3 == 5) {
                                                            i30Var2.a();
                                                        }
                                                    } else if (j5 < atomicLongFieldUpdater2.get(jyVar)) {
                                                        i30Var2.a();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    a(jyVar, obj, t00VarG);
                                    break;
                                } else {
                                    hq0Var2 = hq0Var2;
                                    t00VarG.a(i30Var, i2 + i);
                                }
                                objS = t00VarG.s();
                                hq0Var = hq0Var2;
                                if (objS != hq0Var) {
                                    objS = w84Var;
                                }
                                if (objS == hq0Var) {
                                    return objS;
                                }
                            } else {
                                hq0Var2 = hq0Var2;
                                i30Var.a();
                            }
                            t00VarG.resumeWith(w84Var);
                            objS = t00VarG.s();
                            hq0Var = hq0Var2;
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
                    } else if (iD == 4) {
                        if (j < atomicLongFieldUpdater2.get(jyVar)) {
                            i30Var.a();
                        }
                        Object objG3 = jyVar.G(so0Var, obj);
                        if (objG3 == hq0Var2) {
                            return objG3;
                        }
                    } else if (iD == 5) {
                        i30Var.a();
                    }
                }
            } else {
                break;
            }
        }
        return w84Var;
    }

    public static boolean N(Object obj) {
        if (obj instanceof r00) {
            return ly.a((r00) obj, w84.a, null);
        }
        m51.u(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void a(jy jyVar, Object obj, t00 t00Var) {
        t00Var.resumeWith(new i63(jyVar.u()));
    }

    public static final int d(jy jyVar, i30 i30Var, int i, Object obj, long j, Object obj2, boolean z) {
        i30Var.r(i, obj);
        if (z) {
            return jyVar.Q(i30Var, i, obj, j, obj2, z);
        }
        Object objP = i30Var.p(i);
        if (objP == null) {
            if (jyVar.e(j)) {
                if (i30Var.o(null, i, ly.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (i30Var.o(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objP instanceof kf4) {
            i30Var.r(i, null);
            if (jyVar.M(objP, obj)) {
                i30Var.s(i, ly.i);
                return 0;
            }
            d5 d5Var = ly.k;
            if (i30Var.h.getAndSet((i * 2) + 1, d5Var) == d5Var) {
                return 5;
            }
            i30Var.q(i, true);
            return 5;
        }
        return jyVar.Q(i30Var, i, obj, j, obj2, z);
    }

    public static void x(jy jyVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        if ((atomicLongFieldUpdater.addAndGet(jyVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(jyVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m(j & 1152921504606846975L);
                if (!z || !w()) {
                }
            } else {
                if (i != 3) {
                    j93.b(ud2.m(i, "unexpected close status: "));
                    return false;
                }
                i30 i30VarM = m(j & 1152921504606846975L);
                Object objC0 = null;
                loop0: do {
                    for (int i2 = ly.b - 1; -1 < i2; i2--) {
                        long j2 = (i30VarM.e * ((long) ly.b)) + ((long) i2);
                        while (true) {
                            Object objP = i30VarM.p(i2);
                            if (objP == ly.i) {
                                break loop0;
                            }
                            d5 d5Var = ly.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                            if (objP != d5Var) {
                                if (objP != ly.e && objP != null) {
                                    if (!(objP instanceof kf4) && !(objP instanceof lf4)) {
                                        d5 d5Var2 = ly.g;
                                        if (objP == d5Var2 || objP == ly.f) {
                                            break loop0;
                                        }
                                        if (objP != d5Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        kf4 kf4Var = objP instanceof lf4 ? ((lf4) objP).a : (kf4) objP;
                                        if (i30VarM.o(objP, i2, ly.l)) {
                                            objC0 = kr1.c0(objC0, kf4Var);
                                            i30VarM.r(i2, null);
                                            i30VarM.m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (i30VarM.o(objP, i2, ly.l)) {
                                        i30VarM.m();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (i30VarM.o(objP, i2, ly.l)) {
                                    i30VarM.r(i2, null);
                                    i30VarM.m();
                                    break;
                                }
                            }
                        }
                    }
                    i30VarM = (i30) i30VarM.e();
                } while (i30VarM != null);
                if (objC0 != null) {
                    if (objC0 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objC0;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            K((kf4) arrayList.get(size), false);
                        }
                    } else {
                        K((kf4) objC0, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean B() {
        return A(d.get(this), true);
    }

    public final boolean C() {
        return A(d.get(this), false);
    }

    public boolean D() {
        return false;
    }

    public final boolean E() {
        long j = l.get(this);
        return j == 0 || j == LongCompanionObject.MAX_VALUE;
    }

    public final void F(long j, i30 i30Var) {
        jy jyVar;
        i30 i30Var2;
        i30 i30Var3;
        while (i30Var.e < j && (i30Var3 = (i30) i30Var.c()) != null) {
            i30Var = i30Var3;
        }
        while (true) {
            i30 i30Var4 = i30Var;
            while (i30Var4.f() && (i30Var2 = (i30) i30Var4.c()) != null) {
                i30Var4 = i30Var2;
            }
            while (true) {
                p.getClass();
                Unsafe unsafe = u00.a;
                long j2 = t;
                vc3 vc3Var = (vc3) unsafe.getObjectVolatile(this, j2);
                if (vc3Var.e >= i30Var4.e) {
                    return;
                }
                if (!i30Var4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = u00.a;
                    jyVar = this;
                    if (unsafe2.compareAndSwapObject(jyVar, t, vc3Var, i30Var4)) {
                        if (vc3Var.j()) {
                            vc3Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(jyVar, j2) != vc3Var) {
                        break;
                    } else {
                        this = jyVar;
                    }
                }
                if (i30Var4.j()) {
                    i30Var4.h();
                }
                this = jyVar;
            }
            i30Var = i30Var4;
        }
    }

    public final Object G(so0 so0Var, Object obj) {
        t00 t00Var = new t00(1, gm4.G(so0Var));
        t00Var.u();
        t00Var.resumeWith(new i63(u()));
        Object objS = t00Var.s();
        return objS == hq0.c ? objS : w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(i30 i30Var, int i, long j, uo0 uo0Var) throws Throwable {
        iy iyVar;
        h30 h30Var;
        i30 i30Var2;
        if (uo0Var instanceof iy) {
            iyVar = (iy) uo0Var;
            int i2 = iyVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iyVar.h = i2 - Integer.MIN_VALUE;
            } else {
                iyVar = new iy(this, uo0Var);
            }
        } else {
            iyVar = new iy(this, uo0Var);
        }
        Object objS = iyVar.c;
        int i3 = iyVar.h;
        if (i3 == 0) {
            g13.O(objS);
            iyVar.h = 1;
            t00 t00VarG = gb2.G(gm4.G(iyVar));
            try {
                t33 t33Var = new t33(t00VarG);
                Object objP = P(i30Var, i, j, t33Var);
                if (objP != ly.m) {
                    if (objP == ly.o) {
                        if (j < v()) {
                            i30Var.a();
                        }
                        i30 i30Var3 = (i30) o.get(this);
                        while (true) {
                            if (B()) {
                                t00VarG.resumeWith(new h30(new f30(s())));
                                break;
                            }
                            long andIncrement = h.getAndIncrement(this);
                            long j2 = ly.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (i30Var3.e != j3) {
                                i30 i30VarQ = q(j3, i30Var3);
                                if (i30VarQ != null) {
                                    i30Var2 = i30VarQ;
                                }
                            } else {
                                i30Var2 = i30Var3;
                            }
                            Object objP2 = P(i30Var2, i4, andIncrement, t33Var);
                            i30 i30Var4 = i30Var2;
                            if (objP2 == ly.m) {
                                t33Var.a(i30Var4, i4);
                                break;
                            }
                            if (objP2 == ly.o) {
                                if (andIncrement < v()) {
                                    i30Var4.a();
                                }
                                i30Var3 = i30Var4;
                            } else {
                                if (objP2 == ly.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                i30Var4.a();
                                h30Var = new h30(objP2);
                            }
                        }
                    } else {
                        i30Var.a();
                        h30Var = new h30(objP);
                    }
                    t00VarG.d(h30Var, null);
                    break;
                }
                t33Var.a(i30Var, i);
                objS = t00VarG.s();
                hq0 hq0Var = hq0.c;
                if (objS == hq0Var) {
                    return hq0Var;
                }
            } catch (Throwable th) {
                t00VarG.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objS);
        }
        return ((h30) objS).a;
    }

    public final void K(kf4 kf4Var, boolean z) {
        if (kf4Var instanceof r00) {
            ((so0) kf4Var).resumeWith(new i63(z ? t() : u()));
            return;
        }
        if (kf4Var instanceof t33) {
            ((t33) kf4Var).c.resumeWith(new h30(new f30(s())));
            return;
        }
        if (!(kf4Var instanceof gy)) {
            m51.u(kf4Var, "Unexpected waiter: ");
            return;
        }
        gy gyVar = (gy) kf4Var;
        t00 t00Var = gyVar.d;
        t00Var.getClass();
        gyVar.d = null;
        gyVar.c = ly.l;
        Throwable thS = gyVar.h.s();
        if (thS == null) {
            t00Var.resumeWith(Boolean.FALSE);
        } else {
            t00Var.resumeWith(new i63(thS));
        }
    }

    public final boolean M(Object obj, Object obj2) {
        if (obj instanceof t33) {
            return ly.a(((t33) obj).c, new h30(obj2), null);
        }
        if (!(obj instanceof gy)) {
            if (obj instanceof r00) {
                return ly.a((r00) obj, obj2, null);
            }
            m51.u(obj, "Unexpected receiver type: ");
            return false;
        }
        gy gyVar = (gy) obj;
        t00 t00Var = gyVar.d;
        t00Var.getClass();
        gyVar.d = null;
        gyVar.c = obj2;
        Boolean bool = Boolean.TRUE;
        gyVar.h.getClass();
        return ly.a(t00Var, bool, null);
    }

    public final Object O(Object obj) {
        i30 i30VarR;
        cq3 cq3Var = ly.d;
        n.getClass();
        i30 i30Var = (i30) u00.a.getObjectVolatile(this, w);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zA = this.A(andIncrement, false);
            int i = ly.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (i30Var.e != j3) {
                i30VarR = this.r(j3, i30Var);
                if (i30VarR == null) {
                    if (zA) {
                        return new f30(this.u());
                    }
                }
            } else {
                i30VarR = i30Var;
            }
            Object obj2 = obj;
            int iD = d(this, i30VarR, i2, obj2, j, cq3Var, zA);
            jy jyVar = this;
            i30Var = i30VarR;
            w84 w84Var = w84.a;
            if (iD == 0) {
                i30Var.a();
                return w84Var;
            }
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        u41.r("unexpected");
                        return null;
                    }
                    if (iD == 4) {
                        if (j < h.get(jyVar)) {
                            i30Var.a();
                        }
                        return new f30(jyVar.u());
                    }
                    if (iD == 5) {
                        i30Var.a();
                    }
                    this = jyVar;
                    obj = obj2;
                } else {
                    if (zA) {
                        i30Var.m();
                        return new f30(jyVar.u());
                    }
                    kf4 kf4Var = cq3Var instanceof kf4 ? (kf4) cq3Var : null;
                    if (kf4Var != null) {
                        kf4Var.a(i30Var, i2 + i);
                    }
                    jyVar.n((i30Var.e * j2) + ((long) i2));
                }
            }
            return w84Var;
        }
    }

    public final Object P(i30 i30Var, int i, long j, Object obj) {
        Object objP = i30Var.p(i);
        AtomicReferenceArray atomicReferenceArray = i30Var.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objP == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ly.n;
                }
                if (i30Var.o(objP, i, obj)) {
                    o();
                    return ly.m;
                }
            }
        } else if (objP == ly.d && i30Var.o(objP, i, ly.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            i30Var.r(i, null);
            return obj2;
        }
        while (true) {
            Object objP2 = i30Var.p(i);
            if (objP2 == null || objP2 == ly.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (i30Var.o(objP2, i, ly.h)) {
                        o();
                        return ly.o;
                    }
                } else {
                    if (obj == null) {
                        return ly.n;
                    }
                    if (i30Var.o(objP2, i, obj)) {
                        o();
                        return ly.m;
                    }
                }
            } else {
                if (objP2 != ly.d) {
                    d5 d5Var = ly.j;
                    if (objP2 != d5Var && objP2 != ly.h) {
                        if (objP2 == ly.l) {
                            o();
                            return ly.o;
                        }
                        if (objP2 != ly.g && i30Var.o(objP2, i, ly.f)) {
                            boolean z = objP2 instanceof lf4;
                            if (z) {
                                objP2 = ((lf4) objP2).a;
                            }
                            if (N(objP2)) {
                                i30Var.s(i, ly.i);
                                o();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                i30Var.r(i, null);
                                return obj3;
                            }
                            i30Var.s(i, d5Var);
                            i30Var.m();
                            if (z) {
                                o();
                            }
                            return ly.o;
                        }
                    }
                    return ly.o;
                }
                if (i30Var.o(objP2, i, ly.i)) {
                    o();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    i30Var.r(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int Q(i30 i30Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objP = i30Var.p(i);
            if (objP == null) {
                if (!e(j) || z) {
                    if (z) {
                        if (i30Var.o(null, i, ly.j)) {
                            i30Var.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (i30Var.o(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (i30Var.o(null, i, ly.d)) {
                    break;
                }
            } else {
                if (objP != ly.e) {
                    d5 d5Var = ly.k;
                    if (objP == d5Var) {
                        i30Var.r(i, null);
                        return 5;
                    }
                    if (objP == ly.h) {
                        i30Var.r(i, null);
                        return 5;
                    }
                    if (objP == ly.l) {
                        i30Var.r(i, null);
                        C();
                        return 4;
                    }
                    i30Var.r(i, null);
                    if (objP instanceof lf4) {
                        objP = ((lf4) objP).a;
                    }
                    if (M(objP, obj)) {
                        i30Var.s(i, ly.i);
                        return 0;
                    }
                    if (i30Var.h.getAndSet((i * 2) + 1, d5Var) != d5Var) {
                        i30Var.q(i, true);
                    }
                    return 5;
                }
                if (i30Var.o(objP, i, ly.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void R(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        jy jyVar = this;
        if (jyVar.E()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = l;
            if (atomicLongFieldUpdater.get(jyVar) > j) {
                break;
            } else {
                jyVar = this;
            }
        }
        int i = ly.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = m;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(jyVar);
                if (j2 == (DurationKt.MAX_MILLIS & atomicLongFieldUpdater2.get(jyVar)) && j2 == atomicLongFieldUpdater.get(jyVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(jyVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jyVar, j3, (j3 & DurationKt.MAX_MILLIS) + 4611686018427387904L)) {
                        break;
                    } else {
                        jyVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(jyVar);
                    long j5 = atomicLongFieldUpdater2.get(jyVar);
                    long j6 = j5 & DurationKt.MAX_MILLIS;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(jyVar)) {
                        break;
                    }
                    if (z) {
                        jyVar = this;
                    } else {
                        jyVar = this;
                        atomicLongFieldUpdater2.compareAndSet(jyVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(jyVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jyVar, j7, j7 & DurationKt.MAX_MILLIS)) {
                        return;
                    } else {
                        jyVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.nf3
    public Object b(so0 so0Var, Object obj) {
        return L(this, obj, so0Var);
    }

    @Override // defpackage.w20
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    public final boolean e(long j) {
        return j < l.get(this) || j < h.get(this) + ((long) this.c);
    }

    @Override // defpackage.w20
    public final Object f(mq3 mq3Var) {
        return H(this, mq3Var);
    }

    public final boolean g(Throwable th) {
        return l(th, false);
    }

    @Override // defpackage.w20
    public final Object h() {
        i30 i30Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = d.get(this);
        if (A(j2, true)) {
            return new f30(s());
        }
        long j3 = j2 & 1152921504606846975L;
        g30 g30Var = h30.b;
        if (j >= j3) {
            return g30Var;
        }
        Object obj = ly.k;
        o.getClass();
        i30 i30Var2 = (i30) u00.a.getObjectVolatile(this, v);
        while (!this.B()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = ly.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (i30Var2.e != j5) {
                i30 i30VarQ = this.q(j5, i30Var2);
                if (i30VarQ == null) {
                    continue;
                } else {
                    i30Var = i30VarQ;
                }
            } else {
                i30Var = i30Var2;
            }
            jy jyVar = this;
            Object objP = jyVar.P(i30Var, i, andIncrement, obj);
            i30Var2 = i30Var;
            if (objP == ly.m) {
                kf4 kf4Var = obj instanceof kf4 ? (kf4) obj : null;
                if (kf4Var != null) {
                    kf4Var.a(i30Var2, i);
                }
                jyVar.R(andIncrement);
                i30Var2.m();
                return g30Var;
            }
            if (objP != ly.o) {
                if (objP != ly.n) {
                    i30Var2.a();
                    return objP;
                }
                u41.r("unexpected");
                return null;
            }
            if (andIncrement < jyVar.v()) {
                i30Var2.a();
            }
            this = jyVar;
        }
        return new f30(this.s());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // defpackage.nf3
    public Object i(Object obj) {
        int iD;
        w84 w84Var;
        kf4 kf4Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = A(j, false) ? false : !e(j & 1152921504606846975L);
        g30 g30Var = h30.b;
        if (z2) {
            return g30Var;
        }
        cq3 cq3Var = ly.j;
        n.getClass();
        i30 i30Var = (i30) u00.a.getObjectVolatile(this, w);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zA = A(andIncrement, z);
            int i = ly.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (i30Var.e == j5) {
                iD = d(this, i30Var, i2, obj, j3, cq3Var, zA);
                w84Var = w84.a;
                if (iD != 0) {
                    i30Var.a();
                    return w84Var;
                }
                if (iD != 1) {
                    return w84Var;
                }
                if (iD != 2) {
                    if (zA) {
                        i30Var.m();
                        return new f30(u());
                    }
                    kf4Var = cq3Var instanceof kf4 ? (kf4) cq3Var : null;
                    if (kf4Var != null) {
                        kf4Var.a(i30Var, i2 + i);
                    }
                    i30Var.m();
                    return g30Var;
                }
                if (iD != 3) {
                    u41.r("unexpected");
                    return null;
                }
                if (iD != 4) {
                    if (j3 < h.get(this)) {
                        i30Var.a();
                    }
                    return new f30(u());
                }
                if (iD == 5) {
                    i30Var.a();
                }
                z = false;
            } else {
                i30 i30VarR = r(j5, i30Var);
                if (i30VarR != null) {
                    i30Var = i30VarR;
                    iD = d(this, i30Var, i2, obj, j3, cq3Var, zA);
                    w84Var = w84.a;
                    if (iD != 0) {
                        i30Var.a();
                        return w84Var;
                    }
                    if (iD != 1) {
                        return w84Var;
                    }
                    if (iD != 2) {
                        if (zA) {
                            i30Var.m();
                            return new f30(u());
                        }
                        if (cq3Var instanceof kf4) {
                        }
                        if (kf4Var != null) {
                            kf4Var.a(i30Var, i2 + i);
                        }
                        i30Var.m();
                        return g30Var;
                    }
                    if (iD != 3) {
                        u41.r("unexpected");
                        return null;
                    }
                    if (iD != 4) {
                        if (j3 < h.get(this)) {
                            i30Var.a();
                        }
                        return new f30(u());
                    }
                    if (iD == 5) {
                        i30Var.a();
                    }
                    z = false;
                } else {
                    if (zA) {
                        return new f30(u());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    @Override // defpackage.w20
    public final gy iterator() {
        return new gy(this);
    }

    @Override // defpackage.w20
    public final Object j(pf0 pf0Var) {
        return I(this, pf0Var);
    }

    public final i30 k() {
        p.getClass();
        Unsafe unsafe = u00.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, t);
        n.getClass();
        i30 i30Var = (i30) unsafe.getObjectVolatile(this, w);
        if (i30Var.e > ((i30) objectVolatile).e) {
            objectVolatile = i30Var;
        }
        o.getClass();
        i30 i30Var2 = (i30) unsafe.getObjectVolatile(this, v);
        if (i30Var2.e > ((i30) objectVolatile).e) {
            objectVolatile = i30Var2;
        }
        il0 il0Var = (il0) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = il0.a;
            Object objD = il0Var.d();
            if (objD == sf3.a) {
                break;
            }
            il0 il0Var2 = (il0) objD;
            if (il0Var2 != null) {
                il0Var = il0Var2;
            } else if (il0Var.g()) {
                break;
            }
        }
        return (i30) il0Var;
    }

    public final boolean l(Throwable th, boolean z) {
        jy jyVar;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (!z) {
            jyVar = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                jyVar = this;
                break;
            }
            i30 i30Var = ly.a;
            jyVar = this;
            if (atomicLongFieldUpdater.compareAndSet(jyVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = jyVar;
        }
        d5 d5Var = ly.s;
        while (true) {
            q.getClass();
            jy jyVar2 = jyVar;
            Unsafe unsafe = u00.a;
            long j5 = s;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(jyVar2, j5, d5Var, th2);
            jyVar = jyVar2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(jyVar, j5) != d5Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(jyVar);
            } while (!atomicLongFieldUpdater.compareAndSet(jyVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(jyVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(jyVar, j, j2));
        }
        jyVar.C();
        if (z2) {
            jyVar.y();
        }
        return z2;
    }

    public final i30 m(long j) {
        long j2;
        i30 i30VarK = k();
        if (D()) {
            i30 i30Var = i30VarK;
            loop0: while (true) {
                int i = ly.b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (i30Var.e * ((long) ly.b)) + ((long) i);
                        if (j2 >= h.get(this)) {
                            while (true) {
                                Object objP = i30Var.p(i);
                                if (objP != null && objP != ly.e) {
                                    if (objP != ly.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (i30Var.o(objP, i, ly.l)) {
                                    i30Var.m();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        i30Var = (i30) i30Var.e();
                        if (i30Var == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                n(j2);
            }
        }
        Object objC0 = null;
        loop3: for (i30 i30Var2 = i30VarK; i30Var2 != null; i30Var2 = (i30) i30Var2.e()) {
            for (int i2 = ly.b - 1; -1 < i2; i2--) {
                if ((i30Var2.e * ((long) ly.b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objP2 = i30Var2.p(i2);
                    if (objP2 != null && objP2 != ly.e) {
                        if (!(objP2 instanceof lf4)) {
                            if (!(objP2 instanceof kf4)) {
                                break;
                            }
                            if (i30Var2.o(objP2, i2, ly.l)) {
                                objC0 = kr1.c0(objC0, objP2);
                                i30Var2.q(i2, true);
                                break;
                            }
                        } else {
                            if (i30Var2.o(objP2, i2, ly.l)) {
                                objC0 = kr1.c0(objC0, ((lf4) objP2).a);
                                i30Var2.q(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (i30Var2.o(objP2, i2, ly.l)) {
                            i30Var2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (objC0 != null) {
            if (!(objC0 instanceof ArrayList)) {
                K((kf4) objC0, true);
                return i30VarK;
            }
            ArrayList arrayList = (ArrayList) objC0;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                K((kf4) arrayList.get(size), true);
            }
        }
        return i30VarK;
    }

    public final void n(long j) {
        o.getClass();
        i30 i30Var = (i30) u00.a.getObjectVolatile(this, v);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.c) + j2, l.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = ly.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (i30Var.e != j4) {
                    i30 i30VarQ = this.q(j4, i30Var);
                    if (i30VarQ != null) {
                        i30Var = i30VarQ;
                    }
                }
                i30 i30Var2 = i30Var;
                if (this.P(i30Var2, i, j2, null) != ly.o || j2 < this.v()) {
                    i30Var2.a();
                }
                i30Var = i30Var2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    public final void o() {
        int i;
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objP;
        if (E()) {
            return;
        }
        p.getClass();
        i30 i30Var = (i30) u00.a.getObjectVolatile(this, t);
        while (true) {
            long andIncrement = l.getAndIncrement(this);
            long j = ly.b;
            long j2 = andIncrement / j;
            if (this.v() <= andIncrement) {
                if (i30Var.e < j2 && i30Var.c() != null) {
                    this.F(j2, i30Var);
                }
                x(this);
                return;
            }
            jy jyVar = this;
            if (i30Var.e == j2) {
                i = (int) (andIncrement % j);
                Object objP2 = i30Var.p(i);
                z = objP2 instanceof kf4;
                atomicLongFieldUpdater = h;
                if (z || andIncrement < atomicLongFieldUpdater.get(jyVar) || !i30Var.o(objP2, i, ly.g)) {
                    while (true) {
                        objP = i30Var.p(i);
                        if (objP instanceof kf4) {
                            if (andIncrement < atomicLongFieldUpdater.get(jyVar)) {
                                if (i30Var.o(objP, i, new lf4((kf4) objP))) {
                                    x(jyVar);
                                    return;
                                }
                            } else if (i30Var.o(objP, i, ly.g)) {
                                if (!N(objP)) {
                                    i30Var.s(i, ly.j);
                                    i30Var.m();
                                    break;
                                } else {
                                    i30Var.s(i, ly.d);
                                    x(jyVar);
                                    return;
                                }
                            }
                        } else {
                            if (objP == ly.j) {
                                break;
                            }
                            if (objP == null) {
                                if (i30Var.o(objP, i, ly.e)) {
                                    x(jyVar);
                                    return;
                                }
                            } else if (objP != ly.d || objP == ly.h || objP == ly.i || objP == ly.k || objP == ly.l) {
                                x(jyVar);
                                return;
                            } else if (objP != ly.f) {
                                m51.u(objP, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    x(jyVar);
                } else if (N(objP2)) {
                    i30Var.s(i, ly.d);
                    x(jyVar);
                    return;
                } else {
                    i30Var.s(i, ly.j);
                    i30Var.m();
                    x(jyVar);
                }
            } else {
                i30 i30VarP = jyVar.p(j2, i30Var, andIncrement);
                if (i30VarP == null) {
                    continue;
                } else {
                    i30Var = i30VarP;
                    i = (int) (andIncrement % j);
                    Object objP3 = i30Var.p(i);
                    z = objP3 instanceof kf4;
                    atomicLongFieldUpdater = h;
                    if (z) {
                        while (true) {
                            objP = i30Var.p(i);
                            if (objP instanceof kf4) {
                                if (andIncrement < atomicLongFieldUpdater.get(jyVar)) {
                                    if (i30Var.o(objP, i, new lf4((kf4) objP))) {
                                        x(jyVar);
                                        return;
                                    }
                                } else if (i30Var.o(objP, i, ly.g)) {
                                    if (!N(objP)) {
                                        i30Var.s(i, ly.j);
                                        i30Var.m();
                                        break;
                                    } else {
                                        i30Var.s(i, ly.d);
                                        x(jyVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objP == ly.j) {
                                    break;
                                    break;
                                }
                                if (objP == null) {
                                    if (objP != ly.d) {
                                        if (objP != ly.f) {
                                            m51.u(objP, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    x(jyVar);
                                    return;
                                }
                                if (i30Var.o(objP, i, ly.e)) {
                                    x(jyVar);
                                    return;
                                }
                            }
                        }
                        x(jyVar);
                    } else {
                        while (true) {
                            objP = i30Var.p(i);
                            if (objP instanceof kf4) {
                                if (andIncrement < atomicLongFieldUpdater.get(jyVar)) {
                                    if (i30Var.o(objP, i, new lf4((kf4) objP))) {
                                        x(jyVar);
                                        return;
                                    }
                                } else if (i30Var.o(objP, i, ly.g)) {
                                    if (!N(objP)) {
                                        i30Var.s(i, ly.j);
                                        i30Var.m();
                                        break;
                                    } else {
                                        i30Var.s(i, ly.d);
                                        x(jyVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objP == ly.j) {
                                    break;
                                    break;
                                }
                                if (objP == null) {
                                    if (objP != ly.d) {
                                        if (objP != ly.f) {
                                            m51.u(objP, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    x(jyVar);
                                    return;
                                }
                                if (i30Var.o(objP, i, ly.e)) {
                                    x(jyVar);
                                    return;
                                }
                            }
                        }
                        x(jyVar);
                    }
                }
            }
            this = jyVar;
        }
    }

    public final i30 p(long j, i30 i30Var, long j2) {
        Object objA;
        Unsafe unsafe;
        i30 i30Var2 = ly.a;
        ky kyVar = ky.c;
        loop0: while (true) {
            objA = sf3.A(i30Var, j, kyVar);
            if (!av1.B(objA)) {
                vc3 vc3VarZ = av1.z(objA);
                while (true) {
                    p.getClass();
                    Unsafe unsafe2 = u00.a;
                    long j3 = t;
                    vc3 vc3Var = (vc3) unsafe2.getObjectVolatile(this, j3);
                    if (vc3Var.e >= vc3VarZ.e) {
                        break loop0;
                    }
                    if (!vc3VarZ.n()) {
                        break;
                    }
                    do {
                        unsafe = u00.a;
                        if (unsafe.compareAndSwapObject(this, t, vc3Var, vc3VarZ)) {
                            if (!vc3Var.j()) {
                                break loop0;
                            }
                            vc3Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == vc3Var);
                    if (vc3VarZ.j()) {
                        vc3VarZ.h();
                    }
                }
            } else {
                break;
            }
        }
        if (av1.B(objA)) {
            C();
            F(j, i30Var);
            x(this);
            return null;
        }
        i30 i30Var3 = (i30) av1.z(objA);
        long j4 = i30Var3.e;
        if (j4 <= j) {
            return i30Var3;
        }
        long j5 = j4 * ((long) ly.b);
        if (!l.compareAndSet(this, j2 + 1, j5)) {
            x(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final i30 q(long j, i30 i30Var) {
        Object objA;
        i30 i30Var2;
        long j2;
        Unsafe unsafe;
        i30 i30Var3 = ly.a;
        ky kyVar = ky.c;
        loop0: while (true) {
            objA = sf3.A(i30Var, j, kyVar);
            if (!av1.B(objA)) {
                vc3 vc3VarZ = av1.z(objA);
                while (true) {
                    o.getClass();
                    Unsafe unsafe2 = u00.a;
                    long j3 = v;
                    vc3 vc3Var = (vc3) unsafe2.getObjectVolatile(this, j3);
                    if (vc3Var.e >= vc3VarZ.e) {
                        break loop0;
                    }
                    if (!vc3VarZ.n()) {
                        break;
                    }
                    do {
                        unsafe = u00.a;
                        if (unsafe.compareAndSwapObject(this, v, vc3Var, vc3VarZ)) {
                            if (!vc3Var.j()) {
                                break loop0;
                            }
                            vc3Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == vc3Var);
                    if (vc3VarZ.j()) {
                        vc3VarZ.h();
                    }
                }
            } else {
                break;
            }
        }
        if (av1.B(objA)) {
            C();
            if (i30Var.e * ((long) ly.b) < v()) {
                i30Var.a();
                return null;
            }
        } else {
            i30 i30Var4 = (i30) av1.z(objA);
            long j4 = i30Var4.e;
            if (E() || j > l.get(this) / ((long) ly.b)) {
                i30Var2 = i30Var4;
                break;
            }
            loop3: while (true) {
                p.getClass();
                Unsafe unsafe3 = u00.a;
                long j5 = t;
                vc3 vc3Var2 = (vc3) unsafe3.getObjectVolatile(this, j5);
                if (vc3Var2.e >= j4 || !i30Var4.n()) {
                    i30Var2 = i30Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = u00.a;
                    i30Var2 = i30Var4;
                    if (unsafe4.compareAndSwapObject(this, t, vc3Var2, i30Var4)) {
                        if (!vc3Var2.j()) {
                            break loop3;
                        }
                        vc3Var2.h();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != vc3Var2) {
                        break;
                    }
                    i30Var4 = i30Var2;
                }
                if (i30Var2.j()) {
                    i30Var2.h();
                }
                i30Var4 = i30Var2;
            }
            if (j4 <= j) {
                return i30Var2;
            }
            long j6 = j4 * ((long) ly.b);
            do {
                j2 = h.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!h.compareAndSet(this, j2, j6));
            if (j4 * ((long) ly.b) < v()) {
                i30Var2.a();
            }
        }
        return null;
    }

    public final i30 r(long j, i30 i30Var) {
        Object objA;
        long j2;
        long j3;
        Unsafe unsafe;
        i30 i30Var2 = ly.a;
        ky kyVar = ky.c;
        loop0: while (true) {
            objA = sf3.A(i30Var, j, kyVar);
            if (!av1.B(objA)) {
                vc3 vc3VarZ = av1.z(objA);
                while (true) {
                    n.getClass();
                    Unsafe unsafe2 = u00.a;
                    long j4 = w;
                    vc3 vc3Var = (vc3) unsafe2.getObjectVolatile(this, j4);
                    if (vc3Var.e >= vc3VarZ.e) {
                        break loop0;
                    }
                    if (!vc3VarZ.n()) {
                        break;
                    }
                    do {
                        unsafe = u00.a;
                        if (unsafe.compareAndSwapObject(this, w, vc3Var, vc3VarZ)) {
                            if (!vc3Var.j()) {
                                break loop0;
                            }
                            vc3Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == vc3Var);
                    if (vc3VarZ.j()) {
                        vc3VarZ.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = av1.B(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (zB) {
            C();
            if (i30Var.e * ((long) ly.b) < atomicLongFieldUpdater.get(this)) {
                i30Var.a();
                return null;
            }
        } else {
            i30 i30Var3 = (i30) av1.z(objA);
            long j5 = i30Var3.e;
            if (j5 <= j) {
                return i30Var3;
            }
            long j6 = j5 * ((long) ly.b);
            do {
                j2 = d.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!d.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) ly.b) < atomicLongFieldUpdater.get(this)) {
                i30Var3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        q.getClass();
        return (Throwable) u00.a.getObjectVolatile(this, s);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new qd0("Channel was closed") : thS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (d.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.c + ',');
        sb.append("data=[");
        o.getClass();
        Unsafe unsafe = u00.a;
        int i3 = 0;
        n.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, w);
        int i4 = 1;
        p.getClass();
        List listU = kr1.U(unsafe.getObjectVolatile(this, v), objectVolatile, unsafe.getObjectVolatile(this, t));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            if (((i30) obj) != ly.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            m51.o();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((i30) next).e;
            do {
                Object next2 = it.next();
                long j2 = ((i30) next2).e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        i30 i30Var = (i30) next;
        long j3 = h.get(this);
        long jV = v();
        loop2: while (true) {
            int i5 = ly.b;
            int i6 = i3;
            while (i6 < i5) {
                i = i4;
                long j4 = (i30Var.e * ((long) ly.b)) + ((long) i6);
                if (j4 >= jV && j4 >= j3) {
                    break loop2;
                }
                Object objP = i30Var.p(i6);
                Object obj2 = i30Var.h.get(i6 * 2);
                if (objP instanceof r00) {
                    string = (j4 >= j3 || j4 < jV) ? (j4 >= jV || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objP instanceof t33) {
                    string = "receiveCatching";
                } else if (objP instanceof lf4) {
                    string = "EB(" + objP + ')';
                } else if (kr1.n(objP, ly.f) || kr1.n(objP, ly.g)) {
                    string = "resuming_sender";
                } else {
                    if (objP != null && !objP.equals(ly.e) && !objP.equals(ly.i) && !objP.equals(ly.h) && !objP.equals(ly.k) && !objP.equals(ly.j) && !objP.equals(ly.l)) {
                        string = objP.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i = i4;
            i30Var = (i30) i30Var.c();
            if (i30Var == null) {
                break;
            }
            i4 = i;
            i3 = 0;
        }
        if (mo3.D0(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new rd0("Channel was closed") : thS;
    }

    public final long v() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            o.getClass();
            Unsafe unsafe = u00.a;
            long j = v;
            i30 i30VarQ = (i30) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            if (v() <= j2) {
                return false;
            }
            long j3 = ly.b;
            long j4 = j2 / j3;
            if (i30VarQ.e == j4 || (i30VarQ = q(j4, i30VarQ)) != null) {
                i30VarQ.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objP = i30VarQ.p(i);
                    if (objP != null && objP != ly.e) {
                        if (objP != ly.d) {
                            if (objP != ly.j && objP != ly.l && objP != ly.i && objP != ly.h) {
                                if (objP != ly.g) {
                                    if (objP == ly.f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (i30VarQ.o(objP, i, ly.h)) {
                        o();
                        break;
                    }
                }
                h.compareAndSet(this, j2, j2 + 1);
            } else if (((i30) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }

    public final void y() {
        Object objectVolatile;
        jy jyVar;
        loop0: while (true) {
            r.getClass();
            Unsafe unsafe = u00.a;
            long j = u;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            d5 d5Var = objectVolatile == null ? ly.q : ly.r;
            while (true) {
                Unsafe unsafe2 = u00.a;
                jyVar = this;
                if (unsafe2.compareAndSwapObject(jyVar, u, objectVolatile, d5Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(jyVar, j) != objectVolatile) {
                    break;
                } else {
                    this = jyVar;
                }
            }
            this = jyVar;
        }
        if (objectVolatile == null) {
            return;
        }
        y64.l(1, objectVolatile);
        ((le1) objectVolatile).invoke(jyVar.s());
    }

    public final void z(qa0 qa0Var) {
        Unsafe unsafe;
        while (true) {
            r.getClass();
            Unsafe unsafe2 = u00.a;
            jy jyVar = this;
            if (unsafe2.compareAndSwapObject(jyVar, u, (Object) null, qa0Var)) {
                return;
            }
            long j = u;
            if (unsafe2.getObjectVolatile(jyVar, j) != null) {
                while (true) {
                    Object objectVolatile = u00.a.getObjectVolatile(jyVar, j);
                    d5 d5Var = ly.q;
                    if (objectVolatile != d5Var) {
                        if (objectVolatile == ly.r) {
                            u41.r("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            m51.u(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    d5 d5Var2 = ly.r;
                    do {
                        jy jyVar2 = jyVar;
                        unsafe = u00.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(jyVar2, u, d5Var, d5Var2);
                        jyVar = jyVar2;
                        if (zCompareAndSwapObject) {
                            qa0Var.invoke(jyVar.s());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(jyVar, j) == d5Var);
                }
            } else {
                this = jyVar;
            }
        }
    }
}
