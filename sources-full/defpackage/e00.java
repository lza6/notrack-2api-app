package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e00 extends y20 {
    public final ne1 l;
    public final ne1 m;

    public e00(ne1 ne1Var, xp0 xp0Var, int i, fy fyVar) {
        super(xp0Var, i, fyVar);
        this.l = ne1Var;
        this.m = ne1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.y20
    public final Object e(wz2 wz2Var, so0 so0Var) throws Throwable {
        d00 d00Var;
        if (so0Var instanceof d00) {
            d00Var = (d00) so0Var;
            int i = d00Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                d00Var.l = i - Integer.MIN_VALUE;
            } else {
                d00Var = new d00(this, (uo0) so0Var);
            }
        } else {
            d00Var = new d00(this, (uo0) so0Var);
        }
        Object obj = d00Var.d;
        int i2 = d00Var.l;
        w84 w84Var = w84.a;
        if (i2 == 0) {
            g13.O(obj);
            d00Var.c = wz2Var;
            d00Var.l = 1;
            Object objInvoke = this.l.invoke(wz2Var, d00Var);
            hq0 hq0Var = hq0.c;
            if (objInvoke != hq0Var) {
                objInvoke = w84Var;
            }
            if (objInvoke == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2Var = d00Var.c;
            g13.O(obj);
        }
        if (wz2Var.n.C()) {
            return w84Var;
        }
        u41.r("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.y20
    public final y20 g(xp0 xp0Var, int i, fy fyVar) {
        return new e00(this.m, xp0Var, i, fyVar);
    }

    @Override // defpackage.y20
    public final String toString() {
        return "block[" + this.l + "] -> " + super.toString();
    }
}
