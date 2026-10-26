package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao1;
import defpackage.e14;
import defpackage.fq2;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kr1;
import defpackage.l64;
import defpackage.n73;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class TriStateToggleableElement extends tf2 {
    public final e14 c;
    public final gh2 d;
    public final ao1 h;
    public final boolean l;
    public final n73 m;
    public final je1 n;

    public TriStateToggleableElement(e14 e14Var, gh2 gh2Var, ao1 ao1Var, boolean z, n73 n73Var, je1 je1Var) {
        this.c = e14Var;
        this.d = gh2Var;
        this.h = ao1Var;
        this.l = z;
        this.m = n73Var;
        this.n = je1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        l64 l64Var = new l64(this.d, this.h, this.l, null, this.m, this.n);
        l64Var.B = this.c;
        return l64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.c == triStateToggleableElement.c && kr1.n(this.d, triStateToggleableElement.d) && kr1.n(this.h, triStateToggleableElement.h) && this.l == triStateToggleableElement.l && this.m.equals(triStateToggleableElement.m) && this.n == triStateToggleableElement.n;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        gh2 gh2Var = this.d;
        int iHashCode2 = (iHashCode + (gh2Var != null ? gh2Var.hashCode() : 0)) * 31;
        ao1 ao1Var = this.h;
        return this.n.hashCode() + fq2.e(this.m.a, ud2.k((iHashCode2 + (ao1Var != null ? ao1Var.hashCode() : 0)) * 31, 31, this.l), 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("triStateToggleable");
        inspectorInfo.getProperties().set("state", this.c);
        inspectorInfo.getProperties().set("interactionSource", this.d);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.h);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.l));
        inspectorInfo.getProperties().set("role", this.m);
        inspectorInfo.getProperties().set("onClick", this.n);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        l64 l64Var = (l64) of2Var;
        e14 e14Var = l64Var.B;
        e14 e14Var2 = this.c;
        if (e14Var != e14Var2) {
            l64Var.B = e14Var2;
            y64.M(l64Var).D();
        }
        l64Var.F0(this.d, this.h, this.l, null, this.m, this.n);
    }
}
