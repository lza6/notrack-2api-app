package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qm implements sm {
    public final ms2 a;

    public qm(ms2 ms2Var) {
        this.a = ms2Var;
    }

    @Override // defpackage.sm
    public final ms2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm) && kr1.n(this.a, ((qm) obj).a);
    }

    public final int hashCode() {
        ms2 ms2Var = this.a;
        if (ms2Var == null) {
            return 0;
        }
        return ms2Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
