package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz3 {
    public final long a;

    public /* synthetic */ zz3(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (a(j, 0L)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        return a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zz3) {
            return this.a == ((zz3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
