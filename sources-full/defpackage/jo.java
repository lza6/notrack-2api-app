package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends jd0 {
    public final go a;

    public jo(go goVar) {
        this.a = goVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jd0)) {
            return false;
        }
        jd0 jd0Var = (jd0) obj;
        Object obj2 = id0.c;
        if (obj2.equals(obj2)) {
            return this.a.equals(((jo) jd0Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((id0.c.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + id0.c + ", androidClientInfo=" + this.a + "}";
    }
}
