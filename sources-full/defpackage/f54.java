package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f54 {
    public final hg a;
    public final nn2 b;

    public f54(hg hgVar, nn2 nn2Var) {
        this.a = hgVar;
        this.b = nn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f54)) {
            return false;
        }
        f54 f54Var = (f54) obj;
        return kr1.n(this.a, f54Var.a) && this.b.equals(f54Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
