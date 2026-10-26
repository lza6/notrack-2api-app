package defpackage;

import androidx.compose.ui.text.style.TextForegroundStyle$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class em3 implements dg {
    public final hy3 a;
    public final long b;
    public final ic1 c;
    public final gc1 d;
    public final hc1 e;
    public final lb1 f;
    public final String g;
    public final long h;
    public final zr i;
    public final iy3 j;
    public final g72 k;
    public final long l;
    public final tt3 m;
    public final pg3 n;
    public final hw2 o;
    public final uz0 p;

    public em3(long j, long j2, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j3, zr zrVar, iy3 iy3Var, g72 g72Var, long j4, tt3 tt3Var, pg3 pg3Var, int i) {
        this((i & 1) != 0 ? re0.i : j, (i & 2) != 0 ? yz3.c : j2, (i & 4) != 0 ? null : ic1Var, (i & 8) != 0 ? null : gc1Var, (i & 16) != 0 ? null : hc1Var, (i & 32) != 0 ? null : lb1Var, (i & 64) != 0 ? null : str, (i & Uuid.SIZE_BITS) != 0 ? yz3.c : j3, (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : zrVar, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : iy3Var, (i & 1024) != 0 ? null : g72Var, (i & 2048) != 0 ? re0.i : j4, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : tt3Var, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : pg3Var, (hw2) null);
    }

    public em3(long j, long j2, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j3, zr zrVar, iy3 iy3Var, g72 g72Var, long j4, tt3 tt3Var, pg3 pg3Var, hw2 hw2Var) {
        this(TextForegroundStyle$Companion.m138xe5d6173e(j), j2, ic1Var, gc1Var, hc1Var, lb1Var, str, j3, zrVar, iy3Var, g72Var, j4, tt3Var, pg3Var, hw2Var, null);
    }

    public em3(hy3 hy3Var, long j, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j2, zr zrVar, iy3 iy3Var, g72 g72Var, long j3, tt3 tt3Var, pg3 pg3Var, hw2 hw2Var, uz0 uz0Var) {
        this.a = hy3Var;
        this.b = j;
        this.c = ic1Var;
        this.d = gc1Var;
        this.e = hc1Var;
        this.f = lb1Var;
        this.g = str;
        this.h = j2;
        this.i = zrVar;
        this.j = iy3Var;
        this.k = g72Var;
        this.l = j3;
        this.m = tt3Var;
        this.n = pg3Var;
        this.o = hw2Var;
        this.p = uz0Var;
    }

    public final boolean a(em3 em3Var) {
        if (this == em3Var) {
            return true;
        }
        return yz3.a(this.b, em3Var.b) && kr1.n(this.c, em3Var.c) && kr1.n(this.d, em3Var.d) && kr1.n(this.e, em3Var.e) && kr1.n(this.f, em3Var.f) && kr1.n(this.g, em3Var.g) && yz3.a(this.h, em3Var.h) && kr1.n(this.i, em3Var.i) && kr1.n(this.j, em3Var.j) && kr1.n(this.k, em3Var.k) && re0.c(this.l, em3Var.l) && kr1.n(this.o, em3Var.o);
    }

    public final boolean b(em3 em3Var) {
        return kr1.n(this.a, em3Var.a) && kr1.n(this.m, em3Var.m) && kr1.n(this.n, em3Var.n) && kr1.n(this.p, em3Var.p);
    }

    public final em3 c(em3 em3Var) {
        if (em3Var == null) {
            return this;
        }
        hy3 hy3Var = em3Var.a;
        return fm3.a(this, hy3Var.a(), hy3Var.b(), hy3Var.getAlpha(), em3Var.b, em3Var.c, em3Var.d, em3Var.e, em3Var.f, em3Var.g, em3Var.h, em3Var.i, em3Var.j, em3Var.k, em3Var.l, em3Var.m, em3Var.n, em3Var.o, em3Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em3)) {
            return false;
        }
        em3 em3Var = (em3) obj;
        return a(em3Var) && b(em3Var);
    }

    public final int hashCode() {
        hy3 hy3Var = this.a;
        long jA = hy3Var.a();
        int i = re0.j;
        int iHashCode = Long.hashCode(jA) * 31;
        yx yxVarB = hy3Var.b();
        int iHashCode2 = (Float.hashCode(hy3Var.getAlpha()) + ((iHashCode + (yxVarB != null ? yxVarB.hashCode() : 0)) * 31)) * 31;
        zz3[] zz3VarArr = yz3.b;
        int iH = ud2.h(iHashCode2, 31, this.b);
        ic1 ic1Var = this.c;
        int i2 = (iH + (ic1Var != null ? ic1Var.c : 0)) * 31;
        gc1 gc1Var = this.d;
        int iHashCode3 = (i2 + (gc1Var != null ? Integer.hashCode(gc1Var.a) : 0)) * 31;
        hc1 hc1Var = this.e;
        int iHashCode4 = (iHashCode3 + (hc1Var != null ? Integer.hashCode(hc1Var.a) : 0)) * 31;
        lb1 lb1Var = this.f;
        int iHashCode5 = (iHashCode4 + (lb1Var != null ? lb1Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iH2 = ud2.h((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        zr zrVar = this.i;
        int iHashCode6 = (iH2 + (zrVar != null ? Float.hashCode(zrVar.a) : 0)) * 31;
        iy3 iy3Var = this.j;
        int iHashCode7 = (iHashCode6 + (iy3Var != null ? iy3Var.hashCode() : 0)) * 31;
        g72 g72Var = this.k;
        int iH3 = ud2.h((iHashCode7 + (g72Var != null ? g72Var.c.hashCode() : 0)) * 31, 31, this.l);
        tt3 tt3Var = this.m;
        int i3 = (iH3 + (tt3Var != null ? tt3Var.a : 0)) * 31;
        pg3 pg3Var = this.n;
        int iHashCode8 = (i3 + (pg3Var != null ? pg3Var.hashCode() : 0)) * 31;
        hw2 hw2Var = this.o;
        int iHashCode9 = (iHashCode8 + (hw2Var != null ? hw2Var.hashCode() : 0)) * 31;
        uz0 uz0Var = this.p;
        return iHashCode9 + (uz0Var != null ? uz0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        hy3 hy3Var = this.a;
        sb.append((Object) re0.i(hy3Var.a()));
        sb.append(", brush=");
        sb.append(hy3Var.b());
        sb.append(", alpha=");
        sb.append(hy3Var.getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) yz3.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) yz3.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        ud2.t(this.l, sb, ", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }
}
