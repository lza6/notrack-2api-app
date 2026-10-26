package androidx.compose.ui.focus;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ea1;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends tf2 {
    public final le1 c;

    public FocusChangedElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        ea1 ea1Var = new ea1();
        ea1Var.c = this.c;
        return ea1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && kr1.n(this.c, ((FocusChangedElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.c);
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((ea1) of2Var).c = this.c;
    }
}
