package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 {
    public final long a;
    public final long b;
    public final float c;

    public wb0(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final gn3 borderStroke$material3_release(boolean z, ck0 ck0Var, int i) {
        return cl3.rememberUpdatedState(gm4.a(this.c, z ? this.a : this.b), ck0Var, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return re0.c(this.a, wb0Var.a) && re0.c(this.b, wb0Var.b) && rx0.a(this.c, wb0Var.c);
    }

    public final int hashCode() {
        int i = re0.j;
        return Float.hashCode(this.c) + ud2.h(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
