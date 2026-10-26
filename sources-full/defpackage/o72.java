package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class o72 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(o72.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = u00.a.objectFieldOffset(o72.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(o72.class, "_state$volatile");
    public static final d5 g = new d5("REMOVE_FROZEN", 16);

    public o72(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            u41.r("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        u41.r("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                o72 o72Var = this;
                if (f.compareAndSet(o72Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    o72 o72VarD = o72Var;
                    while ((atomicLongFieldUpdater.get(o72VarD) & 1152921504606846976L) != 0) {
                        o72VarD = o72VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = o72VarD.d;
                        int i4 = o72VarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof n72) && ((n72) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            o72VarD = null;
                        }
                        if (o72VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = o72Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final o72 b(long j) {
        o72 o72Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = u00.a;
            long j2 = h;
            o72 o72Var2 = (o72) unsafe.getObjectVolatile(this, j2);
            if (o72Var2 != null) {
                return o72Var2;
            }
            o72 o72Var3 = new o72(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object n72Var = this.d.get(i4);
                if (n72Var == null) {
                    n72Var = new n72(i);
                }
                o72Var3.d.set(o72Var3.c & i, n72Var);
                i++;
            }
            f.set(o72Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = u00.a;
                o72Var = this;
                if (unsafe2.compareAndSwapObject(o72Var, h, (Object) null, o72Var3) || unsafe2.getObjectVolatile(o72Var, j2) != null) {
                    break;
                }
                this = o72Var;
            }
            this = o72Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            o72 o72Var = this;
            if (atomicLongFieldUpdater.compareAndSet(o72Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = o72Var;
        }
    }

    public final o72 d() {
        long j;
        o72 o72Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                o72Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            o72Var = this;
            if (atomicLongFieldUpdater.compareAndSet(o72Var, j, j2)) {
                j = j2;
                break;
            }
            this = o72Var;
        }
        return o72Var.b(j);
    }

    public final Object e() {
        o72 o72VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(o72VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = o72VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = o72VarD.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = o72VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof n72)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(o72VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    o72VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(o72VarD);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                o72VarD = o72VarD.d();
                            } else {
                                o72 o72Var = o72VarD;
                                if (f.compareAndSet(o72Var, j3, (j3 & (-1073741824)) | j2)) {
                                    o72Var.d.set(i4 & o72Var.c, null);
                                    o72VarD = null;
                                } else {
                                    o72VarD = o72Var;
                                }
                            }
                            if (o72VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
