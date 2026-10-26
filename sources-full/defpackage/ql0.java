package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class ql0 {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public ql0(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    public final pl0 a(SSLSocket sSLSocket) throws UnknownServiceException {
        pl0 pl0Var;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                pl0Var = null;
                break;
            }
            pl0Var = (pl0) list.get(i2);
            if (pl0Var.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (pl0Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            String string = Arrays.toString(enabledProtocols2);
            string.getClass();
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((pl0) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        ?? r0 = pl0Var.d;
        String[] strArr = pl0Var.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            enabledCipherSuites2.getClass();
            enabledCipherSuites = ka4.o(enabledCipherSuites2, strArr, sc0.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r0 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            enabledProtocols3.getClass();
            enabledProtocols = ka4.o(enabledProtocols3, r0, bj2.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        fb1 fb1Var = sc0.c;
        byte[] bArr = ka4.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (fb1Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            enabledCipherSuites.getClass();
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ol0 ol0Var = new ol0();
        ol0Var.a = pl0Var.a;
        ol0Var.c = strArr;
        ol0Var.d = r0;
        ol0Var.b = pl0Var.b;
        enabledCipherSuites.getClass();
        ol0Var.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        enabledProtocols.getClass();
        ol0Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        pl0 pl0VarA = ol0Var.a();
        if (pl0VarA.c() != null) {
            sSLSocket.setEnabledProtocols(pl0VarA.d);
        }
        if (pl0VarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(pl0VarA.c);
        }
        return pl0Var;
    }
}
