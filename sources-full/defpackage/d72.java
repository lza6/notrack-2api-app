package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class d72 {
    public static final o13 a;

    static {
        Object i63Var;
        try {
            ClassLoader classLoader = n32.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof o13) {
                        i63Var = (o13) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof cv0)) {
                    i++;
                }
                i63Var = null;
                break;
            }
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        o13 un3Var = (o13) (i63Var instanceof i63 ? null : i63Var);
        if (un3Var == null) {
            un3Var = new un3(d4.L);
        }
        a = un3Var;
    }
}
