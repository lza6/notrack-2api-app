package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class e9 extends vv2 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = Headers$Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public e9() {
        int i = 0;
        ArrayList arrayListT0 = vl.t0(new pl3[]{(!Headers$Companion.isAndroid() || Build.VERSION.SDK_INT < 29) ? null : new f9(), new cu0(pd.f), new cu0(dm0.a), new cu0(rw.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListT0.size();
        while (i < size) {
            Object obj = arrayListT0.get(i);
            i++;
            if (((pl3) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.vv2
    public final yh4 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        q9 q9Var = x509TrustManagerExtensions != null ? new q9(x509TrustManager, x509TrustManagerExtensions) : null;
        return q9Var != null ? q9Var : new bs(c(x509TrustManager));
    }

    @Override // defpackage.vv2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((pl3) obj).d(sSLSocket));
        pl3 pl3Var = (pl3) obj;
        if (pl3Var != null) {
            pl3Var.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.vv2
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((pl3) obj).d(sSLSocket));
        pl3 pl3Var = (pl3) obj;
        if (pl3Var != null) {
            return pl3Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.vv2
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
