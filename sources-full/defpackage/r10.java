package defpackage;

import app.template.extension.BuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r10 {
    public final boolean a;
    public final Map b;
    public final Map c;
    public final int d;
    public final String e;
    public final Map f;

    public r10(boolean z, Map map, Map map2, int i, String str, Map map3) {
        this.a = z;
        this.b = map;
        this.c = map2;
        this.d = i;
        this.e = str;
        this.f = map3;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? BuildConfig.VERSION_NAME : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return this.a == r10Var.a && this.b.equals(r10Var.b) && this.c.equals(r10Var.c) && this.d == r10Var.d && this.e.equals(r10Var.e) && this.f.equals(r10Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ud2.i(fq2.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "CarryConfig(enabled=" + this.a + ", limits=" + this.b + ", maxChars=" + this.c + ", minPairs=" + this.d + ", premiumPath=" + this.e + ", strings=" + this.f + ")";
    }
}
