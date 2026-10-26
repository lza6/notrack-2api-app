package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v23 implements Runnable {
    public final c00 c;
    public volatile AtomicInteger d = new AtomicInteger(0);
    public final /* synthetic */ y23 h;

    public v23(y23 y23Var, c00 c00Var) {
        this.h = y23Var;
        this.c = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn2 tn2Var;
        String strConcat = "OkHttp ".concat(this.h.d.a.f());
        y23 y23Var = this.h;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            y23Var.l.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.c.a(y23Var, y23Var.h());
                        tn2Var = y23Var.c;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            vv2 vv2Var = vv2.a;
                            vv2 vv2Var2 = vv2.a;
                            String strConcat2 = "Callback failure for ".concat(y23.a(y23Var));
                            vv2Var2.getClass();
                            vv2.i(strConcat2, 4, e);
                        } else {
                            this.c.k(y23Var, e);
                        }
                        tn2Var = y23Var.c;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        y23Var.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            gb2.l(iOException, th);
                            this.c.k(y23Var, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    y23Var.c.c.P(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            tn2Var.c.P(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
