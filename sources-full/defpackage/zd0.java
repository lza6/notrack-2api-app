package defpackage;

import app.template.extension.BuildConfig;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class zd0 extends be0 {
    public final byte[] h;
    public int l;
    public int m;
    public int n;
    public final int o;
    public int p;
    public int q = IntCompanionObject.MAX_VALUE;

    public zd0(byte[] bArr, int i, int i2, boolean z) {
        this.h = bArr;
        this.l = i2 + i;
        this.n = i;
        this.o = i;
    }

    @Override // defpackage.be0
    public final int A() {
        return J();
    }

    @Override // defpackage.be0
    public final long B() {
        return K();
    }

    @Override // defpackage.be0
    public final int C() {
        return be0.d(L());
    }

    @Override // defpackage.be0
    public final long D() {
        return be0.e(M());
    }

    @Override // defpackage.be0
    public final String E() throws sr1 {
        int iL = L();
        if (iL > 0) {
            int i = this.l;
            int i2 = this.n;
            if (iL <= i - i2) {
                String str = new String(this.h, i2, iL, zq1.a);
                this.n += iL;
                return str;
            }
        }
        if (iL == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iL < 0) {
            throw sr1.e();
        }
        throw sr1.g();
    }

    @Override // defpackage.be0
    public final String F() throws sr1 {
        int iL = L();
        if (iL > 0) {
            int i = this.l;
            int i2 = this.n;
            if (iL <= i - i2) {
                String strM = ha4.a.m(this.h, i2, iL);
                this.n += iL;
                return strM;
            }
        }
        if (iL == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (iL <= 0) {
            throw sr1.e();
        }
        throw sr1.g();
    }

    @Override // defpackage.be0
    public final int G() throws sr1 {
        if (h()) {
            this.p = 0;
            return 0;
        }
        int iL = L();
        this.p = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw sr1.a();
    }

    @Override // defpackage.be0
    public final int H() {
        return L();
    }

    @Override // defpackage.be0
    public final long I() {
        return M();
    }

    public final int J() throws sr1 {
        int i = this.n;
        if (this.l - i < 4) {
            throw sr1.g();
        }
        this.n = i + 4;
        byte[] bArr = this.h;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long K() throws sr1 {
        int i = this.n;
        if (this.l - i < 8) {
            throw sr1.g();
        }
        this.n = i + 8;
        byte[] bArr = this.h;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int L() {
        int i;
        int i2 = this.n;
        int i3 = this.l;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.h;
            byte b = bArr[i2];
            if (b >= 0) {
                this.n = i4;
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
                this.n = i5;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.n;
        int i2 = this.l;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.h;
            byte b = bArr[i];
            if (b >= 0) {
                this.n = i3;
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
                this.n = i4;
                return j;
            }
        }
        return N();
    }

    public final long N() throws sr1 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.n;
            if (i2 == this.l) {
                throw sr1.g();
            }
            this.n = i2 + 1;
            byte b = this.h[i2];
            j |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw sr1.d();
    }

    public final void O() {
        int i = this.l + this.m;
        this.l = i;
        int i2 = i - this.o;
        int i3 = this.q;
        if (i2 <= i3) {
            this.m = 0;
            return;
        }
        int i4 = i2 - i3;
        this.m = i4;
        this.l = i - i4;
    }

    @Override // defpackage.be0
    public final void b(int i) throws sr1 {
        if (this.p != i) {
            throw new sr1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.be0
    public final int g() {
        return this.n - this.o;
    }

    @Override // defpackage.be0
    public final boolean h() {
        return this.n == this.l;
    }

    @Override // defpackage.be0
    public final void o(int i) {
        this.q = i;
        O();
    }

    @Override // defpackage.be0
    public final int q(int i) throws sr1 {
        if (i < 0) {
            throw sr1.e();
        }
        int iG = g() + i;
        if (iG < 0) {
            throw sr1.f();
        }
        int i2 = this.q;
        if (iG > i2) {
            throw sr1.g();
        }
        this.q = iG;
        O();
        return i2;
    }

    @Override // defpackage.be0
    public final boolean r() {
        return M() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.be0
    public final kz s() throws sr1 {
        byte[] bArrCopyOfRange;
        int iL = L();
        byte[] bArr = this.h;
        if (iL > 0) {
            int i = this.l;
            int i2 = this.n;
            if (iL <= i - i2) {
                kz kzVarG = mz.g(bArr, i2, iL);
                this.n += iL;
                return kzVarG;
            }
        }
        if (iL == 0) {
            return mz.d;
        }
        if (iL > 0) {
            int i3 = this.l;
            int i4 = this.n;
            if (iL <= i3 - i4) {
                int i5 = iL + i4;
                this.n = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iL <= 0) {
                    throw sr1.g();
                }
                if (iL == 0) {
                    throw sr1.e();
                }
                bArrCopyOfRange = zq1.b;
            }
        } else {
            if (iL <= 0) {
                throw sr1.g();
            }
            if (iL == 0) {
                throw sr1.e();
            }
            bArrCopyOfRange = zq1.b;
        }
        kz kzVar = mz.d;
        return new kz(bArrCopyOfRange);
    }

    @Override // defpackage.be0
    public final double t() {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.be0
    public final int u() {
        return L();
    }

    @Override // defpackage.be0
    public final int v() {
        return J();
    }

    @Override // defpackage.be0
    public final long w() {
        return K();
    }

    @Override // defpackage.be0
    public final float x() {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.be0
    public final int y() {
        return L();
    }

    @Override // defpackage.be0
    public final long z() {
        return M();
    }
}
