package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in1 {
    public static final in1 g = new in1(false, 0, true, 1, 1, g72.h);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final g72 f;

    public in1(boolean z, int i, boolean z2, int i2, int i3, g72 g72Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = g72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in1)) {
            return false;
        }
        in1 in1Var = (in1) obj;
        return this.a == in1Var.a && this.b == in1Var.b && this.c == in1Var.c && this.d == in1Var.d && this.e == in1Var.e && kr1.n(this.f, in1Var.f);
    }

    public final int hashCode() {
        return this.f.c.hashCode() + fq2.e(this.e, fq2.e(this.d, ud2.k(fq2.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) xv1.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) zv1.a(this.d)) + ", imeAction=" + ((Object) en1.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
