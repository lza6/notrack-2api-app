package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class iv0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = 6;
        a5[] a5VarArr = {new a5(hv0.class, 6)};
        HashMap map = new HashMap();
        a5 a5Var = a5VarArr[0];
        boolean zContainsKey = map.containsKey(a5Var.a);
        Class cls = a5Var.a;
        if (zContainsKey) {
            u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, a5Var);
        Class cls2 = a5VarArr[0].a;
        Collections.unmodifiableMap(map);
        int i2 = x43.CONFIG_NAME_FIELD_NUMBER;
        try {
            w43.h(kv0.b);
            if (y04.a()) {
                return;
            }
            w43.f(new c5(w6.class, new a5[]{new a5(hv0.class, 6)}, i), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
