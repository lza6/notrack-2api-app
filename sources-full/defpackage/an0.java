package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an0 extends bn0 {
    public final int a;

    public an0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an0) && this.a == ((an0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fq2.p(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
