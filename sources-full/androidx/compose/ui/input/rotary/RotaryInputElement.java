package androidx.compose.ui.input.rotary;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.v73;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends tf2 {
    public final le1 c;

    public RotaryInputElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        v73 v73Var = new v73();
        v73Var.c = this.c;
        return v73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RotaryInputElement) && kr1.n(this.c, ((RotaryInputElement) obj).c);
    }

    public final int hashCode() {
        le1 le1Var = this.c;
        return (le1Var == null ? 0 : le1Var.hashCode()) * 31;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        le1 le1Var = this.c;
        if (le1Var != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", le1Var);
        }
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.c + ", onPreRotaryScrollEvent=null)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((v73) of2Var).c = this.c;
    }
}
