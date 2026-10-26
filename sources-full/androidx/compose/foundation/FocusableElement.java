package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.gb1;
import defpackage.gh2;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends tf2 {
    public final gh2 c;

    public FocusableElement(gh2 gh2Var) {
        this.c = gh2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new gb1(this.c, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return kr1.n(this.c, ((FocusableElement) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        gh2 gh2Var = this.c;
        if (gh2Var != null) {
            return gh2Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusable");
        inspectorInfo.getProperties().set("enabled", Boolean.TRUE);
        inspectorInfo.getProperties().set("interactionSource", this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((gb1) of2Var).A0(this.c);
    }
}
