package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.kx1;
import defpackage.oe1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends tf2 {
    public final oe1 c;

    public LayoutElement(oe1 oe1Var) {
        this.c = oe1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        kx1 kx1Var = new kx1();
        kx1Var.c = this.c;
        return kx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && kr1.n(this.c, ((LayoutElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.c);
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((kx1) of2Var).c = this.c;
    }
}
