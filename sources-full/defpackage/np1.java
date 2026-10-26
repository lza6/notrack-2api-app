package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class np1 extends wi {
    public final /* synthetic */ int c;

    public np1(int i, byte[] bArr) throws GeneralSecurityException {
        this.c = i;
        if (!ud2.a(1)) {
            m51.v("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.a = j(1, bArr);
        this.b = j(0, bArr);
    }

    @Override // defpackage.wi
    public final be0 j(int i, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new mp1(bArr, i, 0);
            default:
                return new mp1(bArr, i, 1);
        }
    }
}
