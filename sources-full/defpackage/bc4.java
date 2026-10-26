package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc4 {
    public final cg a;
    public final b11 b;

    public bc4(cg cgVar, b11 b11Var) {
        this.a = cgVar;
        this.b = b11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc4)) {
            return false;
        }
        bc4 bc4Var = (bc4) obj;
        return kr1.n(this.a, bc4Var.a) && kr1.n(this.b, bc4Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
