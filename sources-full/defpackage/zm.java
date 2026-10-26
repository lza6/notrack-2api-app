package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class zm implements zh3 {
    public final /* synthetic */ int c;
    public final Object d;
    public final Object h;

    public /* synthetic */ zm(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.zh3
    public final c b() {
        switch (this.c) {
            case 0:
                return (ql3) this.d;
            default:
                return (c) this.h;
        }
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ql3 ql3Var = (ql3) obj;
                zm zmVar = (zm) this.h;
                ql3Var.h();
                try {
                    try {
                        zmVar.close();
                        if (ql3Var.i()) {
                            throw ql3Var.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!ql3Var.i()) {
                            throw e;
                        }
                        throw ql3Var.k(e);
                    }
                } catch (Throwable th) {
                    ql3Var.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a A[LOOP:1: B:12:0x0064->B:25:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[SYNTHETIC] */
    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) throws IOException {
        long j2;
        ql3 ql3Var;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                vl0.w(dyVar.d, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    uc3 uc3Var = dyVar.c;
                    uc3Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (uc3Var.c - uc3Var.b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    ql3Var = (ql3) obj;
                                    zm zmVar = (zm) obj2;
                                    ql3Var.h();
                                    zmVar.d(dyVar, j2);
                                    if (!ql3Var.i()) {
                                        throw ql3Var.k(null);
                                    }
                                } else {
                                    uc3Var = uc3Var.f;
                                    uc3Var.getClass();
                                }
                            }
                            zmVar.d(dyVar, j2);
                            if (!ql3Var.i()) {
                                throw ql3Var.k(null);
                            }
                        } catch (IOException e) {
                            if (!ql3Var.i()) {
                                throw e;
                            }
                            throw ql3Var.k(e);
                        }
                    } catch (Throwable th) {
                        ql3Var.i();
                        throw th;
                    }
                    ql3Var = (ql3) obj;
                    zm zmVar2 = (zm) obj2;
                    ql3Var.h();
                }
                return;
            default:
                vl0.w(dyVar.d, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((c) obj2).f();
                    uc3 uc3Var2 = dyVar.c;
                    uc3Var2.getClass();
                    int iMin = (int) Math.min(j4, uc3Var2.c - uc3Var2.b);
                    ((OutputStream) obj).write(uc3Var2.a, uc3Var2.b, iMin);
                    int i2 = uc3Var2.b + iMin;
                    uc3Var2.b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    dyVar.d -= j5;
                    if (i2 == uc3Var2.c) {
                        dyVar.c = uc3Var2.a();
                        xc3.a(uc3Var2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ql3 ql3Var = (ql3) obj;
                zm zmVar = (zm) this.h;
                ql3Var.h();
                try {
                    try {
                        zmVar.flush();
                        if (ql3Var.i()) {
                            throw ql3Var.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!ql3Var.i()) {
                            throw e;
                        }
                        throw ql3Var.k(e);
                    }
                } catch (Throwable th) {
                    ql3Var.i();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "AsyncTimeout.sink(" + ((zm) this.h) + ')';
            default:
                return "sink(" + ((OutputStream) this.d) + ')';
        }
    }
}
