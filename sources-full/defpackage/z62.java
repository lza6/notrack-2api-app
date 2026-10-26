package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class z62 {
    public static final z62 a = new z62();
    public static final dl0 b = new dl0(d4.K);

    public final j4 getCurrent(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.b0(1418020823);
        j4 j4Var = (j4) kk0Var.l(b);
        if (j4Var == null) {
            Object baseContext = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof j4) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            j4Var = (j4) baseContext;
        }
        kk0Var.r(false);
        return j4Var;
    }
}
