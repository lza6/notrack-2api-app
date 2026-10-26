package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yq implements lo2 {
    public boolean c;
    public t00 d;

    @Override // defpackage.lo2
    public final void a(wl2 wl2Var) {
        if (this.c) {
            return;
        }
        this.c = true;
        t00 t00Var = this.d;
        if (t00Var != null) {
            t00Var.resumeWith(w84.a);
        }
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(uo0 uo0Var) throws Throwable {
        xq xqVar;
        t00 t00Var;
        if (uo0Var instanceof xq) {
            xqVar = (xq) uo0Var;
            int i = xqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqVar.l = i - Integer.MIN_VALUE;
            } else {
                xqVar = new xq(this, uo0Var);
            }
        } else {
            xqVar = new xq(this, uo0Var);
        }
        Object obj = xqVar.d;
        int i2 = xqVar.l;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(obj);
            if (!this.c) {
                t00 t00Var2 = this.d;
                xqVar.c = t00Var2;
                xqVar.l = 1;
                t00 t00Var3 = new t00(1, gm4.G(xqVar));
                t00Var3.u();
                this.d = t00Var3;
                Object objS = t00Var3.s();
                hq0 hq0Var = hq0.c;
                if (objS == hq0Var) {
                    return hq0Var;
                }
                t00Var = t00Var2;
            }
            return w84Var;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t00Var = xqVar.c;
        g13.O(obj);
        if (t00Var != null) {
            t00Var.resumeWith(w84Var);
        }
        return w84Var;
    }
}
