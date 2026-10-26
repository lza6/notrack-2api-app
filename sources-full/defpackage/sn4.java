package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class sn4 extends lh4 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafeI;
        try {
            try {
                unsafeI = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeI = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new yn4());
                } catch (Exception unused2) {
                    unsafeI = i();
                    Unsafe unsafe = unsafeI;
                }
            }
            try {
                c = unsafeI.objectFieldOffset(un4.class.getDeclaredField("h"));
                b = unsafeI.objectFieldOffset(un4.class.getDeclaredField("d"));
                d = unsafeI.objectFieldOffset(un4.class.getDeclaredField("c"));
                e = unsafeI.objectFieldOffset(tn4.class.getDeclaredField("a"));
                f = unsafeI.objectFieldOffset(tn4.class.getDeclaredField("b"));
                a = unsafeI;
            } catch (NoSuchFieldException e2) {
                m51.n(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3);
        }
    }

    public static /* synthetic */ Unsafe i() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.lh4
    public final pn4 b(oo4 oo4Var) {
        pn4 pn4Var;
        pn4 pn4Var2 = pn4.d;
        do {
            pn4Var = oo4Var.d;
            if (pn4Var2 == pn4Var) {
                break;
            }
        } while (!f(oo4Var, pn4Var, pn4Var2));
        return pn4Var;
    }

    @Override // defpackage.lh4
    public final tn4 c(oo4 oo4Var) {
        tn4 tn4Var;
        tn4 tn4Var2 = tn4.c;
        do {
            tn4Var = oo4Var.h;
            if (tn4Var2 == tn4Var) {
                break;
            }
        } while (!h(oo4Var, tn4Var, tn4Var2));
        return tn4Var;
    }

    @Override // defpackage.lh4
    public final void d(tn4 tn4Var, tn4 tn4Var2) {
        a.putObject(tn4Var, f, tn4Var2);
    }

    @Override // defpackage.lh4
    public final void e(tn4 tn4Var, Thread thread) {
        a.putObject(tn4Var, e, thread);
    }

    @Override // defpackage.lh4
    public final boolean f(oo4 oo4Var, pn4 pn4Var, pn4 pn4Var2) {
        return wn4.a(a, oo4Var, b, pn4Var, pn4Var2);
    }

    @Override // defpackage.lh4
    public final boolean g(un4 un4Var, Object obj, Object obj2) {
        return wn4.a(a, un4Var, d, obj, obj2);
    }

    @Override // defpackage.lh4
    public final boolean h(un4 un4Var, tn4 tn4Var, tn4 tn4Var2) {
        return wn4.a(a, un4Var, c, tn4Var, tn4Var2);
    }
}
