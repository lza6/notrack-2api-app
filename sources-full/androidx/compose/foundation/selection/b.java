package androidx.compose.foundation.selection;

import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ao1;
import defpackage.e14;
import defpackage.gh2;
import defpackage.je1;
import defpackage.le1;
import defpackage.n73;
import defpackage.vn1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static androidx.compose.ui.c a(androidx.compose.ui.c cVar, boolean z, gh2 gh2Var, vn1 vn1Var, boolean z2, je1 je1Var) {
        androidx.compose.ui.c cVarThen;
        if (vn1Var instanceof ao1) {
            cVarThen = new SelectableElement(z, gh2Var, (ao1) vn1Var, z2, je1Var);
        } else if (vn1Var == null) {
            cVarThen = new SelectableElement(z, gh2Var, null, z2, je1Var);
        } else {
            cVarThen = gh2Var != null ? androidx.compose.foundation.d.a(androidx.compose.ui.c.i, gh2Var, vn1Var).then(new SelectableElement(z, gh2Var, null, z2, je1Var)) : androidx.compose.ui.b.a(androidx.compose.ui.c.i, InspectableValueKt.getNoInspectorInfo(), new a(vn1Var, z, z2, je1Var));
        }
        return cVar.then(cVarThen);
    }

    public static final androidx.compose.ui.c b(androidx.compose.ui.c cVar, boolean z, gh2 gh2Var, vn1 vn1Var, boolean z2, n73 n73Var, le1 le1Var) {
        androidx.compose.ui.c cVarThen;
        if (vn1Var instanceof ao1) {
            cVarThen = new ToggleableElement(z, gh2Var, (ao1) vn1Var, z2, n73Var, le1Var);
        } else if (vn1Var == null) {
            cVarThen = new ToggleableElement(z, gh2Var, null, z2, n73Var, le1Var);
        } else {
            cVarThen = gh2Var != null ? androidx.compose.foundation.d.a(androidx.compose.ui.c.i, gh2Var, vn1Var).then(new ToggleableElement(z, gh2Var, null, z2, n73Var, le1Var)) : androidx.compose.ui.b.a(androidx.compose.ui.c.i, InspectableValueKt.getNoInspectorInfo(), new c(vn1Var, z, z2, n73Var, le1Var));
        }
        return cVar.then(cVarThen);
    }

    public static final androidx.compose.ui.c c(Modifier$Companion modifier$Companion, e14 e14Var, gh2 gh2Var, vn1 vn1Var, boolean z, n73 n73Var, je1 je1Var) {
        if (vn1Var instanceof ao1) {
            return new TriStateToggleableElement(e14Var, gh2Var, (ao1) vn1Var, z, n73Var, je1Var);
        }
        if (vn1Var == null) {
            return new TriStateToggleableElement(e14Var, gh2Var, null, z, n73Var, je1Var);
        }
        return gh2Var != null ? androidx.compose.foundation.d.a(androidx.compose.ui.c.i, gh2Var, vn1Var).then(new TriStateToggleableElement(e14Var, gh2Var, null, z, n73Var, je1Var)) : androidx.compose.ui.b.a(androidx.compose.ui.c.i, InspectableValueKt.getNoInspectorInfo(), new d(vn1Var, e14Var, z, n73Var, je1Var));
    }
}
