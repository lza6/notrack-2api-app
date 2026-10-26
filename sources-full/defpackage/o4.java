package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class o4 {
    public final bg1 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final j20 e;
    public final bg1 f;
    public final ProxySelector g;
    public final tk1 h;
    public final List i;
    public final List j;

    public o4(String str, int i, bg1 bg1Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j20 j20Var, bg1 bg1Var2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        bg1Var.getClass();
        socketFactory.getClass();
        bg1Var2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = bg1Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = j20Var;
        this.f = bg1Var2;
        this.g = proxySelector;
        sk1 sk1Var = new sk1();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            sk1Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                u41.k("unexpected scheme: ".concat(str2));
                throw null;
            }
            sk1Var.a = "https";
        }
        String strU = y64.U(Headers$Companion.percentDecode$okhttp$default(0, 0, 7, str));
        if (strU == null) {
            u41.k("unexpected host: ".concat(str));
            throw null;
        }
        sk1Var.d = strU;
        if (1 > i || i >= 65536) {
            u41.h(ud2.m(i, "unexpected port: "));
            throw null;
        }
        sk1Var.e = i;
        this.h = sk1Var.a();
        this.i = ka4.w(list);
        this.j = ka4.w(list2);
    }

    public final boolean a(o4 o4Var) {
        o4Var.getClass();
        return kr1.n(this.a, o4Var.a) && kr1.n(this.f, o4Var.f) && kr1.n(this.i, o4Var.i) && kr1.n(this.j, o4Var.j) && kr1.n(this.g, o4Var.g) && kr1.n(this.c, o4Var.c) && kr1.n(this.d, o4Var.d) && kr1.n(this.e, o4Var.e) && this.h.e == o4Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return kr1.n(this.h, o4Var.h) && a(o4Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ud2.j(ud2.j((this.f.hashCode() + ((this.a.hashCode() + ud2.i(527, 31, this.h.h)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        tk1 tk1Var = this.h;
        sb.append(tk1Var.d);
        sb.append(':');
        sb.append(tk1Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
