package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sm2 extends ProxySelector {
    public static final sm2 a = new sm2();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return kr1.T(Proxy.NO_PROXY);
        }
        u41.k("uri must not be null");
        return null;
    }
}
