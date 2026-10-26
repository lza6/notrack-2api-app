package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.g02;
import defpackage.h02;
import defpackage.jx;
import defpackage.kr1;
import defpackage.nq2;
import defpackage.of2;
import defpackage.tf2;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends tf2 {
    public final h02 c;
    public final jx d;
    public final boolean h;
    public final nq2 l;

    public LazyLayoutBeyondBoundsModifierElement(h02 h02Var, jx jxVar, boolean z, nq2 nq2Var) {
        this.c = h02Var;
        this.d = jxVar;
        this.h = z;
        this.l = nq2Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        g02 g02Var = new g02();
        g02Var.c = this.c;
        g02Var.d = this.d;
        g02Var.h = this.h;
        g02Var.l = this.l;
        return g02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return kr1.n(this.c, lazyLayoutBeyondBoundsModifierElement.c) && kr1.n(this.d, lazyLayoutBeyondBoundsModifierElement.d) && this.h == lazyLayoutBeyondBoundsModifierElement.h && this.l == lazyLayoutBeyondBoundsModifierElement.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ud2.k((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.h);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        g02 g02Var = (g02) of2Var;
        g02Var.c = this.c;
        g02Var.d = this.d;
        g02Var.h = this.h;
        g02Var.l = this.l;
    }
}
