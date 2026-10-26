package defpackage;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class tn2 implements Cloneable {
    public static final List H = ka4.k(n13.HTTP_2, n13.HTTP_1_1);
    public static final List I = ka4.k(pl0.e, pl0.f);
    public final rn2 A;
    public final j20 B;
    public final yh4 C;
    public final int D;
    public final int E;
    public final int F;
    public final sz0 G;
    public final ir3 c;
    public final jb d;
    public final List h;
    public final List l;
    public final j93 m;
    public final boolean n;
    public final bg1 o;
    public final boolean p;
    public final boolean q;
    public final wo0 r;
    public final bg1 s;
    public final ProxySelector t;
    public final bg1 u;
    public final SocketFactory v;
    public final SSLSocketFactory w;
    public final X509TrustManager x;
    public final List y;
    public final List z;

    public tn2(sn2 sn2Var) throws NoSuchAlgorithmException, KeyStoreException {
        this.c = sn2Var.a;
        this.d = sn2Var.b;
        this.h = ka4.w(sn2Var.c);
        this.l = ka4.w(sn2Var.d);
        this.m = sn2Var.e;
        this.n = sn2Var.f;
        this.o = sn2Var.g;
        this.p = sn2Var.h;
        this.q = sn2Var.i;
        this.r = sn2Var.j;
        this.s = sn2Var.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.t = proxySelector == null ? sm2.a : proxySelector;
        this.u = sn2Var.l;
        this.v = sn2Var.m;
        List list = sn2Var.n;
        this.y = list;
        this.z = sn2Var.o;
        this.A = sn2Var.p;
        this.D = sn2Var.r;
        this.E = sn2Var.s;
        this.F = sn2Var.t;
        this.G = new sz0(28);
        if (list != null && list.isEmpty()) {
            this.w = null;
            this.C = null;
            this.x = null;
            this.B = j20.c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.w = null;
                this.C = null;
                this.x = null;
                this.B = j20.c;
                break;
            }
            if (((pl0) it.next()).a) {
                vv2 vv2Var = vv2.a;
                X509TrustManager x509TrustManagerM = vv2.a.m();
                this.x = x509TrustManagerM;
                this.w = vv2.a.l(x509TrustManagerM);
                yh4 yh4VarB = vv2.a.b(x509TrustManagerM);
                this.C = yh4VarB;
                j20 j20Var = sn2Var.q;
                this.B = kr1.n(j20Var.b, yh4VarB) ? j20Var : new j20(j20Var.a, yh4VarB);
                break;
            }
        }
        X509TrustManager x509TrustManager = this.x;
        yh4 yh4Var = this.C;
        SSLSocketFactory sSLSocketFactory = this.w;
        List list2 = this.l;
        List list3 = this.h;
        list3.getClass();
        if (list3.contains(null)) {
            m51.y(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            m51.y(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.y;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((pl0) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        u41.r("sslSocketFactory == null");
                        throw null;
                    }
                    if (yh4Var == null) {
                        u41.r("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    u41.r("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            u41.r("Check failed.");
            throw null;
        }
        if (yh4Var != null) {
            u41.r("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            u41.r("Check failed.");
            throw null;
        }
        if (kr1.n(this.B, j20.c)) {
            return;
        }
        u41.r("Check failed.");
        throw null;
    }

    public final Object clone() {
        return super.clone();
    }
}
