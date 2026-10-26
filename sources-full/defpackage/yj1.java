package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class yj1 implements e51 {
    public final tn2 a;
    public final a33 b;
    public final ny c;
    public final my d;
    public int e;
    public final uh1 f;
    public th1 g;

    public yj1(tn2 tn2Var, a33 a33Var, u23 u23Var, t23 t23Var) {
        u23Var.getClass();
        t23Var.getClass();
        this.a = tn2Var;
        this.b = a33Var;
        this.c = u23Var;
        this.d = t23Var;
        this.f = new uh1(u23Var);
    }

    @Override // defpackage.e51
    public final void a(l53 l53Var) {
        l53Var.getClass();
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(l53Var.b);
        sb.append(' ');
        tk1 tk1Var = l53Var.a;
        if (tk1Var.i || type != Proxy.Type.HTTP) {
            String strB = tk1Var.b();
            String strD = tk1Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(tk1Var);
        }
        sb.append(" HTTP/1.1");
        j(l53Var.c, sb.toString());
    }

    @Override // defpackage.e51
    public final wl3 b(f63 f63Var) {
        if (!rk1.a(f63Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(f63.a(f63Var, "Transfer-Encoding"))) {
            tk1 tk1Var = f63Var.c.a;
            if (this.e == 4) {
                this.e = 5;
                return new vj1(this, tk1Var);
            }
            m51.p(this.e, "state: ");
            return null;
        }
        long j = ka4.j(f63Var);
        if (j != -1) {
            return i(j);
        }
        if (this.e != 4) {
            m51.p(this.e, "state: ");
            return null;
        }
        this.e = 5;
        this.b.k();
        return new xj1(this);
    }

    @Override // defpackage.e51
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.e51
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            ka4.e(socket);
        }
    }

    @Override // defpackage.e51
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.e51
    public final zh3 e(l53 l53Var, long j) {
        l53Var.getClass();
        if ("chunked".equalsIgnoreCase(l53Var.c.b("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new uj1(this);
            }
            m51.p(this.e, "state: ");
            return null;
        }
        if (j == -1) {
            u41.r("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.e == 1) {
            this.e = 2;
            return new n61(this);
        }
        m51.p(this.e, "state: ");
        return null;
    }

    @Override // defpackage.e51
    public final long f(f63 f63Var) {
        if (!rk1.a(f63Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(f63.a(f63Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return ka4.j(f63Var);
    }

    @Override // defpackage.e51
    public final e63 g(boolean z) {
        uh1 uh1Var = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            m51.p(this.e, "state: ");
            return null;
        }
        try {
            String strZ = ((ny) uh1Var.b).z(uh1Var.a);
            uh1Var.a -= (long) strZ.length();
            gj gjVar = Options$Companion.parse(strZ);
            int i2 = gjVar.b;
            e63 e63Var = new e63();
            e63Var.b = (n13) gjVar.c;
            e63Var.c = i2;
            e63Var.d = (String) gjVar.d;
            e63Var.f = uh1Var.c().g();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return e63Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return e63Var;
            }
            this.e = 3;
            return e63Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.e51
    public final a33 h() {
        return this.b;
    }

    public final wj1 i(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new wj1(this, j);
        }
        m51.p(this.e, "state: ");
        return null;
    }

    public final void j(th1 th1Var, String str) {
        if (this.e != 0) {
            m51.p(this.e, "state: ");
            return;
        }
        my myVar = this.d;
        myVar.H(str).H("\r\n");
        int size = th1Var.size();
        for (int i = 0; i < size; i++) {
            myVar.H(th1Var.d(i)).H(": ").H(th1Var.j(i)).H("\r\n");
        }
        myVar.H("\r\n");
        this.e = 1;
    }
}
