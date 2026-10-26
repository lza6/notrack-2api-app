package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mh2 {
    public long[] a = qa3.a;
    public long[] b = i82.a;
    public int c;
    public int d;
    public int e;

    public mh2(int i) {
        if (i >= 0) {
            c(qa3.d(i));
        } else {
            u41.k("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, qa3.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = qa3.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = qa3.a(this.c) - this.d;
        this.b = new long[iMax];
    }

    public final void d(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.c;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j5 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j6 = i7;
            int i14 = i10;
            int i15 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iB = b(i6);
                long j9 = 255;
                if (this.e != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.c;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i19 = this.c;
                            long[] jArr4 = this.b;
                            int i20 = (i19 + 7) >> 3;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = j9;
                                long j11 = jArr3[i21] & (-9187201950435737472L);
                                jArr3[i21] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i21++;
                                j6 = j6;
                                j9 = j10;
                            }
                            j2 = j9;
                            j3 = j6;
                            char c = 7;
                            int iV0 = vl.v0(jArr3);
                            int i22 = iV0 - 1;
                            long j12 = 72057594037927935L;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iV0] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i19) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr3[i24] >> i25) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i23]) * i17;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 >>> 7;
                                    int iB2 = b(i27);
                                    int i28 = i27 & i19;
                                    long j14 = j12;
                                    if (((iB2 - i28) & i19) / 8 == ((i23 - i28) & i19) / 8) {
                                        int i29 = i15;
                                        jArr3[i24] = (((long) (i26 & 127)) << i25) | (jArr3[i24] & (~(j2 << i25)));
                                        jArr3[jArr3.length - i13] = (jArr3[i29] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        c = c;
                                        j12 = j14;
                                        i15 = i29;
                                    } else {
                                        char c2 = c;
                                        int i30 = i15;
                                        int i31 = iB2 >> 3;
                                        long j15 = jArr3[i31];
                                        int i32 = (iB2 & 7) << 3;
                                        if (((j15 >> i32) & j2) == 128) {
                                            i3 = i13;
                                            jArr3[i31] = (j15 & (~(j2 << i32))) | (((long) (i26 & 127)) << i32);
                                            jArr3[i24] = (jArr3[i24] & (~(j2 << i25))) | (128 << i25);
                                            jArr4[iB2] = jArr4[i23];
                                            jArr4[i23] = 0;
                                        } else {
                                            i3 = i13;
                                            jArr3[i31] = (((long) (i26 & 127)) << i32) | (j15 & (~(j2 << i32)));
                                            long j16 = jArr4[iB2];
                                            jArr4[iB2] = jArr4[i23];
                                            jArr4[i23] = j16;
                                            i23--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i30] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        c = c2;
                                        j12 = j14;
                                        i15 = i30;
                                        i13 = i3;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i = i15;
                            i2 = i13;
                            this.e = qa3.a(this.c) - this.d;
                        }
                        iB = b(i6);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i = 0;
                    i2 = 1;
                    int iB3 = qa3.b(this.c);
                    long[] jArr5 = this.a;
                    long[] jArr6 = this.b;
                    int i33 = this.c;
                    c(iB3);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.b;
                    int i34 = this.c;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j4) {
                            long j17 = jArr6[i35];
                            int iHashCode3 = Long.hashCode(j17) * i17;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i36 >>> 7);
                            long j18 = i36 & 127;
                            int i37 = iB4 >> 3;
                            int i38 = (iB4 & 7) << 3;
                            jArr = jArr7;
                            long j19 = (jArr7[i37] & (~(255 << i38))) | (j18 << i38);
                            jArr[i37] = j19;
                            jArr[(((iB4 - 7) & i34) + (i34 & 7)) >> 3] = j19;
                            jArr8[iB4] = j17;
                        } else {
                            jArr = jArr7;
                        }
                        i35++;
                        jArr5 = jArr5;
                        jArr7 = jArr;
                    }
                    iB = b(i6);
                }
                iNumberOfTrailingZeros = iB;
                this.d++;
                int i39 = this.e;
                long[] jArr9 = this.a;
                int i40 = iNumberOfTrailingZeros >> 3;
                long j20 = jArr9[i40];
                int i41 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j20 >> i41) & j2) == j4) {
                    i = i2;
                }
                this.e = i39 - i;
                int i42 = this.c;
                long j21 = (j20 & (~(j2 << i41))) | (j3 << i41);
                jArr9[i40] = j21;
                jArr9[(((iNumberOfTrailingZeros - 7) & i42) + (i42 & 7)) >> 3] = j21;
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
        this.b[iNumberOfTrailingZeros] = j;
    }

    public final void e(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i5 += 8;
                i4 = (i4 + i5) & i3;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.d--;
            long[] jArr2 = this.a;
            int i8 = this.c;
            int i9 = iNumberOfTrailingZeros >> 3;
            int i10 = (iNumberOfTrailingZeros & 7) << 3;
            long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
            jArr2[i9] = j5;
            jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mh2)) {
            return false;
        }
        mh2 mh2Var = (mh2) obj;
        if (mh2Var.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !mh2Var.a(jArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
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
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Long.hashCode(jArr[(i << 3) + i3]) + iHashCode;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT, PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0016->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j2);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
