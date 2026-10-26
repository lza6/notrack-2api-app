package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip4 extends jp4 {
    public final byte[] h;
    public final int l;
    public final int m;

    public ip4(byte[] bArr, int i, int i2) {
        jp4.n(i, i + i2, bArr.length);
        this.h = bArr;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.jp4
    public final byte b(int i) {
        return this.h[this.l + i];
    }

    @Override // defpackage.jp4
    public final int d(int i, int i2) {
        return wp4.a(i, this.h, this.l, i2);
    }

    @Override // defpackage.jp4
    public final int g() {
        return this.m;
    }

    @Override // defpackage.jp4
    public final jp4 j(int i, int i2) {
        int iN = jp4.n(i, i2, this.m);
        if (iN == 0) {
            return jp4.d;
        }
        return new ip4(this.h, this.l + i, iN);
    }

    @Override // defpackage.jp4
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.h, this.l, bArr, 0, i);
    }

    @Override // defpackage.jp4
    public final void l(bk bkVar) {
        bkVar.t(this.h, this.l, this.m);
    }

    @Override // defpackage.jp4
    public final boolean m(jp4 jp4Var) {
        boolean z = jp4Var instanceof kp4;
        if (!z && !(jp4Var instanceof ip4)) {
            return jp4Var.m(this);
        }
        int iG = jp4Var.g();
        int i = this.m;
        if (i > iG) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > jp4Var.g()) {
            u41.k(ud2.l(i, jp4Var.g(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.h;
        int i2 = this.l;
        if (z) {
            return jp4.p(i2, 0, i, bArr, ((kp4) jp4Var).h);
        }
        if (!(jp4Var instanceof ip4)) {
            return jp4Var.j(0, i).equals(j(i2, i + i2));
        }
        ip4 ip4Var = (ip4) jp4Var;
        return jp4.p(i2, ip4Var.l, i, bArr, ip4Var.h);
    }
}
