package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class il0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(il0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = u00.a;
        c = unsafe.objectFieldOffset(il0.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(il0.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(il0.class.getDeclaredField("_prev$volatile"));
    }

    public il0(vc3 vc3Var) {
        this._prev$volatile = vc3Var;
    }

    public final void a() {
        b.getClass();
        u00.a.putObjectVolatile(this, d, (Object) null);
    }

    public final il0 b() {
        il0 il0VarE = e();
        while (il0VarE != null && il0VarE.f()) {
            b.getClass();
            il0VarE = (il0) u00.a.getObjectVolatile(il0VarE, d);
        }
        return il0VarE;
    }

    public final il0 c() {
        Object objD = d();
        if (objD == sf3.a) {
            return null;
        }
        return (il0) objD;
    }

    public final Object d() {
        a.getClass();
        return u00.a.getObjectVolatile(this, c);
    }

    public final il0 e() {
        b.getClass();
        return (il0) u00.a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        d5 d5Var = sf3.a;
        while (true) {
            a.getClass();
            Unsafe unsafe = u00.a;
            long j = c;
            il0 il0Var = this;
            if (unsafe.compareAndSwapObject(il0Var, j, (Object) null, d5Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(il0Var, j) != null) {
                return false;
            }
            this = il0Var;
        }
    }

    public final void h() {
        il0 il0Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            il0 il0VarB = b();
            il0 il0VarC = c();
            il0VarC.getClass();
            do {
                il0Var = il0VarC;
                if (!il0Var.f()) {
                    break;
                } else {
                    il0VarC = il0Var.c();
                }
            } while (il0VarC != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = u00.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(il0Var, j);
                il0 il0Var2 = ((il0) objectVolatile) == null ? null : il0VarB;
                while (true) {
                    unsafe = u00.a;
                    if (unsafe.compareAndSwapObject(il0Var, d, objectVolatile, il0Var2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(il0Var, j) != objectVolatile) {
                    }
                }
            }
            if (il0VarB != null) {
                a.getClass();
                unsafe.putObjectVolatile(il0VarB, c, il0Var);
            }
            if (!il0Var.f() || il0Var.c() == null) {
                if (il0VarB == null || !il0VarB.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(vc3 vc3Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = u00.a;
            long j = c;
            il0 il0Var = this;
            vc3 vc3Var2 = vc3Var;
            if (unsafe.compareAndSwapObject(il0Var, j, (Object) null, vc3Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(il0Var, j) != null) {
                return false;
            }
            this = il0Var;
            vc3Var = vc3Var2;
        }
    }
}
