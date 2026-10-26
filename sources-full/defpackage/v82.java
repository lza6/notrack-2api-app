package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class v82 {
    static {
        a5[] a5VarArr = {new a5(u82.class, 8)};
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
        int i = x43.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        w43.h(y82.c);
        w43.h(rc0.a);
        w43.f(new c5(), true);
        at2 at2Var = ri1.a;
        hi2 hi2Var = hi2.b;
        hi2Var.e(ri1.a);
        hi2Var.d(ri1.b);
        hi2Var.c(ri1.c);
        hi2Var.b(ri1.d);
        zh2 zh2Var = zh2.b;
        zh2Var.a(c5.f);
        if (y04.a()) {
            return;
        }
        w43.f(new c5(w4.class, new a5[]{new a5(u82.class, 0)}, 0), true);
        hi2Var.e(h5.a);
        hi2Var.d(h5.b);
        hi2Var.c(h5.c);
        hi2Var.b(h5.d);
        zh2Var.a(c5.e);
    }
}
