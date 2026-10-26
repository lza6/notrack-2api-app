package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ao1;
import defpackage.iu0;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.uq1;
import defpackage.zn1;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends tf2 {
    public final uq1 c;
    public final ao1 d;

    public IndicationModifierElement(uq1 uq1Var, ao1 ao1Var) {
        this.c = uq1Var;
        this.d = ao1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        iu0 iu0VarA = this.d.a(this.c);
        zn1 zn1Var = new zn1();
        zn1Var.h = iu0VarA;
        zn1Var.v0(iu0VarA);
        return zn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return kr1.n(this.c, indicationModifierElement.c) && kr1.n(this.d, indicationModifierElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.c);
        inspectorInfo.getProperties().set("indication", this.d);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        zn1 zn1Var = (zn1) of2Var;
        iu0 iu0VarA = this.d.a(this.c);
        zn1Var.w0(zn1Var.h);
        zn1Var.h = iu0VarA;
        zn1Var.v0(iu0VarA);
    }
}
