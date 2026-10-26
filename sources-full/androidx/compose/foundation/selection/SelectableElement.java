package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao1;
import defpackage.cd3;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class SelectableElement extends tf2 {
    public final boolean c;
    public final gh2 d;
    public final ao1 h;
    public final boolean l;
    public final je1 m;

    public SelectableElement(boolean z, gh2 gh2Var, ao1 ao1Var, boolean z2, je1 je1Var) {
        this.c = z;
        this.d = gh2Var;
        this.h = ao1Var;
        this.l = z2;
        this.m = je1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        cd3 cd3Var = new cd3(this.d, this.h, this.l, null, null, this.m);
        cd3Var.B = this.c;
        return cd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.c == selectableElement.c && kr1.n(this.d, selectableElement.d) && kr1.n(this.h, selectableElement.h) && this.l == selectableElement.l && this.m == selectableElement.m;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.c) * 31;
        gh2 gh2Var = this.d;
        int iHashCode2 = (iHashCode + (gh2Var != null ? gh2Var.hashCode() : 0)) * 31;
        ao1 ao1Var = this.h;
        return this.m.hashCode() + ud2.k((iHashCode2 + (ao1Var != null ? ao1Var.hashCode() : 0)) * 31, 961, this.l);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set("selected", Boolean.valueOf(this.c));
        inspectorInfo.getProperties().set("interactionSource", this.d);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.h);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.l));
        inspectorInfo.getProperties().set("role", null);
        inspectorInfo.getProperties().set("onClick", this.m);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        cd3 cd3Var = (cd3) of2Var;
        boolean z = cd3Var.B;
        boolean z2 = this.c;
        if (z != z2) {
            cd3Var.B = z2;
            y64.M(cd3Var).D();
        }
        cd3Var.F0(this.d, this.h, this.l, null, null, this.m);
    }
}
