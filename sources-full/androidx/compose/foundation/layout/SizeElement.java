package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fi3;
import defpackage.fq2;
import defpackage.le1;
import defpackage.of2;
import defpackage.rx0;
import defpackage.tf2;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends tf2 {
    public final float c;
    public final float d;
    public final float h;
    public final float l;
    public final boolean m;
    public final le1 n;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, le1 le1Var, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true, le1Var);
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, le1 le1Var) {
        this.c = f;
        this.d = f2;
        this.h = f3;
        this.l = f4;
        this.m = z;
        this.n = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        fi3 fi3Var = new fi3();
        fi3Var.c = this.c;
        fi3Var.d = this.d;
        fi3Var.h = this.h;
        fi3Var.l = this.l;
        fi3Var.m = this.m;
        return fi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return rx0.a(this.c, sizeElement.c) && rx0.a(this.d, sizeElement.d) && rx0.a(this.h, sizeElement.h) && rx0.a(this.l, sizeElement.l) && this.m == sizeElement.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + fq2.d(this.l, fq2.d(this.h, fq2.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.n.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        fi3 fi3Var = (fi3) of2Var;
        fi3Var.c = this.c;
        fi3Var.d = this.d;
        fi3Var.h = this.h;
        fi3Var.l = this.l;
        fi3Var.m = this.m;
    }
}
