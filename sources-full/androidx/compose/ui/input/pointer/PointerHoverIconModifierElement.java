package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bx2;
import defpackage.kr1;
import defpackage.nc;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends tf2 {
    public final nc c;

    public PointerHoverIconModifierElement(nc ncVar) {
        this.c = ncVar;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new bx2(this.c, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.c.equals(((PointerHoverIconModifierElement) obj).c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.c.b * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.c);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.FALSE);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.c + ", overrideDescendants=false)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        bx2 bx2Var = (bx2) of2Var;
        nc ncVar = bx2Var.d;
        nc ncVar2 = this.c;
        if (kr1.n(ncVar, ncVar2)) {
            return;
        }
        bx2Var.d = ncVar2;
        if (bx2Var.h) {
            bx2Var.x0();
        }
    }
}
