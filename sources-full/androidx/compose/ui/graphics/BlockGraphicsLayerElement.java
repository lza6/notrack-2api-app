package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.mv;
import defpackage.of2;
import defpackage.tf2;
import defpackage.wl2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends tf2 {
    public final le1 c;

    public BlockGraphicsLayerElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new mv(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kr1.n(this.c, ((BlockGraphicsLayerElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.c);
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        mv mvVar = (mv) of2Var;
        mvVar.c = this.c;
        wl2 wl2Var = y64.K(mvVar, 2).u;
        if (wl2Var != null) {
            wl2Var.l1(mvVar.c, true);
        }
    }
}
