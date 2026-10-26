package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ck2;
import defpackage.fk2;
import defpackage.ik2;
import defpackage.j;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends tf2 {
    public final ck2 c;
    public final fk2 d;

    public NestedScrollElement(ck2 ck2Var, fk2 fk2Var) {
        this.c = ck2Var;
        this.d = fk2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new ik2(this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return kr1.n(nestedScrollElement.c, this.c) && kr1.n(nestedScrollElement.d, this.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        fk2 fk2Var = this.d;
        return iHashCode + (fk2Var != null ? fk2Var.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.c);
        inspectorInfo.getProperties().set("dispatcher", this.d);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ik2 ik2Var = (ik2) of2Var;
        ik2Var.c = this.c;
        fk2 fk2Var = ik2Var.d;
        if (fk2Var.a == ik2Var) {
            fk2Var.a = null;
        }
        fk2 fk2Var2 = this.d;
        if (fk2Var2 == null) {
            ik2Var.d = new fk2();
        } else if (fk2Var2 != fk2Var) {
            ik2Var.d = fk2Var2;
        }
        if (ik2Var.isAttached()) {
            fk2 fk2Var3 = ik2Var.d;
            fk2Var3.a = ik2Var;
            fk2Var3.b = null;
            ik2Var.h = null;
            fk2Var3.c = new j(25, ik2Var);
            fk2Var3.d = ik2Var.getCoroutineScope();
        }
    }
}
