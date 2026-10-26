package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class jn3 extends x0 implements k81, xe1, hn3, ki2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(jn3.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long o = u00.a.objectFieldOffset(jn3.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int m;

    public jn3(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e3 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00c0, B:53:0x00dc, B:59:0x00ec, B:56:0x00e3, B:58:0x00e9, B:41:0x0095, B:45:0x009c, B:21:0x004b), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:0: B:53:0x00dc->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [kn3] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kn3] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kn3] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kn3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [x0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [jn3] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, jn3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [jn3] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bf -> B:31:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.k81
    public final java.lang.Object a(defpackage.l81 r14, defpackage.so0 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn3.a(l81, so0):java.lang.Object");
    }

    @Override // defpackage.xe1
    public final k81 b(xp0 xp0Var, int i, fy fyVar) {
        return (((i < 0 || i >= 2) && i != -2) || fyVar != fy.d) ? xr0.Y(this, xp0Var, i, fyVar) : this;
    }

    @Override // defpackage.ki2
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        o(obj);
        return w84.a;
    }

    @Override // defpackage.ki2
    public final boolean f(Object obj) {
        p(null, obj);
        return true;
    }

    @Override // defpackage.x0
    public final y0 g() {
        return new kn3();
    }

    @Override // defpackage.hn3
    public final Object getValue() {
        d5 d5Var = av1.c;
        n.getClass();
        Object objectVolatile = u00.a.getObjectVolatile(this, o);
        if (objectVolatile == d5Var) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.x0
    public final y0[] h() {
        return new kn3[2];
    }

    public final boolean n(Object obj, Object obj2) {
        d5 d5Var = av1.c;
        if (obj == null) {
            obj = d5Var;
        }
        return p(obj, obj2);
    }

    public final void o(Object obj) {
        if (obj == null) {
            obj = av1.c;
        }
        p(null, obj);
    }

    public final boolean p(Object obj, Object obj2) {
        int i;
        y0[] y0VarArr;
        d5 d5Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kr1.n(obj3, obj)) {
                return false;
            }
            if (kr1.n(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.m;
            if ((i2 & 1) != 0) {
                this.m = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.m = i3;
            y0[] y0VarArr2 = (y0[]) this.h;
            while (true) {
                kn3[] kn3VarArr = (kn3[]) y0VarArr2;
                if (kn3VarArr != null) {
                    for (kn3 kn3Var : kn3VarArr) {
                        if (kn3Var != null) {
                            AtomicReference atomicReference = kn3Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (d5Var = gb2.f)) {
                                    break;
                                }
                                d5 d5Var2 = gb2.e;
                                if (obj4 != d5Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, d5Var2)) {
                                            ((t00) obj4).resumeWith(w84.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, d5Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.m;
                    if (i == i3) {
                        this.m = i3 + 1;
                        return true;
                    }
                    y0VarArr = (y0[]) this.h;
                }
                y0VarArr2 = y0VarArr;
                i3 = i;
            }
        }
    }
}
