package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ey3;
import defpackage.f54;
import defpackage.in1;
import defpackage.jz3;
import defpackage.kr1;
import defpackage.nn2;
import defpackage.of2;
import defpackage.rp0;
import defpackage.tf2;
import defpackage.tp0;
import defpackage.ud2;
import defpackage.xw3;
import defpackage.y64;
import defpackage.z22;
import defpackage.za1;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends tf2 {
    public final f54 c;
    public final ey3 d;
    public final z22 h;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final nn2 o;
    public final xw3 p;
    public final in1 q;
    public final za1 r;

    public CoreTextFieldSemanticsModifier(f54 f54Var, ey3 ey3Var, z22 z22Var, boolean z, boolean z2, boolean z3, nn2 nn2Var, xw3 xw3Var, in1 in1Var, za1 za1Var) {
        this.c = f54Var;
        this.d = ey3Var;
        this.h = z22Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = nn2Var;
        this.p = xw3Var;
        this.q = in1Var;
        this.r = za1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        tp0 tp0Var = new tp0();
        tp0Var.h = this.c;
        tp0Var.l = this.d;
        tp0Var.m = this.h;
        tp0Var.n = this.l;
        tp0Var.o = this.m;
        tp0Var.p = this.n;
        tp0Var.q = this.o;
        xw3 xw3Var = this.p;
        tp0Var.r = xw3Var;
        tp0Var.s = this.q;
        tp0Var.t = this.r;
        xw3Var.g = new rp0(tp0Var, 0);
        return tp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoreTextFieldSemanticsModifier) {
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
            if (this.c.equals(coreTextFieldSemanticsModifier.c) && this.d.equals(coreTextFieldSemanticsModifier.d) && this.h == coreTextFieldSemanticsModifier.h && this.l == coreTextFieldSemanticsModifier.l && this.m == coreTextFieldSemanticsModifier.m && this.n == coreTextFieldSemanticsModifier.n && this.o.equals(coreTextFieldSemanticsModifier.o) && this.p == coreTextFieldSemanticsModifier.p && kr1.n(this.q, coreTextFieldSemanticsModifier.q) && kr1.n(this.r, coreTextFieldSemanticsModifier.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ud2.k(ud2.k(ud2.k((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.c + ", value=" + this.d + ", state=" + this.h + ", readOnly=" + this.l + ", enabled=" + this.m + ", isPassword=" + this.n + ", offsetMapping=" + this.o + ", manager=" + this.p + ", imeOptions=" + this.q + ", focusRequester=" + this.r + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        tp0 tp0Var = (tp0) of2Var;
        boolean z = tp0Var.o;
        boolean z2 = false;
        boolean z3 = z && !tp0Var.n;
        boolean z4 = tp0Var.p;
        in1 in1Var = tp0Var.s;
        xw3 xw3Var = tp0Var.r;
        boolean z5 = this.l;
        boolean z6 = this.m;
        if (z6 && !z5) {
            z2 = true;
        }
        tp0Var.h = this.c;
        ey3 ey3Var = this.d;
        tp0Var.l = ey3Var;
        tp0Var.m = this.h;
        tp0Var.n = z5;
        tp0Var.o = z6;
        tp0Var.q = this.o;
        xw3 xw3Var2 = this.p;
        tp0Var.r = xw3Var2;
        in1 in1Var2 = this.q;
        tp0Var.s = in1Var2;
        tp0Var.t = this.r;
        if (z6 != z || z2 != z3 || !kr1.n(in1Var2, in1Var) || this.n != z4 || !jz3.c(ey3Var.b)) {
            y64.M(tp0Var).D();
        }
        if (xw3Var2 != xw3Var) {
            xw3Var2.g = new rp0(tp0Var, 7);
        }
    }
}
