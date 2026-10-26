package androidx.compose.ui.draw;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.wz0;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends tf2 {
    public final le1 c;

    public DrawWithContentElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        wz0 wz0Var = new wz0();
        wz0Var.c = this.c;
        return wz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && kr1.n(this.c, ((DrawWithContentElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.c);
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((wz0) of2Var).c = this.c;
    }
}
