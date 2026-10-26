package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class id4 {
    public static final zf3 a = new zf3(3);

    public static final nd0 a(gd4 gd4Var) {
        nd0 nd0Var;
        gd4Var.getClass();
        synchronized (a) {
            nd0Var = (nd0) gd4Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (nd0Var == null) {
                xp0 xp0Var = x21.c;
                try {
                    jt0 jt0Var = sw0.a;
                    xp0Var = i92.a.l;
                } catch (im2 | IllegalStateException unused) {
                }
                nd0 nd0Var2 = new nd0(xp0Var.plus(py.g()));
                gd4Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", nd0Var2);
                nd0Var = nd0Var2;
            }
        }
        return nd0Var;
    }
}
