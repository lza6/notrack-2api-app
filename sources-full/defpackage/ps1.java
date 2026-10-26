package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ps1 {
    public final Integer a;
    public final Object b;

    public ps1(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps1)) {
            return false;
        }
        ps1 ps1Var = (ps1) obj;
        return this.a.equals(ps1Var.a) && kr1.n(this.b, ps1Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
