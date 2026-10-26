package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.az3;
import defpackage.dr0;
import defpackage.du3;
import defpackage.gs1;
import defpackage.kr1;
import defpackage.nq2;
import defpackage.of2;
import defpackage.rb3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.wx3;
import defpackage.y64;
import defpackage.ym3;
import defpackage.yx;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldCoreModifier extends tf2 {
    public final boolean c;
    public final boolean d;
    public final az3 h;
    public final c l;
    public final wx3 m;
    public final yx n;
    public final boolean o;
    public final rb3 p;
    public final nq2 q;

    public TextFieldCoreModifier(boolean z, boolean z2, az3 az3Var, c cVar, wx3 wx3Var, yx yxVar, boolean z3, rb3 rb3Var, nq2 nq2Var) {
        this.c = z;
        this.d = z2;
        this.h = az3Var;
        this.l = cVar;
        this.m = wx3Var;
        this.n = yxVar;
        this.o = z3;
        this.p = rb3Var;
        this.q = nq2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new du3(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.c == textFieldCoreModifier.c && this.d == textFieldCoreModifier.d && kr1.n(this.h, textFieldCoreModifier.h) && kr1.n(this.l, textFieldCoreModifier.l) && kr1.n(this.m, textFieldCoreModifier.m) && kr1.n(this.n, textFieldCoreModifier.n) && this.o == textFieldCoreModifier.o && kr1.n(this.p, textFieldCoreModifier.p) && this.q == textFieldCoreModifier.q;
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ud2.k((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.h.hashCode() + ud2.k(Boolean.hashCode(this.c) * 31, 31, this.d)) * 31)) * 31)) * 31)) * 31, 31, this.o)) * 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.c + ", isDragHovered=" + this.d + ", textLayoutState=" + this.h + ", textFieldState=" + this.l + ", textFieldSelectionState=" + this.m + ", cursorBrush=" + this.n + ", writeable=" + this.o + ", scrollState=" + this.p + ", orientation=" + this.q + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        gs1 gs1Var;
        du3 du3Var = (du3) of2Var;
        boolean zZ0 = du3Var.z0();
        boolean z = du3Var.h;
        c cVar = du3Var.n;
        az3 az3Var = du3Var.m;
        wx3 wx3Var = du3Var.o;
        rb3 rb3Var = du3Var.r;
        boolean z2 = this.c;
        du3Var.h = z2;
        boolean z3 = this.d;
        du3Var.l = z3;
        az3 az3Var2 = this.h;
        du3Var.m = az3Var2;
        c cVar2 = this.l;
        du3Var.n = cVar2;
        wx3 wx3Var2 = this.m;
        du3Var.o = wx3Var2;
        du3Var.p = this.n;
        du3Var.q = this.o;
        rb3 rb3Var2 = this.p;
        du3Var.r = rb3Var2;
        du3Var.s = this.q;
        du3Var.y.y0(cVar2, wx3Var2, az3Var2, z2 || z3);
        if (!du3Var.z0()) {
            ym3 ym3Var = du3Var.u;
            if (ym3Var != null) {
                ym3Var.c(null);
            }
            du3Var.u = null;
            dr0 dr0Var = du3Var.t;
            if (dr0Var != null && (gs1Var = (gs1) dr0Var.b.getAndSet(null)) != null) {
                gs1Var.c(null);
            }
        } else if (!z || !kr1.n(cVar, cVar2) || !zZ0) {
            du3Var.A0();
        }
        if (kr1.n(cVar, cVar2) && kr1.n(az3Var, az3Var2) && kr1.n(wx3Var, wx3Var2) && kr1.n(rb3Var, rb3Var2)) {
            return;
        }
        y64.M(du3Var).C();
    }
}
