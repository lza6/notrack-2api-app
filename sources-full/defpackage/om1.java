package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class om1 {
    public final xp0 a;
    public final xp0 b;
    public final xp0 c;
    public final le1 d;
    public final le1 e;
    public final le1 f;
    public final gi3 g;
    public final ma3 h;
    public final wx2 i;

    public om1(xp0 xp0Var, xp0 xp0Var2, xp0 xp0Var3, le1 le1Var, le1 le1Var2, le1 le1Var3, gi3 gi3Var, ma3 ma3Var, wx2 wx2Var) {
        this.a = xp0Var;
        this.b = xp0Var2;
        this.c = xp0Var3;
        this.d = le1Var;
        this.e = le1Var2;
        this.f = le1Var3;
        this.g = gi3Var;
        this.h = ma3Var;
        this.i = wx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        return kr1.n(this.a, om1Var.a) && kr1.n(this.b, om1Var.b) && kr1.n(this.c, om1Var.c) && kr1.n(this.d, om1Var.d) && kr1.n(this.e, om1Var.e) && kr1.n(this.f, om1Var.f) && kr1.n(this.g, om1Var.g) && this.h == om1Var.h && this.i == om1Var.i;
    }

    public final int hashCode() {
        xp0 xp0Var = this.a;
        int iHashCode = (xp0Var == null ? 0 : xp0Var.hashCode()) * 31;
        xp0 xp0Var2 = this.b;
        int iHashCode2 = (iHashCode + (xp0Var2 == null ? 0 : xp0Var2.hashCode())) * 31;
        xp0 xp0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (xp0Var3 == null ? 0 : xp0Var3.hashCode())) * 923521;
        le1 le1Var = this.d;
        int iHashCode4 = (iHashCode3 + (le1Var == null ? 0 : le1Var.hashCode())) * 31;
        le1 le1Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (le1Var2 == null ? 0 : le1Var2.hashCode())) * 31;
        le1 le1Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (le1Var3 == null ? 0 : le1Var3.hashCode())) * 31;
        gi3 gi3Var = this.g;
        int iHashCode7 = (iHashCode6 + (gi3Var == null ? 0 : gi3Var.hashCode())) * 31;
        ma3 ma3Var = this.h;
        int iHashCode8 = (iHashCode7 + (ma3Var == null ? 0 : ma3Var.hashCode())) * 31;
        wx2 wx2Var = this.i;
        return iHashCode8 + (wx2Var != null ? wx2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ')';
    }
}
