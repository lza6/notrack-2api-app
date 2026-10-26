package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 implements AutoCloseable {
    public static final u43 z = new u43("[a-z0-9_-]{1,120}");
    public final mt2 c;
    public final long d;
    public final mt2 h;
    public final mt2 l;
    public final mt2 m;
    public final LinkedHashMap n;
    public final qo0 o;
    public final Object p;
    public long q;
    public int r;
    public t23 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final kw0 y;

    public lw0(long j, a71 a71Var, mt2 mt2Var) {
        this.c = mt2Var;
        this.d = j;
        if (j <= 0) {
            u41.k("maxSize <= 0");
            throw null;
        }
        this.h = mt2Var.e("journal");
        this.l = mt2Var.e("journal.tmp");
        this.m = mt2Var.e("journal.bkp");
        this.n = new LinkedHashMap(0, 0.75f, true);
        rp3 rp3VarG = py.g();
        zp0.Key.getClass();
        jt0 jt0Var = sw0.a;
        this.o = yo4.a(y64.I(rp3VarG, zp0.limitedParallelism$default(at0.c, 1, null, 2, null)));
        this.p = new Object();
        this.y = new kw0(a71Var);
    }

    public static void R(String str) {
        if (z.c(str)) {
            return;
        }
        u41.q(str, "keys must match regex [a-z0-9_-]{1,120}: \"");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0077, B:33:0x007e, B:28:0x005e, B:37:0x009e, B:39:0x00a5, B:42:0x00aa, B:44:0x00bb, B:47:0x00c0, B:52:0x00fb, B:54:0x0106, B:58:0x010f, B:48:0x00d8, B:50:0x00ed, B:51:0x00f8, B:36:0x008e, B:61:0x0114, B:62:0x011b), top: B:65:0x0003 }] */
    public static final void a(lw0 lw0Var, hw0 hw0Var, boolean z2) {
        synchronized (lw0Var.p) {
            iw0 iw0Var = (iw0) hw0Var.c;
            if (!kr1.n(iw0Var.g, hw0Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z2 || iw0Var.f) {
                for (int i = 0; i < 2; i++) {
                    lw0Var.y.p((mt2) iw0Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) hw0Var.a)[i2] && !lw0Var.y.x((mt2) iw0Var.d.get(i2))) {
                        hw0Var.a(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    mt2 mt2Var = (mt2) iw0Var.d.get(i3);
                    mt2 mt2Var2 = (mt2) iw0Var.c.get(i3);
                    boolean zX = lw0Var.y.x(mt2Var);
                    kw0 kw0Var = lw0Var.y;
                    if (zX) {
                        kw0Var.c(mt2Var, mt2Var2);
                    } else {
                        yh4.t(kw0Var, (mt2) iw0Var.c.get(i3));
                    }
                    long j = iw0Var.b[i3];
                    Long l = lw0Var.y.K(mt2Var2).d;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    iw0Var.b[i3] = jLongValue;
                    lw0Var.q = (lw0Var.q - j) + jLongValue;
                }
            }
            iw0Var.g = null;
            if (iw0Var.f) {
                lw0Var.O(iw0Var);
                return;
            }
            lw0Var.r++;
            t23 t23Var = lw0Var.s;
            t23Var.getClass();
            if (z2 || iw0Var.e) {
                iw0Var.e = true;
                t23Var.H("CLEAN");
                t23Var.writeByte(32);
                t23Var.H(iw0Var.a);
                for (long j2 : iw0Var.b) {
                    t23Var.writeByte(32);
                    t23Var.I(j2);
                }
                t23Var.writeByte(10);
            } else {
                lw0Var.n.remove(iw0Var.a);
                t23Var.H("REMOVE");
                t23Var.writeByte(32);
                t23Var.H(iw0Var.a);
                t23Var.writeByte(10);
            }
            t23Var.flush();
            if (lw0Var.q > lw0Var.d) {
                lw0Var.p();
            } else if (lw0Var.r >= 2000) {
                lw0Var.p();
            }
        }
    }

    public final void A() {
        Iterator it = this.n.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            iw0 iw0Var = (iw0) it.next();
            int i = 0;
            if (iw0Var.g == null) {
                while (i < 2) {
                    j += iw0Var.b[i];
                    i++;
                }
            } else {
                iw0Var.g = null;
                while (i < 2) {
                    mt2 mt2Var = (mt2) iw0Var.c.get(i);
                    kw0 kw0Var = this.y;
                    kw0Var.p(mt2Var);
                    kw0Var.p((mt2) iw0Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.q = j;
    }

    public final void K() throws Throwable {
        wl3 wl3VarR = this.y.R(this.h);
        wl3VarR.getClass();
        u23 u23Var = new u23(wl3VarR);
        try {
            String strZ = u23Var.z(LongCompanionObject.MAX_VALUE);
            String strZ2 = u23Var.z(LongCompanionObject.MAX_VALUE);
            String strZ3 = u23Var.z(LongCompanionObject.MAX_VALUE);
            String strZ4 = u23Var.z(LongCompanionObject.MAX_VALUE);
            String strZ5 = u23Var.z(LongCompanionObject.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strZ) || !"1".equals(strZ2) || !kr1.n(String.valueOf(3), strZ3) || !kr1.n(String.valueOf(2), strZ4) || strZ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ + ", " + strZ2 + ", " + strZ3 + ", " + strZ4 + ", " + strZ5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    L(u23Var.z(LongCompanionObject.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.r = i - this.n.size();
                    if (u23Var.r()) {
                        this.s = x();
                    } else {
                        S();
                    }
                    try {
                        u23Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                u23Var.close();
            } catch (Throwable th3) {
                gb2.l(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void L(String str) throws IOException {
        String strSubstring;
        int iZ0 = mo3.z0(' ', 0, 6, str);
        if (iZ0 == -1) {
            m51.l("unexpected journal line: ".concat(str));
            return;
        }
        int i = iZ0 + 1;
        int iZ1 = mo3.z0(' ', i, 4, str);
        LinkedHashMap linkedHashMap = this.n;
        if (iZ1 == -1) {
            strSubstring = str.substring(i);
            if (iZ0 == 6 && to3.q0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iZ1);
        }
        Object iw0Var = linkedHashMap.get(strSubstring);
        if (iw0Var == null) {
            iw0Var = new iw0(this, strSubstring);
            linkedHashMap.put(strSubstring, iw0Var);
        }
        iw0 iw0Var2 = (iw0) iw0Var;
        if (iZ1 == -1 || iZ0 != 5 || !to3.q0(str, "CLEAN", false)) {
            if (iZ1 == -1 && iZ0 == 5 && to3.q0(str, "DIRTY", false)) {
                iw0Var2.g = new hw0(this, iw0Var2);
                return;
            } else {
                if (iZ1 == -1 && iZ0 == 4 && to3.q0(str, "READ", false)) {
                    return;
                }
                m51.l("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listN0 = mo3.N0(str.substring(iZ1 + 1), new char[]{' '});
        iw0Var2.e = true;
        iw0Var2.g = null;
        if (listN0.size() != 2) {
            j93.f(listN0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listN0.size();
            for (int i2 = 0; i2 < size; i2++) {
                iw0Var2.b[i2] = Long.parseLong((String) listN0.get(i2));
            }
        } catch (NumberFormatException unused) {
            j93.f(listN0, "unexpected journal line: ");
        }
    }

    public final void O(iw0 iw0Var) {
        t23 t23Var;
        int i = iw0Var.h;
        String str = iw0Var.a;
        if (i > 0 && (t23Var = this.s) != null) {
            t23Var.H("DIRTY");
            t23Var.writeByte(32);
            t23Var.H(str);
            t23Var.writeByte(10);
            t23Var.flush();
        }
        if (iw0Var.h > 0 || iw0Var.g != null) {
            iw0Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.y.p((mt2) iw0Var.c.get(i2));
            long j = this.q;
            long[] jArr = iw0Var.b;
            this.q = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.r++;
        t23 t23Var2 = this.s;
        if (t23Var2 != null) {
            t23Var2.H("REMOVE");
            t23Var2.writeByte(32);
            t23Var2.H(str);
            t23Var2.writeByte(10);
            t23Var2.flush();
        }
        this.n.remove(str);
        if (this.r >= 2000) {
            p();
        }
    }

    public final void Q() {
        while (this.q > this.d) {
            for (iw0 iw0Var : this.n.values()) {
                if (!iw0Var.f) {
                    O(iw0Var);
                }
            }
            return;
        }
        this.w = false;
    }

    public final void S() {
        synchronized (this.p) {
            try {
                t23 t23Var = this.s;
                if (t23Var != null) {
                    t23Var.close();
                }
                zh3 zh3VarQ = this.y.Q(this.l, false);
                zh3VarQ.getClass();
                t23 t23Var2 = new t23(zh3VarQ);
                try {
                    t23Var2.H("libcore.io.DiskLruCache");
                    t23Var2.writeByte(10);
                    t23Var2.H("1");
                    t23Var2.writeByte(10);
                    t23Var2.I(3L);
                    t23Var2.writeByte(10);
                    t23Var2.I(2L);
                    t23Var2.writeByte(10);
                    t23Var2.writeByte(10);
                    for (iw0 iw0Var : this.n.values()) {
                        if (iw0Var.g != null) {
                            t23Var2.H("DIRTY");
                            t23Var2.writeByte(32);
                            t23Var2.H(iw0Var.a);
                            t23Var2.writeByte(10);
                        } else {
                            t23Var2.H("CLEAN");
                            t23Var2.writeByte(32);
                            t23Var2.H(iw0Var.a);
                            for (long j : iw0Var.b) {
                                t23Var2.writeByte(32);
                                t23Var2.I(j);
                            }
                            t23Var2.writeByte(10);
                        }
                    }
                    try {
                        t23Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        t23Var2.close();
                    } catch (Throwable th3) {
                        gb2.l(th, th3);
                    }
                }
                if (th != null) {
                    throw th;
                }
                boolean zX = this.y.x(this.h);
                kw0 kw0Var = this.y;
                if (zX) {
                    kw0Var.c(this.h, this.m);
                    this.y.c(this.l, this.h);
                    this.y.p(this.m);
                } else {
                    kw0Var.c(this.l, this.h);
                }
                this.s = x();
                this.r = 0;
                this.t = false;
                this.x = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final hw0 c(String str) {
        synchronized (this.p) {
            if (this.v) {
                throw new IllegalStateException("cache is closed");
            }
            R(str);
            l();
            iw0 iw0Var = (iw0) this.n.get(str);
            if ((iw0Var != null ? iw0Var.g : null) != null) {
                return null;
            }
            if (iw0Var != null && iw0Var.h != 0) {
                return null;
            }
            if (!this.w && !this.x) {
                t23 t23Var = this.s;
                t23Var.getClass();
                t23Var.H("DIRTY");
                t23Var.writeByte(32);
                t23Var.H(str);
                t23Var.writeByte(10);
                t23Var.flush();
                if (this.t) {
                    return null;
                }
                if (iw0Var == null) {
                    iw0Var = new iw0(this, str);
                    this.n.put(str, iw0Var);
                }
                hw0 hw0Var = new hw0(this, iw0Var);
                iw0Var.g = hw0Var;
                return hw0Var;
            }
            p();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.p) {
            try {
                if (this.u && !this.v) {
                    for (iw0 iw0Var : (iw0[]) this.n.values().toArray(new iw0[0])) {
                        hw0 hw0Var = iw0Var.g;
                        if (hw0Var != null) {
                            iw0 iw0Var2 = (iw0) hw0Var.c;
                            if (kr1.n(iw0Var2.g, hw0Var)) {
                                iw0Var2.f = true;
                            }
                        }
                    }
                    Q();
                    yo4.l(this.o, null);
                    t23 t23Var = this.s;
                    t23Var.getClass();
                    t23Var.close();
                    this.s = null;
                    this.v = true;
                    return;
                }
                this.v = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final jw0 h(String str) {
        jw0 jw0VarA;
        synchronized (this.p) {
            if (this.v) {
                throw new IllegalStateException("cache is closed");
            }
            R(str);
            l();
            iw0 iw0Var = (iw0) this.n.get(str);
            if (iw0Var != null && (jw0VarA = iw0Var.a()) != null) {
                boolean z2 = true;
                this.r++;
                t23 t23Var = this.s;
                t23Var.getClass();
                t23Var.H("READ");
                t23Var.writeByte(32);
                t23Var.H(str);
                t23Var.writeByte(10);
                t23Var.flush();
                if (this.r < 2000) {
                    z2 = false;
                }
                if (z2) {
                    p();
                }
                return jw0VarA;
            }
            return null;
        }
    }

    public final void l() {
        synchronized (this.p) {
            try {
                if (this.u) {
                    return;
                }
                this.y.p(this.l);
                if (this.y.x(this.m)) {
                    boolean zX = this.y.x(this.h);
                    kw0 kw0Var = this.y;
                    mt2 mt2Var = this.m;
                    if (zX) {
                        kw0Var.p(mt2Var);
                    } else {
                        kw0Var.c(mt2Var, this.h);
                    }
                }
                if (this.y.x(this.h)) {
                    try {
                        K();
                        A();
                        this.u = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            yh4.v(this.y, this.c);
                            this.v = false;
                            S();
                            this.u = true;
                        } catch (Throwable th) {
                            this.v = false;
                            throw th;
                        }
                    }
                }
                S();
                this.u = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        py.F(this.o, null, null, new fp(this, null, 3), 3);
    }

    public final t23 x() {
        kw0 kw0Var = this.y;
        kw0Var.getClass();
        mt2 mt2Var = this.h;
        mt2Var.getClass();
        return new t23(new n61(kw0Var.h.a(mt2Var), new s(5, this)));
    }
}
