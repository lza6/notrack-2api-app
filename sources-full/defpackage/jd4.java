package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jd4 extends ld4 {
    public static jd4 c;
    public static final zf3 d = new zf3(10);
    public final Application b;

    public jd4(Application application) {
        this.b = application;
    }

    @Override // defpackage.ld4, defpackage.kd4
    public final gd4 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        j93.k("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.ld4, defpackage.kd4
    public final gd4 b(Class cls, zg2 zg2Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) zg2Var.a).get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!oe.class.isAssignableFrom(cls)) {
            return jr1.p(cls);
        }
        u41.k("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final gd4 d(Class cls, Application application) {
        if (!oe.class.isAssignableFrom(cls)) {
            return jr1.p(cls);
        }
        try {
            gd4 gd4Var = (gd4) cls.getConstructor(Application.class).newInstance(application);
            gd4Var.getClass();
            return gd4Var;
        } catch (IllegalAccessException e) {
            j93.h("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            j93.h("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            j93.h("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            j93.h("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
