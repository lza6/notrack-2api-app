package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu0) && this.a == ((vu0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fq2.p(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
