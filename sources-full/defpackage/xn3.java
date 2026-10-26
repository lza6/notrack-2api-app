package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xn3 implements Runnable {
    public final tz2 c;
    public final dn3 d;
    public final boolean h;
    public final int l;

    public xn3(tz2 tz2Var, dn3 dn3Var, boolean z, int i) {
        tz2Var.getClass();
        dn3Var.getClass();
        this.c = tz2Var;
        this.d = dn3Var;
        this.h = z;
        this.l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        aj4 aj4VarB;
        boolean z = this.h;
        tz2 tz2Var = this.c;
        dn3 dn3Var = this.d;
        if (z) {
            int i = this.l;
            tz2Var.getClass();
            String str = dn3Var.a.a;
            synchronized (tz2Var.k) {
                aj4VarB = tz2Var.b(str);
            }
            zD = tz2.d(str, aj4VarB, i);
        } else {
            int i2 = this.l;
            tz2Var.getClass();
            String str2 = dn3Var.a.a;
            synchronized (tz2Var.k) {
                try {
                    if (tz2Var.f.get(str2) != null) {
                        v72.f().c(tz2.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) tz2Var.h.get(str2);
                        if (set != null && set.contains(dn3Var)) {
                            zD = tz2.d(str2, tz2Var.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v72.f().c(v72.h("StopWorkRunnable"), "StopWorkRunnable for " + this.d.a.a + "; Processor.stopWork = " + zD);
    }
}
