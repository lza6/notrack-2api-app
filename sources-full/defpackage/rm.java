package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rm implements sm {
    public final ms2 a;
    public final np3 b;

    public rm(ms2 ms2Var, np3 np3Var) {
        this.a = ms2Var;
        this.b = np3Var;
    }

    @Override // defpackage.sm
    public final ms2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm)) {
            return false;
        }
        rm rmVar = (rm) obj;
        return this.a.equals(rmVar.a) && this.b.equals(rmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
