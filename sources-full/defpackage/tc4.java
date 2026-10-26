package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc4 {
    public static wg4 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        wg4 wg4VarC = wg4.c(rootWindowInsets, null);
        tg4 tg4Var = wg4VarC.a;
        tg4Var.t(wg4VarC);
        tg4Var.d(view.getRootView());
        return wg4VarC;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
