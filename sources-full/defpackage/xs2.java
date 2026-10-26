package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xs2 implements dg {
    public final int a;
    public final int b;
    public final long c;
    public final ky3 d;
    public final fw2 e;
    public final c42 f;
    public final int g;
    public final int h;
    public final hz3 i;

    public xs2(int i, int i2, long j, ky3 ky3Var, fw2 fw2Var, c42 c42Var, int i3, int i4, hz3 hz3Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = ky3Var;
        this.e = fw2Var;
        this.f = c42Var;
        this.g = i3;
        this.h = i4;
        this.i = hz3Var;
        if (yz3.a(j, yz3.c) || yz3.c(j) >= 0.0f) {
            return;
        }
        qo1.b("lineHeight can't be negative (" + yz3.c(j) + ')');
    }

    public final xs2 a(xs2 xs2Var) {
        return xs2Var == null ? this : ys2.a(this, xs2Var.a, xs2Var.b, xs2Var.c, xs2Var.d, xs2Var.e, xs2Var.f, xs2Var.g, xs2Var.h, xs2Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs2)) {
            return false;
        }
        xs2 xs2Var = (xs2) obj;
        return this.a == xs2Var.a && this.b == xs2Var.b && yz3.a(this.c, xs2Var.c) && kr1.n(this.d, xs2Var.d) && kr1.n(this.e, xs2Var.e) && kr1.n(this.f, xs2Var.f) && this.g == xs2Var.g && this.h == xs2Var.h && kr1.n(this.i, xs2Var.i);
    }

    public final int hashCode() {
        int iE = fq2.e(this.b, Integer.hashCode(this.a) * 31, 31);
        zz3[] zz3VarArr = yz3.b;
        int iH = ud2.h(iE, 31, this.c);
        ky3 ky3Var = this.d;
        int iHashCode = (iH + (ky3Var != null ? ky3Var.hashCode() : 0)) * 31;
        fw2 fw2Var = this.e;
        int iHashCode2 = (iHashCode + (fw2Var != null ? fw2Var.hashCode() : 0)) * 31;
        c42 c42Var = this.f;
        int iE2 = fq2.e(this.h, fq2.e(this.g, (iHashCode2 + (c42Var != null ? c42Var.hashCode() : 0)) * 31, 31), 31);
        hz3 hz3Var = this.i;
        return iE2 + (hz3Var != null ? hz3Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) jt3.a(this.a)) + ", textDirection=" + ((Object) wt3.a(this.b)) + ", lineHeight=" + ((Object) yz3.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) x32.a(this.g)) + ", hyphens=" + ((Object) vk1.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
