package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bj4 {
    public static final String a = v72.h("WorkerWrapper");

    public static final Object a(m62 m62Var, s62 s62Var, mq3 mq3Var) {
        Object obj;
        try {
            int i = 0;
            if (!m62Var.isDone()) {
                t00 t00Var = new t00(1, gm4.G(mq3Var));
                t00Var.u();
                m62Var.a(new c14(m62Var, t00Var, i), cw0.c);
                t00Var.w(new sg2(s62Var, 27, m62Var));
                return t00Var.s();
            }
            while (true) {
                try {
                    obj = m62Var.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
