package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ rh2() {
        this(6);
    }

    public rh2(int i) {
        this.a = qa3.a;
        this.b = gm4.d;
        this.c = pq1.a;
        if (i >= 0) {
            f(qa3.d(i));
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
        vl.p0(0, this.d, null, this.b);
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

    public final int c(Object obj) {
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
                int iB = b(i3);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
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
                            int[] iArr = this.c;
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
                            long j11 = 72057594037927935L;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iV0] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j12 = (jArr3[i21] >> i22) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iB2 = b(i24);
                                    int i25 = i24 & i15;
                                    long j13 = j11;
                                    if (((iB2 - i25) & i15) / 8 == ((i20 - i25) & i15) / i18) {
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | (jArr3[i21] & (~(j << i22)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i20++;
                                        j11 = j13;
                                        i18 = i18;
                                    } else {
                                        int i26 = i18;
                                        int i27 = iB2 >> 3;
                                        long j14 = jArr3[i27];
                                        int i28 = (iB2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(j << i28)) & j14) | (((long) (i23 & 127)) << i28);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iB2] = objArr[i20];
                                            objArr[i20] = null;
                                            iArr[iB2] = iArr[i20];
                                            iArr[i20] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = (((long) (i23 & 127)) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            int i29 = iArr[iB2];
                                            iArr[iB2] = iArr[i20];
                                            iArr[i20] = i29;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i20++;
                                        i15 = i15;
                                        j11 = j13;
                                        i18 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.f = qa3.a(this.d) - this.e;
                        }
                        iB = b(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB3 = qa3.b(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i30 = this.d;
                    f(iB3);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i33 >>> 7);
                            jArr = jArr5;
                            long j15 = i33 & 127;
                            int i34 = iB4 >> 3;
                            int i35 = (iB4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((iB4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i32];
                        } else {
                            jArr = jArr5;
                        }
                        i32++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i3);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr6 = this.a;
                int i37 = iB >> 3;
                long j17 = jArr6[i37];
                int i38 = (iB & 7) << 3;
                this.f = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr6[i37] = j18;
                jArr6[(((iB - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~iB;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kr1.n(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.c[iD];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[LOOP:0: B:14:0x0023->B:28:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rh2)) {
            return false;
        }
        rh2 rh2Var = (rh2) obj;
        if (rh2Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iD = rh2Var.d(obj2);
                            if (iD < 0 || i5 != rh2Var.c[iD]) {
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

    public final void f(int i) {
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
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    public final void g(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void h(int i, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = obj;
        this.c[iC] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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
