package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class to0 implements c00, le1 {
    public final y23 c;
    public final t00 d;

    public to0(y23 y23Var, t00 t00Var) {
        this.c = y23Var;
        this.d = t00Var;
    }

    @Override // defpackage.c00
    public final void a(y23 y23Var, f63 f63Var) {
        this.d.resumeWith(f63Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        try {
            this.c.d();
        } catch (Throwable unused) {
        }
        return w84.a;
    }

    @Override // defpackage.c00
    public final void k(y23 y23Var, IOException iOException) {
        if (y23Var.u) {
            return;
        }
        this.d.resumeWith(new i63(iOException));
    }
}
