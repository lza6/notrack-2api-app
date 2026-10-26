package defpackage;

import kotlin.jvm.internal.IntCompanionObject;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class vs2 {
    public String a;
    public uz3 b;
    public kb1 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public wu0 i;
    public dc j;
    public boolean k;
    public he2 m;
    public us2 n;
    public dx1 o;
    public long h = to1.a;
    public long l = 0;
    public long p = wm0.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public vs2(String str, uz3 uz3Var, kb1 kb1Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = uz3Var;
        this.c = kb1Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long e(vs2 vs2Var, long j, dx1 dx1Var) {
        uz3 uz3Var = vs2Var.b;
        he2 he2Var = vs2Var.m;
        wu0 wu0Var = vs2Var.i;
        wu0Var.getClass();
        he2 he2VarFrom = Options$Companion.from(he2Var, dx1Var, uz3Var, wu0Var, vs2Var.c);
        vs2Var.m = he2VarFrom;
        return he2VarFrom.a(j, vs2Var.g);
    }

    public final int a(int i, dx1 dx1Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = wm0.a(0, i, 0, IntCompanionObject.MAX_VALUE);
        if (this.g > 1) {
            jA = e(this, jA, dx1Var);
        }
        us2 us2VarD = d(dx1Var);
        long jV = gm4.v(jA, this.e, this.d, us2VarD.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iQ = g13.q(new dc((hc) us2VarD, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jV).b());
        int i6 = um0.i(jA);
        if (iQ < i6) {
            iQ = i6;
        }
        this.q = i;
        this.r = iQ;
        return iQ;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = wm0.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void c(wu0 wu0Var) {
        long jA;
        wu0 wu0Var2 = this.i;
        if (wu0Var != null) {
            int i = to1.b;
            jA = to1.a(wu0Var.getDensity(), wu0Var.l());
        } else {
            jA = to1.a;
        }
        if (wu0Var2 == null) {
            this.i = wu0Var;
            this.h = jA;
        } else if (wu0Var == null || this.h != jA) {
            this.i = wu0Var;
            this.h = jA;
            b();
        }
    }

    public final us2 d(dx1 dx1Var) {
        us2 hcVar = this.n;
        if (hcVar == null || dx1Var != this.o || hcVar.b()) {
            this.o = dx1Var;
            String str = this.a;
            uz3 uz3VarQ = yh4.Q(this.b, dx1Var);
            wu0 wu0Var = this.i;
            wu0Var.getClass();
            kb1 kb1Var = this.c;
            z21 z21Var = z21.c;
            hcVar = new hc(str, uz3VarQ, z21Var, z21Var, kb1Var, wu0Var);
        }
        this.n = hcVar;
        return hcVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = to1.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
