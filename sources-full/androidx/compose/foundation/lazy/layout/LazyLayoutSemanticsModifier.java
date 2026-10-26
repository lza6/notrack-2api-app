package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.g12;
import defpackage.je1;
import defpackage.kr1;
import defpackage.l12;
import defpackage.nq2;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends tf2 {
    public final je1 c;
    public final g12 d;
    public final nq2 h;
    public final boolean l;
    public final boolean m;

    public LazyLayoutSemanticsModifier(je1 je1Var, g12 g12Var, nq2 nq2Var, boolean z, boolean z2) {
        this.c = je1Var;
        this.d = g12Var;
        this.h = nq2Var;
        this.l = z;
        this.m = z2;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new l12(this.c, this.d, this.h, this.l, this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.c == lazyLayoutSemanticsModifier.c && kr1.n(this.d, lazyLayoutSemanticsModifier.d) && this.h == lazyLayoutSemanticsModifier.h && this.l == lazyLayoutSemanticsModifier.l && this.m == lazyLayoutSemanticsModifier.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + ud2.k((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.l);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        l12 l12Var = (l12) of2Var;
        l12Var.c = this.c;
        l12Var.d = this.d;
        nq2 nq2Var = l12Var.h;
        nq2 nq2Var2 = this.h;
        if (nq2Var != nq2Var2) {
            l12Var.h = nq2Var2;
            y64.M(l12Var).D();
        }
        boolean z = l12Var.l;
        boolean z2 = this.l;
        boolean z3 = this.m;
        if (z == z2 && l12Var.m == z3) {
            return;
        }
        l12Var.l = z2;
        l12Var.m = z3;
        l12Var.v0();
        y64.M(l12Var).D();
    }
}
