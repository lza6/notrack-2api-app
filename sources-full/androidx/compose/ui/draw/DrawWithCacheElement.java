package androidx.compose.ui.draw;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.qz;
import defpackage.rz;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends tf2 {
    public final le1 c;

    public DrawWithCacheElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new qz(new rz(), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && kr1.n(this.c, ((DrawWithCacheElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.c);
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        qz qzVar = (qz) of2Var;
        qzVar.h = this.c;
        qzVar.v0();
    }
}
