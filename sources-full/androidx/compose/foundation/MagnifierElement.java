package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.a92;
import defpackage.aw2;
import defpackage.b92;
import defpackage.ff3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of2;
import defpackage.rx0;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.ux0;
import defpackage.wu0;
import defpackage.y64;
import defpackage.yh4;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends tf2 {
    public final le1 c;
    public final le1 d;
    public final aw2 h;

    public MagnifierElement(le1 le1Var, le1 le1Var2, aw2 aw2Var) {
        this.c = le1Var;
        this.d = le1Var2;
        this.h = aw2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new a92(this.c, this.d, this.h);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.d.hashCode() + ud2.k(fq2.d(Float.NaN, fq2.d(Float.NaN, ud2.h(ud2.k(fq2.d(Float.NaN, this.c.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.c);
        inspectorInfo.getProperties().set("magnifierCenter", null);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(Float.NaN));
        inspectorInfo.getProperties().set("size", new ux0(9205357640488583168L));
        fq2.l(Float.NaN, fq2.l(Float.NaN, inspectorInfo.getProperties(), "cornerRadius", inspectorInfo), "elevation", inspectorInfo).set("clippingEnabled", Boolean.TRUE);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        a92 a92Var = (a92) of2Var;
        float f = a92Var.h;
        long j = a92Var.m;
        float f2 = a92Var.n;
        boolean z = a92Var.l;
        float f3 = a92Var.o;
        boolean z2 = a92Var.p;
        aw2 aw2Var = a92Var.q;
        View view = a92Var.r;
        wu0 wu0Var = a92Var.s;
        a92Var.c = this.c;
        a92Var.h = Float.NaN;
        a92Var.l = true;
        a92Var.m = 9205357640488583168L;
        a92Var.n = Float.NaN;
        a92Var.o = Float.NaN;
        a92Var.p = true;
        a92Var.d = this.d;
        aw2 aw2Var2 = this.h;
        a92Var.q = aw2Var2;
        View viewP = yh4.P(a92Var);
        wu0 wu0Var2 = y64.M(a92Var).G;
        if (a92Var.t != null) {
            ff3 ff3Var = b92.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !aw2Var2.a()) || 9205357640488583168L != j || !rx0.a(Float.NaN, f2) || !rx0.a(Float.NaN, f3) || true != z || true != z2 || !aw2Var2.equals(aw2Var) || !viewP.equals(view) || !kr1.n(wu0Var2, wu0Var)) {
                a92Var.w0();
            }
        }
        a92Var.x0();
    }
}
