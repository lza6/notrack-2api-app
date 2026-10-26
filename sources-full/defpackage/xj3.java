package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj3 {
    public final long a;
    public final long b;
    public final re0 c;

    public xj3(long j, long j2, re0 re0Var) {
        this.a = j;
        this.b = j2;
        this.c = re0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj3)) {
            return false;
        }
        xj3 xj3Var = (xj3) obj;
        return re0.c(this.a, xj3Var.a) && re0.c(this.b, xj3Var.b) && kr1.n(this.c, xj3Var.c);
    }

    public final int hashCode() {
        int i = re0.j;
        int iH = ud2.h(Long.hashCode(this.a) * 31, 31, this.b);
        re0 re0Var = this.c;
        return iH + (re0Var == null ? 0 : Long.hashCode(re0Var.a));
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("SlotSkin(accent=", re0.i(this.a), ", bg=", re0.i(this.b), ", fg=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
