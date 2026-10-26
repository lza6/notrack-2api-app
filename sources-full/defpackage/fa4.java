package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class fa4 extends av1 {
    public final /* synthetic */ int j;

    public /* synthetic */ fa4(int i) {
        this.j = i;
    }

    public static int R(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            av1 av1Var = ha4.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return ha4.c(i, o94.g(bArr, j));
        }
        if (i2 == 2) {
            return ha4.d(i, o94.g(bArr, j), o94.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    @Override // defpackage.av1
    public final int E(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        byte bG;
        long j3;
        byte bG2;
        long j4;
        int i5 = i;
        switch (this.j) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j5 = i5;
                int i6 = (int) (((long) i2) - j5);
                if (i6 < 16) {
                    j = 1;
                    i3 = 0;
                } else {
                    int i7 = 8 - (((int) j5) & 7);
                    long j6 = j5;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i7) {
                            long j7 = j6 + 1;
                            if (o94.g(bArr, j6) >= 0) {
                                i3++;
                                j6 = j7;
                            }
                        } else {
                            while (true) {
                                int i8 = i3 + 8;
                                if (i8 <= i6) {
                                    if ((o94.c.h(bArr, o94.f + j6) & (-9187201950435737472L)) == 0) {
                                        j6 += 8;
                                        i3 = i8;
                                    }
                                }
                            }
                            while (true) {
                                if (i3 < i6) {
                                    long j8 = j6 + 1;
                                    if (o94.g(bArr, j6) >= 0) {
                                        i3++;
                                        j6 = j8;
                                    }
                                } else {
                                    i3 = i6;
                                }
                            }
                        }
                    }
                }
                int i9 = i6 - i3;
                long j9 = j5 + ((long) i3);
                while (true) {
                    byte bG3 = 0;
                    while (i9 > 0) {
                        long j10 = j9 + j;
                        bG3 = o94.g(bArr, j9);
                        if (bG3 >= 0) {
                            i9--;
                            j9 = j10;
                        } else {
                            j9 = j10;
                            if (i9 == 0) {
                                return 0;
                            }
                            i4 = i9 - 1;
                            if (bG3 < -32) {
                                if (i4 == 0) {
                                    return bG3;
                                }
                                i9 -= 2;
                                if (bG3 >= -62) {
                                    j2 = j9 + j;
                                    if (o94.g(bArr, j9) > -65) {
                                        j9 = j2;
                                    }
                                }
                            } else if (bG3 < -16) {
                                if (i4 < 2) {
                                    return R(j9, bArr, bG3, i4);
                                }
                                i9 -= 3;
                                long j11 = j9 + j;
                                bG = o94.g(bArr, j9);
                                if (bG > -65 && ((bG3 != -32 || bG >= -96) && (bG3 != -19 || bG < -96))) {
                                    j9 += 2;
                                    if (o94.g(bArr, j11) > -65) {
                                    }
                                }
                            } else {
                                if (i4 < 3) {
                                    return R(j9, bArr, bG3, i4);
                                }
                                i9 -= 4;
                                j3 = j9 + j;
                                bG2 = o94.g(bArr, j9);
                                if (bG2 <= -65) {
                                    if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                                        j4 = 2 + j9;
                                        if (o94.g(bArr, j3) <= -65) {
                                            j9 += 3;
                                            if (o94.g(bArr, j4) > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i9 == 0) {
                        return 0;
                    }
                    i4 = i9 - 1;
                    if (bG3 < -32) {
                        if (i4 == 0) {
                            return bG3;
                        }
                        i9 -= 2;
                        if (bG3 >= -62) {
                            j2 = j9 + j;
                            if (o94.g(bArr, j9) > -65) {
                                j9 = j2;
                            }
                        }
                    } else if (bG3 < -16) {
                        if (i4 < 2) {
                            return R(j9, bArr, bG3, i4);
                        }
                        i9 -= 3;
                        long j12 = j9 + j;
                        bG = o94.g(bArr, j9);
                        if (bG > -65) {
                        }
                    } else {
                        if (i4 < 3) {
                            return R(j9, bArr, bG3, i4);
                        }
                        i9 -= 4;
                        j3 = j9 + j;
                        bG2 = o94.g(bArr, j9);
                        if (bG2 <= -65) {
                            if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                                j4 = 2 + j9;
                                if (o94.g(bArr, j3) <= -65) {
                                    j9 += 3;
                                    if (o94.g(bArr, j4) > -65) {
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b = bArr[i5];
                if (b < 0) {
                    if (b < -32) {
                        if (i10 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i5 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i10 >= i2 - 1) {
                            return ha4.a(bArr, i10, i2);
                        }
                        int i11 = i5 + 2;
                        byte b2 = bArr[i10];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i5 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return ha4.a(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i13 = i5 + 3;
                            if (bArr[i12] <= -65) {
                                i5 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i10;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    @Override // defpackage.av1
    public final String m(byte[] bArr, int i, int i2) throws sr1 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.j) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw sr1.b();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || kr1.P(b6)) {
                                    throw sr1.b();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw sr1.b();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!kr1.P(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !kr1.P(b7) && !kr1.P(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw sr1.b();
                                }
                                if (i3 < i5 - 1) {
                                    throw sr1.b();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!kr1.P(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || kr1.P(b9)))) {
                                    throw sr1.b();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw sr1.b();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw sr1.b();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw sr1.b();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (kr1.P(b3)) {
                            }
                            throw sr1.b();
                        }
                        if (i3 < i5 - 2) {
                            throw sr1.b();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!kr1.P(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw sr1.b();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = zq1.a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw sr1.b();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    @Override // defpackage.av1
    public final int p(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.j) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new ga4(i7, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | Uuid.SIZE_BITS);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | Uuid.SIZE_BITS);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | Uuid.SIZE_BITS);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new ga4(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | Uuid.SIZE_BITS);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | Uuid.SIZE_BITS);
                    }
                    i7++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    o94.k(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            o94.k(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new ga4(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        o94.k(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        o94.k(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | Uuid.SIZE_BITS));
                                        long j3 = j + 3;
                                        o94.k(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | Uuid.SIZE_BITS));
                                        j += 4;
                                        o94.k(bArr, j3, (byte) ((codePoint2 & 63) | Uuid.SIZE_BITS));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new ga4(i20 - 1, length2);
                            }
                            o94.k(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            o94.k(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | Uuid.SIZE_BITS));
                            j += 3;
                            o94.k(bArr, j4, (byte) ((cCharAt5 & '?') | Uuid.SIZE_BITS));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            o94.k(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            o94.k(bArr, j5, (byte) ((cCharAt5 & '?') | Uuid.SIZE_BITS));
                            i20 = i20;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
