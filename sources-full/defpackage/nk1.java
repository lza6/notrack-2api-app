package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class nk1 implements wl3 {
    public final long c;
    public boolean d;
    public final dy h = new dy();
    public final dy l = new dy();
    public boolean m;
    public final /* synthetic */ pk1 n;

    public nk1(pk1 pk1Var, long j, boolean z) {
        this.n = pk1Var;
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.n.k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        pk1 pk1Var = this.n;
        synchronized (pk1Var) {
            this.m = true;
            dy dyVar = this.l;
            j = dyVar.d;
            dyVar.a();
            pk1Var.notifyAll();
        }
        if (j > 0) {
            pk1 pk1Var2 = this.n;
            byte[] bArr = ka4.a;
            pk1Var2.b.p(j);
        }
        this.n.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009d A[LOOP:0: B:4:0x000d->B:49:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a1 A[SYNTHETIC] */
    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) throws Throwable {
        int i;
        Throwable th;
        dy dyVar2;
        long j2;
        boolean z;
        long j3;
        long jY;
        long j4;
        dyVar.getClass();
        long j5 = 0;
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            pk1 pk1Var = this.n;
            synchronized (pk1Var) {
                pk1Var.k.h();
                try {
                    synchronized (pk1Var) {
                        i = pk1Var.m;
                    }
                    if (!z) {
                        if (jY != -1) {
                            return jY;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j5 = j3;
                } catch (Throwable th2) {
                    pk1Var.k.k();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.d) {
                Throwable bo3Var = pk1Var.n;
                if (bo3Var == null) {
                    synchronized (pk1Var) {
                        int i2 = pk1Var.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        bo3Var = new bo3(i2);
                    }
                }
                th = bo3Var;
                if (!this.m) {
                    throw new IOException("stream closed");
                }
                dyVar2 = this.l;
                j2 = dyVar2.d;
                z = false;
                if (j2 > j5) {
                    jY = dyVar2.y(dyVar, Math.min(j, j2));
                    long j6 = pk1Var.c + jY;
                    pk1Var.c = j6;
                    j3 = j5;
                    j4 = j6 - pk1Var.d;
                    if (th == null) {
                        pk1Var.b.K(j4, pk1Var.a);
                        pk1Var.d = pk1Var.c;
                    }
                } else {
                    j3 = j5;
                    if (!this.d) {
                        pk1Var.wait();
                        z = true;
                    }
                    jY = -1;
                }
                pk1Var.k.k();
                if (!z) {
                    if (jY != -1) {
                        return jY;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j5 = j3;
            } else {
                if (!this.m) {
                    throw new IOException("stream closed");
                }
                dyVar2 = this.l;
                j2 = dyVar2.d;
                z = false;
                if (j2 > j5) {
                    jY = dyVar2.y(dyVar, Math.min(j, j2));
                    long j7 = pk1Var.c + jY;
                    pk1Var.c = j7;
                    j3 = j5;
                    j4 = j7 - pk1Var.d;
                    if (th == null && j4 >= pk1Var.b.x.a() / 2) {
                        pk1Var.b.K(j4, pk1Var.a);
                        pk1Var.d = pk1Var.c;
                    }
                } else {
                    j3 = j5;
                    if (!this.d && th == null) {
                        try {
                            pk1Var.wait();
                            z = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    jY = -1;
                }
                pk1Var.k.k();
                if (!z) {
                    if (jY != -1) {
                        return jY;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j5 = j3;
            }
            throw th;
        }
    }
}
