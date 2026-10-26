package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ap3;
import defpackage.je1;
import defpackage.kr1;
import defpackage.of2;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElement extends tf2 {
    public final je1 c;

    public StylusHandwritingElement(je1 je1Var) {
        this.c = je1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new ap3(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && kr1.n(this.c, ((StylusHandwritingElement) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.c);
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.c + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((ap3) of2Var).h = this.c;
    }
}
