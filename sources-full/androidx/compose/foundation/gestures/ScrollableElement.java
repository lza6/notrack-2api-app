package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fc3;
import defpackage.gc3;
import defpackage.gh2;
import defpackage.kr1;
import defpackage.nq2;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends tf2 {
    public final gc3 c;
    public final nq2 d;
    public final boolean h;
    public final boolean l;
    public final gh2 m;

    public ScrollableElement(gc3 gc3Var, nq2 nq2Var, boolean z, boolean z2, gh2 gh2Var) {
        this.c = gc3Var;
        this.d = nq2Var;
        this.h = z;
        this.l = z2;
        this.m = gh2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new fc3(null, this.m, this.d, null, this.c, this.h, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return kr1.n(this.c, scrollableElement.c) && this.d == scrollableElement.d && this.h == scrollableElement.h && this.l == scrollableElement.l && kr1.n(this.m, scrollableElement.m);
    }

    public final int hashCode() {
        int iK = ud2.k(ud2.k((this.d.hashCode() + (this.c.hashCode() * 31)) * 961, 31, this.h), 961, this.l);
        gh2 gh2Var = this.m;
        return (iK + (gh2Var != null ? gh2Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.d);
        inspectorInfo.getProperties().set("state", this.c);
        inspectorInfo.getProperties().set("overscrollEffect", null);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.h));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.l));
        inspectorInfo.getProperties().set("flingBehavior", null);
        inspectorInfo.getProperties().set("interactionSource", this.m);
        inspectorInfo.getProperties().set("bringIntoViewSpec", null);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((fc3) of2Var).H0(null, this.m, this.d, null, this.c, this.h, this.l);
    }
}
