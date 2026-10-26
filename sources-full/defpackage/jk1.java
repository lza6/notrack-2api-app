package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements e51 {
    public static final List g = ka4.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = ka4.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final a33 a;
    public final i33 b;
    public final ik1 c;
    public volatile pk1 d;
    public final n13 e;
    public volatile boolean f;

    public jk1(tn2 tn2Var, a33 a33Var, i33 i33Var, ik1 ik1Var) {
        tn2Var.getClass();
        ik1Var.getClass();
        this.a = a33Var;
        this.b = i33Var;
        this.c = ik1Var;
        List list = tn2Var.z;
        n13 n13Var = n13.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(n13Var) ? n13Var : n13.HTTP_2;
    }

    @Override // defpackage.e51
    public final void a(l53 l53Var) throws IOException {
        int i;
        pk1 pk1Var;
        boolean z;
        l53Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = l53Var.d != null;
        th1 th1Var = l53Var.c;
        ArrayList arrayList = new ArrayList(th1Var.size() + 4);
        arrayList.add(new rh1(rh1.f, l53Var.b));
        lz lzVar = rh1.g;
        tk1 tk1Var = l53Var.a;
        tk1Var.getClass();
        String strB = tk1Var.b();
        String strD = tk1Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new rh1(lzVar, strB));
        String strB2 = th1Var.b("Host");
        if (strB2 != null) {
            arrayList.add(new rh1(rh1.i, strB2));
        }
        arrayList.add(new rh1(rh1.h, tk1Var.a));
        int size = th1Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strD2 = th1Var.d(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strD2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && kr1.n(th1Var.j(i2), "trailers"))) {
                arrayList.add(new rh1(lowerCase, th1Var.j(i2)));
            }
        }
        ik1 ik1Var = this.c;
        ik1Var.getClass();
        boolean z3 = !z2;
        synchronized (ik1Var.E) {
            synchronized (ik1Var) {
                try {
                    if (ik1Var.m > 1073741823) {
                        ik1Var.l(8);
                    }
                    if (ik1Var.n) {
                        throw new nl0();
                    }
                    i = ik1Var.m;
                    ik1Var.m = i + 2;
                    pk1Var = new pk1(i, ik1Var, z3, false, null);
                    z = !z2 || ik1Var.B >= ik1Var.C || pk1Var.e >= pk1Var.f;
                    if (pk1Var.h()) {
                        ik1Var.d.put(Integer.valueOf(i), pk1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ik1Var.E.p(z3, i, arrayList);
        }
        if (z) {
            ik1Var.E.flush();
        }
        this.d = pk1Var;
        boolean z4 = this.f;
        pk1 pk1Var2 = this.d;
        if (z4) {
            pk1Var2.getClass();
            pk1Var2.e(9);
            m51.l("Canceled");
        } else {
            pk1Var2.getClass();
            pk1Var2.k.g(this.b.g);
            pk1 pk1Var3 = this.d;
            pk1Var3.getClass();
            pk1Var3.l.g(this.b.h);
        }
    }

    @Override // defpackage.e51
    public final wl3 b(f63 f63Var) {
        pk1 pk1Var = this.d;
        pk1Var.getClass();
        return pk1Var.i;
    }

    @Override // defpackage.e51
    public final void c() {
        pk1 pk1Var = this.d;
        pk1Var.getClass();
        pk1Var.f().close();
    }

    @Override // defpackage.e51
    public final void cancel() {
        this.f = true;
        pk1 pk1Var = this.d;
        if (pk1Var != null) {
            pk1Var.e(9);
        }
    }

    @Override // defpackage.e51
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.e51
    public final zh3 e(l53 l53Var, long j) {
        l53Var.getClass();
        pk1 pk1Var = this.d;
        pk1Var.getClass();
        return pk1Var.f();
    }

    @Override // defpackage.e51
    public final long f(f63 f63Var) {
        if (rk1.a(f63Var)) {
            return ka4.j(f63Var);
        }
        return 0L;
    }

    @Override // defpackage.e51
    public final e63 g(boolean z) throws IOException {
        th1 th1Var;
        pk1 pk1Var = this.d;
        if (pk1Var == null) {
            m51.l("stream wasn't created");
            return null;
        }
        synchronized (pk1Var) {
            pk1Var.k.h();
            while (pk1Var.g.isEmpty() && pk1Var.m == 0) {
                try {
                    try {
                        pk1Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    pk1Var.k.k();
                    throw th;
                }
            }
            pk1Var.k.k();
            if (pk1Var.g.isEmpty()) {
                IOException iOException = pk1Var.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = pk1Var.m;
                if (i != 0) {
                    throw new bo3(i);
                }
                throw null;
            }
            Object objRemoveFirst = pk1Var.g.removeFirst();
            objRemoveFirst.getClass();
            th1Var = (th1) objRemoveFirst;
        }
        n13 n13Var = this.e;
        n13Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = th1Var.size();
        gj gjVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strD = th1Var.d(i2);
            String strJ = th1Var.j(i2);
            if (kr1.n(strD, ":status")) {
                gjVar = Options$Companion.parse("HTTP/1.1 " + strJ);
            } else if (!h.contains(strD)) {
                strD.getClass();
                strJ.getClass();
                arrayList.add(strD);
                arrayList.add(mo3.U0(strJ).toString());
            }
        }
        if (gjVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        e63 e63Var = new e63();
        e63Var.b = n13Var;
        e63Var.c = gjVar.b;
        e63Var.d = (String) gjVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        sh1 sh1Var = new sh1();
        ArrayList arrayList2 = sh1Var.a;
        arrayList2.getClass();
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList2.addAll(listAsList);
        e63Var.f = sh1Var;
        if (z && e63Var.c == 100) {
            return null;
        }
        return e63Var;
    }

    @Override // defpackage.e51
    public final a33 h() {
        return this.a;
    }
}
