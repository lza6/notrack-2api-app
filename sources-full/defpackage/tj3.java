package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj3 {
    public static final long b = rj3.a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ tj3(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        u41.r("SliderRange is unspecified");
        return 0.0f;
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        u41.r("SliderRange is unspecified");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tj3) {
            return this.a == ((tj3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        float f = rj3.b;
        long j = b;
        long j2 = this.a;
        if (j2 == j) {
            return "FloatRange.Unspecified";
        }
        return b(j2) + ".." + a(j2);
    }
}
