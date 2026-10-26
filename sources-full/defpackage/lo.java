package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo {
    public final sr4 a;

    public lo(sr4 sr4Var) {
        this.a = sr4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lo) || !this.a.equals(((lo) obj).a)) {
            return false;
        }
        Object obj2 = lz2.c;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ lz2.c.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + lz2.c + "}";
    }
}
