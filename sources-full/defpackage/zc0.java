package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public static final zc0 c = new zc0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, yc0 yc0Var, f32 f32Var, Class cls) {
        f32 f32Var2 = (f32) map.get(yc0Var);
        if (f32Var2 == null || f32Var == f32Var2) {
            if (f32Var2 == null) {
                map.put(yc0Var, f32Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + yc0Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + f32Var2 + ", new value " + f32Var);
    }

    public final xc0 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            xc0 xc0VarA = (xc0) map2.get(superclass);
            if (xc0VarA == null) {
                xc0VarA = a(superclass, null);
            }
            map.putAll(xc0VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            xc0 xc0VarA2 = (xc0) map2.get(cls2);
            if (xc0VarA2 == null) {
                xc0VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : xc0VarA2.b.entrySet()) {
                b(map, (yc0) entry.getKey(), (f32) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            no2 no2Var = (no2) method.getAnnotation(no2.class);
            if (no2Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!n32.class.isAssignableFrom(parameterTypes[0])) {
                        u41.k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                f32 f32VarValue = no2Var.value();
                if (parameterTypes.length > 1) {
                    if (!f32.class.isAssignableFrom(parameterTypes[1])) {
                        u41.k("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (f32VarValue != f32.ON_ANY) {
                        u41.k("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    u41.k("cannot have more than 2 params");
                    return null;
                }
                b(map, new yc0(i, method), f32VarValue, cls);
                z = true;
            }
        }
        xc0 xc0Var = new xc0(map);
        map2.put(cls, xc0Var);
        this.b.put(cls, Boolean.valueOf(z));
        return xc0Var;
    }
}
