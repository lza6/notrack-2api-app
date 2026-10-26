package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hr4 extends wq4 {
    public final byte[] f;

    public hr4(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // defpackage.wq4
    public final byte[] i() {
        return this.f;
    }
}
