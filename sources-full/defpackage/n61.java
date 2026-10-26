package defpackage;

import java.io.EOFException;
import java.io.IOException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class n61 implements zh3 {
    public final /* synthetic */ int c = 1;
    public boolean d;
    public final Object h;
    public final Object l;

    public n61(yj1 yj1Var) {
        this.l = yj1Var;
        this.h = new uc1(yj1Var.d.b());
    }

    public n61(zh3 zh3Var, s sVar) {
        this.h = zh3Var;
        this.l = sVar;
    }

    @Override // defpackage.zh3
    public final c b() {
        switch (this.c) {
            case 0:
                return ((zh3) this.h).b();
            default:
                return (uc1) this.h;
        }
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        Object obj = this.h;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                try {
                    ((zh3) obj).close();
                } catch (IOException e) {
                    this.d = true;
                    ((s) obj2).invoke(e);
                    return;
                }
                break;
            default:
                yj1 yj1Var = (yj1) obj2;
                if (!this.d) {
                    this.d = true;
                    uc1 uc1Var = (uc1) obj;
                    c cVar = uc1Var.e;
                    uc1Var.e = c.d;
                    cVar.a();
                    cVar.b();
                    yj1Var.e = 3;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) throws EOFException {
        int i = this.c;
        Object obj = this.l;
        switch (i) {
            case 0:
                if (this.d) {
                    dyVar.skip(j);
                } else {
                    try {
                        ((zh3) this.h).d(dyVar, j);
                    } catch (IOException e) {
                        this.d = true;
                        ((s) obj).invoke(e);
                        return;
                    }
                }
                break;
            default:
                if (!this.d) {
                    ka4.c(dyVar.d, 0L, j);
                    ((yj1) obj).d.d(dyVar, j);
                } else {
                    u41.r("closed");
                }
                break;
        }
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final void flush() {
        int i = this.c;
        Object obj = this.l;
        switch (i) {
            case 0:
                try {
                    ((zh3) this.h).flush();
                } catch (IOException e) {
                    this.d = true;
                    ((s) obj).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.d) {
                    ((yj1) obj).d.flush();
                    break;
                }
                break;
        }
    }
}
