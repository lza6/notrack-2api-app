package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class e72 {
    public static final e72 a = new e72();
    public static final dl0 b = new dl0(d4.M);

    public final ho2 getCurrent(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.b0(-2068013981);
        ho2 ho2Var = (ho2) kk0Var.l(b);
        kk0Var.b0(1680121597);
        if (ho2Var == null) {
            View view = (View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView());
            view.getClass();
            ho2Var = (ho2) rf3.Y(rf3.a0(rf3.Z(view, lb4.r), lb4.s));
        }
        kk0Var.r(false);
        if (ho2Var == null) {
            Object baseContext = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ho2) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            ho2Var = (ho2) baseContext;
        }
        kk0Var.r(false);
        return ho2Var;
    }
}
