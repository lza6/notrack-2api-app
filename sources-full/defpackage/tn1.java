package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tn1 {
    public final int a;
    public final Object b;

    public tn1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn1)) {
            return false;
        }
        tn1 tn1Var = (tn1) obj;
        return this.a == tn1Var.a && kr1.n(this.b, tn1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
