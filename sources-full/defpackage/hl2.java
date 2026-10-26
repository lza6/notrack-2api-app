package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hl2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public hl2(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl2)) {
            return false;
        }
        hl2 hl2Var = (hl2) obj;
        return this.a == hl2Var.a && this.b == hl2Var.b && this.c == hl2Var.c && this.d == hl2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ud2.k(ud2.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
