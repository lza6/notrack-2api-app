package androidx.compose.material3.internal;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.hz0;
import defpackage.ji4;
import defpackage.kr1;
import defpackage.ne1;
import defpackage.nq2;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends tf2 {
    public final ji4 c;
    public final ne1 d;

    public DraggableAnchorsElement(ji4 ji4Var, ne1 ne1Var) {
        this.c = ji4Var;
        this.d = ne1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        hz0 hz0Var = new hz0();
        hz0Var.c = this.c;
        hz0Var.d = this.d;
        hz0Var.h = nq2.c;
        return hz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return kr1.n(this.c, draggableAnchorsElement.c) && this.d == draggableAnchorsElement.d;
    }

    public final int hashCode() {
        return nq2.c.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return;
        }
        InspectableValueKt.getNoInspectorInfo();
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        hz0 hz0Var = (hz0) of2Var;
        hz0Var.c = this.c;
        hz0Var.d = this.d;
        hz0Var.h = nq2.c;
    }
}
