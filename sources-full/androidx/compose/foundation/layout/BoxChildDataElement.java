package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.tw;
import defpackage.yt;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends tf2 {
    public final yt c;
    public final boolean d;
    public final le1 h;

    public BoxChildDataElement(yt ytVar, boolean z, le1 le1Var) {
        this.c = ytVar;
        this.d = z;
        this.h = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        tw twVar = new tw();
        twVar.c = this.c;
        twVar.d = this.d;
        return twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.c.equals(boxChildDataElement.c) && this.d == boxChildDataElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.h.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        tw twVar = (tw) of2Var;
        twVar.c = this.c;
        twVar.d = this.d;
    }
}
