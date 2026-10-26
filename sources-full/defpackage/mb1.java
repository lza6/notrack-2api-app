package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb1 implements kb1 {
    public final bg1 a;
    public final gb b;
    public final fy2 c;
    public final pb1 d;
    public final sz0 e;

    public mb1(bg1 bg1Var, gb gbVar) {
        fy2 fy2Var = nb1.a;
        pb1 pb1Var = new pb1();
        yo4.a(pb1.a.plus(rw0.a).plus(x21.c).plus(new rp3(null)));
        sz0 sz0Var = new sz0(21);
        this.a = bg1Var;
        this.b = gbVar;
        this.c = fy2Var;
        this.d = pb1Var;
        this.e = sz0Var;
        new e8(16, this);
    }

    public final k74 a(j74 j74Var) {
        fy2 fy2Var = this.c;
        rc rcVar = new rc(this, 19, j74Var);
        synchronized (((sb3) fy2Var.c)) {
            k74 k74Var = (k74) ((t82) fy2Var.d).a(j74Var);
            if (k74Var != null) {
                if (k74Var.d) {
                    return k74Var;
                }
            }
            try {
                k74 k74Var2 = (k74) rcVar.invoke(new sg2(fy2Var, 24, j74Var));
                synchronized (((sb3) fy2Var.c)) {
                    if (((t82) fy2Var.d).a(j74Var) == null && k74Var2.d) {
                        ((t82) fy2Var.d).b(j74Var, k74Var2);
                    }
                }
                return k74Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final k74 b(lb1 lb1Var, ic1 ic1Var, int i, int i2) {
        gb gbVar = this.b;
        gbVar.getClass();
        int i3 = gbVar.c;
        ic1 ic1Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? ic1Var : new ic1(py.x(ic1Var.c + i3, 1, 1000));
        this.a.getClass();
        return a(new j74(lb1Var, ic1Var2, i, i2, null));
    }
}
