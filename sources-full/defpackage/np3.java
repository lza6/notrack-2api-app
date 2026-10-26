package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class np3 implements tm1 {
    public final am1 a;
    public final pm1 b;
    public final qr0 c;
    public final cc2 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public np3(am1 am1Var, pm1 pm1Var, qr0 qr0Var, cc2 cc2Var, String str, boolean z, boolean z2) {
        this.a = am1Var;
        this.b = pm1Var;
        this.c = qr0Var;
        this.d = cc2Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.tm1
    public final pm1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np3)) {
            return false;
        }
        np3 np3Var = (np3) obj;
        return kr1.n(this.a, np3Var.a) && kr1.n(this.b, np3Var.b) && this.c == np3Var.c && kr1.n(this.d, np3Var.d) && kr1.n(this.e, np3Var.e) && this.f == np3Var.f && this.g == np3Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        cc2 cc2Var = this.d;
        int iHashCode2 = (iHashCode + (cc2Var == null ? 0 : cc2Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + ud2.k((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SuccessResult(image=" + this.a + ", request=" + this.b + ", dataSource=" + this.c + ", memoryCacheKey=" + this.d + ", diskCacheKey=" + this.e + ", isSampled=" + this.f + ", isPlaceholderCached=" + this.g + ')';
    }
}
