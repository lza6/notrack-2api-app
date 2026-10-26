package defpackage;

import androidx.compose.ui.text.style.TextForegroundStyle$Companion;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class uz3 {
    public static final uz3 d = new uz3(0, 0, null, 0, 0, 0, 0, 16777215);
    public final em3 a;
    public final xs2 b;
    public final jw2 c;

    public uz3(long j, long j2, ic1 ic1Var, long j3, int i, int i2, long j4, int i3) {
        this(new em3((i3 & 1) != 0 ? re0.i : j, (i3 & 2) != 0 ? yz3.c : j2, (i3 & 4) != 0 ? null : ic1Var, (gc1) null, (hc1) null, (i3 & 32) != 0 ? null : lb1.a, (String) null, (i3 & Uuid.SIZE_BITS) != 0 ? yz3.c : j3, (zr) null, (iy3) null, (g72) null, re0.i, (tt3) null, (pg3) null, (hw2) null), new xs2((32768 & i3) != 0 ? Integer.MIN_VALUE : i, (65536 & i3) == 0 ? i2 : Integer.MIN_VALUE, (i3 & 131072) != 0 ? yz3.c : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uz3(em3 em3Var, xs2 xs2Var) {
        hw2 hw2Var = em3Var.o;
        fw2 fw2Var = xs2Var.e;
        this(em3Var, xs2Var, (hw2Var == null && fw2Var == null) ? null : new jw2(hw2Var, fw2Var));
    }

    public uz3(em3 em3Var, xs2 xs2Var, jw2 jw2Var) {
        this.a = em3Var;
        this.b = xs2Var;
        this.c = jw2Var;
    }

    public static uz3 a(uz3 uz3Var, long j, long j2, ic1 ic1Var, lb1 lb1Var, long j3, int i, long j4, jw2 jw2Var, c42 c42Var, int i2) {
        long jA = (i2 & 1) != 0 ? uz3Var.a.a.a() : j;
        long j5 = (i2 & 2) != 0 ? uz3Var.a.b : j2;
        ic1 ic1Var2 = (i2 & 4) != 0 ? uz3Var.a.c : ic1Var;
        em3 em3Var = uz3Var.a;
        gc1 gc1Var = em3Var.d;
        hc1 hc1Var = em3Var.e;
        lb1 lb1Var2 = (i2 & 32) != 0 ? em3Var.f : lb1Var;
        String str = em3Var.g;
        long j6 = (i2 & Uuid.SIZE_BITS) != 0 ? em3Var.h : j3;
        zr zrVar = em3Var.i;
        iy3 iy3Var = em3Var.j;
        g72 g72Var = em3Var.k;
        long j7 = em3Var.l;
        tt3 tt3Var = em3Var.m;
        pg3 pg3Var = em3Var.n;
        uz0 uz0Var = em3Var.p;
        xs2 xs2Var = uz3Var.b;
        int i3 = xs2Var.a;
        int i4 = (i2 & 65536) != 0 ? xs2Var.b : i;
        long j8 = (i2 & 131072) != 0 ? xs2Var.c : j4;
        ky3 ky3Var = xs2Var.d;
        jw2 jw2Var2 = (i2 & 524288) != 0 ? uz3Var.c : jw2Var;
        return new uz3(new em3(re0.c(jA, em3Var.a.a()) ? em3Var.a : TextForegroundStyle$Companion.m138xe5d6173e(jA), j5, ic1Var2, gc1Var, hc1Var, lb1Var2, str, j6, zrVar, iy3Var, g72Var, j7, tt3Var, pg3Var, jw2Var2 != null ? jw2Var2.a : null, uz0Var), new xs2(i3, i4, j8, ky3Var, jw2Var2 != null ? jw2Var2.b : null, (i2 & 1048576) != 0 ? xs2Var.f : c42Var, xs2Var.g, xs2Var.h, xs2Var.i), jw2Var2);
    }

    public static uz3 e(uz3 uz3Var, long j, long j2, ic1 ic1Var, gc1 gc1Var, lb1 lb1Var, long j3, tt3 tt3Var, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? yz3.c : j2;
        ic1 ic1Var2 = (i2 & 4) != 0 ? null : ic1Var;
        gc1 gc1Var2 = (i2 & 8) != 0 ? null : gc1Var;
        lb1 lb1Var2 = (i2 & 32) != 0 ? null : lb1Var;
        long j6 = (i2 & Uuid.SIZE_BITS) != 0 ? yz3.c : j3;
        long j7 = re0.i;
        tt3 tt3Var2 = (i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : tt3Var;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? yz3.c : j4;
        em3 em3VarA = fm3.a(uz3Var.a, j, null, Float.NaN, j5, ic1Var2, gc1Var2, null, lb1Var2, null, j6, null, null, null, j7, tt3Var2, null, null, null);
        xs2 xs2VarA = ys2.a(uz3Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (uz3Var.a == em3VarA && uz3Var.b == xs2VarA) ? uz3Var : new uz3(em3VarA, xs2VarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(uz3 uz3Var) {
        if (this != uz3Var) {
            return kr1.n(this.b, uz3Var.b) && this.a.a(uz3Var.a);
        }
        return true;
    }

    public final uz3 d(uz3 uz3Var) {
        return (uz3Var == null || uz3Var.equals(d)) ? this : new uz3(this.a.c(uz3Var.a), this.b.a(uz3Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz3)) {
            return false;
        }
        uz3 uz3Var = (uz3) obj;
        return kr1.n(this.a, uz3Var.a) && kr1.n(this.b, uz3Var.b) && kr1.n(this.c, uz3Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jw2 jw2Var = this.c;
        return iHashCode + (jw2Var != null ? jw2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) re0.i(b()));
        sb.append(", brush=");
        em3 em3Var = this.a;
        sb.append(em3Var.a.b());
        sb.append(", alpha=");
        sb.append(em3Var.a.getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) yz3.d(em3Var.b));
        sb.append(", fontWeight=");
        sb.append(em3Var.c);
        sb.append(", fontStyle=");
        sb.append(em3Var.d);
        sb.append(", fontSynthesis=");
        sb.append(em3Var.e);
        sb.append(", fontFamily=");
        sb.append(em3Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(em3Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) yz3.d(em3Var.h));
        sb.append(", baselineShift=");
        sb.append(em3Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(em3Var.j);
        sb.append(", localeList=");
        sb.append(em3Var.k);
        sb.append(", background=");
        ud2.t(em3Var.l, sb, ", textDecoration=");
        sb.append(em3Var.m);
        sb.append(", shadow=");
        sb.append(em3Var.n);
        sb.append(", drawStyle=");
        sb.append(em3Var.p);
        sb.append(", textAlign=");
        xs2 xs2Var = this.b;
        sb.append((Object) jt3.a(xs2Var.a));
        sb.append(", textDirection=");
        sb.append((Object) wt3.a(xs2Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) yz3.d(xs2Var.c));
        sb.append(", textIndent=");
        sb.append(xs2Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(xs2Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) x32.a(xs2Var.g));
        sb.append(", hyphens=");
        sb.append((Object) vk1.a(xs2Var.h));
        sb.append(", textMotion=");
        sb.append(xs2Var.i);
        sb.append(')');
        return sb.toString();
    }
}
