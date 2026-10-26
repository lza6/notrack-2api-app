package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de3 {
    public final ah1 a;
    public final long b;
    public final ce3 c;
    public final boolean d;

    public de3(ah1 ah1Var, long j, ce3 ce3Var, boolean z) {
        this.a = ah1Var;
        this.b = j;
        this.c = ce3Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de3)) {
            return false;
        }
        de3 de3Var = (de3) obj;
        return this.a == de3Var.a && ln2.c(this.b, de3Var.b) && this.c == de3Var.c && this.d == de3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ud2.h(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) ln2.k(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
