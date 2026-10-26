package androidx.compose.ui.focus;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bb1;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.za1;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends tf2 {
    public final za1 c;

    public FocusRequesterElement(za1 za1Var) {
        this.c = za1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        bb1 bb1Var = new bb1();
        bb1Var.c = this.c;
        return bb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && kr1.n(this.c, ((FocusRequesterElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.c);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        bb1 bb1Var = (bb1) of2Var;
        bb1Var.c.a.l(bb1Var);
        za1 za1Var = this.c;
        bb1Var.c = za1Var;
        za1Var.a.c(bb1Var);
    }
}
