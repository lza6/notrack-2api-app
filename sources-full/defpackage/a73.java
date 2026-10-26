package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a73 {
    public ln2 a;
    public final float b;
    public final boolean c;
    public Float d;
    public ln2 e;
    public final ue f = kr1.a(0.0f);
    public final ue g = kr1.a(0.0f);
    public final ue h = kr1.a(0.0f);
    public final ag0 i;
    public final ft2 j;
    public final ft2 k;

    public a73(ln2 ln2Var, float f, boolean z) {
        this.a = ln2Var;
        this.b = f;
        this.c = z;
        ag0 ag0Var = new ag0(true);
        ag0Var.H(null);
        this.i = ag0Var;
        Boolean bool = Boolean.FALSE;
        this.j = cl3.d(bool);
        this.k = cl3.d(bool);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(uo0 uo0Var) throws Throwable {
        x63 x63Var;
        Object objQ;
        if (uo0Var instanceof x63) {
            x63Var = (x63) uo0Var;
            int i = x63Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x63Var.l = i - Integer.MIN_VALUE;
            } else {
                x63Var = new x63(this, uo0Var);
            }
        } else {
            x63Var = new x63(this, uo0Var);
        }
        Object obj = x63Var.d;
        int i2 = x63Var.l;
        int i3 = 1;
        w84 w84Var = w84.a;
        so0 so0Var = null;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj);
            x63Var.c = this;
            x63Var.l = 1;
            Object objQ2 = yo4.q(new z63(this, so0Var, 0), x63Var);
            if (objQ2 != hq0Var) {
                objQ2 = w84Var;
            }
            if (objQ2 != hq0Var) {
            }
            return hq0Var;
        }
        if (i2 == 1) {
            this = x63Var.c;
            g13.O(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = x63Var.c;
            g13.O(obj);
        }
        x63Var.c = null;
        x63Var.l = 3;
        this.getClass();
        objQ = yo4.q(new z63(this, so0Var, i3), x63Var);
        if (objQ != hq0Var) {
            objQ = w84Var;
        }
        if (objQ != hq0Var) {
            return hq0Var;
        }
        return w84Var;
        this.j.setValue(Boolean.TRUE);
        ag0 ag0Var = this.i;
        x63Var.c = this;
        x63Var.l = 2;
        if (ag0Var.n(x63Var) != hq0Var) {
            x63Var.c = null;
            x63Var.l = 3;
            this.getClass();
            objQ = yo4.q(new z63(this, so0Var, i3), x63Var);
            if (objQ != hq0Var) {
                objQ = w84Var;
            }
            if (objQ != hq0Var) {
                return w84Var;
            }
        }
        return hq0Var;
    }
}
