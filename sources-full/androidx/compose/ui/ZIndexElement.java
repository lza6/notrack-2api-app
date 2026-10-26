package androidx.compose.ui;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.of2;
import defpackage.rj4;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends tf2 {
    @Override // defpackage.tf2
    public final of2 create() {
        rj4 rj4Var = new rj4();
        rj4Var.c = 10.0f;
        return rj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(10.0f, 10.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(10.0f));
    }

    public final String toString() {
        return "ZIndexElement(zIndex=10.0)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((rj4) of2Var).c = 10.0f;
    }
}
