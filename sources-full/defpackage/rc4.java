package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rc4 implements View.OnApplyWindowInsetsListener {
    public wg4 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ wn2 c;

    public rc4(View view, wn2 wn2Var) {
        this.b = view;
        this.c = wn2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wg4 wg4VarC = wg4.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        wn2 wn2Var = this.c;
        if (i < 30) {
            sc4.a(windowInsets, this.b);
            if (wg4VarC.equals(this.a)) {
                return wn2Var.f(view, wg4VarC).b();
            }
        }
        this.a = wg4VarC;
        wg4 wg4VarF = wn2Var.f(view, wg4VarC);
        if (i >= 30) {
            return wg4VarF.b();
        }
        WeakHashMap weakHashMap = zc4.a;
        qc4.c(view);
        return wg4VarF.b();
    }
}
