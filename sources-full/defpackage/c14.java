package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class c14 implements Runnable {
    public final /* synthetic */ int c;
    public final m62 d;
    public final t00 h;

    public /* synthetic */ c14(m62 m62Var, t00 t00Var, int i) {
        this.c = i;
        this.d = m62Var;
        this.h = t00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        t00 t00Var = this.h;
        m62 m62Var = this.d;
        switch (i) {
            case 0:
                if (m62Var.isCancelled()) {
                    t00Var.g(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = m62Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            t00Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            t00Var.resumeWith(new i63(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (m62Var.isCancelled()) {
                    t00Var.g(null);
                    return;
                }
                try {
                    t00Var.resumeWith(u0.g(m62Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        t00Var.resumeWith(new i63(cause2));
                        return;
                    } else {
                        uw1 uw1Var = new uw1();
                        kr1.g0(uw1Var, kr1.class.getName());
                        throw uw1Var;
                    }
                }
        }
    }
}
