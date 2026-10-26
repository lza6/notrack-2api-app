package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.mn2;
import defpackage.of2;
import defpackage.on2;
import defpackage.rx0;
import defpackage.tf2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends tf2 {
    public final float c;
    public final float d;
    public final mn2 h;

    public OffsetElement(float f, float f2, mn2 mn2Var) {
        this.c = f;
        this.d = f2;
        this.h = mn2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        on2 on2Var = new on2();
        on2Var.c = this.c;
        on2Var.d = this.d;
        on2Var.h = true;
        return on2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && rx0.a(this.c, offsetElement.c) && rx0.a(this.d, offsetElement.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fq2.d(this.d, Float.hashCode(this.c) * 31, 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.h.invoke(inspectorInfo);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) rx0.b(this.c)) + ", y=" + ((Object) rx0.b(this.d)) + ", rtlAware=true)";
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        on2 on2Var = (on2) of2Var;
        float f = on2Var.c;
        float f2 = this.c;
        boolean zA = rx0.a(f, f2);
        float f3 = this.d;
        if (!zA || !rx0.a(on2Var.d, f3) || !on2Var.h) {
            y64.M(on2Var).R(false);
        }
        on2Var.c = f2;
        on2Var.d = f3;
        on2Var.h = true;
    }
}
