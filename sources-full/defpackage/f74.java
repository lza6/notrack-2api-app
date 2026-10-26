package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class f74 extends e74 {
    @Override // defpackage.e74
    public final Typeface W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.w, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.C.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            m51.n(e);
            return null;
        }
    }

    @Override // defpackage.e74
    public final Method Z(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
