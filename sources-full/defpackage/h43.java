package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h43 {
    public static final h43 e = new h43(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public h43(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static h43 a(h43 h43Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = h43Var.a;
        }
        float f4 = h43Var.b;
        if ((i & 4) != 0) {
            f2 = h43Var.c;
        }
        if ((i & 8) != 0) {
            f3 = h43Var.d;
        }
        return new h43(f, f4, f2, f3);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long d() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h43)) {
            return false;
        }
        h43 h43Var = (h43) obj;
        return Float.compare(this.a, h43Var.a) == 0 && Float.compare(this.b, h43Var.b) == 0 && Float.compare(this.c, h43Var.c) == 0 && Float.compare(this.d, h43Var.d) == 0;
    }

    public final h43 f(h43 h43Var) {
        return new h43(Math.max(this.a, h43Var.a), Math.max(this.b, h43Var.b), Math.min(this.c, h43Var.c), Math.min(this.d, h43Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(h43 h43Var) {
        return (this.a < h43Var.c) & (h43Var.a < this.c) & (this.b < h43Var.d) & (h43Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final h43 i(float f, float f2) {
        return new h43(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final h43 j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new h43(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + yo4.Y(this.a) + ", " + yo4.Y(this.b) + ", " + yo4.Y(this.c) + ", " + yo4.Y(this.d) + ')';
    }
}
