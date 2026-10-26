package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Headers$Companion;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class a33 extends bk1 {
    public final a83 b;
    public Socket c;
    public Socket d;
    public hh1 e;
    public n13 f;
    public ik1 g;
    public u23 h;
    public t23 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public a33(s11 s11Var, a83 a83Var) {
        s11Var.getClass();
        a83Var.getClass();
        this.b = a83Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = LongCompanionObject.MAX_VALUE;
    }

    public static void d(tn2 tn2Var, a83 a83Var, IOException iOException) {
        tn2Var.getClass();
        a83Var.getClass();
        iOException.getClass();
        if (a83Var.b.type() != Proxy.Type.DIRECT) {
            o4 o4Var = a83Var.a;
            o4Var.g.connectFailed(o4Var.h.g(), a83Var.b.address(), iOException);
        }
        sz0 sz0Var = tn2Var.G;
        synchronized (sz0Var) {
            ((LinkedHashSet) sz0Var.c).add(a83Var);
        }
    }

    @Override // defpackage.bk1
    public final synchronized void a(ik1 ik1Var, mg3 mg3Var) {
        mg3Var.getClass();
        this.o = (mg3Var.a & 16) != 0 ? mg3Var.b[4] : IntCompanionObject.MAX_VALUE;
    }

    @Override // defpackage.bk1
    public final void b(pk1 pk1Var) {
        pk1Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, y23 y23Var) throws Throwable {
        if (this.f != null) {
            u41.r("already connected");
            return;
        }
        List list = this.b.a.j;
        ql0 ql0Var = new ql0(list);
        o4 o4Var = this.b.a;
        if (o4Var.c == null) {
            if (!list.contains(pl0.f)) {
                throw new b83(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            vv2 vv2Var = vv2.a;
            if (!vv2.a.h(str)) {
                throw new b83(new UnknownServiceException(fq2.n("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (o4Var.i.contains(n13.H2_PRIOR_KNOWLEDGE)) {
            throw new b83(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        b83 b83Var = null;
        while (true) {
            try {
                a83 a83Var = this.b;
                if (a83Var.a.c != null && a83Var.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, y23Var);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i2, y23Var);
                g(ql0Var, y23Var);
                this.b.c.getClass();
                break;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    ka4.e(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    ka4.e(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                this.b.c.getClass();
                if (b83Var == null) {
                    b83Var = new b83(e);
                } else {
                    gb2.l(b83Var.c, e);
                    b83Var.d = e;
                }
                if (!z) {
                    throw b83Var;
                }
                ql0Var.d = true;
                if (!ql0Var.c) {
                    throw b83Var;
                }
                if (e instanceof ProtocolException) {
                    throw b83Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw b83Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw b83Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw b83Var;
                }
                if (!(e instanceof SSLException)) {
                    throw b83Var;
                }
            }
        }
        a83 a83Var2 = this.b;
        if (a83Var2.a.c != null && a83Var2.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new b83(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, y23 y23Var) throws IOException {
        Socket socketCreateSocket;
        a83 a83Var = this.b;
        Proxy proxy = a83Var.b;
        o4 o4Var = a83Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : z23.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = o4Var.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        this.b.c.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            vv2 vv2Var = vv2.a;
            vv2.a.e(socketCreateSocket, this.b.c, i);
            try {
                ql3 ql3Var = new ql3(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                this.h = new u23(new an(ql3Var, new an(inputStream, ql3Var)));
                ql3 ql3Var2 = new ql3(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                this.i = new t23(new zm(ql3Var2, 0, new zm(outputStream, i4, ql3Var2)));
            } catch (NullPointerException e) {
                if (kr1.n(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, y23 y23Var) throws IOException {
        vu vuVar = new vu();
        a83 a83Var = this.b;
        tk1 tk1Var = a83Var.a.h;
        tk1Var.getClass();
        vuVar.c = tk1Var;
        vuVar.o("CONNECT", null);
        o4 o4Var = a83Var.a;
        vuVar.m("Host", ka4.v(o4Var.h, true));
        vuVar.m("Proxy-Connection", "Keep-Alive");
        vuVar.m("User-Agent", "okhttp/4.12.0");
        l53 l53VarG = vuVar.g();
        ArrayList arrayList = new ArrayList(20);
        Headers$Companion.checkName("Proxy-Authenticate");
        Headers$Companion.checkValue("OkHttp-Preemptive", "Proxy-Authenticate");
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
        arrayList.add("Proxy-Authenticate");
        arrayList.add(mo3.U0("OkHttp-Preemptive").toString());
        o4Var.f.getClass();
        tk1 tk1Var2 = l53VarG.a;
        e(i, i2, y23Var);
        String str = "CONNECT " + ka4.v(tk1Var2, true) + " HTTP/1.1";
        u23 u23Var = this.h;
        u23Var.getClass();
        t23 t23Var = this.i;
        t23Var.getClass();
        yj1 yj1Var = new yj1(null, this, u23Var, t23Var);
        u23Var.c.b().g(i2);
        t23Var.c.b().g(i3);
        yj1Var.j(l53VarG.c, str);
        yj1Var.c();
        e63 e63VarG = yj1Var.g(false);
        e63VarG.getClass();
        e63VarG.a = l53VarG;
        f63 f63VarA = e63VarG.a();
        int i5 = f63VarA.l;
        long j = ka4.j(f63VarA);
        if (j != -1) {
            wj1 wj1VarI = yj1Var.i(j);
            ka4.t(wj1VarI, IntCompanionObject.MAX_VALUE);
            wj1VarI.close();
        }
        if (i5 == 200) {
            if (u23Var.d.r() && t23Var.d.r()) {
                return;
            }
            m51.l("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            m51.l(ud2.m(i5, "Unexpected response code for CONNECT: "));
        } else {
            o4Var.f.getClass();
            m51.l("Failed to authenticate with proxy");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(ql0 ql0Var, y23 y23Var) throws Throwable {
        n13 n13Var = n13.HTTP_1_1;
        o4 o4Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = o4Var.c;
        if (sSLSocketFactory == null) {
            List list = o4Var.i;
            n13 n13Var2 = n13.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(n13Var2);
            Socket socket = this.c;
            if (!zContains) {
                this.d = socket;
                this.f = n13Var;
                return;
            } else {
                this.d = socket;
                this.f = n13Var2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            tk1 tk1Var = o4Var.h;
            int i = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, tk1Var.d, tk1Var.e, true);
            socketCreateSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                pl0 pl0VarA = ql0Var.a(sSLSocket2);
                if (pl0VarA.b) {
                    vv2 vv2Var = vv2.a;
                    vv2.a.d(sSLSocket2, o4Var.h.d, o4Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                hh1 hh1Var = Protocol$Companion.get(session);
                HostnameVerifier hostnameVerifier = o4Var.d;
                hostnameVerifier.getClass();
                boolean zVerify = hostnameVerifier.verify(o4Var.h.d, session);
                int i2 = 0;
                if (!zVerify) {
                    List listA = hh1Var.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + o4Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = listA.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(o4Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    j20 j20Var = j20.c;
                    sb.append(Protocol$Companion.pin(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(ke0.H0(rn2.a(x509Certificate, 7), rn2.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(no3.f0(sb.toString()));
                }
                j20 j20Var2 = o4Var.e;
                j20Var2.getClass();
                this.e = new hh1(hh1Var.a, hh1Var.b, hh1Var.c, new oh(j20Var2, hh1Var, o4Var, 9));
                o4Var.h.d.getClass();
                Iterator it = j20Var2.a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (pl0VarA.b) {
                    vv2 vv2Var2 = vv2.a;
                    strF = vv2.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                ql3 ql3Var = new ql3(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new u23(new an(ql3Var, new an(inputStream, ql3Var)));
                ql3 ql3Var2 = new ql3(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new t23(new zm(ql3Var2, i2, new zm(outputStream, i, ql3Var2)));
                if (strF != null) {
                    n13Var = Protocol$Companion.get(strF);
                }
                this.f = n13Var;
                vv2 vv2Var3 = vv2.a;
                vv2.a.a(sSLSocket2);
                if (this.f == n13.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    vv2 vv2Var4 = vv2.a;
                    vv2.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    ka4.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(o4 o4Var, List list) {
        hh1 hh1Var;
        tk1 tk1Var = o4Var.h;
        byte[] bArr = ka4.a;
        if (this.p.size() < this.o && !this.j) {
            a83 a83Var = this.b;
            o4 o4Var2 = a83Var.a;
            o4 o4Var3 = a83Var.a;
            if (o4Var2.a(o4Var)) {
                String str = tk1Var.d;
                String str2 = tk1Var.d;
                if (!kr1.n(str, o4Var3.h.d)) {
                    if (this.g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            a83 a83Var2 = (a83) it.next();
                            Proxy.Type type = a83Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && a83Var.b.type() == type2 && kr1.n(a83Var.c, a83Var2.c)) {
                                if (o4Var.d != rn2.a) {
                                    break;
                                }
                                byte[] bArr2 = ka4.a;
                                tk1 tk1Var2 = o4Var3.h;
                                if (tk1Var.e != tk1Var2.e) {
                                    break;
                                }
                                if (!kr1.n(str2, tk1Var2.d)) {
                                    if (!this.k && (hh1Var = this.e) != null) {
                                        List listA = hh1Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!rn2.c(str2, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    j20 j20Var = o4Var.e;
                                    j20Var.getClass();
                                    hh1 hh1Var2 = this.e;
                                    hh1Var2.getClass();
                                    List listA2 = hh1Var2.a();
                                    str2.getClass();
                                    listA2.getClass();
                                    Iterator it2 = j20Var.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = ka4.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        u23 u23Var = this.h;
        u23Var.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ik1 ik1Var = this.g;
        if (ik1Var != null) {
            synchronized (ik1Var) {
                if (ik1Var.n) {
                    return false;
                }
                return ik1Var.v >= ik1Var.u || jNanoTime < ik1Var.w;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !u23Var.r();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final e51 j(tn2 tn2Var, i33 i33Var) throws SocketException {
        tn2Var.getClass();
        int i = i33Var.g;
        Socket socket = this.d;
        socket.getClass();
        u23 u23Var = this.h;
        u23Var.getClass();
        t23 t23Var = this.i;
        t23Var.getClass();
        ik1 ik1Var = this.g;
        if (ik1Var != null) {
            return new jk1(tn2Var, this, i33Var, ik1Var);
        }
        socket.setSoTimeout(i);
        u23Var.c.b().g(i);
        t23Var.c.b().g(i33Var.h);
        return new yj1(tn2Var, this, u23Var, t23Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.d;
        socket.getClass();
        u23 u23Var = this.h;
        u23Var.getClass();
        t23 t23Var = this.i;
        t23Var.getClass();
        socket.setSoTimeout(0);
        et3 et3Var = et3.h;
        et3Var.getClass();
        f13 f13Var = new f13();
        f13Var.b = et3Var;
        f13Var.f = bk1.a;
        String str = this.b.a.h.d;
        str.getClass();
        f13Var.c = socket;
        f13Var.a = ka4.h + ' ' + str;
        f13Var.d = u23Var;
        f13Var.e = t23Var;
        f13Var.f = this;
        ik1 ik1Var = new ik1(f13Var);
        this.g = ik1Var;
        mg3 mg3Var = ik1.H;
        this.o = (mg3Var.a & 16) != 0 ? mg3Var.b[4] : IntCompanionObject.MAX_VALUE;
        qk1 qk1Var = ik1Var.E;
        synchronized (qk1Var) {
            try {
                if (qk1Var.l) {
                    throw new IOException("closed");
                }
                Logger logger = qk1.n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ka4.h(">> CONNECTION " + zj1.a.d(), new Object[0]));
                }
                qk1Var.c.e(zj1.a);
                qk1Var.c.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        qk1 qk1Var2 = ik1Var.E;
        mg3 mg3Var2 = ik1Var.x;
        synchronized (qk1Var2) {
            try {
                mg3Var2.getClass();
                if (qk1Var2.l) {
                    throw new IOException("closed");
                }
                qk1Var2.h(0, Integer.bitCount(mg3Var2.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & mg3Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        qk1Var2.c.writeShort(i);
                        qk1Var2.c.writeInt(mg3Var2.b[i2]);
                    }
                    i2++;
                }
                qk1Var2.c.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = ik1Var.x.a();
        if (iA != 65535) {
            ik1Var.E.K(iA - 65535, 0);
        }
        et3Var.e().c(new gk1(ik1Var.h, ik1Var.F, 2), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        a83 a83Var = this.b;
        sb.append(a83Var.a.h.d);
        sb.append(':');
        sb.append(a83Var.a.h.e);
        sb.append(", proxy=");
        sb.append(a83Var.b);
        sb.append(" hostAddress=");
        sb.append(a83Var.c);
        sb.append(" cipherSuite=");
        hh1 hh1Var = this.e;
        sb.append(hh1Var != null ? hh1Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
