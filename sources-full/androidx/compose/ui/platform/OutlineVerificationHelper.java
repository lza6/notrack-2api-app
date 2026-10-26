package androidx.compose.ui.platform;

import android.graphics.Outline;
import defpackage.ic;
import defpackage.j93;
import defpackage.nt2;

/* JADX INFO: loaded from: classes.dex */
public final class OutlineVerificationHelper {
    public static final int $stable = 0;
    public static final OutlineVerificationHelper INSTANCE = new OutlineVerificationHelper();

    private OutlineVerificationHelper() {
    }

    public final void setPath(Outline outline, nt2 nt2Var) {
        if (nt2Var instanceof ic) {
            outline.setPath(((ic) nt2Var).a);
        } else {
            j93.k("Unable to obtain android.graphics.Path");
        }
    }
}
