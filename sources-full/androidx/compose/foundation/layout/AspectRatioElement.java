package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.le1;
import defpackage.of2;
import defpackage.tf2;
import defpackage.xl;

/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends tf2 {
    public final le1 c;

    public AspectRatioElement(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        xl xlVar = new xl();
        xlVar.c = 1.0f;
        return xlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null) == null) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.c.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((xl) of2Var).c = 1.0f;
    }
}
