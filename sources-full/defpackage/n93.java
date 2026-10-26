package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class n93 {
    public static final rn0 a = new rn0(28);
    public static final qn0 b = new qn0(29);
    public static final qn0 c = new qn0(28);

    public static final k93 a(zg2 zg2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) zg2Var.a;
        u93 u93Var = (u93) linkedHashMap.get(a);
        if (u93Var == null) {
            u41.k("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        nd4 nd4Var = (nd4) linkedHashMap.get(b);
        if (nd4Var == null) {
            u41.k("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(t73.D);
        if (str == null) {
            u41.k("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        s93 s93VarB = u93Var.b().b();
        o93 o93Var = s93VarB instanceof o93 ? (o93) s93VarB : null;
        if (o93Var == null) {
            u41.r("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(nd4Var).b;
        k93 k93Var = (k93) linkedHashMap2.get(str);
        if (k93Var != null) {
            return k93Var;
        }
        Class[] clsArr = k93.f;
        o93Var.b();
        Bundle bundle2 = o93Var.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = o93Var.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = o93Var.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            o93Var.c = null;
        }
        k93 k93VarCreateHandle = Options$Companion.createHandle(bundle3, bundle);
        linkedHashMap2.put(str, k93VarCreateHandle);
        return k93VarCreateHandle;
    }

    public static final void b(u93 u93Var) {
        g32 g32Var = u93Var.h().c;
        if (g32Var != g32.d && g32Var != g32.h) {
            u41.k("Failed requirement.");
        } else if (u93Var.b().b() == null) {
            o93 o93Var = new o93(u93Var.b(), (nd4) u93Var);
            u93Var.b().c("androidx.lifecycle.internal.SavedStateHandlesProvider", o93Var);
            u93Var.h().a(new g43(4, o93Var));
        }
    }

    public static final p93 c(nd4 nd4Var) {
        m93 m93Var = new m93();
        md4 md4VarG = nd4Var.g();
        qq4 qq4VarE = nd4Var instanceof ph1 ? ((ph1) nd4Var).e() : oq0.b;
        md4VarG.getClass();
        qq4VarE.getClass();
        return (p93) new iy2(md4VarG, m93Var, qq4VarE).j(r43.a(p93.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
