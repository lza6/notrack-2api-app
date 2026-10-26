package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g43 implements k32 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ g43(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                u93 u93Var = (u93) obj;
                if (f32Var != f32.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                n32Var.h().b(this);
                Bundle bundleA = u93Var.b().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    u41.r("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, g43.class.getClassLoader()).asSubclass(r93.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(u93Var instanceof nd4)) {
                                    u41.r("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    return;
                                }
                                md4 md4VarG = ((nd4) u93Var).g();
                                t93 t93VarB = u93Var.b();
                                md4VarG.getClass();
                                LinkedHashMap linkedHashMap = md4VarG.a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    gd4 gd4Var = (gd4) linkedHashMap.get(str3);
                                    gd4Var.getClass();
                                    g13.m(gd4Var, t93VarB, u93Var.h());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    t93VarB.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(fq2.m("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(fq2.n("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                qg0 qg0Var = (qg0) obj;
                if (qg0Var.m == null) {
                    lg0 lg0Var = (lg0) qg0Var.getLastNonConfigurationInstance();
                    if (lg0Var != null) {
                        qg0Var.m = lg0Var.a;
                    }
                    if (qg0Var.m == null) {
                        qg0Var.m = new md4();
                    }
                }
                qg0Var.c.b(this);
                return;
            case 2:
                new HashMap();
                af1[] af1VarArr = (af1[]) obj;
                if (af1VarArr.length > 0) {
                    af1 af1Var = af1VarArr[0];
                    throw null;
                }
                if (af1VarArr.length <= 0) {
                    return;
                }
                af1 af1Var2 = af1VarArr[0];
                throw null;
            case 3:
                if (f32Var == f32.ON_STOP) {
                    ((xc1) obj).getClass();
                    return;
                }
                return;
            default:
                if (f32Var != f32.ON_CREATE) {
                    m51.y(f32Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    n32Var.h().b(this);
                    ((o93) obj).b();
                    return;
                }
        }
    }
}
