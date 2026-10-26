package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pm1 {
    public final Context a;
    public final Object b;
    public final ps3 c;
    public final String d;
    public final Map e;
    public final String f;
    public final a71 g;
    public final xp0 h;
    public final xp0 i;
    public final xp0 j;
    public final tz k;
    public final tz l;
    public final tz m;
    public final le1 n;
    public final le1 o;
    public final le1 p;
    public final gi3 q;
    public final ma3 r;
    public final wx2 s;
    public final g61 t;
    public final om1 u;
    public final nm1 v;

    public pm1(Context context, Object obj, ps3 ps3Var, String str, Map map, String str2, a71 a71Var, xp0 xp0Var, xp0 xp0Var2, xp0 xp0Var3, tz tzVar, tz tzVar2, tz tzVar3, le1 le1Var, le1 le1Var2, le1 le1Var3, gi3 gi3Var, ma3 ma3Var, wx2 wx2Var, g61 g61Var, om1 om1Var, nm1 nm1Var) {
        this.a = context;
        this.b = obj;
        this.c = ps3Var;
        this.d = str;
        this.e = map;
        this.f = str2;
        this.g = a71Var;
        this.h = xp0Var;
        this.i = xp0Var2;
        this.j = xp0Var3;
        this.k = tzVar;
        this.l = tzVar2;
        this.m = tzVar3;
        this.n = le1Var;
        this.o = le1Var2;
        this.p = le1Var3;
        this.q = gi3Var;
        this.r = ma3Var;
        this.s = wx2Var;
        this.t = g61Var;
        this.u = om1Var;
        this.v = nm1Var;
    }

    public static mm1 a(pm1 pm1Var) {
        Context context = pm1Var.a;
        pm1Var.getClass();
        return new mm1(pm1Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return kr1.n(this.a, pm1Var.a) && this.b.equals(pm1Var.b) && kr1.n(this.c, pm1Var.c) && kr1.n(this.d, pm1Var.d) && this.e.equals(pm1Var.e) && kr1.n(this.f, pm1Var.f) && kr1.n(this.g, pm1Var.g) && kr1.n(this.h, pm1Var.h) && kr1.n(this.i, pm1Var.i) && kr1.n(this.j, pm1Var.j) && this.k == pm1Var.k && this.l == pm1Var.l && this.m == pm1Var.m && kr1.n(this.n, pm1Var.n) && kr1.n(this.o, pm1Var.o) && kr1.n(this.p, pm1Var.p) && kr1.n(this.q, pm1Var.q) && this.r == pm1Var.r && this.s == pm1Var.s && this.t.equals(pm1Var.t) && this.u.equals(pm1Var.u) && kr1.n(this.v, pm1Var.v);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ps3 ps3Var = this.c;
        int iHashCode2 = (iHashCode + (ps3Var == null ? 0 : ps3Var.hashCode())) * 961;
        String str = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return this.v.hashCode() + ((this.u.hashCode() + ((this.t.a.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=" + this.d + ", memoryCacheKeyExtras=" + this.e + ", diskCacheKey=" + this.f + ", fileSystem=" + this.g + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.h + ", fetcherCoroutineContext=" + this.i + ", decoderCoroutineContext=" + this.j + ", memoryCachePolicy=" + this.k + ", diskCachePolicy=" + this.l + ", networkCachePolicy=" + this.m + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.n + ", errorFactory=" + this.o + ", fallbackFactory=" + this.p + ", sizeResolver=" + this.q + ", scale=" + this.r + ", precision=" + this.s + ", extras=" + this.t + ", defined=" + this.u + ", defaults=" + this.v + ')';
    }
}
