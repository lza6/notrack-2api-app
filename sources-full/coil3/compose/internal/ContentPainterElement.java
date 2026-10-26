package coil3.compose.internal;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.a8;
import defpackage.bi3;
import defpackage.e71;
import defpackage.fq2;
import defpackage.gi3;
import defpackage.im1;
import defpackage.kr1;
import defpackage.le1;
import defpackage.mm;
import defpackage.nm;
import defpackage.of2;
import defpackage.pm1;
import defpackage.pn0;
import defpackage.sn0;
import defpackage.te0;
import defpackage.tf2;
import defpackage.tm;
import defpackage.ud2;
import defpackage.xm;
import defpackage.y64;
import defpackage.ym0;

/* JADX INFO: loaded from: classes.dex */
public final class ContentPainterElement extends tf2 {
    public final pm1 c;
    public final im1 d;
    public final mm h;
    public final le1 l;
    public final le1 m;
    public final int n;
    public final a8 o;
    public final sn0 p;
    public final float q;
    public final te0 r;
    public final boolean s;
    public final xm t;
    public final String u;

    public ContentPainterElement(pm1 pm1Var, im1 im1Var, mm mmVar, le1 le1Var, le1 le1Var2, int i, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, boolean z, xm xmVar, String str) {
        this.c = pm1Var;
        this.d = im1Var;
        this.h = mmVar;
        this.l = le1Var;
        this.m = le1Var2;
        this.n = i;
        this.o = a8Var;
        this.p = sn0Var;
        this.q = f;
        this.r = te0Var;
        this.s = z;
        this.t = xmVar;
        this.u = str;
    }

    @Override // defpackage.tf2
    public final of2 create() {
        mm mmVar = this.h;
        im1 im1Var = this.d;
        pm1 pm1Var = this.c;
        nm nmVar = new nm(im1Var, pm1Var, mmVar);
        tm tmVar = new tm(nmVar);
        tmVar.u = this.l;
        tmVar.v = this.m;
        tmVar.w = this.p;
        tmVar.x = this.n;
        tmVar.y = this.t;
        tmVar.m(nmVar);
        gi3 gi3Var = pm1Var.q;
        return new pn0(tmVar, this.o, this.p, this.q, this.r, this.s, this.u, gi3Var instanceof ym0 ? (ym0) gi3Var : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return this.c.equals(contentPainterElement.c) && kr1.n(this.d, contentPainterElement.d) && kr1.n(this.h, contentPainterElement.h) && kr1.n(this.l, contentPainterElement.l) && kr1.n(this.m, contentPainterElement.m) && this.n == contentPainterElement.n && kr1.n(this.o, contentPainterElement.o) && kr1.n(this.p, contentPainterElement.p) && Float.compare(this.q, contentPainterElement.q) == 0 && kr1.n(this.r, contentPainterElement.r) && this.s == contentPainterElement.s && kr1.n(this.t, contentPainterElement.t) && kr1.n(this.u, contentPainterElement.u);
    }

    public final int hashCode() {
        int iHashCode = (this.l.hashCode() + ((this.h.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31)) * 31;
        le1 le1Var = this.m;
        int iD = fq2.d(this.q, (this.p.hashCode() + ((this.o.hashCode() + fq2.e(this.n, (iHashCode + (le1Var == null ? 0 : le1Var.hashCode())) * 31, 31)) * 31)) * 31, 31);
        te0 te0Var = this.r;
        int iK = ud2.k((iD + (te0Var == null ? 0 : te0Var.hashCode())) * 31, 31, this.s);
        xm xmVar = this.t;
        int iHashCode2 = (iK + (xmVar == null ? 0 : xmVar.hashCode())) * 31;
        String str = this.u;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.tf2
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("request", this.c);
        inspectorInfo.getProperties().set("imageLoader", this.d);
        inspectorInfo.getProperties().set("modelEqualityDelegate", this.h);
        inspectorInfo.getProperties().set("transform", this.l);
        inspectorInfo.getProperties().set("onState", this.m);
        inspectorInfo.getProperties().set("filterQuality", new e71(this.n));
        inspectorInfo.getProperties().set("alignment", this.o);
        inspectorInfo.getProperties().set("contentScale", this.p);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.q));
        inspectorInfo.getProperties().set("colorFilter", this.r);
        inspectorInfo.getProperties().set("clipToBounds", Boolean.valueOf(this.s));
        inspectorInfo.getProperties().set("previewHandler", this.t);
        inspectorInfo.getProperties().set("contentDescription", this.u);
    }

    public final String toString() {
        String strA = e71.a(this.n);
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.c);
        sb.append(", imageLoader=");
        sb.append(this.d);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.h);
        sb.append(", transform=");
        sb.append(this.l);
        sb.append(", onState=");
        sb.append(this.m);
        sb.append(", filterQuality=");
        sb.append(strA);
        sb.append(", alignment=");
        sb.append(this.o);
        sb.append(", contentScale=");
        sb.append(this.p);
        sb.append(", alpha=");
        sb.append(this.q);
        sb.append(", colorFilter=");
        sb.append(this.r);
        sb.append(", clipToBounds=");
        sb.append(this.s);
        sb.append(", previewHandler=");
        sb.append(this.t);
        sb.append(", contentDescription=");
        return fq2.r(sb, this.u, ")");
    }

    @Override // defpackage.tf2
    public final void update(of2 of2Var) {
        pn0 pn0Var = (pn0) of2Var;
        long jH = pn0Var.p.h();
        ym0 ym0Var = pn0Var.o;
        mm mmVar = this.h;
        im1 im1Var = this.d;
        pm1 pm1Var = this.c;
        nm nmVar = new nm(im1Var, pm1Var, mmVar);
        tm tmVar = pn0Var.p;
        tmVar.u = this.l;
        tmVar.v = this.m;
        sn0 sn0Var = this.p;
        tmVar.w = sn0Var;
        tmVar.x = this.n;
        tmVar.y = this.t;
        tmVar.m(nmVar);
        boolean zA = bi3.a(jH, tmVar.h());
        pn0Var.c = this.o;
        gi3 gi3Var = pm1Var.q;
        pn0Var.o = gi3Var instanceof ym0 ? (ym0) gi3Var : null;
        pn0Var.d = sn0Var;
        pn0Var.h = this.q;
        pn0Var.l = this.r;
        pn0Var.m = this.s;
        String str = pn0Var.n;
        String str2 = this.u;
        if (!kr1.n(str, str2)) {
            pn0Var.n = str2;
            y64.M(pn0Var).D();
        }
        boolean zN = kr1.n(ym0Var, pn0Var.o);
        if (!zA || !zN) {
            y64.M(pn0Var).C();
        }
        kr1.O(pn0Var);
    }
}
