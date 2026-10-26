package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.of2;
import defpackage.p94;
import defpackage.rx0;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends tf2 {
    public final float c;
    public final float d;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        p94 p94Var = new p94();
        p94Var.c = this.c;
        p94Var.d = this.d;
        return p94Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return rx0.a(this.c, unspecifiedConstraintsElement.c) && rx0.a(this.d, unspecifiedConstraintsElement.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        fq2.l(this.c, inspectorInfo.getProperties(), "minWidth", inspectorInfo).set("minHeight", new rx0(this.d));
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        p94 p94Var = (p94) of2Var;
        p94Var.c = this.c;
        p94Var.d = this.d;
    }
}
