package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 {
    public final long a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) rx0.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) rx0.b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tx0) {
            return this.a == ((tx0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
