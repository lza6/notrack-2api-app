package defpackage;

import app.template.extension.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class y23 implements Cloneable {
    public final tn2 c;
    public final l53 d;
    public final s11 h;
    public final x23 l;
    public final AtomicBoolean m;
    public Object n;
    public f51 o;
    public a33 p;
    public sd q;
    public boolean r;
    public boolean s;
    public boolean t;
    public volatile boolean u;
    public volatile sd v;
    public volatile a33 w;

    public y23(tn2 tn2Var, l53 l53Var) {
        tn2Var.getClass();
        l53Var.getClass();
        this.c = tn2Var;
        this.d = l53Var;
        this.h = (s11) tn2Var.d.d;
        tn2Var.m.getClass();
        x23 x23Var = new x23(this);
        x23Var.g(0L);
        this.l = x23Var;
        this.m = new AtomicBoolean();
        this.t = true;
    }

    public static final String a(y23 y23Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(y23Var.u ? "canceled " : BuildConfig.VERSION_NAME);
        sb.append("call");
        sb.append(" to ");
        sb.append(y23Var.d.a.f());
        return sb.toString();
    }

    public final void b(a33 a33Var) {
        byte[] bArr = ka4.a;
        if (this.p != null) {
            u41.r("Check failed.");
        } else {
            this.p = a33Var;
            a33Var.p.add(new w23(this, this.n));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        byte[] bArr = ka4.a;
        a33 a33Var = this.p;
        if (a33Var != null) {
            synchronized (a33Var) {
                socketK = k();
            }
            if (this.p == null) {
                if (socketK != null) {
                    ka4.e(socketK);
                }
            } else if (socketK != null) {
                u41.r("Check failed.");
                return null;
            }
        }
        if (this.l.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new y23(this.c, this.d);
    }

    public final void d() {
        Socket socket;
        if (this.u) {
            return;
        }
        this.u = true;
        sd sdVar = this.v;
        if (sdVar != null) {
            ((e51) sdVar.d).cancel();
        }
        a33 a33Var = this.w;
        if (a33Var == null || (socket = a33Var.c) == null) {
            return;
        }
        ka4.e(socket);
    }

    public final void e(c00 c00Var) {
        v23 v23Var;
        if (!this.m.compareAndSet(false, true)) {
            u41.r("Already Executed");
            return;
        }
        vv2 vv2Var = vv2.a;
        this.n = vv2.a.g();
        ir3 ir3Var = this.c.c;
        v23 v23Var2 = new v23(this, c00Var);
        ir3Var.getClass();
        synchronized (ir3Var) {
            ((ArrayDeque) ir3Var.d).add(v23Var2);
            String str = this.d.a.d;
            Iterator it = ((ArrayDeque) ir3Var.h).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) ir3Var.d).iterator();
                    do {
                        if (!it2.hasNext()) {
                            v23Var = null;
                            break;
                        }
                        v23Var = (v23) it2.next();
                    } while (!kr1.n(v23Var.h.d.a.d, str));
                } else {
                    v23Var = (v23) it.next();
                }
            } while (!kr1.n(v23Var.h.d.a.d, str));
            if (v23Var != null) {
                v23Var2.d = v23Var.d;
            }
        }
        ir3Var.f0();
    }

    public final f63 f() {
        if (!this.m.compareAndSet(false, true)) {
            u41.r("Already Executed");
            return null;
        }
        this.l.h();
        vv2 vv2Var = vv2.a;
        this.n = vv2.a.g();
        try {
            ir3 ir3Var = this.c.c;
            synchronized (ir3Var) {
                ((ArrayDeque) ir3Var.l).add(this);
            }
            f63 f63VarH = h();
            ir3 ir3Var2 = this.c.c;
            ir3Var2.getClass();
            ir3Var2.O((ArrayDeque) ir3Var2.l, this);
            return f63VarH;
        } catch (Throwable th) {
            ir3 ir3Var3 = this.c.c;
            ir3Var3.getClass();
            ir3Var3.O((ArrayDeque) ir3Var3.l, this);
            throw th;
        }
    }

    public final void g(boolean z) {
        sd sdVar;
        synchronized (this) {
            if (!this.t) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (sdVar = this.v) != null) {
            ((e51) sdVar.d).cancel();
            ((y23) sdVar.b).i(sdVar, true, true, null);
        }
        this.q = null;
    }

    public final f63 h() {
        ArrayList arrayList = new ArrayList();
        pe0.s0(this.c.h, arrayList);
        arrayList.add(new hx(this.c));
        arrayList.add(new hx(this.c.r));
        this.c.getClass();
        arrayList.add(new sz(0));
        arrayList.add(sz.b);
        pe0.s0(this.c.l, arrayList);
        arrayList.add(new sz(2));
        l53 l53Var = this.d;
        tn2 tn2Var = this.c;
        try {
            try {
                f63 f63VarB = new i33(this, arrayList, 0, null, l53Var, tn2Var.D, tn2Var.E, tn2Var.F).b(this.d);
                if (this.u) {
                    ka4.d(f63VarB);
                    throw new IOException("Canceled");
                }
                j(null);
                return f63VarB;
            } catch (IOException e) {
                IOException iOExceptionJ = j(e);
                iOExceptionJ.getClass();
                throw iOExceptionJ;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0030  */
    public final IOException i(sd sdVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sdVar.getClass();
        if (sdVar.equals(this.v)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.r) {
                            if (z) {
                                this.r = false;
                            }
                            if (z2) {
                                this.s = false;
                            }
                            z5 = this.r;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.s) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.r = false;
                            }
                            if (z2) {
                                this.s = false;
                            }
                            z5 = this.r;
                            if (z5 || this.s) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.s && !this.t) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.v = null;
                a33 a33Var = this.p;
                if (a33Var != null) {
                    synchronized (a33Var) {
                        a33Var.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.t) {
                this.t = false;
                if (!this.r && !this.s) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        a33 a33Var = this.p;
        a33Var.getClass();
        byte[] bArr = ka4.a;
        ArrayList arrayList = a33Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (kr1.n(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            u41.r("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        a33Var.q = System.nanoTime();
        s11 s11Var = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) s11Var.d;
        dt3 dt3Var = (dt3) s11Var.b;
        byte[] bArr2 = ka4.a;
        if (!a33Var.j) {
            dt3Var.c((gk1) s11Var.c, 0L);
            return null;
        }
        a33Var.j = true;
        concurrentLinkedQueue.remove(a33Var);
        if (concurrentLinkedQueue.isEmpty()) {
            dt3Var.a();
        }
        Socket socket = a33Var.d;
        socket.getClass();
        return socket;
    }
}
