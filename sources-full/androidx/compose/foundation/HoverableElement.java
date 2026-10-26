package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dj1;
import defpackage.gh2;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends tf2 {
    public final gh2 c;

    public HoverableElement(gh2 gh2Var) {
        this.c = gh2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        dj1 dj1Var = new dj1();
        dj1Var.c = this.c;
        return dj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && kr1.n(((HoverableElement) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() * 31;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.c);
        inspectorInfo.getProperties().set("enabled", Boolean.TRUE);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        dj1 dj1Var = (dj1) of2Var;
        gh2 gh2Var = dj1Var.c;
        gh2 gh2Var2 = this.c;
        if (kr1.n(gh2Var, gh2Var2)) {
            return;
        }
        dj1Var.x0();
        dj1Var.c = gh2Var2;
    }
}
