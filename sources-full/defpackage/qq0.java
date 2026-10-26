package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends py {
    public final y7 s;

    public qq0(y7 y7Var) {
        this.s = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq0) && kr1.n(this.s, ((qq0) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // defpackage.py
    public final int m(int i, dx1 dx1Var) {
        return this.s.a(0, i, dx1Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.s + ')';
    }
}
