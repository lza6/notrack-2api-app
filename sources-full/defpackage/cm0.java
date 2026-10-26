package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements bu0 {
    @Override // defpackage.bu0
    public final boolean d(SSLSocket sSLSocket) {
        return bm0.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.bu0
    public final pl3 g(SSLSocket sSLSocket) {
        return new dm0();
    }
}
