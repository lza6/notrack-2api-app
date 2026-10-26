package defpackage;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends py {
    public final Resources s;
    public final tu t;
    public final im1 u;

    public cn1(Resources resources, tu tuVar, im1 im1Var) {
        this.s = resources;
        this.t = tuVar;
        this.u = im1Var;
    }

    @Override // defpackage.py
    public final void I(em emVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ci4 ci4Var = new ci4(emVar, atomicBoolean, this.s, 21);
        mm1 mm1Var = new mm1(this.t.a);
        mm1Var.c = emVar.a;
        mm1 mm1VarA = pm1.a(mm1Var.a());
        mm1VarA.d = ci4Var;
        pm1 pm1VarA = mm1VarA.a();
        g33 g33Var = (g33) this.u;
        ro2 ro2Var = new ro2(py.o(g33Var.b, (xp0) g33Var.a.c.getValue(), new e33(g33Var, pm1VarA, null, 0)));
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        dn1.b.put(emVar, ro2Var);
    }

    @Override // defpackage.py
    public final void K(em emVar) {
    }

    @Override // defpackage.py
    public final void r(em emVar) {
        ro2 ro2Var = (ro2) dn1.b.remove(emVar);
        if (ro2Var != null) {
            yt0 yt0Var = ro2Var.a;
            if (yt0Var.a()) {
                yt0Var.c(null);
            }
        }
    }
}
