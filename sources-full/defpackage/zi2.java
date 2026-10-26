package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class zi2 extends jf3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(zi2.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long k = u00.a.objectFieldOffset(zi2.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public zi2() {
        super(1);
        this.owner$volatile = kr1.j;
    }

    public final boolean e() {
        return Math.max(jf3.g.get(this), 0) == 0;
    }

    public final Object f(uo0 uo0Var) {
        boolean zG = g();
        w84 w84Var = w84.a;
        if (!zG) {
            t00 t00VarG = gb2.G(gm4.G(uo0Var));
            try {
                yi2 yi2Var = new yi2(this, t00VarG);
                while (true) {
                    int andDecrement = jf3.g.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                            zi2 zi2Var = yi2Var.d;
                            atomicReferenceFieldUpdater.set(zi2Var, null);
                            t00 t00Var = yi2Var.c;
                            t00Var.D(w84Var, t00Var.h, new s00(0, new s(zi2Var, yi2Var)));
                            break;
                        }
                        if (b(yi2Var)) {
                            break;
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

    public final boolean g() {
        int iH = h();
        if (iH == 0) {
            return true;
        }
        if (iH == 1) {
            return false;
        }
        if (iH != 2) {
            u41.r("unexpected");
            return false;
        }
        j93.b("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int h() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = jf3.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    j.getClass();
                    u00.a.putObjectVolatile(this, k, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void i(Object obj) {
        while (this.e()) {
            j.getClass();
            Unsafe unsafe = u00.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            d5 d5Var = kr1.j;
            if (objectVolatile != d5Var) {
                if (objectVolatile != obj && obj != null) {
                    m51.m("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = u00.a;
                    zi2 zi2Var = this;
                    if (unsafe2.compareAndSwapObject(zi2Var, k, objectVolatile, d5Var)) {
                        zi2Var.c();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(zi2Var, j2) != objectVolatile) {
                            this = zi2Var;
                            break;
                        }
                        this = zi2Var;
                    }
                }
            }
        }
        u41.r("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(xr0.a0(this));
        sb.append("[isLocked=");
        sb.append(e());
        sb.append(",owner=");
        j.getClass();
        sb.append(u00.a.getObjectVolatile(this, k));
        sb.append(']');
        return sb.toString();
    }
}
