package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq0 extends py {
    public final z7 s;

    public rq0(z7 z7Var) {
        this.s = z7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq0) && kr1.n(this.s, ((rq0) obj).s);
    }

    public final int hashCode() {
        return Float.hashCode(((xt) this.s).a);
    }

    @Override // defpackage.py
    public final int m(int i, dx1 dx1Var) {
        return ((xt) this.s).a(0, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.s + ')';
    }
}
