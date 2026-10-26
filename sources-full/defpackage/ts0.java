package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ts0 {
    public static final du0 a;

    static {
        String property;
        eh1 eh1Var;
        du0 du0Var;
        int i = lr3.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            jt0 jt0Var = sw0.a;
            eh1Var = i92.a;
            eh1 eh1Var2 = eh1Var.l;
            if (eh1Var == null) {
                du0Var = eh1Var;
                du0Var = ss0.r;
            }
        } else {
            du0Var = ss0.r;
        }
        du0Var = eh1Var;
        a = du0Var;
    }
}
