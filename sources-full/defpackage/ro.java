package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ro extends rk2 {
    public final qk2 a;
    public final pk2 b;

    public ro(qk2 qk2Var, pk2 pk2Var) {
        this.a = qk2Var;
        this.b = pk2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rk2) {
            rk2 rk2Var = (rk2) obj;
            qk2 qk2Var = this.a;
            if (qk2Var != null ? qk2Var.equals(((ro) rk2Var).a) : ((ro) rk2Var).a == null) {
                pk2 pk2Var = this.b;
                if (pk2Var != null ? pk2Var.equals(((ro) rk2Var).b) : ((ro) rk2Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        qk2 qk2Var = this.a;
        int iHashCode = ((qk2Var == null ? 0 : qk2Var.hashCode()) ^ 1000003) * 1000003;
        pk2 pk2Var = this.b;
        return iHashCode ^ (pk2Var != null ? pk2Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
