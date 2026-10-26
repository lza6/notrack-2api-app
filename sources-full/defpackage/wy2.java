package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class wy2 implements u82 {
    public final uy2 a;
    public final int b;

    public wy2(uy2 uy2Var, int i) throws InvalidAlgorithmParameterException {
        this.a = uy2Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        uy2Var.a(i, new byte[0]);
    }

    @Override // defpackage.u82
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        m51.v("invalid MAC");
    }

    @Override // defpackage.u82
    public final byte[] b(byte[] bArr) {
        return this.a.a(this.b, bArr);
    }
}
