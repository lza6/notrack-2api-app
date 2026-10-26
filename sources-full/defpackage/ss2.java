package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss2 {
    public final dc a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ss2(dc dcVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = dcVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final h43 a(h43 h43Var) {
        return h43Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = jz3.b;
            if (jz3.b(j, j2)) {
                return j2;
            }
        }
        int i = jz3.c;
        int i2 = this.b;
        return p23.d(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final h43 c(h43 h43Var) {
        float f = -this.f;
        return h43Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return py.x(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ss2) {
            ss2 ss2Var = (ss2) obj;
            if (this.a == ss2Var.a && this.b == ss2Var.b && this.c == ss2Var.c && this.d == ss2Var.d && this.e == ss2Var.e && Float.compare(this.f, ss2Var.f) == 0 && Float.compare(this.g, ss2Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + fq2.d(this.f, fq2.e(this.e, fq2.e(this.d, fq2.e(this.c, fq2.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return fq2.o(sb, this.g, ')');
    }
}
