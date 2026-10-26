package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq4 {
    public static final Unsafe a;
    public static final Class b;
    public static final qq4 c;
    public static final boolean d;
    public static final boolean e;

    static {
        boolean z;
        qq4 qq4Var;
        Unsafe unsafeE = e();
        a = unsafeE;
        int i = gp4.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        qq4 oq4Var = null;
        if (unsafeE != null) {
            if (zM) {
                oq4Var = new pq4(unsafeE);
            } else if (zM2) {
                oq4Var = new oq4(unsafeE);
            }
        }
        c = oq4Var;
        if (oq4Var != null) {
            try {
                Class<?> cls3 = ((Unsafe) oq4Var.a).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                p();
            } catch (Throwable th) {
                Logger.getLogger(rq4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        qq4 qq4Var2 = c;
        if (qq4Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) qq4Var2.a).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(rq4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        d = z;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        Field fieldP = p();
        if (fieldP != null && (qq4Var = c) != null) {
            ((Unsafe) qq4Var.a).objectFieldOffset(fieldP);
        }
        e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Object obj, long j) {
        return ((Unsafe) c.a).getInt(obj, j);
    }

    public static long b(Object obj, long j) {
        return ((Unsafe) c.a).getLong(obj, j);
    }

    public static Object c(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object d(Object obj, long j) {
        return ((Unsafe) c.a).getObject(obj, j);
    }

    public static Unsafe e() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new nq4());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(rq4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j, boolean z) {
        Unsafe unsafe = (Unsafe) c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i2)) & i));
    }

    public static /* synthetic */ void g(Object obj, long j, boolean z) {
        Unsafe unsafe = (Unsafe) c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i)) & unsafe.getInt(obj, j2)));
    }

    public static void h(int i, long j, Object obj) {
        ((Unsafe) c.a).putInt(obj, j, i);
    }

    public static void i(Object obj, long j, long j2) {
        ((Unsafe) c.a).putLong(obj, j, j2);
    }

    public static void j(long j, Object obj, Object obj2) {
        ((Unsafe) c.a).putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj, long j) {
        return ((byte) ((((Unsafe) c.a).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj, long j) {
        return ((byte) ((((Unsafe) c.a).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean m(Class cls) {
        int i = gp4.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void n(Class cls) {
        if (d) {
            ((Unsafe) c.a).arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (d) {
            ((Unsafe) c.a).arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i = gp4.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
