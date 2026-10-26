package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ao1;
import defpackage.d4;
import defpackage.rc;
import defpackage.un3;
import defpackage.uq1;
import defpackage.vn1;
import defpackage.xn1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final un3 a = new un3(d4.F);

    public static final androidx.compose.ui.c a(androidx.compose.ui.c cVar, uq1 uq1Var, vn1 vn1Var) {
        if (vn1Var == null) {
            return cVar;
        }
        if (vn1Var instanceof ao1) {
            return cVar.then(new IndicationModifierElement(uq1Var, (ao1) vn1Var));
        }
        return androidx.compose.ui.b.a(cVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new rc(uq1Var, 21, vn1Var) : InspectableValueKt.getNoInspectorInfo(), new xn1(vn1Var, uq1Var));
    }
}
