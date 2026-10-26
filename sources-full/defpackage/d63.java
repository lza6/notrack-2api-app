package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class d63 {
    public static final Resources resources(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        return ((Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
    }
}
