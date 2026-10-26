package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm implements sm {
    public final ms2 a;
    public final s41 b;

    public pm(ms2 ms2Var, s41 s41Var) {
        this.a = ms2Var;
        this.b = s41Var;
    }

    @Override // defpackage.sm
    public final ms2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return kr1.n(this.a, pmVar.a) && this.b.equals(pmVar.b);
    }

    public final int hashCode() {
        ms2 ms2Var = this.a;
        return this.b.hashCode() + ((ms2Var == null ? 0 : ms2Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
