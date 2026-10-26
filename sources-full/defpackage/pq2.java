package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq2 extends rq2 {
    public final h43 a;

    public pq2(h43 h43Var) {
        this.a = h43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pq2) {
            return this.a.equals(((pq2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
