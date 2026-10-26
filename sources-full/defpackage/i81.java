package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class i81 implements c81 {
    public final float a;
    public final sm3 b;

    public i81(float f, float f2, float f3) {
        this.a = f3;
        sm3 sm3Var = new sm3();
        sm3Var.a = 1.0f;
        sm3Var.b = Math.sqrt(50.0d);
        sm3Var.c = 1.0f;
        if (f < 0.0f) {
            ay2.a("Damping ratio must be non-negative");
        }
        sm3Var.c = f;
        double d = sm3Var.b;
        if (((float) (d * d)) <= 0.0f) {
            ay2.a("Spring stiffness constant must be positive.");
        }
        sm3Var.b = Math.sqrt(f2);
        this.b = sm3Var;
    }

    @Override // defpackage.c81
    public final float b(long j, float f, float f2, float f3) {
        sm3 sm3Var = this.b;
        sm3Var.a = f2;
        return Float.intBitsToFloat((int) (sm3Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.c81
    public final float c(long j, float f, float f2, float f3) {
        sm3 sm3Var = this.b;
        sm3Var.a = f2;
        return Float.intBitsToFloat((int) (sm3Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.c81
    public final long d(float f, float f2, float f3) {
        double dLog;
        long j;
        sm3 sm3Var = this.b;
        double d = sm3Var.b;
        float f4 = (float) (d * d);
        float f5 = sm3Var.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d2 = f4;
            double d3 = f5;
            double d4 = f8;
            double d5 = f7;
            double dSqrt = Math.sqrt(d2) * d3 * 2.0d;
            double d6 = (dSqrt * dSqrt) - (d2 * 4.0d);
            double dSqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
            double d7 = -dSqrt;
            double d8 = (d7 + dSqrt2) * 0.5d;
            double dSqrt3 = (d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d) * 0.5d;
            double d9 = (d7 - dSqrt2) * 0.5d;
            if (d5 == 0.0d && d4 == 0.0d) {
                j = 0;
            } else {
                if (d5 < 0.0d) {
                    d4 = -d4;
                }
                double dAbs = Math.abs(d5);
                double d10 = 1.0d;
                double d11 = -1.0d;
                double dAbs2 = Double.MAX_VALUE;
                if (d3 > 1.0d) {
                    double d12 = (d8 * dAbs) - d4;
                    double d13 = d8 - d9;
                    double d14 = d12 / d13;
                    double d15 = dAbs - d14;
                    dLog = Math.log(Math.abs(1.0d / d15)) / d8;
                    double dLog2 = Math.log(Math.abs(1.0d / d14)) / d9;
                    if ((Double.doubleToRawLongBits(dLog) & LongCompanionObject.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d16 = d15 * d8;
                    double dLog3 = Math.log(d16 / ((-d14) * d9)) / (d9 - d8);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d10 = -1.0d;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d9) * d14) + (Math.exp(d8 * dLog3) * d15))) < 1.0d) {
                                dLog = (d14 <= 0.0d || d15 >= 0.0d) ? dLog : 0.0d;
                                d10 = -1.0d;
                            }
                        }
                        dLog = Math.log((-((d14 * d9) * d9)) / (d16 * d8)) / d13;
                    }
                    double d17 = d14 * d9;
                    if (Math.abs((Math.exp(d9 * dLog) * d17) + (Math.exp(d8 * dLog) * d16)) >= 1.0E-4d) {
                        int i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            i++;
                            double d18 = d8 * dLog;
                            double d19 = d9 * dLog;
                            double dExp = dLog - ((((Math.exp(d19) * d14) + (Math.exp(d18) * d15)) + d10) / ((Math.exp(d19) * d17) + (Math.exp(d18) * d16)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d3 < 1.0d) {
                    double d20 = (d4 - (d8 * dAbs)) / dSqrt3;
                    dLog = Math.log(1.0d / Math.sqrt((d20 * d20) + (dAbs * dAbs))) / d8;
                } else {
                    double d21 = d8 * dAbs;
                    double d22 = d4 - d21;
                    double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d8;
                    double dLog5 = Math.log(Math.abs(1.0d / d22));
                    double dLog6 = dLog5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d8));
                    }
                    double d23 = dLog6 / d8;
                    if ((Double.doubleToRawLongBits(dLog4) & LongCompanionObject.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d23;
                    } else if ((Double.doubleToRawLongBits(d23) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d23);
                    }
                    double d24 = (-(d21 + d22)) / (d8 * d22);
                    double d25 = d8 * d24;
                    double dExp2 = (Math.exp(d25) * d22 * d24) + (Math.exp(d25) * dAbs);
                    if (!Double.isNaN(d24) && d24 > 0.0d) {
                        if (d24 <= 0.0d || (-dExp2) >= 1.0d) {
                            dLog4 = (-(2.0d / d8)) - (dAbs / d22);
                            d11 = 1.0d;
                        } else {
                            dLog4 = (d22 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                        }
                    }
                    dLog = dLog4;
                    int i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double d26 = d8 * dLog;
                        double dExp3 = dLog - (((Math.exp(d26) * ((d22 * dLog) + dAbs)) + d11) / (Math.exp(d26) * (((d26 + 1.0d) * d22) + d21)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // defpackage.c81
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}
