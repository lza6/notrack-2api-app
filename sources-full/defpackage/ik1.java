package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements Closeable {
    public static final mg3 H;
    public long A;
    public long B;
    public long C;
    public final Socket D;
    public final qk1 E;
    public final h90 F;
    public final LinkedHashSet G;
    public final bk1 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final String h;
    public int l;
    public int m;
    public boolean n;
    public final et3 o;
    public final dt3 p;
    public final dt3 q;
    public final dt3 r;
    public final bg1 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final mg3 x;
    public mg3 y;
    public long z;

    static {
        mg3 mg3Var = new mg3();
        mg3Var.b(7, 65535);
        mg3Var.b(5, 16384);
        H = mg3Var;
    }

    public ik1(f13 f13Var) {
        this.c = (bk1) f13Var.f;
        String str = (String) f13Var.a;
        if (str == null) {
            kr1.n0("connectionName");
            throw null;
        }
        this.h = str;
        this.m = 3;
        et3 et3Var = (et3) f13Var.b;
        this.o = et3Var;
        this.p = et3Var.e();
        this.q = et3Var.e();
        this.r = et3Var.e();
        this.s = bg1.x;
        mg3 mg3Var = new mg3();
        mg3Var.b(7, 16777216);
        this.x = mg3Var;
        mg3 mg3Var2 = H;
        this.y = mg3Var2;
        this.C = mg3Var2.a();
        Socket socket = (Socket) f13Var.c;
        if (socket == null) {
            kr1.n0("socket");
            throw null;
        }
        this.D = socket;
        t23 t23Var = (t23) f13Var.e;
        if (t23Var == null) {
            kr1.n0("sink");
            throw null;
        }
        this.E = new qk1(t23Var);
        u23 u23Var = (u23) f13Var.d;
        if (u23Var == null) {
            kr1.n0("source");
            throw null;
        }
        this.F = new h90(this, new lk1(u23Var));
        this.G = new LinkedHashSet();
    }

    public final void A(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.p.c(new dk1(this.h + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void K(long j, int i) {
        this.p.c(new hk1(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array = null;
        if (i == 0 || i2 == 0) {
            throw null;
        }
        byte[] bArr = ka4.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.d.isEmpty()) {
                array = this.d.values().toArray(new pk1[0]);
                this.d.clear();
            }
        }
        pk1[] pk1VarArr = (pk1[]) array;
        if (pk1VarArr != null) {
            for (pk1 pk1Var : pk1VarArr) {
                try {
                    pk1Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.E.close();
        } catch (IOException unused3) {
        }
        try {
            this.D.close();
        } catch (IOException unused4) {
        }
        this.p.e();
        this.q.e();
        this.r.e();
    }

    public final synchronized pk1 c(int i) {
        return (pk1) this.d.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final void flush() {
        this.E.flush();
    }

    public final synchronized pk1 h(int i) {
        pk1 pk1Var;
        pk1Var = (pk1) this.d.remove(Integer.valueOf(i));
        notifyAll();
        return pk1Var;
    }

    public final void l(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.E) {
            synchronized (this) {
                if (this.n) {
                    return;
                }
                this.n = true;
                this.E.l(ka4.a, this.l, i);
            }
        }
    }

    public final synchronized void p(long j) {
        long j2 = this.z + j;
        this.z = j2;
        long j3 = j2 - this.A;
        if (j3 >= this.x.a() / 2) {
            K(j3, 0);
            this.A += j3;
        }
    }

    public final void x(int i, boolean z, dy dyVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.E.c(z, i, dyVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.B;
                            j3 = this.C;
                            if (j2 >= j3) {
                                if (!this.d.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.E.h);
                j4 = iMin;
                this.B += j4;
            }
            j -= j4;
            this.E.c(z && j == 0, i, dyVar, iMin);
        }
    }
}
