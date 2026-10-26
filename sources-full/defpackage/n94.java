package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class n94 {
    public final Unsafe a;

    public n94(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract byte d(Object obj, long j);

    public abstract double e(Object obj, long j);

    public abstract float f(Object obj, long j);

    public final int g(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long h(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final Object i(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z);

    public abstract void l(Object obj, long j, byte b);

    public abstract void m(Object obj, long j, double d);

    public abstract void n(Object obj, long j, float f);

    public final void o(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void p(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void q(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            o94.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
