package defpackage;

import java.io.Closeable;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class f63 implements Closeable {
    public final l53 c;
    public final n13 d;
    public final String h;
    public final int l;
    public final hh1 m;
    public final th1 n;
    public final m33 o;
    public final f63 p;
    public final f63 q;
    public final f63 r;
    public final long s;
    public final long t;
    public final sd u;

    public f63(l53 l53Var, n13 n13Var, String str, int i, hh1 hh1Var, th1 th1Var, m33 m33Var, f63 f63Var, f63 f63Var2, f63 f63Var3, long j, long j2, sd sdVar) {
        l53Var.getClass();
        n13Var.getClass();
        str.getClass();
        this.c = l53Var;
        this.d = n13Var;
        this.h = str;
        this.l = i;
        this.m = hh1Var;
        this.n = th1Var;
        this.o = m33Var;
        this.p = f63Var;
        this.q = f63Var2;
        this.r = f63Var3;
        this.s = j;
        this.t = j2;
        this.u = sdVar;
    }

    public static String a(f63 f63Var, String str) {
        f63Var.getClass();
        String strB = f63Var.n.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final boolean c() {
        int i = this.l;
        return 200 <= i && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m33 m33Var = this.o;
        if (m33Var != null) {
            m33Var.close();
        } else {
            u41.r("response is not eligible for a body and must not be closed");
        }
    }

    public final e63 h() {
        e63 e63Var = new e63();
        e63Var.a = this.c;
        e63Var.b = this.d;
        e63Var.c = this.l;
        e63Var.d = this.h;
        e63Var.e = this.m;
        e63Var.f = this.n.g();
        e63Var.g = this.o;
        e63Var.h = this.p;
        e63Var.i = this.q;
        e63Var.j = this.r;
        e63Var.k = this.s;
        e63Var.l = this.t;
        e63Var.m = this.u;
        return e63Var;
    }

    public final m33 l() throws EOFException {
        m33 m33Var = this.o;
        m33Var.getClass();
        u23 u23VarPeek = m33Var.D().peek();
        dy dyVar = new dy();
        u23VarPeek.j(65536L);
        long jMin = Math.min(65536L, u23VarPeek.d.d);
        while (jMin > 0) {
            long jY = u23VarPeek.y(dyVar, jMin);
            if (jY == -1) {
                throw new EOFException();
            }
            jMin -= jY;
        }
        return new m33(m33Var.h(), dyVar.d, dyVar, 1);
    }

    public final String toString() {
        return "Response{protocol=" + this.d + ", code=" + this.l + ", message=" + this.h + ", url=" + this.c.a + '}';
    }
}
