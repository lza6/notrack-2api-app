package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.le1;
import defpackage.mo2;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends tf2 {
    public final le1 c;

    public OnGloballyPositionedElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        mo2 mo2Var = new mo2();
        mo2Var.c = this.c;
        return mo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.c == ((OnGloballyPositionedElement) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onGloballyPositioned");
        inspectorInfo.getProperties().set("onGloballyPositioned", this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((mo2) of2Var).c = this.c;
    }
}
