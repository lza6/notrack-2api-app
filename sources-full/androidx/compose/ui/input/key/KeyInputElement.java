package androidx.compose.ui.input.key;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dv1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends tf2 {
    public final le1 c;
    public final le1 d;

    public KeyInputElement(le1 le1Var, le1 le1Var2) {
        this.c = le1Var;
        this.d = le1Var2;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        dv1 dv1Var = new dv1();
        dv1Var.c = this.c;
        dv1Var.d = this.d;
        return dv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.c == keyInputElement.c && this.d == keyInputElement.d;
    }

    public final int hashCode() {
        le1 le1Var = this.c;
        int iHashCode = (le1Var != null ? le1Var.hashCode() : 0) * 31;
        le1 le1Var2 = this.d;
        return iHashCode + (le1Var2 != null ? le1Var2.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        le1 le1Var = this.c;
        if (le1Var != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", le1Var);
        }
        le1 le1Var2 = this.d;
        if (le1Var2 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", le1Var2);
        }
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        dv1 dv1Var = (dv1) of2Var;
        dv1Var.c = this.c;
        dv1Var.d = this.d;
    }
}
