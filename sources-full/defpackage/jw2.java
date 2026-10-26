package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 {
    public final hw2 a;
    public final fw2 b;

    public jw2(hw2 hw2Var, fw2 fw2Var) {
        this.a = hw2Var;
        this.b = fw2Var;
    }

    public jw2(boolean z) {
        this(null, new fw2(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw2)) {
            return false;
        }
        jw2 jw2Var = (jw2) obj;
        return kr1.n(this.b, jw2Var.b) && kr1.n(this.a, jw2Var.a);
    }

    public final int hashCode() {
        hw2 hw2Var = this.a;
        int iHashCode = (hw2Var != null ? hw2Var.hashCode() : 0) * 31;
        fw2 fw2Var = this.b;
        return iHashCode + (fw2Var != null ? fw2Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
