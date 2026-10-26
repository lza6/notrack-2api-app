package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class cc4 implements zb4 {
    public final ch2 c;
    public final dh2 d;
    public final int h;
    public final b11 l;
    public int[] m = yb4.a;
    public float[] n;
    public cg o;
    public cg p;
    public cg q;
    public cg r;
    public float[] s;
    public float[] t;
    public jb u;

    public cc4(ch2 ch2Var, dh2 dh2Var, int i, b11 b11Var) {
        this.c = ch2Var;
        this.d = dh2Var;
        this.h = i;
        this.l = b11Var;
        float[] fArr = yb4.b;
        this.n = fArr;
        this.s = fArr;
        this.t = fArr;
        this.u = yb4.c;
    }

    public final int c(int i) {
        int i2;
        ch2 ch2Var = this.c;
        int i3 = ch2Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            m51.s(BuildConfig.VERSION_NAME);
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = ch2Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        b11 b11Var;
        float f;
        ch2 ch2Var = this.c;
        if (i >= ch2Var.b - 1) {
            f = i2;
        } else {
            int iA = ch2Var.a(i);
            int iA2 = ch2Var.a(i + 1);
            if (i2 != iA) {
                int i3 = iA2 - iA;
                bc4 bc4Var = (bc4) this.d.b(iA);
                if (bc4Var == null || (b11Var = bc4Var.b) == null) {
                    b11Var = this.l;
                }
                float f2 = i3;
                float fB = b11Var.b((i2 - iA) / f2);
                return z ? fB : ((f2 * fB) + iA) / 1000.0f;
            }
            f = iA;
        }
        return f / 1000.0f;
    }

    public final void e(cg cgVar, cg cgVar2, cg cgVar3) {
        float[] fArr;
        boolean z = this.u != yb4.c;
        cg cgVar4 = this.o;
        dh2 dh2Var = this.d;
        ch2 ch2Var = this.c;
        if (cgVar4 == null) {
            this.o = cgVar.c();
            this.p = cgVar3.c();
            int i = ch2Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ch2Var.a(i2) / 1000.0f;
            }
            this.n = fArr2;
            int i3 = ch2Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.m = iArr;
        }
        if (z) {
            if (this.u != yb4.c && kr1.n(this.q, cgVar) && kr1.n(this.r, cgVar2)) {
                return;
            }
            this.q = cgVar;
            this.r = cgVar2;
            int iB = cgVar.b() + (cgVar.b() % 2);
            this.s = new float[iB];
            this.t = new float[iB];
            int i5 = ch2Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iA = ch2Var.a(i6);
                bc4 bc4Var = (bc4) dh2Var.b(iA);
                if (iA == 0 && bc4Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = cgVar.a(i7);
                    }
                } else if (iA == this.h && bc4Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = cgVar2.a(i8);
                    }
                } else {
                    bc4Var.getClass();
                    cg cgVar5 = bc4Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = cgVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.u = new jb(this.m, this.n, fArr3);
        }
    }

    @Override // defpackage.zb4
    public final int k() {
        return 0;
    }

    @Override // defpackage.xb4
    public final cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        long j2 = j / 1000000;
        int[] iArr = yb4.a;
        long j3 = this.h;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return cgVar3;
        }
        e(cgVar, cgVar2, cgVar3);
        cg cgVar4 = this.p;
        cgVar4.getClass();
        int i = 0;
        if (this.u != yb4.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.t;
            zk[][] zkVarArr = (zk[][]) this.u.d;
            float f = zkVarArr[0][0].a;
            float f2 = zkVarArr[zkVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (zk[] zkVarArr2 : zkVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    zk zkVar = zkVarArr2[i4];
                    if (f2 <= zkVar.b) {
                        if (zkVar.p) {
                            fArr[i3] = zkVar.q;
                            fArr[i3 + 1] = zkVar.r;
                        } else {
                            zkVar.c(f2);
                            fArr[i3] = zkVar.a();
                            fArr[i3 + 1] = zkVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                cgVar4.e(fArr[i], i);
                i++;
            }
        } else {
            cg cgVarU = u((j4 - 1) * 1000000, cgVar, cgVar2, cgVar3);
            cg cgVarU2 = u(j4 * 1000000, cgVar, cgVar2, cgVar3);
            int iB = cgVarU.b();
            while (i < iB) {
                cgVar4.e((cgVarU.a(i) - cgVarU2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return cgVar4;
    }

    @Override // defpackage.zb4
    public final int t() {
        return this.h;
    }

    @Override // defpackage.xb4
    public final cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        cg cgVar4;
        cg cgVar5;
        cg cgVar6 = cgVar;
        long j2 = j / 1000000;
        int[] iArr = yb4.a;
        int i = this.h;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        dh2 dh2Var = this.d;
        bc4 bc4Var = (bc4) dh2Var.b(i2);
        if (bc4Var != null) {
            return bc4Var.a;
        }
        if (i2 >= i) {
            return cgVar2;
        }
        if (i2 <= 0) {
            return cgVar6;
        }
        e(cgVar6, cgVar2, cgVar3);
        cg cgVar7 = this.o;
        cgVar7.getClass();
        int i3 = 0;
        if (this.u != yb4.c) {
            float fD = d(c(i2), i2, false);
            float[] fArr = this.s;
            zk[][] zkVarArr = (zk[][]) this.u.d;
            int length = zkVarArr.length - 1;
            float f = zkVarArr[0][0].a;
            float f2 = zkVarArr[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    zk zkVar = zkVarArr[length][i5];
                    boolean z = zkVar.p;
                    float f4 = zkVar.r;
                    float f5 = zkVar.q;
                    if (z) {
                        float f6 = zkVar.a;
                        float f7 = zkVar.k;
                        float f8 = zkVar.c;
                        fArr[i4] = (f5 * f3) + ((zkVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = zkVar.d;
                        fArr[i4 + 1] = (f4 * f3) + ((zkVar.f - f10) * f9) + f10;
                    } else {
                        zkVar.c(f);
                        fArr[i4] = (zkVar.a() * f3) + (zkVar.n * zkVar.h) + f5;
                        fArr[i4 + 1] = (zkVar.b() * f3) + (zkVar.o * zkVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    zkVarArr = zkVarArr;
                }
            } else {
                int length3 = zkVarArr.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        zk zkVar2 = zkVarArr[i6][i8];
                        if (fD <= zkVar2.b) {
                            if (zkVar2.p) {
                                float f11 = zkVar2.a;
                                float f12 = zkVar2.k;
                                float f13 = zkVar2.c;
                                fArr[i7] = ((zkVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = zkVar2.d;
                                fArr[i7 + 1] = ((zkVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                zkVar2.c(fD);
                                fArr[i7] = (zkVar2.n * zkVar2.h) + zkVar2.q;
                                fArr[i7 + 1] = (zkVar2.o * zkVar2.i) + zkVar2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                cgVar7.e(fArr[i9], i9);
            }
        } else {
            int iC = c(i2);
            float fD2 = d(iC, i2, true);
            ch2 ch2Var = this.c;
            bc4 bc4Var2 = (bc4) dh2Var.b(ch2Var.a(iC));
            if (bc4Var2 != null && (cgVar5 = bc4Var2.a) != null) {
                cgVar6 = cgVar5;
            }
            bc4 bc4Var3 = (bc4) dh2Var.b(ch2Var.a(iC + 1));
            if (bc4Var3 == null || (cgVar4 = bc4Var3.a) == null) {
                cgVar4 = cgVar2;
            }
            int iB = cgVar7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                cgVar7.e((cgVar4.a(i10) * fD2) + ((1.0f - fD2) * cgVar6.a(i10)), i10);
            }
        }
        return cgVar7;
    }
}
