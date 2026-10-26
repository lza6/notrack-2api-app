package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class an implements wl3 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object h;

    public an(InputStream inputStream, c cVar) {
        inputStream.getClass();
        this.d = inputStream;
        this.h = cVar;
    }

    public an(ql3 ql3Var, an anVar) {
        this.d = ql3Var;
        this.h = anVar;
    }

    @Override // defpackage.wl3
    public final c b() {
        switch (this.c) {
            case 0:
                return (ql3) this.d;
            default:
                return (c) this.h;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ql3 ql3Var = (ql3) obj;
                an anVar = (an) this.h;
                ql3Var.h();
                try {
                    try {
                        anVar.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "AsyncTimeout.source(" + ((an) this.h) + ')';
            default:
                return "source(" + ((InputStream) this.d) + ')';
        }
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.h;
        dyVar.getClass();
        switch (i) {
            case 0:
                ql3 ql3Var = (ql3) obj;
                an anVar = (an) obj2;
                ql3Var.h();
                try {
                    try {
                        long jY = anVar.y(dyVar, j);
                        if (ql3Var.i()) {
                            throw ql3Var.k(null);
                        }
                        return jY;
                    } catch (IOException e) {
                        if (ql3Var.i()) {
                            throw ql3Var.k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    ql3Var.i();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    u41.h(ud2.o("byteCount < 0: ", j));
                    return 0L;
                }
                try {
                    ((c) obj2).f();
                    uc3 uc3VarR = dyVar.R(1);
                    int i2 = ((InputStream) obj).read(uc3VarR.a, uc3VarR.c, (int) Math.min(j, 8192 - uc3VarR.c));
                    if (i2 == -1) {
                        if (uc3VarR.b == uc3VarR.c) {
                            dyVar.c = uc3VarR.a();
                            xc3.a(uc3VarR);
                        }
                        return -1L;
                    }
                    uc3VarR.c += i2;
                    long j2 = i2;
                    dyVar.d += j2;
                    return j2;
                } catch (AssertionError e2) {
                    Logger logger = xj4.a;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? mo3.u0(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }
}
