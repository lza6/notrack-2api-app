package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x73 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        yh4.e(0.0f, 0.0f, 0L, 0.0f, 0.0f);
    }

    public x73(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x73)) {
            return false;
        }
        x73 x73Var = (x73) obj;
        return Float.compare(this.a, x73Var.a) == 0 && Float.compare(this.b, x73Var.b) == 0 && Float.compare(this.c, x73Var.c) == 0 && Float.compare(this.d, x73Var.d) == 0 && g13.z(this.e, x73Var.e) && g13.z(this.f, x73Var.f) && g13.z(this.g, x73Var.g) && g13.z(this.h, x73Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ud2.h(ud2.h(ud2.h(fq2.d(this.d, fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = yo4.Y(this.a) + ", " + yo4.Y(this.b) + ", " + yo4.Y(this.c) + ", " + yo4.Y(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean z = g13.z(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!z || !g13.z(j2, j3) || !g13.z(j3, j4)) {
            StringBuilder sbS = fq2.s("RoundRect(rect=", str, ", topLeft=");
            sbS.append((Object) g13.Q(j));
            sbS.append(", topRight=");
            sbS.append((Object) g13.Q(j2));
            sbS.append(", bottomRight=");
            sbS.append((Object) g13.Q(j3));
            sbS.append(", bottomLeft=");
            sbS.append((Object) g13.Q(j4));
            sbS.append(')');
            return sbS.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbS2 = fq2.s("RoundRect(rect=", str, ", radius=");
            sbS2.append(yo4.Y(Float.intBitsToFloat(i)));
            sbS2.append(')');
            return sbS2.toString();
        }
        StringBuilder sbS3 = fq2.s("RoundRect(rect=", str, ", x=");
        sbS3.append(yo4.Y(Float.intBitsToFloat(i)));
        sbS3.append(", y=");
        sbS3.append(yo4.Y(Float.intBitsToFloat(i2)));
        sbS3.append(')');
        return sbS3.toString();
    }
}
