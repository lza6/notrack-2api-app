package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final class gw2 extends v63 {
    @Override // defpackage.v63
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public f73 mo204x4f4c327b(uq1 uq1Var, boolean z, float f, gn3 gn3Var, gn3 gn3Var2, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(331259447);
        ViewGroup viewGroupB = m73.b((View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView()));
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && kk0Var.h(uq1Var)) || (i & 6) == 4;
        if ((((458752 & i) ^ 196608) <= 131072 || !kk0Var.h(this)) && (i & 196608) != 131072) {
            z2 = false;
        }
        boolean zH = z3 | z2 | kk0Var.h(viewGroupB);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            cd cdVar = new cd(z, f, gn3Var, gn3Var2, viewGroupB);
            kk0Var.l0(cdVar);
            objP = cdVar;
        }
        cd cdVar2 = (cd) objP;
        kk0Var.r(false);
        return cdVar2;
    }
}
