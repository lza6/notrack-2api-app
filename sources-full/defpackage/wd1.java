package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class wd1 {
    public static final vd1 a = vd1.a;

    public static vd1 a(xc1 xc1Var) {
        while (xc1Var != null) {
            if (xc1Var.p()) {
                xc1Var.l();
            }
            xc1Var = xc1Var.E;
        }
        return a;
    }

    public static void b(sd1 sd1Var) {
        if (nd1.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(sd1Var.c.getClass().getName()), sd1Var);
        }
    }

    public static final void c(xc1 xc1Var, String str) {
        str.getClass();
        b(new sd1(xc1Var, "Attempting to reuse fragment " + xc1Var + " with previous ID " + str));
        a(xc1Var).getClass();
    }
}
