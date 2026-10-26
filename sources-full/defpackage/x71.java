package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x71 {
    public final float a;
    public final float b;
    public final long c;

    public x71(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x71)) {
            return false;
        }
        x71 x71Var = (x71) obj;
        return Float.compare(this.a, x71Var.a) == 0 && Float.compare(this.b, x71Var.b) == 0 && this.c == x71Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fq2.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
