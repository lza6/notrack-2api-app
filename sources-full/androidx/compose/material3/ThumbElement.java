package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.kr1;
import defpackage.of2;
import defpackage.r04;
import defpackage.tf2;
import defpackage.uq1;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class ThumbElement extends tf2 {
    public final uq1 c;
    public final boolean d;

    public ThumbElement(uq1 uq1Var, boolean z) {
        this.c = uq1Var;
        this.d = z;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        r04 r04Var = new r04();
        r04Var.c = this.c;
        r04Var.d = this.d;
        r04Var.n = Float.NaN;
        r04Var.o = Float.NaN;
        return r04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return kr1.n(this.c, thumbElement.c) && this.d == thumbElement.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("switchThumb");
        inspectorInfo.getProperties().set("interactionSource", this.c);
        inspectorInfo.getProperties().set("checked", Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.c + ", checked=" + this.d + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        r04 r04Var = (r04) of2Var;
        r04Var.c = this.c;
        boolean z = r04Var.d;
        boolean z2 = this.d;
        if (z != z2) {
            y64.M(r04Var).C();
        }
        r04Var.d = z2;
        if (r04Var.m == null && !Float.isNaN(r04Var.o)) {
            r04Var.m = kr1.a(r04Var.o);
        }
        if (r04Var.l != null || Float.isNaN(r04Var.n)) {
            return;
        }
        r04Var.l = kr1.a(r04Var.n);
    }
}
