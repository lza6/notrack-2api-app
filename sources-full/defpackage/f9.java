package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import app.template.extension.BuildConfig;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class f9 implements pl3 {
    @Override // defpackage.pl3
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(BuildConfig.VERSION_NAME)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.pl3
    public final boolean b() {
        vv2 vv2Var = vv2.a;
        return Headers$Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.pl3
    public final void c(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            vv2 vv2Var = vv2.a;
            sSLParameters.setApplicationProtocols((String[]) Headers$Companion.alpnProtocolNames(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.pl3
    public final boolean d(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }
}
