package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 implements pl3 {
    public final bu0 a;
    public pl3 b;

    public cu0(bu0 bu0Var) {
        this.a = bu0Var;
    }

    @Override // defpackage.pl3
    public final String a(SSLSocket sSLSocket) {
        pl3 pl3VarE = e(sSLSocket);
        if (pl3VarE != null) {
            return pl3VarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.pl3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pl3
    public final void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        pl3 pl3VarE = e(sSLSocket);
        if (pl3VarE != null) {
            pl3VarE.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.pl3
    public final boolean d(SSLSocket sSLSocket) {
        return this.a.d(sSLSocket);
    }

    public final synchronized pl3 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.d(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
