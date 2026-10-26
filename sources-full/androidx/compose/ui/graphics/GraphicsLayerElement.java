package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import defpackage.e54;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.of2;
import defpackage.ok0;
import defpackage.pj2;
import defpackage.qh3;
import defpackage.re0;
import defpackage.rg3;
import defpackage.tf2;
import defpackage.ud2;
import defpackage.wl2;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends tf2 {
    public final float c;
    public final float d;
    public final float h;
    public final long l;
    public final rg3 m;
    public final boolean n;
    public final long o;
    public final long p;

    public GraphicsLayerElement(float f, float f2, float f3, long j, rg3 rg3Var, boolean z, long j2, long j3) {
        this.c = f;
        this.d = f2;
        this.h = f3;
        this.l = j;
        this.m = rg3Var;
        this.n = z;
        this.o = j2;
        this.p = j3;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        qh3 qh3Var = new qh3();
        qh3Var.c = 1.0f;
        qh3Var.d = 1.0f;
        qh3Var.h = this.c;
        qh3Var.l = this.d;
        qh3Var.m = this.h;
        qh3Var.n = 8.0f;
        qh3Var.o = this.l;
        qh3Var.p = this.m;
        qh3Var.q = this.n;
        qh3Var.r = this.o;
        qh3Var.s = this.p;
        qh3Var.t = new pj2(17, qh3Var);
        return qh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(8.0f, 8.0f) == 0 && e54.a(this.l, graphicsLayerElement.l) && kr1.n(this.m, graphicsLayerElement.m) && this.n == graphicsLayerElement.n && re0.c(this.o, graphicsLayerElement.o) && re0.c(this.p, graphicsLayerElement.p);
    }

    public final int hashCode() {
        int iD = fq2.d(8.0f, fq2.d(this.h, fq2.d(0.0f, fq2.d(0.0f, fq2.d(this.d, fq2.d(0.0f, fq2.d(0.0f, fq2.d(this.c, fq2.d(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = e54.c;
        int iK = ud2.k((this.m.hashCode() + ud2.h(iD, 31, this.l)) * 31, 961, this.n);
        int i2 = re0.j;
        return Integer.hashCode(0) + ud2.h(ud2.h(iK, 31, this.o), 31, this.p);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        ValueElementSequence properties = inspectorInfo.getProperties();
        Float fValueOf = Float.valueOf(1.0f);
        properties.set("scaleX", fValueOf);
        inspectorInfo.getProperties().set("scaleY", fValueOf);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.c));
        ValueElementSequence properties2 = inspectorInfo.getProperties();
        Float fValueOf2 = Float.valueOf(0.0f);
        properties2.set("translationX", fValueOf2);
        inspectorInfo.getProperties().set("translationY", fValueOf2);
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.d));
        inspectorInfo.getProperties().set("rotationX", fValueOf2);
        inspectorInfo.getProperties().set("rotationY", fValueOf2);
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.h));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(8.0f));
        inspectorInfo.getProperties().set("transformOrigin", new e54(this.l));
        inspectorInfo.getProperties().set("shape", this.m);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.n));
        inspectorInfo.getProperties().set("renderEffect", null);
        inspectorInfo.getProperties().set("ambientShadowColor", new re0(this.o));
        inspectorInfo.getProperties().set("spotShadowColor", new re0(this.p));
        inspectorInfo.getProperties().set("compositingStrategy", new ok0());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.h);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) e54.d(this.l));
        sb.append(", shape=");
        sb.append(this.m);
        sb.append(", clip=");
        sb.append(this.n);
        sb.append(", renderEffect=null, ambientShadowColor=");
        ud2.t(this.o, sb, ", spotShadowColor=");
        sb.append((Object) re0.i(this.p));
        sb.append(", compositingStrategy=");
        sb.append((Object) ok0.a(0));
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        qh3 qh3Var = (qh3) of2Var;
        qh3Var.c = 1.0f;
        qh3Var.d = 1.0f;
        qh3Var.h = this.c;
        qh3Var.l = this.d;
        qh3Var.m = this.h;
        qh3Var.n = 8.0f;
        qh3Var.o = this.l;
        qh3Var.p = this.m;
        qh3Var.q = this.n;
        qh3Var.r = this.o;
        qh3Var.s = this.p;
        wl2 wl2Var = y64.K(qh3Var, 2).u;
        if (wl2Var != null) {
            wl2Var.l1(qh3Var.t, true);
        }
    }
}
