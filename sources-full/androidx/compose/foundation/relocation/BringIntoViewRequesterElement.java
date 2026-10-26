package androidx.compose.foundation.relocation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.kx;
import defpackage.mx;
import defpackage.nx;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends tf2 {
    public final kx c;

    public BringIntoViewRequesterElement(kx kxVar) {
        this.c = kxVar;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        nx nxVar = new nx();
        nxVar.c = this.c;
        return nxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return kr1.n(this.c, ((BringIntoViewRequesterElement) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.c);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        nx nxVar = (nx) of2Var;
        kx kxVar = nxVar.c;
        if (kxVar instanceof mx) {
            ((mx) kxVar).a.l(nxVar);
        }
        kx kxVar2 = this.c;
        if (kxVar2 instanceof mx) {
            ((mx) kxVar2).a.c(nxVar);
        }
        nxVar.c = kxVar2;
    }
}
