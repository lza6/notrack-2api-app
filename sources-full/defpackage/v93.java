package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class v93 implements kd4 {
    public final Application a;
    public final jd4 b;
    public final Bundle c;
    public final h32 d;
    public final t93 e;

    public v93(Application application, u93 u93Var, Bundle bundle) {
        jd4 jd4Var;
        this.e = u93Var.b();
        this.d = u93Var.h();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (jd4.c == null) {
                jd4.c = new jd4(application);
            }
            jd4Var = jd4.c;
            jd4Var.getClass();
        } else {
            jd4Var = new jd4(null);
        }
        this.b = jd4Var;
    }

    @Override // defpackage.kd4
    public final gd4 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        u41.k("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.kd4
    public final gd4 b(Class cls, zg2 zg2Var) {
        t73 t73Var = t73.D;
        LinkedHashMap linkedHashMap = (LinkedHashMap) zg2Var.a;
        String str = (String) linkedHashMap.get(t73Var);
        if (str == null) {
            u41.r("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(n93.a) == null || linkedHashMap.get(n93.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            u41.r("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(jd4.d);
        boolean zIsAssignableFrom = oe.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w93.a(cls, w93.b) : w93.a(cls, w93.a);
        if (constructorA == null) {
            return this.b.b(cls, zg2Var);
        }
        return (!zIsAssignableFrom || application == null) ? w93.b(cls, constructorA, n93.a(zg2Var)) : w93.b(cls, constructorA, application, n93.a(zg2Var));
    }

    public final gd4 d(Class cls, String str) {
        h32 h32Var = this.d;
        if (h32Var == null) {
            j93.k("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = oe.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? w93.a(cls, w93.b) : w93.a(cls, w93.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (ld4.a == null) {
                ld4.a = new ld4();
            }
            ld4.a.getClass();
            return jr1.p(cls);
        }
        t93 t93Var = this.e;
        t93Var.getClass();
        Bundle bundleA = t93Var.a(str);
        Class[] clsArr = k93.f;
        k93 k93VarCreateHandle = Options$Companion.createHandle(bundleA, this.c);
        l93 l93Var = new l93(str, k93VarCreateHandle);
        l93Var.a(h32Var, t93Var);
        g32 g32Var = ((p32) h32Var).c;
        if (g32Var == g32.d || g32Var.compareTo(g32.l) >= 0) {
            t93Var.d();
        } else {
            h32Var.a(new gt0(h32Var, t93Var));
        }
        gd4 gd4VarB = (!zIsAssignableFrom || application == null) ? w93.b(cls, constructorA, k93VarCreateHandle) : w93.b(cls, constructorA, application, k93VarCreateHandle);
        gd4VarB.a("androidx.lifecycle.savedstate.vm.tag", l93Var);
        return gd4VarB;
    }
}
