package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eh2 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ eh2() {
        this(6);
    }

    public eh2(int i) {
        this.a = qa3.a;
        this.b = pq1.a;
        if (i >= 0) {
            d(qa3.d(i));
        } else {
            u41.k("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean a(int i) {
        long j;
        boolean z;
        long j2;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3 = this.d;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
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
            boolean z2 = true;
            int i13 = i10;
            long j3 = (((-i12) >> 63) & (jArr2[i11 + 1] << (64 - i12))) | (jArr2[i11] >>> i12);
            long j4 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (j6 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i8;
                int i14 = i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    z = true;
                    break loop0;
                }
                j6 &= j6 - 1;
                i4 = i14;
            }
            int i15 = i4;
            long j7 = j3 & ((~j3) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j7 != 0) {
                int iC = c(i6);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = 255;
                    z = true;
                    j2 = 128;
                } else {
                    int i16 = this.c;
                    if (i16 > 8) {
                        j2 = 128;
                        if (Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) i16) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.c;
                            int[] iArr2 = this.b;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            while (i19 < i18) {
                                char c2 = c;
                                long j9 = jArr3[i19] & (-9187201950435737472L);
                                jArr3[i19] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i19++;
                                j8 = j8;
                                c = c2;
                            }
                            j = j8;
                            int iV0 = vl.v0(jArr3);
                            int i20 = iV0 - 1;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iV0] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i17) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j10 = (jArr3[i22] >> i23) & j;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i21]) * i15;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iC2 = c(i25);
                                    int i26 = i25 & i17;
                                    boolean z3 = z2;
                                    if (((iC2 - i26) & i17) / 8 == ((i21 - i26) & i17) / 8) {
                                        iArr = iArr2;
                                        jArr3[i22] = ((~(j << i23)) & jArr3[i22]) | (((long) (i24 & 127)) << i23);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    } else {
                                        iArr = iArr2;
                                        int i27 = i21;
                                        int i28 = iC2 >> 3;
                                        long j11 = jArr3[i28];
                                        int i29 = (iC2 & 7) << 3;
                                        if (((j11 >> i29) & j) == 128) {
                                            jArr3[i28] = (j11 & (~(j << i29))) | (((long) (i24 & 127)) << i29);
                                            jArr3[i22] = (jArr3[i22] & (~(j << i23))) | (128 << i23);
                                            iArr[iC2] = iArr[i27];
                                            iArr[i27] = 0;
                                            i2 = i27;
                                        } else {
                                            jArr3[i28] = (((long) (i24 & 127)) << i29) | (j11 & (~(j << i29)));
                                            int i30 = iArr[iC2];
                                            iArr[iC2] = iArr[i27];
                                            iArr[i27] = i30;
                                            i2 = i27 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21 = i2 + 1;
                                    }
                                    iArr2 = iArr;
                                    z2 = z3;
                                } else {
                                    i21++;
                                }
                            }
                            z = z2;
                            this.e = qa3.a(this.c) - this.d;
                        }
                        iC = c(i6);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    z = true;
                    int iB = qa3.b(this.c);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    int i31 = this.c;
                    d(iB);
                    long[] jArr5 = this.a;
                    int[] iArr4 = this.b;
                    int i32 = this.c;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr4[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j2) {
                            int i34 = iArr3[i33];
                            int iHashCode3 = Integer.hashCode(i34) * i15;
                            int i35 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i35 >>> 7);
                            jArr = jArr5;
                            long j12 = i35 & 127;
                            int i36 = iC3 >> 3;
                            int i37 = (iC3 & 7) << 3;
                            long j13 = (jArr[i36] & (~(255 << i37))) | (j12 << i37);
                            jArr[i36] = j13;
                            jArr[(((iC3 - 7) & i32) + (i32 & 7)) >> 3] = j13;
                            iArr4[iC3] = i34;
                        } else {
                            jArr = jArr5;
                        }
                        i33++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iC = c(i6);
                }
                iNumberOfTrailingZeros = iC;
                this.d++;
                int i38 = this.e;
                long[] jArr6 = this.a;
                int i39 = iNumberOfTrailingZeros >> 3;
                long j14 = jArr6[i39];
                int i40 = (iNumberOfTrailingZeros & 7) << 3;
                this.e = i38 - (((j14 >> i40) & j) == j2 ? z : 0);
                int i41 = this.c;
                long j15 = (j14 & (~(j << i40))) | (j4 << i40);
                jArr6[i39] = j15;
                jArr6[(((iNumberOfTrailingZeros - 7) & i41) + (i41 & 7)) >> 3] = j15;
                break;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i15;
        }
        this.b[iNumberOfTrailingZeros] = i;
        if (this.d != i3) {
            return z;
        }
        return false;
    }

    public final boolean b(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i) {
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

    public final void d(int i) {
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
        this.b = new int[iMax];
    }

    public final boolean e(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            f(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eh2)) {
            return false;
        }
        eh2 eh2Var = (eh2) obj;
        if (eh2Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !eh2Var.b(iArr[(i << 3) + i3])) {
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

    public final void f(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i5);
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
