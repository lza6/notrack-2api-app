package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class mc extends vv2 {
    public static final boolean e;
    public final ArrayList c;
    public final md0 d;

    static {
        boolean z = false;
        if (Headers$Companion.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public mc() throws NoSuchMethodException {
        zm3 zm3Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            zm3Var = new zm3(cls);
        } catch (Exception e2) {
            vv2.a.getClass();
            vv2.i("unable to load android socket classes", 5, e2);
            zm3Var = null;
        }
        int i = 0;
        ArrayList arrayListT0 = vl.t0(new pl3[]{zm3Var, new cu0(pd.f), new cu0(dm0.a), new cu0(rw.a)});
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
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new md0(method3, method2, method);
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
    public final s64 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new lc(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() {
        md0 md0Var = this.d;
        md0Var.getClass();
        Method method = md0Var.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = md0Var.b;
                method2.getClass();
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.vv2
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.vv2
    public final void j(Object obj, String str) {
        md0 md0Var = this.d;
        md0Var.getClass();
        if (obj != null) {
            try {
                Method method = md0Var.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        vv2.i(str, 5, null);
    }
}
