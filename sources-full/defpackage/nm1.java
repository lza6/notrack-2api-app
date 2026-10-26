package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm1 {
    public static final nm1 o;
    public final a71 a;
    public final xp0 b;
    public final xp0 c;
    public final xp0 d;
    public final tz e;
    public final tz f;
    public final tz g;
    public final le1 h;
    public final le1 i;
    public final le1 j;
    public final gi3 k;
    public final ma3 l;
    public final wx2 m;
    public final g61 n;

    static {
        bu1 bu1Var = a71.c;
        jt0 jt0Var = sw0.a;
        at0 at0Var = at0.c;
        n33 n33Var = gi3.e;
        wx2 wx2Var = wx2.c;
        g61 g61Var = g61.b;
        x21 x21Var = x21.c;
        tz tzVar = tz.h;
        ma4 ma4Var = ma4.c;
        o = new nm1(bu1Var, x21Var, at0Var, at0Var, tzVar, tzVar, tzVar, ma4Var, ma4Var, ma4Var, n33Var, ma3.d, wx2Var, g61Var);
    }

    public nm1(a71 a71Var, xp0 xp0Var, xp0 xp0Var2, xp0 xp0Var3, tz tzVar, tz tzVar2, tz tzVar3, le1 le1Var, le1 le1Var2, le1 le1Var3, gi3 gi3Var, ma3 ma3Var, wx2 wx2Var, g61 g61Var) {
        this.a = a71Var;
        this.b = xp0Var;
        this.c = xp0Var2;
        this.d = xp0Var3;
        this.e = tzVar;
        this.f = tzVar2;
        this.g = tzVar3;
        this.h = le1Var;
        this.i = le1Var2;
        this.j = le1Var3;
        this.k = gi3Var;
        this.l = ma3Var;
        this.m = wx2Var;
        this.n = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return kr1.n(this.a, nm1Var.a) && kr1.n(this.b, nm1Var.b) && kr1.n(this.c, nm1Var.c) && kr1.n(this.d, nm1Var.d) && this.e == nm1Var.e && this.f == nm1Var.f && this.g == nm1Var.g && kr1.n(this.h, nm1Var.h) && kr1.n(this.i, nm1Var.i) && kr1.n(this.j, nm1Var.j) && kr1.n(this.k, nm1Var.k) && this.l == nm1Var.l && this.m == nm1Var.m && kr1.n(this.n, nm1Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
    }
}
