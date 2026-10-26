package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.c71;
import defpackage.fw0;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends tf2 {
    public final fw0 c;
    public final String d;

    public FillElement(fw0 fw0Var, String str) {
        this.c = fw0Var;
        this.d = str;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        c71 c71Var = new c71();
        c71Var.c = this.c;
        c71Var.d = 1.0f;
        return c71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.c == ((FillElement) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.d);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(1.0f));
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        c71 c71Var = (c71) of2Var;
        c71Var.c = this.c;
        c71Var.d = 1.0f;
    }
}
