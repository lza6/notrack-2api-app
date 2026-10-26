package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao1;
import defpackage.d14;
import defpackage.gh2;
import defpackage.kr1;
import defpackage.le1;
import defpackage.n73;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends tf2 {
    public final boolean c;
    public final gh2 d;
    public final ao1 h;
    public final boolean l;
    public final n73 m;
    public final le1 n;

    public ToggleableElement(boolean z, gh2 gh2Var, ao1 ao1Var, boolean z2, n73 n73Var, le1 le1Var) {
        this.c = z;
        this.d = gh2Var;
        this.h = ao1Var;
        this.l = z2;
        this.m = n73Var;
        this.n = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new d14(this.c, this.d, this.h, this.l, this.m, this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.c == toggleableElement.c && kr1.n(this.d, toggleableElement.d) && kr1.n(this.h, toggleableElement.h) && this.l == toggleableElement.l && kr1.n(this.m, toggleableElement.m) && this.n == toggleableElement.n;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.c) * 31;
        gh2 gh2Var = this.d;
        int iHashCode2 = (iHashCode + (gh2Var != null ? gh2Var.hashCode() : 0)) * 31;
        ao1 ao1Var = this.h;
        int iK = ud2.k((iHashCode2 + (ao1Var != null ? ao1Var.hashCode() : 0)) * 31, 31, this.l);
        n73 n73Var = this.m;
        return this.n.hashCode() + ((iK + (n73Var != null ? Integer.hashCode(n73Var.a) : 0)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", inspectorInfo.getValue());
        inspectorInfo.getProperties().set("interactionSource", this.d);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.h);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.l));
        inspectorInfo.getProperties().set("role", this.m);
        inspectorInfo.getProperties().set("onValueChange", this.n);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        d14 d14Var = (d14) of2Var;
        boolean z = d14Var.B;
        boolean z2 = this.c;
        if (z != z2) {
            d14Var.B = z2;
            y64.M(d14Var).D();
        }
        d14Var.C = this.n;
        d14Var.F0(this.d, this.h, this.l, null, this.m, d14Var.D);
    }
}
