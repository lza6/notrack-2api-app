package defpackage;

import app.template.extension.BuildConfig;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Headers$Companion;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class rw implements pl3 {
    public static final qw a = new qw();

    @Override // defpackage.pl3
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(BuildConfig.VERSION_NAME)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.pl3
    public final boolean b() {
        boolean z = pw.d;
        return pw.d;
    }

    @Override // defpackage.pl3
    public final void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (d(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            vv2 vv2Var = vv2.a;
            parameters.setApplicationProtocols((String[]) Headers$Companion.alpnProtocolNames(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.pl3
    public final boolean d(SSLSocket sSLSocket) {
        return false;
    }
}
