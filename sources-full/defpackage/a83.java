package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class a83 {
    public final o4 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public a83(o4 o4Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = o4Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a83)) {
            return false;
        }
        a83 a83Var = (a83) obj;
        return a83Var.a.equals(this.a) && a83Var.b.equals(this.b) && kr1.n(a83Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
