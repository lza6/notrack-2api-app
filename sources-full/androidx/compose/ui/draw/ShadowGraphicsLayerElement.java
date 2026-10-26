package androidx.compose.ui.draw;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.mv;
import defpackage.of2;
import defpackage.pj2;
import defpackage.re0;
import defpackage.rg3;
import defpackage.rx0;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.wl2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends tf2 {
    public final rg3 c;
    public final boolean d;
    public final long h;
    public final long l;

    public ShadowGraphicsLayerElement(rg3 rg3Var, boolean z, long j, long j2) {
        this.c = rg3Var;
        this.d = z;
        this.h = j;
        this.l = j2;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        return new mv(new pj2(15, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return rx0.a(3.0f, 3.0f) && kr1.n(this.c, shadowGraphicsLayerElement.c) && this.d == shadowGraphicsLayerElement.d && re0.c(this.h, shadowGraphicsLayerElement.h) && re0.c(this.l, shadowGraphicsLayerElement.l);
    }

    public final int hashCode() {
        int iK = ud2.k((this.c.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.d);
        int i = re0.j;
        return Long.hashCode(this.l) + ud2.h(iK, 31, this.h);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        fq2.l(3.0f, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.c);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.d));
        inspectorInfo.getProperties().set("ambientColor", new re0(this.h));
        inspectorInfo.getProperties().set("spotColor", new re0(this.l));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) rx0.b(3.0f));
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        ud2.t(this.h, sb, ", spotColor=");
        sb.append((Object) re0.i(this.l));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        mv mvVar = (mv) of2Var;
        mvVar.c = new pj2(15, this);
        wl2 wl2Var = y64.K(mvVar, 2).u;
        if (wl2Var != null) {
            wl2Var.l1(mvVar.c, true);
        }
    }
}
