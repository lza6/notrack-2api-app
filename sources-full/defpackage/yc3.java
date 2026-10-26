package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class yc3 extends lz {
    public final transient byte[][] m;
    public final transient int[] n;

    public yc3(byte[][] bArr, int[] iArr) {
        super(lz.l.c);
        this.m = bArr;
        this.n = iArr;
    }

    @Override // defpackage.lz
    public final lz b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.m;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.n;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new lz(bArrDigest);
    }

    @Override // defpackage.lz
    public final int c() {
        return this.n[this.m.length - 1];
    }

    @Override // defpackage.lz
    public final String d() {
        return s().d();
    }

    @Override // defpackage.lz
    public final int e(int i, byte[] bArr) {
        bArr.getClass();
        return s().e(i, bArr);
    }

    @Override // defpackage.lz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lz) {
            lz lzVar = (lz) obj;
            if (lzVar.c() == c() && k(0, lzVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lz
    public final byte[] g() {
        return r();
    }

    @Override // defpackage.lz
    public final byte h(int i) {
        byte[][] bArr = this.m;
        int length = bArr.length - 1;
        int[] iArr = this.n;
        vl0.w(iArr[length], i, 1L);
        int iO = py.O(this, i);
        return bArr[iO][(i - (iO == 0 ? 0 : iArr[iO - 1])) + iArr[bArr.length + iO]];
    }

    @Override // defpackage.lz
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.m;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.n;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.d = i3;
        return i3;
    }

    @Override // defpackage.lz
    public final int i(byte[] bArr) {
        bArr.getClass();
        return s().i(bArr);
    }

    @Override // defpackage.lz
    public final boolean k(int i, lz lzVar, int i2) {
        lzVar.getClass();
        if (i >= 0 && i <= c() - i2) {
            int i3 = i2 + i;
            int iO = py.O(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.n;
                int i5 = iO == 0 ? 0 : iArr[iO - 1];
                int i6 = iArr[iO] - i5;
                byte[][] bArr = this.m;
                int i7 = iArr[bArr.length + iO];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (lzVar.l(i4, bArr[iO], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iO++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lz
    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iO = py.O(this, i);
        while (i < i4) {
            int[] iArr = this.n;
            int i5 = iO == 0 ? 0 : iArr[iO - 1];
            int i6 = iArr[iO] - i5;
            byte[][] bArr2 = this.m;
            int i7 = iArr[bArr2.length + iO];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!vl0.s((i - i5) + i7, i2, iMin, bArr2[iO], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iO++;
        }
        return true;
    }

    @Override // defpackage.lz
    public final lz m(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = c();
        }
        if (i < 0) {
            u41.h(ud2.q("beginIndex=", " < 0", i));
            return null;
        }
        if (i2 > c()) {
            StringBuilder sbS = ud2.s("endIndex=", " > length(", i2);
            sbS.append(c());
            sbS.append(')');
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            u41.h(ud2.l(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == c()) {
            return this;
        }
        if (i == i2) {
            return lz.l;
        }
        int iO = py.O(this, i);
        int iO2 = py.O(this, i2 - 1);
        byte[][] bArr = this.m;
        byte[][] bArr2 = (byte[][]) vl.o0(bArr, iO, iO2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.n;
        if (iO <= iO2) {
            int i4 = iO;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iO2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iO != 0 ? iArr2[iO - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new yc3(bArr2, iArr);
    }

    @Override // defpackage.lz
    public final lz o() {
        return s().o();
    }

    @Override // defpackage.lz
    public final void q(dy dyVar, int i) {
        int iO = py.O(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.n;
            int i3 = iO == 0 ? 0 : iArr[iO - 1];
            int i4 = iArr[iO] - i3;
            byte[][] bArr = this.m;
            int i5 = iArr[bArr.length + iO];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            uc3 uc3Var = new uc3(bArr[iO], i6, i6 + iMin, true);
            uc3 uc3Var2 = dyVar.c;
            if (uc3Var2 == null) {
                uc3Var.g = uc3Var;
                uc3Var.f = uc3Var;
                dyVar.c = uc3Var;
            } else {
                uc3 uc3Var3 = uc3Var2.g;
                uc3Var3.getClass();
                uc3Var3.b(uc3Var);
            }
            i2 += iMin;
            iO++;
        }
        dyVar.d += (long) i;
    }

    public final byte[] r() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.m;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.n;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            vl.h0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final lz s() {
        return new lz(r());
    }

    @Override // defpackage.lz
    public final String toString() {
        return s().toString();
    }
}
