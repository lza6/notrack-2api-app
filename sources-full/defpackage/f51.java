package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class f51 {
    public final s11 a;
    public final o4 b;
    public final y23 c;
    public kn4 d;
    public bi e;
    public int f;
    public int g;
    public int h;
    public a83 i;

    public f51(s11 s11Var, o4 o4Var, y23 y23Var) {
        s11Var.getClass();
        this.a = s11Var;
        this.b = o4Var;
        this.c = y23Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0257  */
    /* JADX WARN: Code duplicated, block: B:122:0x0272  */
    /* JADX WARN: Code duplicated, block: B:124:0x027e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0287  */
    /* JADX WARN: Code duplicated, block: B:127:0x028d  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    public final a33 a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        a83 a83Var;
        kn4 kn4Var;
        bi biVar;
        ArrayList arrayList;
        kn4 kn4Var2;
        o4 o4Var;
        Proxy proxy;
        String hostAddress;
        int port;
        List listT;
        boolean zContains;
        a33 a33Var;
        sz0 sz0Var;
        Socket socketK;
        while (!this.c.u) {
            a33 a33Var2 = this.c.p;
            if (a33Var2 != null) {
                synchronized (a33Var2) {
                    try {
                        if (!a33Var2.j) {
                            tk1 tk1Var = a33Var2.b.a.h;
                            tk1Var.getClass();
                            tk1 tk1Var2 = this.b.h;
                            socketK = !(tk1Var.e == tk1Var2.e && kr1.n(tk1Var.d, tk1Var2.d)) ? this.c.k() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.p == null) {
                    if (socketK != null) {
                        ka4.e(socketK);
                    }
                    this.f = 0;
                    this.g = 0;
                    this.h = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        a33Var2 = this.c.p;
                        a33Var2.getClass();
                    } else {
                        a83Var = this.i;
                        try {
                            if (a83Var != null) {
                                this.i = null;
                            } else {
                                kn4Var = this.d;
                                if (kn4Var == null && kn4Var.i()) {
                                    kn4 kn4Var3 = this.d;
                                    kn4Var3.getClass();
                                    if (!kn4Var3.i()) {
                                        m51.o();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) kn4Var3.c;
                                    int i4 = kn4Var3.b;
                                    kn4Var3.b = i4 + 1;
                                    a83Var = (a83) arrayList2.get(i4);
                                } else {
                                    biVar = this.e;
                                    if (biVar == null) {
                                        o4 o4Var2 = this.b;
                                        y23 y23Var = this.c;
                                        biVar = new bi(o4Var2, y23Var.c.G, y23Var);
                                        this.e = biVar;
                                    }
                                    if (biVar.d()) {
                                        m51.o();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (biVar.a < ((List) biVar.d).size()) {
                                        o4Var = (o4) biVar.b;
                                        if (biVar.a < ((List) biVar.d).size()) {
                                            throw new SocketException("No route to " + o4Var.h.d + "; exhausted proxy configurations: " + ((List) biVar.d));
                                        }
                                        List list = (List) biVar.d;
                                        int i5 = biVar.a;
                                        biVar.a = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList3 = new ArrayList();
                                        biVar.e = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            tk1 tk1Var3 = o4Var.h;
                                            hostAddress = tk1Var3.d;
                                            port = tk1Var3.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                m51.z(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                                return null;
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                hostAddress.getClass();
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                hostAddress.getClass();
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = ka4.a;
                                            hostAddress.getClass();
                                            if (ka4.g.c(hostAddress)) {
                                                listT = kr1.T(InetAddress.getByName(hostAddress));
                                            } else {
                                                o4Var.a.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                                    allByName.getClass();
                                                    List listY0 = vl.y0(allByName);
                                                    if (listY0.isEmpty()) {
                                                        throw new UnknownHostException(o4Var.a + " returned no addresses for " + hostAddress);
                                                    }
                                                    listT = listY0;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listT.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = ((List) biVar.e).iterator();
                                        while (it2.hasNext()) {
                                            a83 a83Var2 = new a83((o4) biVar.b, proxy, (InetSocketAddress) it2.next());
                                            sz0 sz0Var2 = (sz0) biVar.c;
                                            synchronized (sz0Var2) {
                                                zContains = ((LinkedHashSet) sz0Var2.c).contains(a83Var2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) biVar.f).add(a83Var2);
                                            } else {
                                                arrayList.add(a83Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        pe0.s0((ArrayList) biVar.f, arrayList);
                                        ((ArrayList) biVar.f).clear();
                                    }
                                    kn4Var2 = new kn4(arrayList);
                                    this.d = kn4Var2;
                                    if (!this.c.u) {
                                        m51.l("Canceled");
                                        return null;
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        a33Var2 = this.c.p;
                                        a33Var2.getClass();
                                    } else {
                                        if (kn4Var2.i()) {
                                            m51.o();
                                            return null;
                                        }
                                        int i6 = kn4Var2.b;
                                        kn4Var2.b = i6 + 1;
                                        a83Var = (a83) arrayList.get(i6);
                                        a33Var = new a33(this.a, a83Var);
                                        this.c.w = a33Var;
                                        a33Var.c(i, i2, i3, z, this.c);
                                        this.c.w = null;
                                        sz0Var = this.c.c.G;
                                        synchronized (sz0Var) {
                                            ((LinkedHashSet) sz0Var.c).remove(a83Var);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            a33 a33Var3 = this.c.p;
                                            a33Var3.getClass();
                                            this.i = a83Var;
                                            Socket socket = a33Var.d;
                                            socket.getClass();
                                            ka4.e(socket);
                                            a33Var2 = a33Var3;
                                        } else {
                                            synchronized (a33Var) {
                                                s11 s11Var = this.a;
                                                s11Var.getClass();
                                                byte[] bArr2 = ka4.a;
                                                ((ConcurrentLinkedQueue) s11Var.d).add(a33Var);
                                                ((dt3) s11Var.b).c((gk1) s11Var.c, 0L);
                                                this.c.b(a33Var);
                                            }
                                            a33Var2 = a33Var;
                                        }
                                    }
                                }
                            }
                            a33Var.c(i, i2, i3, z, this.c);
                            this.c.w = null;
                            sz0Var = this.c.c.G;
                            synchronized (sz0Var) {
                                ((LinkedHashSet) sz0Var.c).remove(a83Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    a33 a33Var4 = this.c.p;
                                    a33Var4.getClass();
                                    this.i = a83Var;
                                    Socket socket2 = a33Var.d;
                                    socket2.getClass();
                                    ka4.e(socket2);
                                    a33Var2 = a33Var4;
                                } else {
                                    synchronized (a33Var) {
                                        s11 s11Var2 = this.a;
                                        s11Var2.getClass();
                                        byte[] bArr3 = ka4.a;
                                        ((ConcurrentLinkedQueue) s11Var2.d).add(a33Var);
                                        ((dt3) s11Var2.b).c((gk1) s11Var2.c, 0L);
                                        this.c.b(a33Var);
                                        a33Var2 = a33Var;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.w = null;
                            throw th2;
                        }
                        arrayList = null;
                        a33Var = new a33(this.a, a83Var);
                        this.c.w = a33Var;
                    }
                } else if (socketK != null) {
                    u41.r("Check failed.");
                    return null;
                }
            } else {
                this.f = 0;
                this.g = 0;
                this.h = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    a33Var2 = this.c.p;
                    a33Var2.getClass();
                } else {
                    a83Var = this.i;
                    if (a83Var != null) {
                        this.i = null;
                    } else {
                        kn4Var = this.d;
                        if (kn4Var == null) {
                        }
                        biVar = this.e;
                        if (biVar == null) {
                            o4 o4Var3 = this.b;
                            y23 y23Var2 = this.c;
                            biVar = new bi(o4Var3, y23Var2.c.G, y23Var2);
                            this.e = biVar;
                        }
                        if (biVar.d()) {
                            m51.o();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (biVar.a < ((List) biVar.d).size()) {
                            o4Var = (o4) biVar.b;
                            if (biVar.a < ((List) biVar.d).size()) {
                                throw new SocketException("No route to " + o4Var.h.d + "; exhausted proxy configurations: " + ((List) biVar.d));
                            }
                            List list2 = (List) biVar.d;
                            int i7 = biVar.a;
                            biVar.a = i7 + 1;
                            proxy = (Proxy) list2.get(i7);
                            ArrayList arrayList4 = new ArrayList();
                            biVar.e = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                tk1 tk1Var4 = o4Var.h;
                                hostAddress = tk1Var4.d;
                                port = tk1Var4.e;
                            } else {
                                tk1 tk1Var5 = o4Var.h;
                                hostAddress = tk1Var5.d;
                                port = tk1Var5.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            pe0.s0((ArrayList) biVar.f, arrayList);
                            ((ArrayList) biVar.f).clear();
                        }
                        kn4Var2 = new kn4(arrayList);
                        this.d = kn4Var2;
                        if (!this.c.u) {
                            m51.l("Canceled");
                            return null;
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            a33Var2 = this.c.p;
                            a33Var2.getClass();
                        } else {
                            if (kn4Var2.i()) {
                                m51.o();
                                return null;
                            }
                            int i8 = kn4Var2.b;
                            kn4Var2.b = i8 + 1;
                            a83Var = (a83) arrayList.get(i8);
                            a33Var = new a33(this.a, a83Var);
                            this.c.w = a33Var;
                            a33Var.c(i, i2, i3, z, this.c);
                            this.c.w = null;
                            sz0Var = this.c.c.G;
                            synchronized (sz0Var) {
                                ((LinkedHashSet) sz0Var.c).remove(a83Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    a33 a33Var5 = this.c.p;
                                    a33Var5.getClass();
                                    this.i = a83Var;
                                    Socket socket3 = a33Var.d;
                                    socket3.getClass();
                                    ka4.e(socket3);
                                    a33Var2 = a33Var5;
                                } else {
                                    synchronized (a33Var) {
                                        s11 s11Var3 = this.a;
                                        s11Var3.getClass();
                                        byte[] bArr4 = ka4.a;
                                        ((ConcurrentLinkedQueue) s11Var3.d).add(a33Var);
                                        ((dt3) s11Var3.b).c((gk1) s11Var3.c, 0L);
                                        this.c.b(a33Var);
                                        a33Var2 = a33Var;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    a33Var = new a33(this.a, a83Var);
                    this.c.w = a33Var;
                    a33Var.c(i, i2, i3, z, this.c);
                    this.c.w = null;
                    sz0Var = this.c.c.G;
                    synchronized (sz0Var) {
                        ((LinkedHashSet) sz0Var.c).remove(a83Var);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            a33 a33Var6 = this.c.p;
                            a33Var6.getClass();
                            this.i = a83Var;
                            Socket socket4 = a33Var.d;
                            socket4.getClass();
                            ka4.e(socket4);
                            a33Var2 = a33Var6;
                        } else {
                            synchronized (a33Var) {
                                s11 s11Var4 = this.a;
                                s11Var4.getClass();
                                byte[] bArr5 = ka4.a;
                                ((ConcurrentLinkedQueue) s11Var4.d).add(a33Var);
                                ((dt3) s11Var4.b).c((gk1) s11Var4.c, 0L);
                                this.c.b(a33Var);
                                a33Var2 = a33Var;
                            }
                        }
                    }
                }
            }
            if (a33Var2.i(z2)) {
                return a33Var2;
            }
            a33Var2.k();
            if (this.i == null) {
                kn4 kn4Var4 = this.d;
                if (kn4Var4 != null ? kn4Var4.i() : true) {
                    continue;
                } else {
                    bi biVar2 = this.e;
                    if (!(biVar2 != null ? biVar2.d() : true)) {
                        m51.l("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        m51.l("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof bo3) && ((bo3) iOException).c == 8) {
            this.f++;
        } else if (iOException instanceof nl0) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
