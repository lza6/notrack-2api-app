package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kp4 extends jp4 {
    public final byte[] h;

    public kp4(byte[] bArr) {
        this.h = bArr;
    }

    @Override // defpackage.jp4
    public final byte b(int i) {
        return this.h[i];
    }

    @Override // defpackage.jp4
    public final int d(int i, int i2) {
        return wp4.a(i, this.h, 0, i2);
    }

    @Override // defpackage.jp4
    public final int g() {
        return this.h.length;
    }

    @Override // defpackage.jp4
    public final jp4 j(int i, int i2) {
        byte[] bArr = this.h;
        int iN = jp4.n(0, i2, bArr.length);
        return iN == 0 ? jp4.d : new ip4(bArr, 0, iN);
    }

    @Override // defpackage.jp4
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.h, 0, bArr, 0, i);
    }

    @Override // defpackage.jp4
    public final void l(bk bkVar) {
        byte[] bArr = this.h;
        bkVar.t(bArr, 0, bArr.length);
    }

    @Override // defpackage.jp4
    public final boolean m(jp4 jp4Var) {
        boolean z = jp4Var instanceof kp4;
        byte[] bArr = this.h;
        if (z) {
            return Arrays.equals(bArr, ((kp4) jp4Var).h);
        }
        boolean z2 = jp4Var instanceof ip4;
        if (!z2) {
            return jp4Var.m(this);
        }
        ip4 ip4Var = (ip4) jp4Var;
        int i = ip4Var.m;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            u41.k(ud2.l(length, i, "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return jp4.p(0, 0, length, bArr, ((kp4) jp4Var).h);
        }
        if (!z2) {
            return jp4Var.j(0, length).equals(j(0, length));
        }
        return jp4.p(0, ip4Var.l, length, bArr, ip4Var.h);
    }
}
