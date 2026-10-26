package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class jq2 {
    public final Context a;
    public final ai3 b;
    public final ma3 c;
    public final wx2 d;
    public final String e;
    public final a71 f;
    public final tz g;
    public final tz h;
    public final tz i;
    public final g61 j;

    public jq2(Context context, ai3 ai3Var, ma3 ma3Var, wx2 wx2Var, String str, a71 a71Var, tz tzVar, tz tzVar2, tz tzVar3, g61 g61Var) {
        this.a = context;
        this.b = ai3Var;
        this.c = ma3Var;
        this.d = wx2Var;
        this.e = str;
        this.f = a71Var;
        this.g = tzVar;
        this.h = tzVar2;
        this.i = tzVar3;
        this.j = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2)) {
            return false;
        }
        jq2 jq2Var = (jq2) obj;
        return kr1.n(this.a, jq2Var.a) && kr1.n(this.b, jq2Var.b) && this.c == jq2Var.c && this.d == jq2Var.d && kr1.n(this.e, jq2Var.e) && kr1.n(this.f, jq2Var.f) && this.g == jq2Var.g && this.h == jq2Var.h && this.i == jq2Var.i && kr1.n(this.j, jq2Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
