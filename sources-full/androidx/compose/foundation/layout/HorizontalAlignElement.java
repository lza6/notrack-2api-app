package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.of2;
import defpackage.si1;
import defpackage.tf2;
import defpackage.wt;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends tf2 {
    public final wt c;

    public HorizontalAlignElement(wt wtVar) {
        this.c = wtVar;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        si1 si1Var = new si1();
        si1Var.c = this.c;
        return si1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.c.equals(horizontalAlignElement.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c.a);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((si1) of2Var).c = this.c;
    }
}
