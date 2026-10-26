package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.hs2;
import defpackage.js2;
import defpackage.kr1;
import defpackage.of2;
import defpackage.pj2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends tf2 {
    public final hs2 c;
    public final pj2 d;

    public PaddingValuesElement(hs2 hs2Var, pj2 pj2Var) {
        this.c = hs2Var;
        this.d = pj2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        js2 js2Var = new js2();
        js2Var.c = this.c;
        return js2Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kr1.n(this.c, paddingValuesElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.d.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((js2) of2Var).c = this.c;
    }
}
