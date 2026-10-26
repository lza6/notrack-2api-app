package androidx.compose.ui.draw;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.oz0;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends tf2 {
    public final le1 c;

    public DrawBehindElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        oz0 oz0Var = new oz0();
        oz0Var.c = this.c;
        return oz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && kr1.n(this.c, ((DrawBehindElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawBehind");
        inspectorInfo.getProperties().set("onDraw", this.c);
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((oz0) of2Var).c = this.c;
    }
}
