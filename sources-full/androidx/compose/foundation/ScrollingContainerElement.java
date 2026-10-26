package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.gc3;
import defpackage.gh2;
import defpackage.jc3;
import defpackage.kr1;
import defpackage.nq2;
import defpackage.of2;
import defpackage.pr2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.w71;

/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends tf2 {
    public final gc3 c;
    public final nq2 d;
    public final boolean h;
    public final boolean l;
    public final w71 m;
    public final gh2 n;
    public final boolean o;
    public final pr2 p;

    public ScrollingContainerElement(w71 w71Var, gh2 gh2Var, nq2 nq2Var, pr2 pr2Var, gc3 gc3Var, boolean z, boolean z2, boolean z3) {
        this.c = gc3Var;
        this.d = nq2Var;
        this.h = z;
        this.l = z2;
        this.m = w71Var;
        this.n = gh2Var;
        this.o = z3;
        this.p = pr2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        jc3 jc3Var = new jc3();
        jc3Var.h = this.c;
        jc3Var.l = this.d;
        jc3Var.m = this.h;
        jc3Var.n = this.l;
        jc3Var.o = this.m;
        jc3Var.p = this.n;
        jc3Var.q = this.o;
        jc3Var.r = this.p;
        return jc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return kr1.n(this.c, scrollingContainerElement.c) && this.d == scrollingContainerElement.d && this.h == scrollingContainerElement.h && this.l == scrollingContainerElement.l && kr1.n(this.m, scrollingContainerElement.m) && kr1.n(this.n, scrollingContainerElement.n) && this.o == scrollingContainerElement.o && kr1.n(this.p, scrollingContainerElement.p);
    }

    public final int hashCode() {
        int iK = ud2.k(ud2.k((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.h), 31, this.l);
        w71 w71Var = this.m;
        int iHashCode = (iK + (w71Var != null ? w71Var.hashCode() : 0)) * 31;
        gh2 gh2Var = this.n;
        int iK2 = ud2.k((iHashCode + (gh2Var != null ? gh2Var.hashCode() : 0)) * 961, 31, this.o);
        pr2 pr2Var = this.p;
        return iK2 + (pr2Var != null ? pr2Var.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollingContainer");
        inspectorInfo.getProperties().set("state", this.c);
        inspectorInfo.getProperties().set("orientation", this.d);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.h));
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(this.l));
        inspectorInfo.getProperties().set("flingBehavior", this.m);
        inspectorInfo.getProperties().set("interactionSource", this.n);
        inspectorInfo.getProperties().set("bringIntoViewSpec", null);
        inspectorInfo.getProperties().set("useLocalOverscrollFactory", Boolean.valueOf(this.o));
        inspectorInfo.getProperties().set("overscrollEffect", this.p);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ((jc3) of2Var).A0(this.m, this.n, this.d, this.p, this.c, this.o, this.h, this.l);
    }
}
