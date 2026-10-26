package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz3 {
    public final String a;
    public String b;
    public boolean c = false;
    public vs2 d = null;

    public rz3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz3)) {
            return false;
        }
        rz3 rz3Var = (rz3) obj;
        return kr1.n(this.a, rz3Var.a) && kr1.n(this.b, rz3Var.b) && this.c == rz3Var.c && kr1.n(this.d, rz3Var.d);
    }

    public final int hashCode() {
        int iK = ud2.k(ud2.i(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        vs2 vs2Var = this.d;
        return iK + (vs2Var == null ? 0 : vs2Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
