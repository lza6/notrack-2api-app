package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fx1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends tf2 {
    public final Object c;

    public LayoutIdElement(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        fx1 fx1Var = new fx1();
        fx1Var.c = this.c;
        return fx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.c.equals(((LayoutIdElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.c);
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((fx1) of2Var).c = this.c;
    }
}
