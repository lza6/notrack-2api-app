package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b61 {
    public static volatile b61 a;
    public static final b61 b;

    static {
        b61 b61Var = new b61();
        Map map = Collections.EMPTY_MAP;
        b = b61Var;
    }

    public static b61 a() {
        b61 b61Var;
        b61 b61Var2 = a;
        if (b61Var2 != null) {
            return b61Var2;
        }
        synchronized (b61.class) {
            try {
                b61Var = a;
                if (b61Var == null) {
                    Class cls = a61.a;
                    b61 b61Var3 = null;
                    if (cls != null) {
                        try {
                            b61Var3 = (b61) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    b61Var = b61Var3 != null ? b61Var3 : b;
                    a = b61Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b61Var;
    }
}
