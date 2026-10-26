package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ky1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends tf2 {
    public final float c;
    public final boolean d;

    public LayoutWeightElement(float f, boolean z) {
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        ky1 ky1Var = new ky1();
        ky1Var.c = this.c;
        ky1Var.d = this.d;
        return ky1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.c == layoutWeightElement.c && this.d == layoutWeightElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("weight");
        float f = this.c;
        inspectorInfo.setValue(Float.valueOf(f));
        inspectorInfo.getProperties().set("weight", Float.valueOf(f));
        inspectorInfo.getProperties().set("fill", Boolean.valueOf(this.d));
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ky1 ky1Var = (ky1) of2Var;
        ky1Var.c = this.c;
        ky1Var.d = this.d;
    }
}
