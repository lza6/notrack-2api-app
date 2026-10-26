package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey2 {
    public final String a;
    public final Long b;

    public ey2(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2)) {
            return false;
        }
        ey2 ey2Var = (ey2) obj;
        return this.a.equals(ey2Var.a) && this.b.equals(ey2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
