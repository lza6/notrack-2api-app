package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 {
    public long[] a = qa3.a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public bh2() {
        int[] iArr = pq1.a;
        this.b = iArr;
        this.c = iArr;
        e(qa3.d(6));
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != qa3.a) {
            vl.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f = qa3.a(this.d) - this.e;
    }

    public final int b(int i) {
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

    public final int c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.c[iC];
        }
        return -1;
    }

    public final void e(int i) {
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
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        if (bh2Var.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            int i6 = iArr2[i4];
                            int iC = bh2Var.c(i5);
                            if (iC < 0 || i6 != bh2Var.c[iC]) {
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

    public final void f(int i, int i2) {
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i5 = i;
        int i6 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.d;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            int i16 = i12;
            int i17 = 0;
            long j4 = (((-i14) >> 63) & (jArr2[i13 + 1] << (64 - i14))) | (jArr2[i13] >>> i14);
            long j5 = i9;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i11) & i10;
                int i18 = i6;
                if (this.b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i8);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    j3 = 128;
                } else {
                    int i20 = this.d;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i21 = this.d;
                            int[] iArr3 = this.b;
                            int[] iArr4 = this.c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j9 = jArr3[i23] & (-9187201950435737472L);
                                jArr3[i23] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i23++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iV0 = vl.v0(jArr3);
                            int i24 = iV0 - 1;
                            jArr3[i24] = (jArr3[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iV0] = jArr3[0];
                            int i25 = 0;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j10 = (jArr3[i26] >> i27) & j2;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i25]) * i19;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iB2 = b(i29);
                                    int i30 = i29 & i21;
                                    char c2 = c;
                                    if (((iB2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        int i31 = i17;
                                        jArr3[i26] = (((long) (i28 & 127)) << i27) | (jArr3[i26] & (~(j2 << i27)));
                                        jArr3[jArr3.length - 1] = (jArr3[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i15 = i15;
                                        c = c2;
                                        i17 = i31;
                                    } else {
                                        int i32 = i15;
                                        int i33 = i17;
                                        int i34 = iB2 >> 3;
                                        long j11 = jArr3[i34];
                                        int i35 = (iB2 & 7) << 3;
                                        if (((j11 >> i35) & j2) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i34] = ((~(j2 << i35)) & j11) | (((long) (i28 & 127)) << i35);
                                            jArr3[i26] = (jArr3[i26] & (~(j2 << i27))) | (128 << i27);
                                            iArr[iB2] = iArr[i25];
                                            iArr[i25] = i33;
                                            iArr2[iB2] = iArr2[i25];
                                            iArr2[i25] = i33;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i34] = (((long) (i28 & 127)) << i35) | ((~(j2 << i35)) & j11);
                                            int i36 = iArr[iB2];
                                            iArr[iB2] = iArr[i25];
                                            iArr[i25] = i36;
                                            int i37 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i25];
                                            iArr2[i25] = i37;
                                            i25--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i33] & 72057594037927935L) | Long.MIN_VALUE;
                                        i25++;
                                        i15 = i32;
                                        c = c2;
                                        i17 = i33;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i3 = i15;
                            i4 = i17;
                            this.f = qa3.a(this.d) - this.e;
                        }
                        iB = b(i8);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i3 = 1;
                    i4 = 0;
                    int iB3 = qa3.b(this.d);
                    long[] jArr4 = this.a;
                    int[] iArr5 = this.b;
                    int[] iArr6 = this.c;
                    int i38 = this.d;
                    e(iB3);
                    long[] jArr5 = this.a;
                    int[] iArr7 = this.b;
                    int[] iArr8 = this.c;
                    int i39 = this.d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            int i41 = iArr5[i40];
                            int iHashCode3 = Integer.hashCode(i41) * i19;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i42 >>> 7);
                            jArr = jArr5;
                            long j12 = i42 & 127;
                            int i43 = iB4 >> 3;
                            int i44 = (iB4 & 7) << 3;
                            long j13 = (jArr[i43] & (~(255 << i44))) | (j12 << i44);
                            jArr[i43] = j13;
                            jArr[(((iB4 - 7) & i39) + (i39 & 7)) >> 3] = j13;
                            iArr7[iB4] = i41;
                            iArr8[iB4] = iArr6[i40];
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr5 = jArr;
                    }
                    iB = b(i8);
                }
                this.e++;
                int i45 = this.f;
                long[] jArr6 = this.a;
                int i46 = iB >> 3;
                long j14 = jArr6[i46];
                int i47 = (iB & 7) << 3;
                if (((j14 >> i47) & j2) == j3) {
                    i4 = i3;
                }
                this.f = i45 - i4;
                int i48 = this.d;
                long j15 = (j14 & (~(j2 << i47))) | (j << i47);
                jArr6[i46] = j15;
                jArr6[(((iB - 7) & i48) + (i48 & 7)) >> 3] = j15;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i5 = i;
            i6 = i19;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
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
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
