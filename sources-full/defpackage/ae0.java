package defpackage;

import app.template.extension.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 extends be0 {
    public final ByteArrayInputStream h;
    public final byte[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r = IntCompanionObject.MAX_VALUE;

    public ae0(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = zq1.a;
        this.h = byteArrayInputStream;
        this.l = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        this.m = 0;
        this.o = 0;
        this.q = 0;
    }

    @Override // defpackage.be0
    public final int A() {
        return M();
    }

    @Override // defpackage.be0
    public final long B() {
        return N();
    }

    @Override // defpackage.be0
    public final int C() {
        return be0.d(O());
    }

    @Override // defpackage.be0
    public final long D() {
        return be0.e(P());
    }

    @Override // defpackage.be0
    public final String E() throws sr1 {
        int iO = O();
        byte[] bArr = this.l;
        if (iO > 0) {
            int i = this.m;
            int i2 = this.o;
            if (iO <= i - i2) {
                String str = new String(bArr, i2, iO, zq1.a);
                this.o += iO;
                return str;
            }
        }
        if (iO == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iO > this.m) {
            return new String(J(iO), zq1.a);
        }
        S(iO);
        String str2 = new String(bArr, this.o, iO, zq1.a);
        this.o += iO;
        return str2;
    }

    @Override // defpackage.be0
    public final String F() throws IOException {
        int iO = O();
        int i = this.o;
        int i2 = this.m;
        int i3 = i2 - i;
        byte[] bArrJ = this.l;
        if (iO <= i3 && iO > 0) {
            this.o = i + iO;
        } else {
            if (iO == 0) {
                return BuildConfig.VERSION_NAME;
            }
            i = 0;
            if (iO <= i2) {
                S(iO);
                this.o = iO;
            } else {
                bArrJ = J(iO);
            }
        }
        return ha4.a.m(bArrJ, i, iO);
    }

    @Override // defpackage.be0
    public final int G() throws sr1 {
        if (h()) {
            this.p = 0;
            return 0;
        }
        int iO = O();
        this.p = iO;
        if ((iO >>> 3) != 0) {
            return iO;
        }
        throw sr1.a();
    }

    @Override // defpackage.be0
    public final int H() {
        return O();
    }

    @Override // defpackage.be0
    public final long I() {
        return P();
    }

    public final byte[] J(int i) throws IOException {
        byte[] bArrK = K(i);
        if (bArrK != null) {
            return bArrK;
        }
        int i2 = this.o;
        int i3 = this.m;
        int length = i3 - i2;
        this.q += i3;
        this.o = 0;
        this.m = 0;
        ArrayList arrayListL = L(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.l, i2, bArr, 0, length);
        int size = arrayListL.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListL.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i) throws IOException {
        if (i == 0) {
            return zq1.b;
        }
        if (i < 0) {
            throw sr1.e();
        }
        int i2 = this.q;
        int i3 = this.o;
        int i4 = i2 + i3 + i;
        if (i4 - IntCompanionObject.MAX_VALUE > 0) {
            throw new sr1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.r;
        if (i4 > i5) {
            T((i5 - i2) - i3);
            throw sr1.g();
        }
        int i6 = this.m - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.h;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (sr1 e) {
                e.c = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.l, this.o, bArr, 0, i6);
        this.q += this.m;
        this.o = 0;
        this.m = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw sr1.g();
                }
                this.q += i8;
                i6 += i8;
            } catch (sr1 e2) {
                e2.c = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList L(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, ConstantsKt.DEFAULT_BLOCK_SIZE);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.h.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw sr1.g();
                }
                this.q += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int M() throws sr1 {
        int i = this.o;
        if (this.m - i < 4) {
            S(4);
            i = this.o;
        }
        this.o = i + 4;
        byte[] bArr = this.l;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long N() throws sr1 {
        int i = this.o;
        if (this.m - i < 8) {
            S(8);
            i = this.o;
        }
        this.o = i + 8;
        byte[] bArr = this.l;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int O() {
        int i;
        int i2 = this.o;
        int i3 = this.m;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.l;
            byte b = bArr[i2];
            if (b >= 0) {
                this.o = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.o = i5;
                return i;
            }
        }
        return (int) Q();
    }

    public final long P() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.o;
        int i2 = this.m;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.l;
            byte b = bArr[i];
            if (b >= 0) {
                this.o = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.o = i4;
                return j;
            }
        }
        return Q();
    }

    public final long Q() throws sr1 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.o == this.m) {
                S(1);
            }
            int i2 = this.o;
            this.o = i2 + 1;
            byte b = this.l[i2];
            j |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw sr1.d();
    }

    public final void R() {
        int i = this.m + this.n;
        this.m = i;
        int i2 = this.q + i;
        int i3 = this.r;
        if (i2 <= i3) {
            this.n = 0;
            return;
        }
        int i4 = i2 - i3;
        this.n = i4;
        this.m = i - i4;
    }

    public final void S(int i) throws sr1 {
        if (U(i)) {
            return;
        }
        if (i <= (IntCompanionObject.MAX_VALUE - this.q) - this.o) {
            throw sr1.g();
        }
        throw new sr1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void T(int i) throws sr1 {
        int i2 = this.m;
        int i3 = this.o;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.o = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.h;
        if (i < 0) {
            throw sr1.e();
        }
        int i5 = this.q;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.r;
        if (i7 > i8) {
            T((i8 - i5) - i3);
            throw sr1.g();
        }
        this.q = i6;
        this.m = 0;
        this.o = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (sr1 e) {
                    e.c = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.q += i4;
                R();
                throw th;
            }
        }
        this.q += i4;
        R();
        if (i4 >= i) {
            return;
        }
        int i9 = this.m;
        int i10 = i9 - this.o;
        this.o = i9;
        S(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.m;
            if (i11 <= i12) {
                this.o = i11;
                return;
            } else {
                i10 += i12;
                this.o = i12;
                S(1);
            }
        }
    }

    public final boolean U(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.h;
        int i2 = this.o;
        int i3 = i2 + i;
        int i4 = this.m;
        if (i3 <= i4) {
            u41.r(ud2.q("refillBuffer() called when ", " bytes were already available in buffer", i));
            return false;
        }
        int i5 = this.q;
        if (i <= (IntCompanionObject.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.r) {
            byte[] bArr = this.l;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.q += i2;
                this.m -= i2;
                this.o = 0;
            }
            int i6 = this.m;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (IntCompanionObject.MAX_VALUE - this.q) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.m += i7;
                    R();
                    if (this.m >= i) {
                        return true;
                    }
                    return U(i);
                }
            } catch (sr1 e) {
                e.c = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.be0
    public final void b(int i) throws sr1 {
        if (this.p != i) {
            throw new sr1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.be0
    public final int g() {
        return this.q + this.o;
    }

    @Override // defpackage.be0
    public final boolean h() {
        return this.o == this.m && !U(1);
    }

    @Override // defpackage.be0
    public final void o(int i) {
        this.r = i;
        R();
    }

    @Override // defpackage.be0
    public final int q(int i) throws sr1 {
        if (i < 0) {
            throw sr1.e();
        }
        int i2 = this.q + this.o + i;
        int i3 = this.r;
        if (i2 > i3) {
            throw sr1.g();
        }
        this.r = i2;
        R();
        return i3;
    }

    @Override // defpackage.be0
    public final boolean r() {
        return P() != 0;
    }

    @Override // defpackage.be0
    public final kz s() throws IOException {
        int iO = O();
        int i = this.m;
        int i2 = this.o;
        int i3 = i - i2;
        byte[] bArr = this.l;
        if (iO <= i3 && iO > 0) {
            kz kzVarG = mz.g(bArr, i2, iO);
            this.o += iO;
            return kzVarG;
        }
        if (iO == 0) {
            return mz.d;
        }
        byte[] bArrK = K(iO);
        if (bArrK != null) {
            return mz.g(bArrK, 0, bArrK.length);
        }
        int i4 = this.o;
        int i5 = this.m;
        int length = i5 - i4;
        this.q += i5;
        this.o = 0;
        this.m = 0;
        ArrayList arrayListL = L(iO - length);
        byte[] bArr2 = new byte[iO];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListL.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListL.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        kz kzVar = mz.d;
        return new kz(bArr2);
    }

    @Override // defpackage.be0
    public final double t() {
        return Double.longBitsToDouble(N());
    }

    @Override // defpackage.be0
    public final int u() {
        return O();
    }

    @Override // defpackage.be0
    public final int v() {
        return M();
    }

    @Override // defpackage.be0
    public final long w() {
        return N();
    }

    @Override // defpackage.be0
    public final float x() {
        return Float.intBitsToFloat(M());
    }

    @Override // defpackage.be0
    public final int y() {
        return O();
    }

    @Override // defpackage.be0
    public final long z() {
        return P();
    }
}
