package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz extends kz {
    public final int m;
    public final int n;

    public iz(byte[] bArr, int i, int i2) {
        super(bArr);
        mz.d(i, i + i2, bArr.length);
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.kz, defpackage.mz
    public final byte b(int i) {
        int i2 = this.n;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.l[this.m + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ud2.m(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ud2.l(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.kz, defpackage.mz
    public final void j(int i, byte[] bArr) {
        System.arraycopy(this.l, this.m, bArr, 0, i);
    }

    @Override // defpackage.kz
    public final int l() {
        return this.m;
    }

    @Override // defpackage.kz
    public final byte m(int i) {
        return this.l[this.m + i];
    }

    @Override // defpackage.kz, defpackage.mz
    public final int size() {
        return this.n;
    }
}
