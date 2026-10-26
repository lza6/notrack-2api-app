package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 {
    public final hg a;
    public final uz3 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final wu0 g;
    public final dx1 h;
    public final kb1 i;
    public final long j;

    public wy3(hg hgVar, uz3 uz3Var, List list, int i, boolean z, int i2, wu0 wu0Var, dx1 dx1Var, kb1 kb1Var, long j) {
        this.a = hgVar;
        this.b = uz3Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = wu0Var;
        this.h = dx1Var;
        this.i = kb1Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy3)) {
            return false;
        }
        wy3 wy3Var = (wy3) obj;
        return kr1.n(this.a, wy3Var.a) && kr1.n(this.b, wy3Var.b) && kr1.n(this.c, wy3Var.c) && this.d == wy3Var.d && this.e == wy3Var.e && this.f == wy3Var.f && kr1.n(this.g, wy3Var.g) && this.h == wy3Var.h && kr1.n(this.i, wy3Var.i) && um0.b(this.j, wy3Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + fq2.e(this.f, ud2.k((ud2.j((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) av1.N(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) um0.l(this.j)) + ')';
    }
}
