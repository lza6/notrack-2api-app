package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class hd1 {
    public static final ph3 b = new ph3(0);
    public final /* synthetic */ nd1 a;

    public hd1(nd1 nd1Var) {
        this.a = nd1Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ph3 ph3Var = b;
        ph3 ph3Var2 = (ph3) ph3Var.get(classLoader);
        if (ph3Var2 == null) {
            ph3Var2 = new ph3(0);
            ph3Var.put(classLoader, ph3Var2);
        }
        Class cls = (Class) ph3Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ph3Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final xc1 a(String str) {
        try {
            return (xc1) c(this.a.w.v.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new eg0(fq2.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
