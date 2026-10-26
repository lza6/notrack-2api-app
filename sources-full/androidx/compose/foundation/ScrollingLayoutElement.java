package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.ob3;
import defpackage.of2;
import defpackage.rb3;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends tf2 {
    public final rb3 c;
    public final boolean d;

    public ScrollingLayoutElement(rb3 rb3Var, boolean z) {
        this.c = rb3Var;
        this.d = z;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        ob3 ob3Var = new ob3();
        ob3Var.c = this.c;
        ob3Var.d = this.d;
        return ob3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return kr1.n(this.c, scrollingLayoutElement.c) && this.d == scrollingLayoutElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ud2.k(this.c.hashCode() * 31, 31, false);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scroll");
        inspectorInfo.getProperties().set("state", this.c);
        inspectorInfo.getProperties().set("reverseScrolling", Boolean.FALSE);
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.d));
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ob3 ob3Var = (ob3) of2Var;
        ob3Var.c = this.c;
        ob3Var.d = this.d;
    }
}
