package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi3 {
    public final long a;

    public /* synthetic */ bi3(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        long j2 = (~((((-9223372034707292160L) & j) >>> 31) * (-1))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public static String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + yo4.Y(Float.intBitsToFloat((int) (j >> 32))) + ", " + yo4.Y(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi3) {
            return this.a == ((bi3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
