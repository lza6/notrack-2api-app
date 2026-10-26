package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class j43 {
    public final gj a;
    public final o04 b;
    public final vh2 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public k4 g;
    public long h;
    public final i43 i;
    public final ei2 j;

    public j43() {
        gj gjVar = new gj(8, (byte) 0);
        gjVar.c = new long[192];
        gjVar.d = new long[192];
        this.a = gjVar;
        this.b = new o04();
        this.c = new vh2();
        this.h = -1L;
        this.i = new i43(0, this);
        this.j = new ei2();
    }

    public static long g(ux1 ux1Var) {
        float[] fArrMo81x1f96a075;
        int iC;
        yd ydVar = ux1Var.N;
        wl2 wl2Var = (wl2) ydVar.d;
        wl2 wl2Var2 = (xo1) ydVar.c;
        long jI = 0;
        while (wl2Var2 != null && wl2Var2 != wl2Var) {
            wr2 wr2Var = wl2Var2.N;
            jI = g13.I(jI, wl2Var2.E);
            wl2Var2 = wl2Var2.v;
            if (wr2Var != null && (iC = jr1.c((fArrMo81x1f96a075 = wr2Var.mo81x1f96a075()))) != 3) {
                if ((iC & 2) == 0) {
                    return 9223372034707292159L;
                }
                jI = ob2.b(jI, fArrMo81x1f96a075);
            }
        }
        return g13.M(jI);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e1 A[EDGE_INSN: B:100:0x00e1->B:53:0x00e1 BREAK  A[LOOP:3: B:36:0x009d->B:50:0x00d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3 A[LOOP:3: B:36:0x009d->B:50:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0171 A[LOOP:6: B:74:0x0141->B:88:0x0171, LOOP_END] */
    public final void a() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int length;
        int i;
        long j4;
        int i2;
        int i3;
        long[] jArr2;
        long[] jArr3;
        int i4;
        int i5;
        int i6;
        Handler handler = l4.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.d;
        boolean z2 = z || this.e;
        gj gjVar = this.a;
        o04 o04Var = this.b;
        if (z) {
            this.d = false;
            vh2 vh2Var = this.c;
            Object[] objArr = vh2Var.a;
            int i7 = vh2Var.b;
            for (int i8 = 0; i8 < i7; i8++) {
                ((je1) objArr[i8]).invoke();
            }
            long[] jArr4 = (long[]) gjVar.c;
            int i9 = gjVar.b;
            for (int i10 = 0; i10 < jArr4.length - 2 && i10 < i9; i10 += 3) {
                long j5 = jArr4[i10 + 2];
                if ((((int) (j5 >> 61)) & 1) != 0) {
                    long j6 = jArr4[i10];
                    long j7 = jArr4[i10 + 1];
                    if (o04Var.a.b(((int) j5) & 67108863) != null) {
                        m51.t();
                        return;
                    }
                }
            }
            long[] jArr5 = (long[]) gjVar.c;
            int i11 = gjVar.b;
            for (int i12 = 0; i12 < jArr5.length - 2 && i12 < i11; i12 += 3) {
                int i13 = i12 + 2;
                jArr5[i13] = jArr5[i13] & (-2305843009213693953L);
            }
        }
        if (this.e) {
            this.e = false;
            dh2 dh2Var = o04Var.a;
            c = 7;
            Object[] objArr2 = dh2Var.c;
            long[] jArr6 = dh2Var.a;
            j = 128;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                j2 = 255;
                while (true) {
                    long j8 = jArr6[i14];
                    j3 = -9187201950435737472L;
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length2) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j8 & 255) < 128 && objArr2[(i14 << 3) + i16] != null) {
                                m51.t();
                                return;
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length2) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
            if (z2) {
                o04Var.getClass();
            }
            if (this.f) {
                this.f = false;
                jArr2 = (long[]) gjVar.c;
                int i17 = gjVar.b;
                jArr3 = (long[]) gjVar.d;
                i5 = 0;
                for (i4 = 0; i4 < jArr2.length - 2 && i5 < jArr3.length - 2 && i4 < i17; i4 += 3) {
                    i6 = i4 + 2;
                    if (jArr2[i6] != 2305843009213693951L) {
                        jArr3[i5] = jArr2[i4];
                        jArr3[i5 + 1] = jArr2[i4 + 1];
                        jArr3[i5 + 2] = jArr2[i6];
                        i5 += 3;
                    }
                }
                gjVar.b = i5;
                gjVar.c = jArr3;
                gjVar.d = jArr2;
            }
            if (o04Var.b > jCurrentTimeMillis) {
                return;
            }
            dh2 dh2Var2 = o04Var.a;
            Object[] objArr3 = dh2Var2.c;
            jArr = dh2Var2.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                while (true) {
                    j4 = jArr[i];
                    if ((((~j4) << c) & j4 & j3) != j3) {
                        i2 = 8 - ((~(i - length)) >>> 31);
                        for (i3 = 0; i3 < i2; i3++) {
                            if ((j4 & j2) >= j && objArr3[(i << 3) + i3] != null) {
                                m51.t();
                                return;
                            }
                            j4 >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
            o04Var.b = -1L;
        }
        c = 7;
        j = 128;
        j2 = 255;
        j3 = -9187201950435737472L;
        if (z2) {
            o04Var.getClass();
        }
        if (this.f) {
            this.f = false;
            jArr2 = (long[]) gjVar.c;
            int i18 = gjVar.b;
            jArr3 = (long[]) gjVar.d;
            i5 = 0;
            while (i4 < jArr2.length - 2) {
                i6 = i4 + 2;
                if (jArr2[i6] != 2305843009213693951L) {
                    jArr3[i5] = jArr2[i4];
                    jArr3[i5 + 1] = jArr2[i4 + 1];
                    jArr3[i5 + 2] = jArr2[i6];
                    i5 += 3;
                }
            }
            gjVar.b = i5;
            gjVar.c = jArr3;
            gjVar.d = jArr2;
        }
        if (o04Var.b > jCurrentTimeMillis) {
            return;
        }
        dh2 dh2Var3 = o04Var.a;
        Object[] objArr4 = dh2Var3.c;
        jArr = dh2Var3.a;
        length = jArr.length - 2;
        if (length >= 0) {
            i = 0;
            while (true) {
                j4 = jArr[i];
                if ((((~j4) << c) & j4 & j3) != j3) {
                    i2 = 8 - ((~(i - length)) >>> 31);
                    while (i3 < i2) {
                        if ((j4 & j2) >= j) {
                        }
                        j4 >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        o04Var.b = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e7  */
    public final void b(ux1 ux1Var, long j, boolean z) {
        boolean z2;
        ux1 ux1VarT;
        int i;
        wl2 wl2Var = (wl2) ux1Var.N.d;
        ub2 ub2Var = ux1Var.O.p;
        int i2 = (int) (j >> 32);
        float f = i2;
        long j2 = 4294967295L;
        int i3 = (int) (j & 4294967295L);
        float fE0 = i2 + ub2Var.e0();
        float fX = i3 + ub2Var.X();
        ei2 ei2Var = this.j;
        ei2Var.a = f;
        ei2Var.b = i3;
        ei2Var.c = fE0;
        ei2Var.d = fX;
        while (wl2Var != null) {
            wr2 wr2Var = wl2Var.N;
            long j3 = wl2Var.E;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            ei2Var.a += fIntBitsToFloat;
            ei2Var.b += fIntBitsToFloat2;
            ei2Var.c += fIntBitsToFloat;
            ei2Var.d += fIntBitsToFloat2;
            wl2Var = wl2Var.v;
            if (wr2Var != null) {
                float[] fArrMo81x1f96a075 = wr2Var.mo81x1f96a075();
                if (!y64.F(fArrMo81x1f96a075)) {
                    ob2.c(fArrMo81x1f96a075, ei2Var);
                }
            }
        }
        int i4 = (int) ei2Var.a;
        int i5 = (int) ei2Var.b;
        int i6 = (int) ei2Var.c;
        int i7 = (int) ei2Var.d;
        int i8 = ux1Var.d;
        gj gjVar = this.a;
        if (z) {
            z2 = true;
            ux1VarT = ux1Var.t();
            if (ux1VarT != null) {
                i = ux1VarT.d;
            } else {
                i = -1;
            }
            gj.k(gjVar, i8, i4, i5, i6, i7, i);
        } else {
            int i9 = i8 & 67108863;
            long[] jArr = (long[]) gjVar.c;
            int i10 = gjVar.b;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    z2 = true;
                    ux1VarT = ux1Var.t();
                    if (ux1VarT != null) {
                        i = ux1VarT.d;
                    } else {
                        i = -1;
                    }
                    gj.k(gjVar, i8, i4, i5, i6, i7, i);
                } else {
                    int i12 = i11 + 2;
                    long j4 = j2;
                    long j5 = jArr[i12];
                    z2 = true;
                    if ((((int) j5) & 67108863) == i9) {
                        jArr[i11] = (((long) i4) << 32) | (((long) i5) & j4);
                        jArr[i11 + 1] = (((long) i6) << 32) | (((long) i7) & j4);
                        jArr[i12] = 2305843009213693952L | j5;
                    } else {
                        i11 += 3;
                        j2 = j4;
                    }
                }
            }
        }
        this.d = z2;
    }

    public final void c(ux1 ux1Var) {
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            b(ux1Var2, ((wl2) ux1Var2.N.d).E, false);
            c(ux1Var2);
        }
    }

    public final void d(ux1 ux1Var) {
        this.d = true;
        int i = ux1Var.d & 67108863;
        gj gjVar = this.a;
        long[] jArr = (long[]) gjVar.c;
        int i2 = gjVar.b;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
        }
        k4 k4Var = this.g;
        boolean z = k4Var != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (k4Var != null) {
                Handler handler = l4.a;
                l4.a.removeCallbacks(k4Var);
            }
            Handler handler2 = l4.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
            this.h = jMax;
            k4 k4Var2 = new k4(this.i, 0);
            l4.a.postDelayed(k4Var2, jMax - jCurrentTimeMillis);
            this.g = k4Var2;
        }
    }

    public final void e(ux1 ux1Var) {
        long jG = g(ux1Var);
        if (iq1.a(jG, 9223372034707292159L)) {
            c(ux1Var);
            return;
        }
        ux1Var.m = jG;
        ux1Var.n = false;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            f(ux1Var2, ((wl2) ux1Var2.N.d).E, false);
        }
        d(ux1Var);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Code duplicated, block: B:75:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    public final void f(ux1 ux1Var, long j, boolean z) {
        char c;
        long j2;
        int i;
        long jM;
        ?? r4;
        ux1 ux1VarT;
        int i2;
        long j3;
        char c2;
        int i3;
        float[] fArrMo81x1f96a075;
        int iC;
        ub2 ub2Var = ux1Var.O.p;
        int iE0 = ub2Var.e0();
        int iX = ub2Var.X();
        ux1 ux1VarT2 = ux1Var.t();
        long j4 = ux1Var.h;
        long j5 = ux1Var.l;
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        int i6 = 0;
        if (ux1VarT2 != null) {
            c = ' ';
            boolean z2 = ux1VarT2.n;
            j2 = 4294967295L;
            long j6 = ux1VarT2.h;
            long jG = ux1VarT2.m;
            if (iq1.a(j6, 9223372034707292159L)) {
                wl2 wl2Var = (wl2) ux1Var.N.d;
                long jI = 0;
                while (true) {
                    if (wl2Var == null) {
                        i = i6;
                        jM = g13.M(jI);
                        break;
                    }
                    i = i6;
                    wr2 wr2Var = wl2Var.N;
                    jI = g13.I(jI, wl2Var.E);
                    wl2Var = wl2Var.v;
                    if (wr2Var != null && (iC = jr1.c((fArrMo81x1f96a075 = wr2Var.mo81x1f96a075()))) != 3) {
                        if ((iC & 2) == 0) {
                            jM = 9223372034707292159L;
                            break;
                        }
                        jI = ob2.b(jI, fArrMo81x1f96a075);
                    }
                    i6 = i;
                }
            } else {
                if (z2) {
                    jG = g(ux1VarT2);
                    ux1VarT2.m = jG;
                    ux1VarT2.n = false;
                }
                boolean zA = iq1.a(jG, 9223372034707292159L);
                jM = iq1.c(iq1.c(j6, jG), j);
                i = 0;
                r4 = zA;
            }
            if (r4 == 0 || iq1.a(jM, 9223372034707292159L)) {
                b(ux1Var, j, z);
            }
            ux1Var.h = jM;
            ux1Var.l = (((long) iE0) << c) | (((long) iX) & j2);
            int i7 = (int) (jM >> c);
            int i8 = (int) (jM & j2);
            int i9 = i7 + iE0;
            int i10 = i8 + iX;
            if (!z && iq1.a(jM, j4) && i4 == iE0 && i5 == iX) {
                return;
            }
            int i11 = ux1Var.d;
            gj gjVar = this.a;
            if (z) {
                ux1VarT = ux1Var.t();
                if (ux1VarT != null) {
                    i2 = ux1VarT.d;
                } else {
                    i2 = -1;
                }
                gj.k(gjVar, i11, i7, i8, i9, i10, i2);
            } else {
                int i12 = 67108863;
                int i13 = i11 & 67108863;
                long[] jArr = (long[]) gjVar.c;
                int i14 = gjVar.b;
                int i15 = i;
                while (true) {
                    if (i15 >= jArr.length - 2 || i15 >= i14) {
                        ux1VarT = ux1Var.t();
                        if (ux1VarT != null) {
                            i2 = ux1VarT.d;
                        } else {
                            i2 = -1;
                        }
                        gj.k(gjVar, i11, i7, i8, i9, i10, i2);
                    } else {
                        int i16 = i15 + 2;
                        int i17 = i12;
                        long j7 = jArr[i16];
                        if ((((int) j7) & i17) == i13) {
                            long j8 = jArr[i15];
                            jArr[i15] = (((long) i7) << c) | (((long) i8) & j2);
                            jArr[i15 + 1] = (((long) i9) << c) | (((long) i10) & j2);
                            long j9 = 2305843009213693952L;
                            jArr[i16] = j7 | 2305843009213693952L;
                            int i18 = i7 - ((int) (j8 >> c));
                            int i19 = i8 - ((int) j8);
                            if (((i18 != 0 ? 1 : i) | (i19 != 0 ? 1 : i)) != 0) {
                                long j10 = -4503599560261633L;
                                char c3 = 26;
                                long j11 = (j7 & (-4503599560261633L)) | (((long) ((i15 + 3) & i17)) << 26);
                                long[] jArr2 = (long[]) gjVar.c;
                                long[] jArr3 = (long[]) gjVar.d;
                                int i20 = gjVar.b / 3;
                                jArr3[i] = j11;
                                int i21 = 1;
                                while (i21 > 0) {
                                    i21--;
                                    long j12 = jArr3[i21];
                                    int i22 = ((int) j12) & i17;
                                    long j13 = j10;
                                    int i23 = ((int) (j12 >> c3)) & i17;
                                    char c4 = '4';
                                    int i24 = ((int) (j12 >> 52)) & 511;
                                    int i25 = i24 == 511 ? i20 : i24 + i23;
                                    if (i23 < 0) {
                                        break;
                                    }
                                    while (i23 < jArr2.length - 2 && i23 < i25) {
                                        int i26 = i23 + 2;
                                        long j14 = jArr2[i26];
                                        char c5 = c4;
                                        int i27 = i20;
                                        if ((((int) (j14 >> c3)) & i17) == i22) {
                                            long j15 = jArr2[i23];
                                            int i28 = i23 + 1;
                                            j3 = j9;
                                            long j16 = jArr2[i28];
                                            c2 = c3;
                                            i3 = i25;
                                            jArr2[i23] = (((long) (((int) j15) + i19)) & j2) | (((long) (((int) (j15 >> c)) + i18)) << c);
                                            jArr2[i28] = (((long) (((int) j16) + i19)) & j2) | (((long) (((int) (j16 >> c)) + i18)) << c);
                                            jArr2[i26] = j14 | j3;
                                            if ((((int) (j14 >> c5)) & 511) > 0) {
                                                jArr3[i21] = (j14 & j13) | (((long) ((i23 + 3) & i17)) << c2);
                                                i21++;
                                            }
                                        } else {
                                            j3 = j9;
                                            c2 = c3;
                                            i3 = i25;
                                        }
                                        i23 += 3;
                                        i20 = i27;
                                        c4 = c5;
                                        j9 = j3;
                                        c3 = c2;
                                        i25 = i3;
                                    }
                                    i20 = i20;
                                    j10 = j13;
                                    j9 = j9;
                                    c3 = c3;
                                }
                            }
                        } else {
                            i15 += 3;
                            i12 = i17;
                        }
                    }
                }
            }
            this.d = true;
            return;
        }
        c = ' ';
        j2 = 4294967295L;
        i = 0;
        jM = j;
        r4 = i;
        if (r4 == 0) {
        }
        b(ux1Var, j, z);
    }

    public final void h(ux1 ux1Var) {
        int i = ux1Var.d & 67108863;
        gj gjVar = this.a;
        long[] jArr = (long[]) gjVar.c;
        int i2 = gjVar.b;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
        }
        this.d = true;
        this.f = true;
    }
}
