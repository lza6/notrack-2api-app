package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ni4 implements Runnable {
    public final oi4 c;
    public final vh4 d;

    public ni4(oi4 oi4Var, vh4 vh4Var) {
        this.c = oi4Var;
        this.d = vh4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.d) {
            try {
                if (((ni4) this.c.b.remove(this.d)) != null) {
                    gu0 gu0Var = (gu0) this.c.c.remove(this.d);
                    if (gu0Var != null) {
                        vh4 vh4Var = this.d;
                        v72.f().c(gu0.w, "Exceeded time limits on execution for " + vh4Var);
                        gu0Var.p.execute(new fu0(gu0Var, 0));
                    }
                } else {
                    v72.f().c("WrkTimerRunnable", "Timer with " + this.d + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
