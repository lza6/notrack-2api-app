package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import defpackage.hw;
import defpackage.kr1;
import defpackage.of2;
import defpackage.qz;
import defpackage.re0;
import defpackage.rg3;
import defpackage.rx0;
import defpackage.tf2;
import defpackage.vl3;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends tf2 {
    public final float c;
    public final vl3 d;
    public final rg3 h;

    public BorderModifierNodeElement(float f, vl3 vl3Var, rg3 rg3Var) {
        this.c = f;
        this.d = vl3Var;
        this.h = rg3Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new hw(this.c, this.d, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return rx0.a(this.c, borderModifierNodeElement.c) && this.d.equals(borderModifierNodeElement.d) && kr1.n(this.h, borderModifierNodeElement.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.d.hashCode() + (Float.hashCode(this.c) * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set("width", new rx0(this.c));
        ValueElementSequence properties = inspectorInfo.getProperties();
        long j = this.d.a;
        properties.set("color", new re0(j));
        inspectorInfo.setValue(new re0(j));
        inspectorInfo.getProperties().set("shape", this.h);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) rx0.b(this.c)) + ", brush=" + this.d + ", shape=" + this.h + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        hw hwVar = (hw) of2Var;
        float f = hwVar.l;
        qz qzVar = hwVar.o;
        float f2 = this.c;
        if (!rx0.a(f, f2)) {
            hwVar.l = f2;
            qzVar.v0();
        }
        vl3 vl3Var = hwVar.m;
        vl3 vl3Var2 = this.d;
        if (!kr1.n(vl3Var, vl3Var2)) {
            hwVar.m = vl3Var2;
            qzVar.v0();
        }
        rg3 rg3Var = hwVar.n;
        rg3 rg3Var2 = this.h;
        if (kr1.n(rg3Var, rg3Var2)) {
            return;
        }
        hwVar.n = rg3Var2;
        qzVar.v0();
    }
}
