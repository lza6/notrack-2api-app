package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx0 implements Comparable {
    public final float c;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.c, ((rx0) obj).c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rx0) {
            return Float.compare(this.c, ((rx0) obj).c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return b(this.c);
    }
}
