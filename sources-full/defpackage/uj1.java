package defpackage;

import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class uj1 implements zh3 {
    public final uc1 c;
    public boolean d;
    public final /* synthetic */ yj1 h;

    public uj1(yj1 yj1Var) {
        this.h = yj1Var;
        this.c = new uc1(yj1Var.d.b());
    }

    @Override // defpackage.zh3
    public final c b() {
        return this.c;
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.h.d.H("0\r\n\r\n");
        uc1 uc1Var = this.c;
        c cVar = uc1Var.e;
        uc1Var.e = c.d;
        cVar.a();
        cVar.b();
        this.h.e = 3;
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) {
        my myVar = this.h.d;
        if (this.d) {
            u41.r("closed");
        } else {
            if (j == 0) {
                return;
            }
            myVar.f(j);
            myVar.H("\r\n");
            myVar.d(dyVar, j);
            myVar.H("\r\n");
        }
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final synchronized void flush() {
        if (this.d) {
            return;
        }
        this.h.d.flush();
    }
}
