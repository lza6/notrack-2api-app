package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj1 extends of2 implements hx2 {
    public gh2 c;
    public xi1 d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v0(dj1 dj1Var, uo0 uo0Var) throws Throwable {
        aj1 aj1Var;
        xi1 xi1Var;
        if (uo0Var instanceof aj1) {
            aj1Var = (aj1) uo0Var;
            int i = aj1Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj1Var.m = i - Integer.MIN_VALUE;
            } else {
                aj1Var = new aj1(dj1Var, uo0Var);
            }
        } else {
            aj1Var = new aj1(dj1Var, uo0Var);
        }
        Object obj = aj1Var.h;
        int i2 = aj1Var.m;
        if (i2 == 0) {
            g13.O(obj);
            if (dj1Var.d == null) {
                xi1Var = new xi1();
                gh2 gh2Var = dj1Var.c;
                aj1Var.c = dj1Var;
                aj1Var.d = xi1Var;
                aj1Var.m = 1;
                Object objA = ((hh2) gh2Var).a(xi1Var, aj1Var);
                hq0 hq0Var = hq0.c;
                if (objA == hq0Var) {
                    return hq0Var;
                }
            }
            return w84.a;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xi1 xi1Var2 = aj1Var.d;
        dj1 dj1Var2 = aj1Var.c;
        g13.O(obj);
        xi1Var = xi1Var2;
        dj1Var = dj1Var2;
        dj1Var.d = xi1Var;
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w0(dj1 dj1Var, uo0 uo0Var) throws Throwable {
        bj1 bj1Var;
        if (uo0Var instanceof bj1) {
            bj1Var = (bj1) uo0Var;
            int i = bj1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bj1Var.l = i - Integer.MIN_VALUE;
            } else {
                bj1Var = new bj1(dj1Var, uo0Var);
            }
        } else {
            bj1Var = new bj1(dj1Var, uo0Var);
        }
        Object obj = bj1Var.d;
        int i2 = bj1Var.l;
        if (i2 == 0) {
            g13.O(obj);
            xi1 xi1Var = dj1Var.d;
            if (xi1Var != null) {
                yi1 yi1Var = new yi1(xi1Var);
                gh2 gh2Var = dj1Var.c;
                bj1Var.c = dj1Var;
                bj1Var.l = 1;
                Object objA = ((hh2) gh2Var).a(yi1Var, bj1Var);
                hq0 hq0Var = hq0.c;
                if (objA == hq0Var) {
                    return hq0Var;
                }
            }
            return w84.a;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dj1Var = bj1Var.c;
        g13.O(obj);
        dj1Var.d = null;
        return w84.a;
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        if (zw2Var == zw2.d) {
            int i = yw2Var.d;
            so0 so0Var = null;
            if (i == 4) {
                py.F(getCoroutineScope(), null, null, new cj1(this, so0Var, 0), 3);
            } else if (i == 5) {
                py.F(getCoroutineScope(), null, null, new cj1(this, so0Var, 1), 3);
            }
        }
    }

    @Override // defpackage.hx2
    public final void h0() {
        x0();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        x0();
    }

    public final void x0() {
        xi1 xi1Var = this.d;
        if (xi1Var != null) {
            ((hh2) this.c).b(new yi1(xi1Var));
            this.d = null;
        }
    }
}
