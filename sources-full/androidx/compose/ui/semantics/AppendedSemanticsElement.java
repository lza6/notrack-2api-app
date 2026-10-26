package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ue3;
import defpackage.ve3;
import defpackage.we3;
import defpackage.zo0;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends tf2 implements ve3 {
    public final boolean c;
    public final le1 d;

    public AppendedSemanticsElement(le1 le1Var, boolean z) {
        this.c = z;
        this.d = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new zo0(this.c, false, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.c == appendedSemanticsElement.c && kr1.n(this.d, appendedSemanticsElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.c) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(this.c));
        we3.a(inspectorInfo, l0());
    }

    @Override // defpackage.ve3
    public final ue3 l0() {
        ue3 ue3Var = new ue3();
        ue3Var.h = this.c;
        this.d.invoke(ue3Var);
        return ue3Var;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.c + ", properties=" + this.d + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        zo0 zo0Var = (zo0) of2Var;
        zo0Var.c = this.c;
        zo0Var.h = this.d;
    }
}
