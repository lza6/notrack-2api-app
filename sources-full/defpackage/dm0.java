package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Headers$Companion;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements pl3 {
    public static final cm0 a = new cm0();

    @Override // defpackage.pl3
    public final String a(SSLSocket sSLSocket) {
        if (d(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.pl3
    public final boolean b() {
        boolean z = bm0.d;
        return bm0.d;
    }

    @Override // defpackage.pl3
    public final void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (d(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            vv2 vv2Var = vv2.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Headers$Companion.alpnProtocolNames(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.pl3
    public final boolean d(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
