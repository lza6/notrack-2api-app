package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m54 implements l54 {
    public final Object a;
    public final Object b;

    public m54(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l54)) {
            return false;
        }
        m54 m54Var = (m54) ((l54) obj);
        return kr1.n(this.a, m54Var.a) && kr1.n(this.b, m54Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
