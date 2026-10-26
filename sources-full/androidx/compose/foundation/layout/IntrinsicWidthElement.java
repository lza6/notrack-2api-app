package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.gr1;
import defpackage.ir1;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends tf2 {
    public final le1 c;

    public IntrinsicWidthElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        ir1 ir1Var = new ir1();
        ir1Var.c = gr1.d;
        ir1Var.d = true;
        return ir1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (gr1.d.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.c.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ir1 ir1Var = (ir1) of2Var;
        ir1Var.c = gr1.d;
        ir1Var.d = true;
    }
}
