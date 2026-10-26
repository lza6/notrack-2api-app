package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import defpackage.ao1;
import defpackage.gh2;
import defpackage.je1;
import defpackage.kr1;
import defpackage.of2;
import defpackage.sf0;
import defpackage.sq3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends tf2 {
    public final gh2 c;
    public final ao1 d;
    public final je1 h;
    public final je1 l;

    public CombinedClickableElement(je1 je1Var, je1 je1Var2, ao1 ao1Var, gh2 gh2Var) {
        this.c = gh2Var;
        this.d = ao1Var;
        this.h = je1Var;
        this.l = je1Var2;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        gh2 gh2Var = this.c;
        return new sf0(this.h, this.l, this.d, gh2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return kr1.n(this.c, combinedClickableElement.c) && kr1.n(this.d, combinedClickableElement.d) && this.h == combinedClickableElement.h && this.l == combinedClickableElement.l;
    }

    public final int hashCode() {
        gh2 gh2Var = this.c;
        int iHashCode = (gh2Var != null ? gh2Var.hashCode() : 0) * 31;
        ao1 ao1Var = this.d;
        int iHashCode2 = (this.h.hashCode() + ud2.k((iHashCode + (ao1Var != null ? ao1Var.hashCode() : 0)) * 31, 29791, true)) * 961;
        je1 je1Var = this.l;
        return Boolean.hashCode(true) + ((iHashCode2 + (je1Var != null ? je1Var.hashCode() : 0)) * 961);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", this.d);
        inspectorInfo.getProperties().set("interactionSource", this.c);
        ValueElementSequence properties = inspectorInfo.getProperties();
        Boolean bool = Boolean.TRUE;
        properties.set("enabled", bool);
        inspectorInfo.getProperties().set("onClickLabel", null);
        inspectorInfo.getProperties().set("role", null);
        inspectorInfo.getProperties().set("onClick", this.h);
        inspectorInfo.getProperties().set("onDoubleClick", null);
        inspectorInfo.getProperties().set("onLongClick", this.l);
        inspectorInfo.getProperties().set("onLongClickLabel", null);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", bool);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        sq3 sq3Var;
        sf0 sf0Var = (sf0) of2Var;
        sf0Var.C = true;
        boolean z = false;
        boolean z2 = sf0Var.B == null;
        je1 je1Var = this.l;
        if (z2 != (je1Var == null)) {
            sf0Var.A0();
            y64.M(sf0Var).D();
            z = true;
        }
        sf0Var.B = je1Var;
        boolean z3 = sf0Var.o ? z : true;
        sf0Var.F0(this.c, this.d, true, null, null, this.h);
        if (!z3 || (sq3Var = sf0Var.r) == null) {
            return;
        }
        sq3Var.x0();
    }
}
