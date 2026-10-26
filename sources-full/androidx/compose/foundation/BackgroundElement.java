package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.jr;
import defpackage.kr1;
import defpackage.le1;
import defpackage.ng3;
import defpackage.of2;
import defpackage.re0;
import defpackage.rg3;
import defpackage.tf2;
import defpackage.yx;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends tf2 {
    public final long c;
    public final yx d;
    public final float h;
    public final rg3 l;
    public final le1 m;

    public BackgroundElement(long j, ng3 ng3Var, rg3 rg3Var, le1 le1Var, int i) {
        j = (i & 1) != 0 ? re0.i : j;
        ng3Var = (i & 2) != 0 ? null : ng3Var;
        this.c = j;
        this.d = ng3Var;
        this.h = 1.0f;
        this.l = rg3Var;
        this.m = le1Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        jr jrVar = new jr();
        jrVar.c = this.c;
        jrVar.d = this.d;
        jrVar.h = this.h;
        jrVar.l = this.l;
        jrVar.m = 9205357640488583168L;
        return jrVar;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && re0.c(this.c, backgroundElement.c) && kr1.n(this.d, backgroundElement.d) && this.h == backgroundElement.h && kr1.n(this.l, backgroundElement.l);
    }

    public final int hashCode() {
        int i = re0.j;
        int iHashCode = Long.hashCode(this.c) * 31;
        yx yxVar = this.d;
        return this.l.hashCode() + fq2.d(this.h, (iHashCode + (yxVar != null ? yxVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.m.invoke(inspectorInfo);
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        jr jrVar = (jr) of2Var;
        jrVar.c = this.c;
        jrVar.d = this.d;
        jrVar.h = this.h;
        jrVar.l = this.l;
    }
}
