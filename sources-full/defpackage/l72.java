package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class l72 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(l72.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = u00.a;
        l = unsafe.objectFieldOffset(l72.class.getDeclaredField("_next$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(l72.class, Object.class, "_prev$volatile");
        m = unsafe.objectFieldOffset(l72.class.getDeclaredField("_prev$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(l72.class, Object.class, "_removedRef$volatile");
        n = unsafe.objectFieldOffset(l72.class.getDeclaredField("_removedRef$volatile"));
    }

    public static l72 h(l72 l72Var) {
        while (l72Var.m()) {
            d.getClass();
            l72Var = (l72) u00.a.getObjectVolatile(l72Var, m);
        }
        return l72Var;
    }

    public final boolean d(l72 l72Var, int i) {
        l72 l72VarL;
        do {
            l72VarL = l();
            if (l72VarL instanceof d52) {
                return (((d52) l72VarL).o & i) == 0 && l72VarL.d(l72Var, i);
            }
        } while (!l72VarL.e(l72Var, this));
        return true;
    }

    public final boolean e(l72 l72Var, l72 l72Var2) {
        d.getClass();
        Unsafe unsafe = u00.a;
        unsafe.putObjectVolatile(l72Var, m, this);
        c.getClass();
        long j = l;
        unsafe.putObjectVolatile(l72Var, j, l72Var2);
        while (true) {
            Unsafe unsafe2 = u00.a;
            l72 l72Var3 = this;
            l72 l72Var4 = l72Var;
            l72 l72Var5 = l72Var2;
            if (unsafe2.compareAndSwapObject(l72Var3, l, l72Var5, l72Var4)) {
                l72Var4.i(l72Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(l72Var3, j) != l72Var5) {
                return false;
            }
            this = l72Var3;
            l72Var2 = l72Var5;
            l72Var = l72Var4;
        }
    }

    public final void f(yl2 yl2Var) {
        l72 l72Var;
        yl2 yl2Var2;
        d.getClass();
        Unsafe unsafe = u00.a;
        unsafe.putObjectVolatile(yl2Var, m, this);
        c.getClass();
        long j = l;
        unsafe.putObjectVolatile(yl2Var, j, this);
        while (this.j() == this) {
            while (true) {
                Unsafe unsafe2 = u00.a;
                l72Var = this;
                yl2Var2 = yl2Var;
                if (unsafe2.compareAndSwapObject(l72Var, l, this, yl2Var2)) {
                    yl2Var2.i(l72Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(l72Var, j) != l72Var) {
                        break;
                    }
                    this = l72Var;
                    yl2Var = yl2Var2;
                }
            }
            this = l72Var;
            yl2Var = yl2Var2;
        }
    }

    public final l72 g() {
        while (true) {
            d.getClass();
            Unsafe unsafe = u00.a;
            long j = m;
            l72 l72Var = (l72) unsafe.getObjectVolatile(this, j);
            l72 l72Var2 = null;
            l72 l72Var3 = l72Var;
            while (true) {
                c.getClass();
                if (l72Var3 == null) {
                    m51.t();
                    return null;
                }
                Unsafe unsafe2 = u00.a;
                long j2 = l;
                Object objectVolatile = unsafe2.getObjectVolatile(l72Var3, j2);
                if (objectVolatile == this) {
                    if (l72Var != l72Var3) {
                        while (true) {
                            Unsafe unsafe3 = u00.a;
                            l72 l72Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(l72Var4, m, l72Var, l72Var3);
                            l72 l72Var5 = l72Var;
                            this = l72Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != l72Var5) {
                                    break;
                                }
                                this = this;
                                l72Var = l72Var5;
                            }
                        }
                    }
                    return l72Var3;
                }
                l72Var = l72Var;
                this = this;
                if (this.m()) {
                    return null;
                }
                if (!(objectVolatile instanceof f53)) {
                    objectVolatile.getClass();
                    l72Var2 = l72Var3;
                    l72Var3 = (l72) objectVolatile;
                } else if (l72Var2 != null) {
                    l72 l72Var6 = ((f53) objectVolatile).a;
                    while (true) {
                        l72 l72Var7 = l72Var3;
                        Unsafe unsafe4 = u00.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(l72Var2, l, l72Var7, l72Var6);
                        l72Var3 = l72Var7;
                        if (zCompareAndSwapObject2) {
                            l72Var3 = l72Var2;
                            l72Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(l72Var2, j2) != l72Var3) {
                            break;
                        }
                    }
                } else {
                    if (l72Var3 == null) {
                        m51.t();
                        return null;
                    }
                    l72Var3 = (l72) unsafe2.getObjectVolatile(l72Var3, j);
                }
            }
            this = this;
        }
    }

    public final void i(l72 l72Var) {
        l72 l72Var2;
        while (true) {
            d.getClass();
            if (l72Var == null) {
                m51.t();
                return;
            }
            Unsafe unsafe = u00.a;
            long j = m;
            l72 l72Var3 = (l72) unsafe.getObjectVolatile(l72Var, j);
            if (this.j() != l72Var) {
                return;
            }
            while (true) {
                if (l72Var == null) {
                    m51.t();
                    return;
                }
                Unsafe unsafe2 = u00.a;
                l72Var2 = this;
                l72 l72Var4 = l72Var;
                if (unsafe2.compareAndSwapObject(l72Var4, m, l72Var3, l72Var2)) {
                    if (l72Var2.m()) {
                        l72Var4.g();
                        return;
                    }
                    return;
                } else {
                    if (l72Var4 == null) {
                        m51.t();
                        return;
                    }
                    l72Var = l72Var4;
                    if (unsafe2.getObjectVolatile(l72Var4, j) != l72Var3) {
                        break;
                    } else {
                        this = l72Var2;
                    }
                }
            }
            this = l72Var2;
        }
    }

    public final Object j() {
        c.getClass();
        return u00.a.getObjectVolatile(this, l);
    }

    public final l72 k() {
        Object objJ = j();
        f53 f53Var = objJ instanceof f53 ? (f53) objJ : null;
        if (f53Var != null) {
            return f53Var.a;
        }
        objJ.getClass();
        return (l72) objJ;
    }

    public final l72 l() {
        l72 l72VarG = g();
        if (l72VarG != null) {
            return l72VarG;
        }
        d.getClass();
        return h((l72) u00.a.getObjectVolatile(this, m));
    }

    public boolean m() {
        return j() instanceof f53;
    }

    public final l72 n() {
        l72 l72Var;
        while (true) {
            Object objJ = this.j();
            if (objJ instanceof f53) {
                return ((f53) objJ).a;
            }
            if (objJ == this) {
                return (l72) objJ;
            }
            objJ.getClass();
            l72 l72Var2 = (l72) objJ;
            f53 f53VarO = l72Var2.o();
            while (true) {
                c.getClass();
                Unsafe unsafe = u00.a;
                long j = l;
                l72Var = this;
                if (unsafe.compareAndSwapObject(l72Var, j, objJ, f53VarO)) {
                    l72Var2.g();
                    return null;
                }
                if (unsafe.getObjectVolatile(l72Var, j) != objJ) {
                    break;
                }
                this = l72Var;
            }
            this = l72Var;
        }
    }

    public final f53 o() {
        h.getClass();
        Unsafe unsafe = u00.a;
        long j = n;
        f53 f53Var = (f53) unsafe.getObjectVolatile(this, j);
        if (f53Var != null) {
            return f53Var;
        }
        f53 f53Var2 = new f53(this);
        unsafe.putObjectVolatile(this, j, f53Var2);
        return f53Var2;
    }

    public String toString() {
        return new ra1(1, 3, xr0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + xr0.a0(this);
    }
}
