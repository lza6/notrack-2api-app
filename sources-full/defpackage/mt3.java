package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mt3 {
    public final hg a;
    public hg b;
    public boolean c = false;
    public rg2 d = null;

    public mt3(hg hgVar, hg hgVar2) {
        this.a = hgVar;
        this.b = hgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt3)) {
            return false;
        }
        mt3 mt3Var = (mt3) obj;
        return kr1.n(this.a, mt3Var.a) && kr1.n(this.b, mt3Var.b) && this.c == mt3Var.c && kr1.n(this.d, mt3Var.d);
    }

    public final int hashCode() {
        int iK = ud2.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        rg2 rg2Var = this.d;
        return iK + (rg2Var == null ? 0 : rg2Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
