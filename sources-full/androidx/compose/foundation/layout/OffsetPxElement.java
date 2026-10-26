package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.f01;
import defpackage.le1;
import defpackage.of2;
import defpackage.qn2;
import defpackage.tf2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends tf2 {
    public final le1 c;
    public final f01 d;

    public OffsetPxElement(le1 le1Var, f01 f01Var) {
        this.c = le1Var;
        this.d = f01Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        qn2 qn2Var = new qn2();
        qn2Var.c = this.c;
        qn2Var.d = true;
        return qn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.c == offsetPxElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.d.invoke(inspectorInfo);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.c + ", rtlAware=true)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        qn2 qn2Var = (qn2) of2Var;
        le1 le1Var = qn2Var.c;
        le1 le1Var2 = this.c;
        if (le1Var != le1Var2 || !qn2Var.d) {
            y64.M(qn2Var).R(false);
        }
        qn2Var.c = le1Var2;
        qn2Var.d = true;
    }
}
