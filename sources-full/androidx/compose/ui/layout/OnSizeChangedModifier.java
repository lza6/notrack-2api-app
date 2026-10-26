package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.le1;
import defpackage.of2;
import defpackage.qo2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends tf2 {
    public final le1 c;

    public OnSizeChangedModifier(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        qo2 qo2Var = new qo2();
        qo2Var.c = this.c;
        qo2Var.d = -9223372034707292160L;
        return qo2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.c == ((OnSizeChangedModifier) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onSizeChanged");
        inspectorInfo.getProperties().set("onSizeChanged", this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        qo2 qo2Var = (qo2) of2Var;
        qo2Var.c = this.c;
        qo2Var.d = -9223372034707292160L;
    }
}
