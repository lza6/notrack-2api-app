package defpackage;

import java.util.Arrays;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class t63 extends bf0 {
    public static final m51 r = new m51(28);
    public final rf4 d;
    public final float e;
    public final float f;
    public final c54 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final nx0 k;
    public final s63 l;
    public final p63 m;
    public final nx0 n;
    public final s63 o;
    public final p63 p;
    public final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public t63(String str, float[] fArr, rf4 rf4Var, final double d, float f, float f2, int i) {
        nx0 nx0Var;
        nx0 nx0Var2 = r;
        if (d == 1.0d) {
            nx0Var = nx0Var2;
        } else {
            final int i2 = 0;
            nx0Var = new nx0() { // from class: q63
                @Override // defpackage.nx0
                public final double c(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            nx0Var2 = new nx0() { // from class: q63
                @Override // defpackage.nx0
                public final double c(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        nx0 nx0Var3 = nx0Var2;
        this(str, fArr, rf4Var, null, nx0Var, nx0Var3, f, f2, new c54(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    public t63(String str, float[] fArr, rf4 rf4Var, final c54 c54Var, int i) {
        double d;
        nx0 nx0Var;
        nx0 nx0Var2;
        double d2 = c54Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = c54Var.g;
        double d4 = c54Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            nx0Var = new nx0() { // from class: r63
                @Override // defpackage.nx0
                public final double c(double d5) {
                    int i5 = i4;
                    c54 c54Var2 = c54Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = ef0.a;
                            return ef0.a(c54Var2, d5);
                        case 1:
                            float[] fArr3 = ef0.a;
                            return ef0.c(c54Var2, d5);
                        case 2:
                            double d6 = c54Var2.b;
                            return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                        case 3:
                            double d7 = c54Var2.b;
                            double d8 = c54Var2.c;
                            double d9 = c54Var2.d;
                            return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                        case 4:
                            float[] fArr4 = ef0.a;
                            return ef0.b(c54Var2, d5);
                        case 5:
                            float[] fArr5 = ef0.a;
                            return ef0.d(c54Var2, d5);
                        case 6:
                            double d10 = c54Var2.b;
                            double d11 = c54Var2.c;
                            double d12 = c54Var2.d;
                            return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c54Var2.b;
                            double d14 = c54Var2.c;
                            double d15 = c54Var2.d;
                            return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                nx0Var = new nx0() { // from class: r63
                    @Override // defpackage.nx0
                    public final double c(double d5) {
                        int i6 = i5;
                        c54 c54Var2 = c54Var;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = ef0.a;
                                return ef0.a(c54Var2, d5);
                            case 1:
                                float[] fArr3 = ef0.a;
                                return ef0.c(c54Var2, d5);
                            case 2:
                                double d6 = c54Var2.b;
                                return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                            case 3:
                                double d7 = c54Var2.b;
                                double d8 = c54Var2.c;
                                double d9 = c54Var2.d;
                                return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                            case 4:
                                float[] fArr4 = ef0.a;
                                return ef0.b(c54Var2, d5);
                            case 5:
                                float[] fArr5 = ef0.a;
                                return ef0.d(c54Var2, d5);
                            case 6:
                                double d10 = c54Var2.b;
                                double d11 = c54Var2.c;
                                double d12 = c54Var2.d;
                                return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c54Var2.b;
                                double d14 = c54Var2.c;
                                double d15 = c54Var2.d;
                                return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                nx0Var = new nx0() { // from class: r63
                    @Override // defpackage.nx0
                    public final double c(double d5) {
                        int i7 = i6;
                        c54 c54Var2 = c54Var;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = ef0.a;
                                return ef0.a(c54Var2, d5);
                            case 1:
                                float[] fArr3 = ef0.a;
                                return ef0.c(c54Var2, d5);
                            case 2:
                                double d6 = c54Var2.b;
                                return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                            case 3:
                                double d7 = c54Var2.b;
                                double d8 = c54Var2.c;
                                double d9 = c54Var2.d;
                                return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                            case 4:
                                float[] fArr4 = ef0.a;
                                return ef0.b(c54Var2, d5);
                            case 5:
                                float[] fArr5 = ef0.a;
                                return ef0.d(c54Var2, d5);
                            case 6:
                                double d10 = c54Var2.b;
                                double d11 = c54Var2.c;
                                double d12 = c54Var2.d;
                                return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c54Var2.b;
                                double d14 = c54Var2.c;
                                double d15 = c54Var2.d;
                                return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                nx0Var = new nx0() { // from class: r63
                    @Override // defpackage.nx0
                    public final double c(double d5) {
                        int i8 = i7;
                        c54 c54Var2 = c54Var;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = ef0.a;
                                return ef0.a(c54Var2, d5);
                            case 1:
                                float[] fArr3 = ef0.a;
                                return ef0.c(c54Var2, d5);
                            case 2:
                                double d6 = c54Var2.b;
                                return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                            case 3:
                                double d7 = c54Var2.b;
                                double d8 = c54Var2.c;
                                double d9 = c54Var2.d;
                                return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                            case 4:
                                float[] fArr4 = ef0.a;
                                return ef0.b(c54Var2, d5);
                            case 5:
                                float[] fArr5 = ef0.a;
                                return ef0.d(c54Var2, d5);
                            case 6:
                                double d10 = c54Var2.b;
                                double d11 = c54Var2.c;
                                double d12 = c54Var2.d;
                                return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c54Var2.b;
                                double d14 = c54Var2.c;
                                double d15 = c54Var2.d;
                                return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            nx0Var2 = new nx0() { // from class: r63
                @Override // defpackage.nx0
                public final double c(double d5) {
                    int i8 = i2;
                    c54 c54Var2 = c54Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = ef0.a;
                            return ef0.a(c54Var2, d5);
                        case 1:
                            float[] fArr3 = ef0.a;
                            return ef0.c(c54Var2, d5);
                        case 2:
                            double d6 = c54Var2.b;
                            return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                        case 3:
                            double d7 = c54Var2.b;
                            double d8 = c54Var2.c;
                            double d9 = c54Var2.d;
                            return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                        case 4:
                            float[] fArr4 = ef0.a;
                            return ef0.b(c54Var2, d5);
                        case 5:
                            float[] fArr5 = ef0.a;
                            return ef0.d(c54Var2, d5);
                        case 6:
                            double d10 = c54Var2.b;
                            double d11 = c54Var2.c;
                            double d12 = c54Var2.d;
                            return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c54Var2.b;
                            double d14 = c54Var2.c;
                            double d15 = c54Var2.d;
                            return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            nx0Var2 = new nx0() { // from class: r63
                @Override // defpackage.nx0
                public final double c(double d5) {
                    int i8 = i3;
                    c54 c54Var2 = c54Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = ef0.a;
                            return ef0.a(c54Var2, d5);
                        case 1:
                            float[] fArr3 = ef0.a;
                            return ef0.c(c54Var2, d5);
                        case 2:
                            double d6 = c54Var2.b;
                            return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                        case 3:
                            double d7 = c54Var2.b;
                            double d8 = c54Var2.c;
                            double d9 = c54Var2.d;
                            return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                        case 4:
                            float[] fArr4 = ef0.a;
                            return ef0.b(c54Var2, d5);
                        case 5:
                            float[] fArr5 = ef0.a;
                            return ef0.d(c54Var2, d5);
                        case 6:
                            double d10 = c54Var2.b;
                            double d11 = c54Var2.c;
                            double d12 = c54Var2.d;
                            return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c54Var2.b;
                            double d14 = c54Var2.c;
                            double d15 = c54Var2.d;
                            return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            nx0Var2 = new nx0() { // from class: r63
                @Override // defpackage.nx0
                public final double c(double d5) {
                    int i9 = i8;
                    c54 c54Var2 = c54Var;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = ef0.a;
                            return ef0.a(c54Var2, d5);
                        case 1:
                            float[] fArr3 = ef0.a;
                            return ef0.c(c54Var2, d5);
                        case 2:
                            double d6 = c54Var2.b;
                            return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                        case 3:
                            double d7 = c54Var2.b;
                            double d8 = c54Var2.c;
                            double d9 = c54Var2.d;
                            return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                        case 4:
                            float[] fArr4 = ef0.a;
                            return ef0.b(c54Var2, d5);
                        case 5:
                            float[] fArr5 = ef0.a;
                            return ef0.d(c54Var2, d5);
                        case 6:
                            double d10 = c54Var2.b;
                            double d11 = c54Var2.c;
                            double d12 = c54Var2.d;
                            return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c54Var2.b;
                            double d14 = c54Var2.c;
                            double d15 = c54Var2.d;
                            return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            nx0Var2 = new nx0() { // from class: r63
                @Override // defpackage.nx0
                public final double c(double d5) {
                    int i10 = i9;
                    c54 c54Var2 = c54Var;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = ef0.a;
                            return ef0.a(c54Var2, d5);
                        case 1:
                            float[] fArr3 = ef0.a;
                            return ef0.c(c54Var2, d5);
                        case 2:
                            double d6 = c54Var2.b;
                            return d5 >= c54Var2.e ? Math.pow((d6 * d5) + c54Var2.c, c54Var2.a) : c54Var2.d * d5;
                        case 3:
                            double d7 = c54Var2.b;
                            double d8 = c54Var2.c;
                            double d9 = c54Var2.d;
                            return d5 >= c54Var2.e ? Math.pow((d7 * d5) + d8, c54Var2.a) + c54Var2.f : (d9 * d5) + c54Var2.g;
                        case 4:
                            float[] fArr4 = ef0.a;
                            return ef0.b(c54Var2, d5);
                        case 5:
                            float[] fArr5 = ef0.a;
                            return ef0.d(c54Var2, d5);
                        case 6:
                            double d10 = c54Var2.b;
                            double d11 = c54Var2.c;
                            double d12 = c54Var2.d;
                            return d5 >= c54Var2.e * d12 ? (Math.pow(d5, 1.0d / c54Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c54Var2.b;
                            double d14 = c54Var2.c;
                            double d15 = c54Var2.d;
                            return d5 >= c54Var2.e * d15 ? (Math.pow(d5 - c54Var2.f, 1.0d / c54Var2.a) - d14) / d13 : (d5 - c54Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, rf4Var, null, nx0Var, nx0Var2, 0.0f, 1.0f, c54Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8 A[SYNTHETIC] */
    public t63(String str, float[] fArr, rf4 rf4Var, float[] fArr2, nx0 nx0Var, nx0 nx0Var2, float f, float f2, c54 c54Var, int i) {
        boolean z;
        float f3;
        boolean z2;
        t63 t63Var;
        double d;
        super(str, 12884901888L, i);
        this.d = rf4Var;
        this.e = f;
        this.f = f2;
        this.g = c54Var;
        this.k = nx0Var;
        int i2 = 1;
        this.l = new s63(this, i2);
        int i3 = 0;
        this.m = new p63(this, i3);
        this.n = nx0Var2;
        this.o = new s63(this, i3);
        this.p = new p63(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            u41.k("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = f4 + f5 + fArr[2];
            fArr3[0] = f4 / f6;
            fArr3[1] = f5 / f6;
            float f7 = fArr[3];
            float f8 = fArr[4];
            float f9 = f7 + f8 + fArr[5];
            fArr3[2] = f7 / f9;
            fArr3[3] = f8 / f9;
            float f10 = fArr[6];
            float f11 = fArr[7];
            float f12 = f10 + f11 + fArr[8];
            fArr3[4] = f10 / f12;
            fArr3[5] = f11 / f12;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            float f15 = fArr3[2];
            float f16 = fArr3[3];
            float f17 = fArr3[4];
            float f18 = fArr3[5];
            f3 = 1.0f;
            float f19 = rf4Var.a;
            z = true;
            float f20 = rf4Var.b;
            float f21 = 1.0f - f13;
            float f22 = f21 / f14;
            float f23 = 1.0f - f15;
            float f24 = 1.0f - f17;
            float f25 = (1.0f - f19) / f20;
            float f26 = f13 / f14;
            float f27 = (f15 / f16) - f26;
            float f28 = (f19 / f20) - f26;
            float f29 = (f23 / f16) - f22;
            float f30 = (f17 / f18) - f26;
            float f31 = (((f25 - f22) * f27) - (f28 * f29)) / ((((f24 / f18) - f22) * f27) - (f29 * f30));
            float f32 = (f28 - (f30 * f31)) / f27;
            float f33 = (1.0f - f32) - f31;
            float f34 = f33 / f14;
            float f35 = f32 / f16;
            float f36 = f31 / f18;
            this.i = new float[]{f13 * f34, f33, (f21 - f14) * f34, f15 * f35, f32, (f23 - f16) * f35, f17 * f36, f31, (f24 - f18) * f36};
        } else {
            z = true;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                m51.g(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
        }
        this.j = p23.G(this.i);
        Headers$Companion.access$isWideGamut(fArr3, f, f2);
        if (i != 0) {
            float[] fArr4 = ef0.a;
            if (fArr3 != fArr4) {
                int i4 = 0;
                while (true) {
                    if (i4 < 6) {
                        if (Float.compare(fArr3[i4], fArr4[i4]) == 0 || Math.abs(fArr3[i4] - fArr4[i4]) <= 0.001f) {
                            i4++;
                        }
                    } else if (p23.q(rf4Var, yh4.m)) {
                        t63Var = ef0.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z2 = z;
                            } else if (Math.abs(nx0Var.c(d) - t63Var.k.c(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (p23.q(rf4Var, yh4.m) && f == 0.0f && f2 == f3) {
                t63Var = ef0.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z2 = z;
                    } else if (Math.abs(nx0Var.c(d) - t63Var.k.c(d)) > 0.001d && Math.abs(nx0Var2.c(d) - t63Var.n.c(d)) <= 0.001d) {
                        d += 0.00392156862745098d;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = z;
        }
        this.q = z2;
    }

    @Override // defpackage.bf0
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.bf0
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.bf0
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.bf0
    public final long d(float f, float f2, float f3) {
        double d = f;
        p63 p63Var = this.p;
        float fC = (float) p63Var.c(d);
        float fC2 = (float) p63Var.c(f2);
        float fC3 = (float) p63Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fC3) + ((fArr[3] * fC2) + (fArr[0] * fC)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))));
    }

    @Override // defpackage.bf0
    public final float e(float f, float f2, float f3) {
        double d = f;
        p63 p63Var = this.p;
        float fC = (float) p63Var.c(d);
        float fC2 = (float) p63Var.c(f2);
        float fC3 = (float) p63Var.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // defpackage.bf0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t63.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        if (Float.compare(t63Var.e, this.e) != 0 || Float.compare(t63Var.f, this.f) != 0 || !kr1.n(this.d, t63Var.d) || !Arrays.equals(this.h, t63Var.h)) {
            return false;
        }
        c54 c54Var = t63Var.g;
        c54 c54Var2 = this.g;
        if (c54Var2 != null) {
            return kr1.n(c54Var2, c54Var);
        }
        if (c54Var == null) {
            return true;
        }
        if (kr1.n(this.k, t63Var.k)) {
            return kr1.n(this.n, t63Var.n);
        }
        return false;
    }

    @Override // defpackage.bf0
    public final long f(float f, float f2, float f3, float f4, bf0 bf0Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        p63 p63Var = this.m;
        return gb2.a((float) p63Var.c(f5), (float) p63Var.c(f6), (float) p63Var.c(f7), f4, bf0Var);
    }

    @Override // defpackage.bf0
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        c54 c54Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (c54Var != null ? c54Var.hashCode() : 0);
        if (c54Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }
}
