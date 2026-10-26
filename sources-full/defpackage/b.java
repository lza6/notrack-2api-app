package defpackage;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(q30.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, LongCompanionObject.MAX_VALUE};
    }

    public static final long a(dy dyVar, lz lzVar, long j, long j2, int i) {
        uc3 uc3Var;
        long j3 = j;
        long j4 = j2;
        lzVar.getClass();
        long j5 = i;
        vl0.w(lzVar.c(), 0L, j5);
        if (i <= 0) {
            u41.k("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            u41.h(ud2.o("fromIndex < 0: ", j3));
            return 0L;
        }
        if (j3 > j4) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j3 + " > " + j4).toString());
        }
        long j6 = dyVar.d;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (uc3Var = dyVar.c) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                uc3Var = uc3Var.g;
                uc3Var.getClass();
                j6 -= (long) (uc3Var.c - uc3Var.b);
            }
            byte[] bArrG = lzVar.g();
            byte b2 = bArrG[0];
            long jMin = Math.min(j4, (dyVar.d - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = uc3Var.a;
                int iMin = (int) Math.min(uc3Var.c, (((long) uc3Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) uc3Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(uc3Var, i2 + 1, bArrG, 1, i)) {
                        return ((long) (i2 - uc3Var.b)) + j6;
                    }
                }
                j6 += (long) (uc3Var.c - uc3Var.b);
                uc3Var = uc3Var.f;
                uc3Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (uc3Var.c - uc3Var.b));
            if (j8 > j3) {
                break;
            }
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j7 = j8;
        }
        byte[] bArrG2 = lzVar.g();
        byte b3 = bArrG2[0];
        long jMin2 = Math.min(j4, (dyVar.d - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = uc3Var.a;
            int iMin2 = (int) Math.min(uc3Var.c, (((long) uc3Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) uc3Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(uc3Var, i3 + 1, bArrG2, 1, i)) {
                    return ((long) (i3 - uc3Var.b)) + j7;
                }
            }
            j7 += (long) (uc3Var.c - uc3Var.b);
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(uc3 uc3Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = uc3Var.c;
        byte[] bArr2 = uc3Var.a;
        while (i2 < i3) {
            if (i == i4) {
                uc3Var = uc3Var.f;
                uc3Var.getClass();
                byte[] bArr3 = uc3Var.a;
                bArr2 = bArr3;
                i = uc3Var.b;
                i4 = uc3Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(dy dyVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (dyVar.l(j2) == 13) {
                String strO = dyVar.O(j2, q30.a);
                dyVar.skip(2L);
                return strO;
            }
        }
        String strO2 = dyVar.O(j, q30.a);
        dyVar.skip(1L);
        return strO2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(dy dyVar, iq2 iq2Var, boolean z) {
        int i;
        int i2;
        int i3;
        uc3 uc3Var;
        int i4;
        iq2Var.getClass();
        uc3 uc3Var2 = dyVar.c;
        if (uc3Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = uc3Var2.a;
        int i5 = uc3Var2.b;
        int i6 = uc3Var2.c;
        int[] iArr = iq2Var.d;
        uc3 uc3Var3 = uc3Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (uc3Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & UByte.MAX_VALUE;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            uc3Var3 = uc3Var3.f;
                            uc3Var3.getClass();
                            int i16 = uc3Var3.b;
                            byte[] bArr2 = uc3Var3.a;
                            i2 = uc3Var3.c;
                            if (uc3Var3 == uc3Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                uc3Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & UByte.MAX_VALUE) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        uc3Var3.getClass();
                        uc3 uc3Var4 = uc3Var3.f;
                        uc3Var4.getClass();
                        i3 = uc3Var4.b;
                        byte[] bArr3 = uc3Var4.a;
                        i4 = uc3Var4.c;
                        if (uc3Var4 != uc3Var2) {
                            uc3Var = uc3Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            uc3Var = null;
                        }
                    } else {
                        uc3Var = uc3Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        uc3Var3 = uc3Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    uc3Var3 = uc3Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
