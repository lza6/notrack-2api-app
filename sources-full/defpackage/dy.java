package defpackage;

import app.template.extension.BuildConfig;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import kotlin.uuid.Uuid;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class dy implements ny, my, Cloneable, ByteChannel {
    public uc3 c;
    public long d;

    public final boolean A(long j, lz lzVar, int i) {
        lzVar.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.d && i <= lzVar.c()) {
            return i == 0 || b.a(this, lzVar, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.ny
    public final long B(my myVar) {
        long j = this.d;
        if (j > 0) {
            myVar.d(this, j);
        }
        return j;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my E(int i, byte[] bArr) {
        S(i, bArr);
        return this;
    }

    @Override // defpackage.ny
    public final void F(long j) throws EOFException {
        if (this.d < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ny
    public final boolean G(long j, lz lzVar) {
        lzVar.getClass();
        return A(j, lzVar, lzVar.c());
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my H(String str) {
        b0(str);
        return this;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my I(long j) {
        W(j);
        return this;
    }

    public final byte[] K(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            u41.h(ud2.o("byteCount: ", j));
            return null;
        }
        if (this.d < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    public final short L() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // defpackage.ny
    public final long M() throws EOFException {
        int i;
        if (this.d == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            uc3 uc3Var = this.c;
            uc3Var.getClass();
            byte[] bArr = uc3Var.a;
            int i3 = uc3Var.b;
            int i4 = uc3Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = py.c;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    dy dyVar = new dy();
                    dyVar.X(j);
                    dyVar.V(b);
                    throw new NumberFormatException("Number too large: ".concat(dyVar.O(dyVar.d, q30.a)));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.c = uc3Var.a();
                xc3.a(uc3Var);
            } else {
                uc3Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.c != null);
        this.d -= (long) i2;
        return j;
    }

    @Override // defpackage.ny
    public final String N(Charset charset) {
        return O(this.d, charset);
    }

    public final String O(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            u41.h(ud2.o("byteCount: ", j));
            return null;
        }
        if (this.d < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return BuildConfig.VERSION_NAME;
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        int i = uc3Var.b;
        if (((long) i) + j > uc3Var.c) {
            return new String(K(j), charset);
        }
        int i2 = (int) j;
        String str = new String(uc3Var.a, i, i2, charset);
        int i3 = uc3Var.b + i2;
        uc3Var.b = i3;
        this.d -= j;
        if (i3 == uc3Var.c) {
            this.c = uc3Var.a();
            xc3.a(uc3Var);
        }
        return str;
    }

    @Override // defpackage.ny
    public final InputStream P() {
        return new cy(this, 0);
    }

    public final lz Q(int i) {
        if (i == 0) {
            return lz.l;
        }
        vl0.w(this.d, 0L, i);
        uc3 uc3Var = this.c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            uc3Var.getClass();
            int i5 = uc3Var.c;
            int i6 = uc3Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            uc3Var = uc3Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        uc3 uc3Var2 = this.c;
        int i7 = 0;
        while (i2 < i) {
            uc3Var2.getClass();
            bArr[i7] = uc3Var2.a;
            i2 += uc3Var2.c - uc3Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uc3Var2.b;
            uc3Var2.d = true;
            i7++;
            uc3Var2 = uc3Var2.f;
        }
        return new yc3(bArr, iArr);
    }

    public final uc3 R(int i) {
        if (i < 1 || i > 8192) {
            u41.k("unexpected capacity");
            return null;
        }
        uc3 uc3Var = this.c;
        if (uc3Var == null) {
            uc3 uc3VarB = xc3.b();
            this.c = uc3VarB;
            uc3VarB.g = uc3VarB;
            uc3VarB.f = uc3VarB;
            return uc3VarB;
        }
        uc3 uc3Var2 = uc3Var.g;
        uc3Var2.getClass();
        if (uc3Var2.c + i <= 8192 && uc3Var2.e) {
            return uc3Var2;
        }
        uc3 uc3VarB2 = xc3.b();
        uc3Var2.b(uc3VarB2);
        return uc3VarB2;
    }

    public final void S(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        vl0.w(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            uc3 uc3VarR = R(1);
            int iMin = Math.min(i - i2, 8192 - uc3VarR.c);
            int i3 = i2 + iMin;
            vl.h0(uc3VarR.c, i2, i3, bArr, uc3VarR.a);
            uc3VarR.c += iMin;
            i2 = i3;
        }
        this.d += j;
    }

    public final void T(lz lzVar) {
        lzVar.getClass();
        lzVar.q(this, lzVar.c());
    }

    public final void U(wl3 wl3Var) {
        wl3Var.getClass();
        while (wl3Var.y(this, 8192L) != -1) {
        }
    }

    public final void V(int i) {
        uc3 uc3VarR = R(1);
        byte[] bArr = uc3VarR.a;
        int i2 = uc3VarR.c;
        uc3VarR.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.d++;
    }

    public final void W(long j) {
        boolean z;
        if (j == 0) {
            V(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                b0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        uc3 uc3VarR = R(i);
        byte[] bArr2 = uc3VarR.a;
        int i2 = uc3VarR.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        uc3VarR.c += i;
        this.d += (long) i;
    }

    public final void X(long j) {
        if (j == 0) {
            V(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        uc3 uc3VarR = R(i);
        byte[] bArr = uc3VarR.a;
        int i2 = uc3VarR.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        uc3VarR.c += i;
        this.d += (long) i;
    }

    public final void Y(int i) {
        uc3 uc3VarR = R(4);
        byte[] bArr = uc3VarR.a;
        int i2 = uc3VarR.c;
        bArr[i2] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        uc3VarR.c = i2 + 4;
        this.d += 4;
    }

    public final void Z(int i) {
        uc3 uc3VarR = R(2);
        byte[] bArr = uc3VarR.a;
        int i2 = uc3VarR.c;
        bArr[i2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        uc3VarR.c = i2 + 2;
        this.d += 2;
    }

    public final void a() throws EOFException {
        skip(this.d);
    }

    public final void a0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            u41.h(ud2.m(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            u41.h(ud2.l(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbS = ud2.s("endIndex > string.length: ", " > ", i2);
            sbS.append(str.length());
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                uc3 uc3VarR = R(1);
                byte[] bArr = uc3VarR.a;
                int i3 = uc3VarR.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = uc3VarR.c;
                int i6 = (i3 + i) - i5;
                uc3VarR.c = i5 + i6;
                this.d += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    uc3 uc3VarR2 = R(2);
                    byte[] bArr2 = uc3VarR2.a;
                    int i7 = uc3VarR2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | Uuid.SIZE_BITS);
                    uc3VarR2.c = i7 + 2;
                    this.d += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    uc3 uc3VarR3 = R(3);
                    byte[] bArr3 = uc3VarR3.a;
                    int i8 = uc3VarR3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | Uuid.SIZE_BITS);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | Uuid.SIZE_BITS);
                    uc3VarR3.c = i8 + 3;
                    this.d += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        V(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        uc3 uc3VarR4 = R(4);
                        byte[] bArr4 = uc3VarR4.a;
                        int i11 = uc3VarR4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | Uuid.SIZE_BITS);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | Uuid.SIZE_BITS);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | Uuid.SIZE_BITS);
                        uc3VarR4.c = i11 + 4;
                        this.d += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.wl3
    public final c b() {
        return c.d;
    }

    public final void b0(String str) {
        str.getClass();
        a0(0, str.length(), str);
    }

    public final long c() {
        long j = this.d;
        if (j == 0) {
            return 0L;
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        uc3 uc3Var2 = uc3Var.g;
        uc3Var2.getClass();
        int i = uc3Var2.c;
        return (i >= 8192 || !uc3Var2.e) ? j : j - ((long) (i - uc3Var2.b));
    }

    public final void c0(int i) {
        if (i < 128) {
            V(i);
            return;
        }
        if (i < 2048) {
            uc3 uc3VarR = R(2);
            byte[] bArr = uc3VarR.a;
            int i2 = uc3VarR.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Uuid.SIZE_BITS);
            uc3VarR.c = i2 + 2;
            this.d += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            V(63);
            return;
        }
        if (i < 65536) {
            uc3 uc3VarR2 = R(3);
            byte[] bArr2 = uc3VarR2.a;
            int i3 = uc3VarR2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Uuid.SIZE_BITS);
            bArr2[i3 + 2] = (byte) ((i & 63) | Uuid.SIZE_BITS);
            uc3VarR2.c = i3 + 3;
            this.d += 3;
            return;
        }
        if (i > 1114111) {
            u41.k("Unexpected code point: 0x".concat(vl0.f0(i)));
            return;
        }
        uc3 uc3VarR3 = R(4);
        byte[] bArr3 = uc3VarR3.a;
        int i4 = uc3VarR3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Uuid.SIZE_BITS);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Uuid.SIZE_BITS);
        bArr3[i4 + 3] = (byte) ((i & 63) | Uuid.SIZE_BITS);
        uc3VarR3.c = i4 + 4;
        this.d += 4;
    }

    public final Object clone() {
        dy dyVar = new dy();
        if (this.d == 0) {
            return dyVar;
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        uc3 uc3VarC = uc3Var.c();
        dyVar.c = uc3VarC;
        uc3VarC.g = uc3VarC;
        uc3VarC.f = uc3VarC;
        for (uc3 uc3Var2 = uc3Var.f; uc3Var2 != uc3Var; uc3Var2 = uc3Var2.f) {
            uc3 uc3Var3 = uc3VarC.g;
            uc3Var3.getClass();
            uc3Var2.getClass();
            uc3Var3.b(uc3Var2.c());
        }
        dyVar.d = this.d;
        return dyVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.zh3
    public final void close() {
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) {
        uc3 uc3VarB;
        dyVar.getClass();
        if (dyVar == this) {
            u41.k("source == this");
            return;
        }
        vl0.w(dyVar.d, 0L, j);
        while (j > 0) {
            uc3 uc3Var = dyVar.c;
            uc3Var.getClass();
            int i = uc3Var.c;
            uc3 uc3Var2 = dyVar.c;
            uc3Var2.getClass();
            long j2 = i - uc3Var2.b;
            int i2 = 0;
            if (j < j2) {
                uc3 uc3Var3 = this.c;
                uc3 uc3Var4 = uc3Var3 != null ? uc3Var3.g : null;
                if (uc3Var4 != null && uc3Var4.e) {
                    if ((((long) uc3Var4.c) + j) - ((long) (uc3Var4.d ? 0 : uc3Var4.b)) <= 8192) {
                        uc3 uc3Var5 = dyVar.c;
                        uc3Var5.getClass();
                        uc3Var5.d(uc3Var4, (int) j);
                        dyVar.d -= j;
                        this.d += j;
                        return;
                    }
                }
                uc3 uc3Var6 = dyVar.c;
                uc3Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > uc3Var6.c - uc3Var6.b) {
                    u41.k("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    uc3VarB = uc3Var6.c();
                } else {
                    uc3VarB = xc3.b();
                    byte[] bArr = uc3Var6.a;
                    byte[] bArr2 = uc3VarB.a;
                    int i4 = uc3Var6.b;
                    vl.h0(0, i4, i4 + i3, bArr, bArr2);
                }
                uc3VarB.c = uc3VarB.b + i3;
                uc3Var6.b += i3;
                uc3 uc3Var7 = uc3Var6.g;
                uc3Var7.getClass();
                uc3Var7.b(uc3VarB);
                dyVar.c = uc3VarB;
            }
            uc3 uc3Var8 = dyVar.c;
            uc3Var8.getClass();
            long j3 = uc3Var8.c - uc3Var8.b;
            dyVar.c = uc3Var8.a();
            uc3 uc3Var9 = this.c;
            if (uc3Var9 == null) {
                this.c = uc3Var8;
                uc3Var8.g = uc3Var8;
                uc3Var8.f = uc3Var8;
            } else {
                uc3 uc3Var10 = uc3Var9.g;
                uc3Var10.getClass();
                uc3Var10.b(uc3Var8);
                uc3 uc3Var11 = uc3Var8.g;
                if (uc3Var11 == uc3Var8) {
                    u41.r("cannot compact");
                    return;
                }
                uc3Var11.getClass();
                if (uc3Var11.e) {
                    int i5 = uc3Var8.c - uc3Var8.b;
                    uc3 uc3Var12 = uc3Var8.g;
                    uc3Var12.getClass();
                    int i6 = 8192 - uc3Var12.c;
                    uc3 uc3Var13 = uc3Var8.g;
                    uc3Var13.getClass();
                    if (!uc3Var13.d) {
                        uc3 uc3Var14 = uc3Var8.g;
                        uc3Var14.getClass();
                        i2 = uc3Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        uc3 uc3Var15 = uc3Var8.g;
                        uc3Var15.getClass();
                        uc3Var8.d(uc3Var15, i5);
                        uc3Var8.a();
                        xc3.a(uc3Var8);
                    }
                }
            }
            dyVar.d -= j3;
            this.d += j3;
            j -= j3;
        }
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my e(lz lzVar) {
        T(lzVar);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        long j = this.d;
        dy dyVar = (dy) obj;
        if (j != dyVar.d) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        uc3 uc3Var2 = dyVar.c;
        uc3Var2.getClass();
        int i = uc3Var.b;
        int i2 = uc3Var2.b;
        long j2 = 0;
        while (j2 < this.d) {
            long jMin = Math.min(uc3Var.c - i, uc3Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (uc3Var.a[i] != uc3Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == uc3Var.c) {
                uc3Var = uc3Var.f;
                uc3Var.getClass();
                i = uc3Var.b;
            }
            if (i2 == uc3Var2.c) {
                uc3Var2 = uc3Var2.f;
                uc3Var2.getClass();
                i2 = uc3Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my f(long j) {
        X(j);
        return this;
    }

    @Override // defpackage.my, defpackage.zh3, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.ny
    public final lz g(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            u41.h(ud2.o("byteCount: ", j));
            return null;
        }
        if (this.d < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new lz(K(j));
        }
        lz lzVarQ = Q((int) j);
        skip(j);
        return lzVarQ;
    }

    public final void h(dy dyVar, long j, long j2) {
        dyVar.getClass();
        long j3 = j;
        vl0.w(this.d, j3, j2);
        if (j2 == 0) {
            return;
        }
        dyVar.d += j2;
        uc3 uc3Var = this.c;
        while (true) {
            uc3Var.getClass();
            long j4 = uc3Var.c - uc3Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            uc3Var = uc3Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            uc3Var.getClass();
            uc3 uc3VarC = uc3Var.c();
            int i = uc3VarC.b + ((int) j3);
            uc3VarC.b = i;
            uc3VarC.c = Math.min(i + ((int) j5), uc3VarC.c);
            uc3 uc3Var2 = dyVar.c;
            if (uc3Var2 == null) {
                uc3VarC.g = uc3VarC;
                uc3VarC.f = uc3VarC;
                dyVar.c = uc3VarC;
            } else {
                uc3 uc3Var3 = uc3Var2.g;
                uc3Var3.getClass();
                uc3Var3.b(uc3VarC);
            }
            j5 -= (long) (uc3VarC.c - uc3VarC.b);
            uc3Var = uc3Var.f;
            j3 = 0;
        }
    }

    public final int hashCode() {
        uc3 uc3Var = this.c;
        if (uc3Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uc3Var.c;
            for (int i3 = uc3Var.b; i3 < i2; i3++) {
                i = (i * 31) + uc3Var.a[i3];
            }
            uc3Var = uc3Var.f;
            uc3Var.getClass();
        } while (uc3Var != this.c);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.ny
    public final boolean j(long j) {
        return this.d >= j;
    }

    public final byte l(long j) {
        vl0.w(this.d, j, 1L);
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        long j2 = this.d;
        if (j2 - j < j) {
            while (j2 > j) {
                uc3Var = uc3Var.g;
                uc3Var.getClass();
                j2 -= (long) (uc3Var.c - uc3Var.b);
            }
            return uc3Var.a[(int) ((((long) uc3Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = uc3Var.c;
            int i2 = uc3Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return uc3Var.a[(int) ((((long) i2) + j) - j3)];
            }
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.ny
    public final String n() {
        return z(LongCompanionObject.MAX_VALUE);
    }

    @Override // defpackage.ny
    public final byte[] o() {
        return K(this.d);
    }

    public final long p(byte b, long j, long j2) {
        uc3 uc3Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.d + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.d;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (uc3Var = this.c) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                uc3Var = uc3Var.g;
                uc3Var.getClass();
                j6 -= (long) (uc3Var.c - uc3Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = uc3Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(uc3Var.c, (((long) uc3Var.b) + j4) - j6);
                for (int i = (int) ((((long) uc3Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - uc3Var.b)) + j6;
                    }
                }
                j6 += (long) (uc3Var.c - uc3Var.b);
                uc3Var = uc3Var.f;
                uc3Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (uc3Var.c - uc3Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = uc3Var.a;
            int iMin2 = (int) Math.min(uc3Var.c, (((long) uc3Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) uc3Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - uc3Var.b)) + j5;
                }
            }
            j5 += (long) (uc3Var.c - uc3Var.b);
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // defpackage.ny
    public final u23 peek() {
        return new u23(new nu2(this));
    }

    @Override // defpackage.ny
    public final dy q() {
        return this;
    }

    @Override // defpackage.ny
    public final boolean r() {
        return this.d == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        uc3 uc3Var = this.c;
        if (uc3Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), uc3Var.c - uc3Var.b);
        byteBuffer.put(uc3Var.a, uc3Var.b, iMin);
        int i = uc3Var.b + iMin;
        uc3Var.b = i;
        this.d -= (long) iMin;
        if (i == uc3Var.c) {
            this.c = uc3Var.a();
            xc3.a(uc3Var);
        }
        return iMin;
    }

    public final int read(byte[] bArr, int i, int i2) {
        vl0.w(bArr.length, i, i2);
        uc3 uc3Var = this.c;
        if (uc3Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, uc3Var.c - uc3Var.b);
        byte[] bArr2 = uc3Var.a;
        int i3 = uc3Var.b;
        vl.h0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = uc3Var.b + iMin;
        uc3Var.b = i4;
        this.d -= (long) iMin;
        if (i4 == uc3Var.c) {
            this.c = uc3Var.a();
            xc3.a(uc3Var);
        }
        return iMin;
    }

    @Override // defpackage.ny
    public final byte readByte() {
        if (this.d == 0) {
            throw new EOFException();
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        int i = uc3Var.b;
        int i2 = uc3Var.c;
        int i3 = i + 1;
        byte b = uc3Var.a[i];
        this.d--;
        if (i3 != i2) {
            uc3Var.b = i3;
            return b;
        }
        this.c = uc3Var.a();
        xc3.a(uc3Var);
        return b;
    }

    @Override // defpackage.ny
    public final int readInt() throws EOFException {
        if (this.d < 4) {
            throw new EOFException();
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        int i = uc3Var.b;
        int i2 = uc3Var.c;
        if (i2 - i < 4) {
            return (readByte() & UByte.MAX_VALUE) | ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8);
        }
        byte[] bArr = uc3Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        this.d -= 4;
        if (i5 != i2) {
            uc3Var.b = i5;
            return i6;
        }
        this.c = uc3Var.a();
        xc3.a(uc3Var);
        return i6;
    }

    @Override // defpackage.ny
    public final short readShort() throws EOFException {
        if (this.d < 2) {
            throw new EOFException();
        }
        uc3 uc3Var = this.c;
        uc3Var.getClass();
        int i = uc3Var.b;
        int i2 = uc3Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & UByte.MAX_VALUE) | ((readByte() & UByte.MAX_VALUE) << 8));
        }
        byte[] bArr = uc3Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & UByte.MAX_VALUE) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & UByte.MAX_VALUE) | i4;
        this.d -= 2;
        if (i5 == i2) {
            this.c = uc3Var.a();
            xc3.a(uc3Var);
        } else {
            uc3Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ny
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            uc3 uc3Var = this.c;
            if (uc3Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, uc3Var.c - uc3Var.b);
            long j2 = iMin;
            this.d -= j2;
            j -= j2;
            int i = uc3Var.b + iMin;
            uc3Var.b = i;
            if (i == uc3Var.c) {
                this.c = uc3Var.a();
                xc3.a(uc3Var);
            }
        }
    }

    @Override // defpackage.ny
    public final int t(iq2 iq2Var) throws EOFException {
        iq2Var.getClass();
        int iD = b.d(this, iq2Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(iq2Var.c[iD].c());
        return iD;
    }

    public final String toString() {
        long j = this.d;
        if (j <= 2147483647L) {
            return Q((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.d).toString());
    }

    @Override // defpackage.ny
    public final String v() {
        long jP = p((byte) 10, 0L, LongCompanionObject.MAX_VALUE);
        if (jP != -1) {
            return b.c(this, jP);
        }
        long j = this.d;
        if (j != 0) {
            return O(j, q30.a);
        }
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            uc3 uc3VarR = R(1);
            int iMin = Math.min(i, 8192 - uc3VarR.c);
            byteBuffer.get(uc3VarR.a, uc3VarR.c, iMin);
            i -= iMin;
            uc3VarR.c += iMin;
        }
        this.d += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.my
    public final my write(byte[] bArr) {
        bArr.getClass();
        S(bArr.length, bArr);
        return this;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my writeByte(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my writeInt(int i) {
        Y(i);
        return this;
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ my writeShort(int i) {
        Z(i);
        return this;
    }

    public final long x(lz lzVar) {
        int i;
        int i2;
        lzVar.getClass();
        uc3 uc3Var = this.c;
        if (uc3Var == null) {
            return -1L;
        }
        long j = this.d;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                uc3Var = uc3Var.g;
                uc3Var.getClass();
                j -= (long) (uc3Var.c - uc3Var.b);
            }
            if (lzVar.c() == 2) {
                byte bH = lzVar.h(0);
                byte bH2 = lzVar.h(1);
                while (j < this.d) {
                    byte[] bArr = uc3Var.a;
                    i = (int) ((((long) uc3Var.b) + j2) - j);
                    int i3 = uc3Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (uc3Var.c - uc3Var.b)) + j;
                            uc3Var = uc3Var.f;
                            uc3Var.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bH || b == bH2) {
                                i2 = uc3Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrG = lzVar.g();
            while (j < this.d) {
                byte[] bArr2 = uc3Var.a;
                i = (int) ((((long) uc3Var.b) + j2) - j);
                int i4 = uc3Var.c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrG.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrG[i5]) {
                                i2 = uc3Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (uc3Var.c - uc3Var.b)) + j;
                        uc3Var = uc3Var.f;
                        uc3Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (uc3Var.c - uc3Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j = j3;
        }
        if (lzVar.c() == 2) {
            byte bH3 = lzVar.h(0);
            byte bH4 = lzVar.h(1);
            while (j < this.d) {
                byte[] bArr3 = uc3Var.a;
                i = (int) ((((long) uc3Var.b) + j2) - j);
                int i6 = uc3Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (uc3Var.c - uc3Var.b)) + j;
                        uc3Var = uc3Var.f;
                        uc3Var.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bH3 || b3 == bH4) {
                            i2 = uc3Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrG2 = lzVar.g();
        while (j < this.d) {
            byte[] bArr4 = uc3Var.a;
            i = (int) ((((long) uc3Var.b) + j2) - j);
            int i7 = uc3Var.c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrG2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrG2[i8]) {
                            i2 = uc3Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (uc3Var.c - uc3Var.b)) + j;
                    uc3Var = uc3Var.f;
                    uc3Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) {
        dyVar.getClass();
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        dyVar.d(this, j);
        return j;
    }

    @Override // defpackage.ny
    public final String z(long j) throws EOFException {
        if (j < 0) {
            u41.h(ud2.o("limit < 0: ", j));
            return null;
        }
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j + 1;
        }
        long j3 = j2;
        long jP = p((byte) 10, 0L, j3);
        if (jP != -1) {
            return b.c(this, jP);
        }
        if (j3 < this.d && l(j3 - 1) == 13 && l(j3) == 10) {
            return b.c(this, j3);
        }
        dy dyVar = new dy();
        h(dyVar, 0L, Math.min(32L, this.d));
        throw new EOFException("\\n not found: limit=" + Math.min(this.d, j) + " content=" + dyVar.g(dyVar.d).d() + Typography.ellipsis);
    }
}
