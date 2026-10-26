package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fi2 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ fi2() {
        this(6);
    }

    public fi2(int i) {
        this.a = qa3.a;
        Object[] objArr = gm4.d;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            h(qa3.d(i));
        } else {
            u41.k("Capacity must be a positive value.");
            throw null;
        }
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
        vl.p0(0, this.d, null, this.c);
        vl.p0(0, this.d, null, this.b);
        this.f = qa3.a(this.d) - this.e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && kr1.n(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        return false;
    }

    public final int e(int i) {
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi2)) {
            return false;
        }
        fi2 fi2Var = (fi2) obj;
        if (fi2Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (fi2Var.g(obj2) != null || !fi2Var.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(fi2Var.g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int f(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iE = e(i3);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int iV0 = vl.v0(jArr3);
                            int i19 = iV0 - 1;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iV0] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j11 = (jArr3[i21] >> i22) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iE2 = e(i24);
                                    int i25 = i24 & i15;
                                    if (((iE2 - i25) & i15) / i18 == ((i20 - i25) & i15) / i18) {
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | (jArr3[i21] & (~(j << i22)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i20++;
                                        i18 = i18;
                                    } else {
                                        int i26 = i18;
                                        int i27 = iE2 >> 3;
                                        long j12 = jArr3[i27];
                                        int i28 = (iE2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(j << i28)) & j12) | (((long) (i23 & 127)) << i28);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iE2] = objArr[i20];
                                            objArr[i20] = null;
                                            objArr3[iE2] = objArr3[i20];
                                            objArr3[i20] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = (((long) (i23 & 127)) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i20];
                                            objArr3[i20] = obj4;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i20++;
                                        i18 = i26;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.f = qa3.a(this.d) - this.e;
                        }
                        iE = e(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB = qa3.b(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i29 = this.d;
                    h(iB);
                    long[] jArr5 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i30 = this.d;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr4[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i12;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i32 >>> 7);
                            jArr = jArr5;
                            long j13 = i32 & 127;
                            int i33 = iE3 >> 3;
                            int i34 = (iE3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((iE3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i31];
                        } else {
                            jArr = jArr5;
                        }
                        i31++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i3);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr6 = this.a;
                int i36 = iE >> 3;
                long j15 = jArr6[i36];
                int i37 = (iE & 7) << 3;
                this.f = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.d;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr6[i36] = j16;
                jArr6[(((iE - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~iE;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        Object[] objArr = gm4.d;
        int iMax = i > 0 ? Math.max(7, qa3.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = qa3.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = qa3.a(this.d) - this.e;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.e == 0;
    }

    public final Object j(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return k(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object k(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.b[iF] = obj;
        this.c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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
