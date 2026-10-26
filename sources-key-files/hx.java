package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class hx implements wq1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public hx(e60 e60Var) {
        this.b = e60Var;
    }

    public hx(tn2 tn2Var) {
        tn2Var.getClass();
        this.b = tn2Var;
    }

    public hx(wo0 wo0Var) {
        wo0Var.getClass();
        this.b = wo0Var;
    }

    public static int d(f63 f63Var, int i) {
        String strA = f63.a(f63Var, "Retry-After");
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return IntCompanionObject.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // defpackage.wq1
    public final f63 a(i33 i33Var) {
        int i;
        int i2;
        m33 m33Var;
        String strE;
        f63 f63VarB;
        SSLSocketFactory sSLSocketFactory;
        rn2 rn2Var;
        j20 j20Var;
        switch (this.a) {
            case 0:
                wo0 wo0Var = (wo0) this.b;
                l53 l53Var = i33Var.e;
                vu vuVarA = l53Var.a();
                tk1 tk1Var = l53Var.a;
                th1 th1Var = l53Var.c;
                av1 av1Var = l53Var.d;
                long j = -1;
                if (av1Var != null) {
                    ac2 ac2VarI = av1Var.i();
                    if (ac2VarI != null) {
                        vuVarA.m("Content-Type", ac2VarI.a);
                    }
                    long jH = av1Var.h();
                    if (jH != -1) {
                        vuVarA.m("Content-Length", String.valueOf(jH));
                        ((sh1) vuVarA.h).d("Transfer-Encoding");
                    } else {
                        vuVarA.m("Transfer-Encoding", "chunked");
                        ((sh1) vuVarA.h).d("Content-Length");
                    }
                }
                if (th1Var.b("Host") == null) {
                    i = 0;
                    vuVarA.m("Host", ka4.v(tk1Var, false));
                } else {
                    i = 0;
                }
                if (th1Var.b("Connection") == null) {
                    vuVarA.m("Connection", "Keep-Alive");
                }
                if (th1Var.b("Accept-Encoding") == null && th1Var.b("Range") == null) {
                    vuVarA.m("Accept-Encoding", "gzip");
                    i2 = 1;
                } else {
                    i2 = i;
                }
                List listL = wo0Var.l(tk1Var);
                if (!listL.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : listL) {
                        int i3 = i + 1;
                        if (i < 0) {
                            kr1.m0();
                            throw null;
                        }
                        vo0 vo0Var = (vo0) obj;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(vo0Var.a);
                        sb.append('=');
                        sb.append(vo0Var.b);
                        i = i3;
                    }
                    vuVarA.m("Cookie", sb.toString());
                }
                if (th1Var.b("User-Agent") == null) {
                    vuVarA.m("User-Agent", "okhttp/4.12.0");
                }
                f63 f63VarB2 = i33Var.b(vuVarA.g());
                th1 th1Var2 = f63VarB2.n;
                rk1.b(wo0Var, tk1Var, th1Var2);
                e63 e63VarH = f63VarB2.h();
                e63VarH.a = l53Var;
                if (i2 != 0 && "gzip".equalsIgnoreCase(f63.a(f63VarB2, "Content-Encoding")) && rk1.a(f63VarB2) && (m33Var = f63VarB2.o) != null) {
                    zg1 zg1Var = new zg1(m33Var.D());
                    sh1 sh1VarG = th1Var2.g();
                    sh1VarG.d("Content-Encoding");
                    sh1VarG.d("Content-Length");
                    e63VarH.f = sh1VarG.c().g();
                    e63VarH.g = new m33(f63.a(f63VarB2, "Content-Type"), j, new u23(zg1Var), 0);
                }
                return e63VarH.a();
            case 1:
                vu vuVarA2 = i33Var.e.a();
                vuVarA2.m("X-App-Key", "[REDACTED-APP-KEY]");
                vuVarA2.m("User-Agent", "notrack-android/1.10.13");
                vuVarA2.m("Accept", "application/json, text/event-stream");
                vuVarA2.m("X-App-Channel", "play");
                vuVarA2.m("X-App-Sig", (String) ((e60) this.b).q.getValue());
                if (kr1.l) {
                    vuVarA2.m("X-App-Keystore", "fail");
                }
                l53 l53Var2 = i33Var.e;
                l53Var2.getClass();
                if (l53Var2.c.b("Authorization") == null && (strE = ((e60) this.b).g.e()) != null) {
                    String str = !mo3.C0(strE) ? strE : null;
                    if (str != null) {
                        vuVarA2.m("Authorization", "Bearer ".concat(str));
                    }
                }
                return i33Var.b(vuVarA2.g());
            default:
                l53 l53Var3 = i33Var.e;
                y23 y23Var = i33Var.a;
                List listI0 = z21.c;
                f63 f63Var = null;
                int i4 = 0;
                l53 l53VarB = l53Var3;
                while (true) {
                    boolean z = true;
                    while (true) {
                        l53VarB.getClass();
                        if (y23Var.q == null) {
                            synchronized (y23Var) {
                                try {
                                    if (y23Var.s) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (y23Var.r) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (z) {
                                s11 s11Var = y23Var.h;
                                tk1 tk1Var2 = l53VarB.a;
                                tn2 tn2Var = y23Var.c;
                                if (tk1Var2.i) {
                                    SSLSocketFactory sSLSocketFactory2 = tn2Var.w;
                                    if (sSLSocketFactory2 != null) {
                                        rn2 rn2Var2 = tn2Var.A;
                                        j20Var = tn2Var.B;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        rn2Var = rn2Var2;
                                    } else {
                                        u41.r("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    rn2Var = null;
                                    j20Var = null;
                                }
                                y23Var.o = new f51(s11Var, new o4(tk1Var2.d, tk1Var2.e, tn2Var.s, tn2Var.v, sSLSocketFactory, rn2Var, j20Var, tn2Var.u, tn2Var.z, tn2Var.y, tn2Var.t), y23Var);
                            }
                            try {
                                if (y23Var.u) {
                                    throw new IOException("Canceled");
                                }
                                try {
                                    try {
                                        f63VarB = i33Var.b(l53VarB);
                                    } catch (IOException e) {
                                        if (!c(e, y23Var, l53VarB, !(e instanceof nl0))) {
                                            Iterator it = listI0.iterator();
                                            while (it.hasNext()) {
                                                gb2.l(e, (Exception) it.next());
                                            }
                                            throw e;
                                        }
                                        listI0 = ke0.I0(listI0, e);
                                        y23Var.g(true);
                                        z = false;
                                    }
                                } catch (b83 e2) {
                                    boolean zC = c(e2.d, y23Var, l53VarB, false);
                                    IOException iOException = e2.c;
                                    if (!zC) {
                                        iOException.getClass();
                                        Iterator it2 = listI0.iterator();
                                        while (it2.hasNext()) {
                                            gb2.l(iOException, (Exception) it2.next());
                                        }
                                        throw iOException;
                                    }
                                    listI0 = ke0.I0(listI0, iOException);
                                    y23Var.g(true);
                                    z = false;
                                }
                            } catch (Throwable th2) {
                                y23Var.g(true);
                                throw th2;
                            }
                        } else {
                            u41.r("Check failed.");
                        }
                        z = false;
                        break;
                    }
                    if (f63Var != null) {
                        e63 e63VarH2 = f63VarB.h();
                        e63 e63VarH3 = f63Var.h();
                        e63VarH3.g = null;
                        f63 f63VarA = e63VarH3.a();
                        if (f63VarA.o != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        e63VarH2.j = f63VarA;
                        f63VarB = e63VarH2.a();
                    }
                    f63Var = f63VarB;
                    l53VarB = b(f63Var, y23Var.q);
                    if (l53VarB == null) {
                        y23Var.g(false);
                        return f63Var;
                    }
                    m33 m33Var2 = f63Var.o;
                    if (m33Var2 != null) {
                        ka4.d(m33Var2);
                    }
                    i4++;
                    if (i4 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i4);
                    }
                    y23Var.g(true);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    public l53 b(f63 f63Var, sd sdVar) throws ProtocolException {
        tn2 tn2Var;
        String strA;
        l53 l53Var;
        sk1 sk1Var;
        tk1 tk1VarA;
        vu vuVarA;
        boolean z;
        f63 f63Var2;
        a33 a33Var;
        a83 a83Var = (sdVar == null || (a33Var = (a33) sdVar.e) == null) ? null : a33Var.b;
        int i = f63Var.l;
        String str = f63Var.c.b;
        if (i == 307 || i == 308) {
            tn2Var = (tn2) this.b;
            if (tn2Var.p) {
                strA = f63.a(f63Var, "Location");
                l53Var = f63Var.c;
                if (strA != null) {
                    tk1 tk1Var = l53Var.a;
                    tk1Var.getClass();
                    try {
                        sk1Var = new sk1();
                        sk1Var.c(tk1Var, strA);
                    } catch (IllegalArgumentException unused) {
                        sk1Var = null;
                    }
                    if (sk1Var != null) {
                        tk1VarA = sk1Var.a();
                    } else {
                        tk1VarA = null;
                    }
                    if (tk1VarA != null && (kr1.n(tk1VarA.a, l53Var.a.a) || tn2Var.q)) {
                        vuVarA = l53Var.a();
                        if (yh4.O(str)) {
                            int i2 = f63Var.l;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                vuVarA.o(str, z ? l53Var.d : null);
                            } else {
                                vuVarA.o("GET", null);
                            }
                            if (!z) {
                                ((sh1) vuVarA.h).d("Transfer-Encoding");
                                ((sh1) vuVarA.h).d("Content-Length");
                                ((sh1) vuVarA.h).d("Content-Type");
                            }
                        }
                        if (!ka4.a(l53Var.a, tk1VarA)) {
                            ((sh1) vuVarA.h).d("Authorization");
                        }
                        vuVarA.c = tk1VarA;
                        return vuVarA.g();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((tn2) this.b).o.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    f63 f63Var3 = f63Var.r;
                    if ((f63Var3 == null || f63Var3.l != 503) && d(f63Var, IntCompanionObject.MAX_VALUE) == 0) {
                        return f63Var.c;
                    }
                } else {
                    if (i == 407) {
                        a83Var.getClass();
                        if (a83Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((tn2) this.b).u.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                tn2Var = (tn2) this.b;
                                if (tn2Var.p) {
                                    strA = f63.a(f63Var, "Location");
                                    l53Var = f63Var.c;
                                    if (strA != null) {
                                        tk1 tk1Var2 = l53Var.a;
                                        tk1Var2.getClass();
                                        sk1Var = new sk1();
                                        sk1Var.c(tk1Var2, strA);
                                        if (sk1Var != null) {
                                            tk1VarA = sk1Var.a();
                                        } else {
                                            tk1VarA = null;
                                        }
                                        if (tk1VarA != null) {
                                            vuVarA = l53Var.a();
                                            if (yh4.O(str)) {
                                                int i3 = f63Var.l;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    vuVarA.o(str, z ? l53Var.d : null);
                                                } else {
                                                    vuVarA.o(str, z ? l53Var.d : null);
                                                }
                                                if (!z) {
                                                    ((sh1) vuVarA.h).d("Transfer-Encoding");
                                                    ((sh1) vuVarA.h).d("Content-Length");
                                                    ((sh1) vuVarA.h).d("Content-Type");
                                                }
                                            }
                                            if (!ka4.a(l53Var.a, tk1VarA)) {
                                                ((sh1) vuVarA.h).d("Authorization");
                                            }
                                            vuVarA.c = tk1VarA;
                                            return vuVarA.g();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((tn2) this.b).n && (((f63Var2 = f63Var.r) == null || f63Var2.l != 408) && d(f63Var, 0) <= 0)) {
                        return f63Var.c;
                    }
                }
            } else if (sdVar != null && !kr1.n(((f51) sdVar.c).b.h.d, ((a33) sdVar.e).b.a.h.d)) {
                a33 a33Var2 = (a33) sdVar.e;
                synchronized (a33Var2) {
                    a33Var2.k = true;
                }
                return f63Var.c;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x004e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0051  */
    /* JADX WARN: Code duplicated, block: B:49:0x0066 A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x0068 A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x0062, B:51:0x0068, B:55:0x007a), top: B:76:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0083  */
    /* JADX WARN: Code duplicated, block: B:63:0x0085  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:66:0x008b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0092  */
    /* JADX WARN: Code duplicated, block: B:75:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean c(IOException iOException, y23 y23Var, l53 l53Var, boolean z) {
        f51 f51Var;
        int i;
        boolean zD;
        a83 a83Var;
        kn4 kn4Var;
        bi biVar;
        a33 a33Var;
        if (!((tn2) this.b).n || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            f51Var = y23Var.o;
            f51Var.getClass();
            i = f51Var.f;
            if (i != 0) {
                if (f51Var.i != null) {
                    zD = true;
                } else {
                    a83Var = null;
                    if (i <= 1) {
                        synchronized (a33Var) {
                            if (a33Var.l != 0) {
                                a83Var = a33Var.b;
                            }
                        }
                    }
                    if (a83Var != null) {
                        f51Var.i = a83Var;
                    } else {
                        kn4Var = f51Var.d;
                        zD = kn4Var != null ? biVar.d() : biVar.d();
                    }
                    zD = true;
                }
            } else if (f51Var.i != null) {
                zD = true;
            } else {
                a83Var = null;
                if (i <= 1) {
                    synchronized (a33Var) {
                        if (a33Var.l != 0) {
                            a83Var = a33Var.b;
                        }
                    }
                }
                if (a83Var != null) {
                    f51Var.i = a83Var;
                } else {
                    kn4Var = f51Var.d;
                    if (kn4Var != null) {
                    }
                }
                zD = true;
            }
            if (!zD) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            f51Var = y23Var.o;
            f51Var.getClass();
            i = f51Var.f;
            if (i != 0 && f51Var.g == 0 && f51Var.h == 0) {
                zD = false;
            } else if (f51Var.i != null) {
                zD = true;
            } else {
                a83Var = null;
                if (i <= 1 && f51Var.g <= 1 && f51Var.h <= 0 && (a33Var = f51Var.c.p) != null) {
                    synchronized (a33Var) {
                        if (a33Var.l != 0 && ka4.a(a33Var.b.a.h, f51Var.b.h)) {
                            a83Var = a33Var.b;
                        }
                    }
                }
                if (a83Var != null) {
                    f51Var.i = a83Var;
                } else {
                    kn4Var = f51Var.d;
                    if ((kn4Var != null || !kn4Var.i()) && (biVar = f51Var.e) != null) {
                    }
                }
                zD = true;
            }
            if (!zD) {
                return true;
            }
        }
        return false;
    }
}
