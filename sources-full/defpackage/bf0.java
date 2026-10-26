package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf0 {
    public final String a;
    public final long b;
    public final int c;

    public bf0(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            u41.k("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            u41.k("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bf0 bf0Var = (bf0) obj;
        if (this.c == bf0Var.c && this.a.equals(bf0Var.a)) {
            return g13.y(this.b, bf0Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, bf0 bf0Var);

    public int hashCode() {
        return ud2.h(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) g13.P(this.b)) + ')';
    }
}
