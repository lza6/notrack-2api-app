package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sm3 {
    public float a;
    public double b;
    public float c;

    public final long a(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.a;
        double d = j / 1000.0d;
        float f4 = this.c;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.b;
        double d4 = ((double) (-f4)) * d3;
        if (f4 <= 1.0f) {
            if (f4 == 1.0f) {
                double d5 = f3;
                double d6 = (d3 * d5) + ((double) f2);
                double d7 = (-d3) * d;
                double d8 = (d * d6) + d5;
                dSin = Math.exp(d7) * d8;
                dExp = Math.exp(d7) * d8 * (-this.b);
                dExp2 = Math.exp(d7) * d6;
            } else {
                double dSqrt = Math.sqrt(1.0d - d2) * d3;
                double d9 = f3;
                double d10 = (((-d4) * d9) + ((double) f2)) * (1.0d / dSqrt);
                double d11 = dSqrt * d;
                double d12 = d * d4;
                dSin = ((Math.sin(d11) * d10) + (Math.cos(d11) * d9)) * Math.exp(d12);
                dCos = (((Math.cos(d11) * dSqrt * d10) + (Math.sin(d11) * (-dSqrt) * d9)) * Math.exp(d12)) + (d4 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d2 - 1.0d) * d3;
        double d13 = d4 + dSqrt2;
        double d14 = d4 - dSqrt2;
        double d15 = f3;
        double d16 = ((d14 * d15) - ((double) f2)) / (d14 - d13);
        double d17 = d15 - d16;
        double d18 = d14 * d;
        double d19 = d * d13;
        dSin = (Math.exp(d19) * d16) + (Math.exp(d18) * d17);
        dExp = Math.exp(d18) * d17 * d14;
        dExp2 = Math.exp(d19) * d16 * d13;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.a))) << 32);
    }
}
