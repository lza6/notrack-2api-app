package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.gs2;
import defpackage.le1;
import defpackage.no1;
import defpackage.of2;
import defpackage.rx0;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends tf2 {
    public final float c;
    public final float d;
    public final float h;
    public final float l;
    public final le1 m;

    public PaddingElement(float f, float f2, float f3, float f4, le1 le1Var) {
        this.c = f;
        this.d = f2;
        this.h = f3;
        this.l = f4;
        this.m = le1Var;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            no1.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.tf2
    public final of2 create() {
        gs2 gs2Var = new gs2();
        gs2Var.c = this.c;
        gs2Var.d = this.d;
        gs2Var.h = this.h;
        gs2Var.l = this.l;
        gs2Var.m = true;
        return gs2Var;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && rx0.a(this.c, paddingElement.c) && rx0.a(this.d, paddingElement.d) && rx0.a(this.h, paddingElement.h) && rx0.a(this.l, paddingElement.l);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fq2.d(this.l, fq2.d(this.h, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.m.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        gs2 gs2Var = (gs2) of2Var;
        gs2Var.c = this.c;
        gs2Var.d = this.d;
        gs2Var.h = this.h;
        gs2Var.l = this.l;
        gs2Var.m = true;
    }
}
