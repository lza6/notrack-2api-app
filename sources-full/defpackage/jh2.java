package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jh2 {
    public long[] a = qa3.a;
    public long[] b = i82.a;
    public int[] c = pq1.a;
    public int d;
    public int e;
    public int f;

    public jh2(int i) {
        if (i >= 0) {
            d(qa3.d(i));
        } else {
            u41.k("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i2 = this.d;
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

    public final int b(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int c(long j) {
        int iB = b(j);
        if (iB >= 0) {
            return this.c[iB];
        }
        j93.g(ud2.o("Cannot find value for key ", j));
        return 0;
    }

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, qa3.c(i)) : 0;
        this.d = iMax;
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
        this.f = qa3.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new int[iMax];
    }

    public final void e(long j, int i) {
        long j2;
        long j3;
        int i2;
        int i3;
        long j4;
        int i4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i5 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j5 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j6 = i8;
            int i15 = i11;
            int i16 = 0;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                int i17 = i5;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    i4 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j8 &= j8 - 1;
                    i5 = i17;
                }
            }
            int i18 = i5;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iA = a(i7);
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j6;
                    i2 = 0;
                    i3 = 1;
                    j4 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        j4 = 128;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i20 = this.d;
                            long[] jArr5 = this.b;
                            int[] iArr2 = this.c;
                            int i21 = (i20 + 7) >> 3;
                            j2 = 255;
                            int i22 = 0;
                            while (i22 < i21) {
                                long j9 = jArr4[i22] & (-9187201950435737472L);
                                jArr4[i22] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i22++;
                                i14 = i14;
                                i16 = i16;
                                j6 = j6;
                            }
                            j3 = j6;
                            i2 = i16;
                            int i23 = i14;
                            char c = 7;
                            int iV0 = vl.v0(jArr4);
                            int i24 = iV0 - 1;
                            long j10 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iV0] = jArr4[i2];
                            int i25 = i2;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j11 = (jArr4[i26] >> i27) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iA2 = a(i29);
                                    int i30 = i29 & i20;
                                    char c2 = c;
                                    if (((iA2 - i30) & i20) / 8 == ((i25 - i30) & i20) / 8) {
                                        int i31 = i23;
                                        long j12 = j10;
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | (jArr4[i26] & (~(255 << i27)));
                                        jArr4[jArr4.length - i31] = (jArr4[i2] & j12) | Long.MIN_VALUE;
                                        i25++;
                                        i23 = i31;
                                        c = c2;
                                        j10 = j12;
                                    } else {
                                        int i32 = i23;
                                        long j13 = j10;
                                        int i33 = iA2 >> 3;
                                        long j14 = jArr4[i33];
                                        int i34 = (iA2 & 7) << 3;
                                        if (((j14 >> i34) & 255) == 128) {
                                            jArr2 = jArr5;
                                            iArr = iArr2;
                                            jArr4[i33] = (j14 & (~(255 << i34))) | (((long) (i28 & 127)) << i34);
                                            jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (128 << i27);
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = 0;
                                            iArr[iA2] = iArr[i25];
                                            iArr[i25] = i2;
                                        } else {
                                            iArr = iArr2;
                                            jArr2 = jArr5;
                                            jArr4[i33] = (((long) (i28 & 127)) << i34) | (j14 & (~(255 << i34)));
                                            long j15 = jArr2[iA2];
                                            jArr2[iA2] = jArr2[i25];
                                            jArr2[i25] = j15;
                                            int i35 = iArr[iA2];
                                            iArr[iA2] = iArr[i25];
                                            iArr[i25] = i35;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i2] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        jArr5 = jArr2;
                                        i23 = i32;
                                        c = c2;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i3 = i23;
                            this.f = qa3.a(this.d) - this.e;
                        }
                        iA = a(i7);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j6;
                    i2 = 0;
                    i3 = 1;
                    int iB = qa3.b(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    int[] iArr3 = this.c;
                    int i36 = this.d;
                    d(iB);
                    long[] jArr8 = this.a;
                    long[] jArr9 = this.b;
                    int[] iArr4 = this.c;
                    int i37 = this.d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr6[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j4) {
                            long j16 = jArr7[i38];
                            int iHashCode3 = Long.hashCode(j16) * i18;
                            int i39 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i39 >>> 7);
                            jArr = jArr8;
                            long j17 = i39 & 127;
                            int i40 = iA3 >> 3;
                            int i41 = (iA3 & 7) << 3;
                            long j18 = (jArr[i40] & (~(255 << i41))) | (j17 << i41);
                            jArr[i40] = j18;
                            jArr[(((iA3 - 7) & i37) + (i37 & 7)) >> 3] = j18;
                            jArr9[iA3] = j16;
                            iArr4[iA3] = iArr3[i38];
                        } else {
                            jArr = jArr8;
                        }
                        i38++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iA = a(i7);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr10 = this.a;
                int i43 = iA >> 3;
                long j19 = jArr10[i43];
                int i44 = (iA & 7) << 3;
                if (((j19 >> i44) & j2) == j4) {
                    i2 = i3;
                }
                this.f = i42 - i2;
                int i45 = this.d;
                long j20 = (j19 & (~(j2 << i44))) | (j3 << i44);
                jArr10[i43] = j20;
                jArr10[(((iA - 7) & i45) + (i45 & 7)) >> 3] = j20;
                i4 = ~iA;
                break;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i18;
        }
        if (i4 < 0) {
            i4 = ~i4;
        }
        this.b[i4] = j;
        this.c[i4] = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh2)) {
            return false;
        }
        jh2 jh2Var = (jh2) obj;
        if (jh2Var.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            long j2 = jArr[i4];
                            int i5 = iArr[i4];
                            int iB = jh2Var.b(j2);
                            if (iB < 0 || i5 != jh2Var.c[iB]) {
                                break loop0;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        int[] iArr = this.c;
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
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(j2);
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

    public final String toString() {
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
