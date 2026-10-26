package androidx.compose.ui.draw;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.a8;
import defpackage.bi3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.ms2;
import defpackage.ns2;
import defpackage.of2;
import defpackage.sn0;
import defpackage.te0;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends tf2 {
    public final ms2 c;
    public final a8 d;
    public final sn0 h;
    public final float l;
    public final te0 m;

    public PainterElement(ms2 ms2Var, a8 a8Var, sn0 sn0Var, float f, te0 te0Var) {
        this.c = ms2Var;
        this.d = a8Var;
        this.h = sn0Var;
        this.l = f;
        this.m = te0Var;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        ns2 ns2Var = new ns2();
        ns2Var.c = this.c;
        ns2Var.d = true;
        ns2Var.h = this.d;
        ns2Var.l = this.h;
        ns2Var.m = this.l;
        ns2Var.n = this.m;
        return ns2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return kr1.n(this.c, painterElement.c) && kr1.n(this.d, painterElement.d) && kr1.n(this.h, painterElement.h) && Float.compare(this.l, painterElement.l) == 0 && kr1.n(this.m, painterElement.m);
    }

    public final int hashCode() {
        int iD = fq2.d(this.l, (this.h.hashCode() + ((this.d.hashCode() + ud2.k(this.c.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        te0 te0Var = this.m;
        return iD + (te0Var == null ? 0 : te0Var.hashCode());
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.c);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.TRUE);
        inspectorInfo.getProperties().set("alignment", this.d);
        inspectorInfo.getProperties().set("contentScale", this.h);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.l));
        inspectorInfo.getProperties().set("colorFilter", this.m);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.c + ", sizeToIntrinsics=true, alignment=" + this.d + ", contentScale=" + this.h + ", alpha=" + this.l + ", colorFilter=" + this.m + ')';
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        ns2 ns2Var = (ns2) of2Var;
        boolean z = ns2Var.d;
        ms2 ms2Var = this.c;
        boolean z2 = (z && bi3.a(ns2Var.c.h(), ms2Var.h())) ? false : true;
        ns2Var.c = ms2Var;
        ns2Var.d = true;
        ns2Var.h = this.d;
        ns2Var.l = this.h;
        ns2Var.m = this.l;
        ns2Var.n = this.m;
        if (z2) {
            y64.M(ns2Var).C();
        }
        kr1.O(ns2Var);
    }
}
