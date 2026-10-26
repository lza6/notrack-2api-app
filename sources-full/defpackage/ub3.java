package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ub3 implements pr2 {
    public static final ub3 a = new ub3();

    @Override // defpackage.pr2
    public final long a(long j, int i, pj2 pj2Var) {
        pj2Var.getClass();
        oc3 oc3Var = (oc3) pj2Var.d;
        return new ln2(oc3.a(oc3Var, oc3Var.j, j, oc3Var.i)).a;
    }

    @Override // defpackage.pr2
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pr2
    public final Object c(long j, nc3 nc3Var, so0 so0Var) {
        nc3 nc3Var2 = new nc3(nc3Var.l, so0Var);
        nc3Var2.h = j;
        w84 w84Var = w84.a;
        Object objInvokeSuspend = nc3Var2.invokeSuspend(w84Var);
        return objInvokeSuspend == hq0.c ? objInvokeSuspend : w84Var;
    }

    @Override // defpackage.pr2
    public final iu0 getNode() {
        return new ql2(1);
    }
}
