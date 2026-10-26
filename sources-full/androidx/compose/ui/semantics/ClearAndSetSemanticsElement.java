package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ue3;
import defpackage.v1;
import defpackage.ve3;
import defpackage.we3;
import defpackage.zo0;

/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends tf2 implements ve3 {
    @Override // defpackage.tf2
    public final of2 create() {
        return new zo0(false, true, v1.C);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClearAndSetSemanticsElement);
    }

    public final int hashCode() {
        return v1.C.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clearAndSetSemantics");
        we3.a(inspectorInfo, l0());
    }

    @Override // defpackage.ve3
    public final ue3 l0() {
        ue3 ue3Var = new ue3();
        ue3Var.h = false;
        ue3Var.l = true;
        return ue3Var;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + v1.C + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((zo0) of2Var).h = v1.C;
    }
}
