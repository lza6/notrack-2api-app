package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = rVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        r rVar = this.d;
        switch (i) {
            case 0:
                return new p(rVar, so0Var, 0);
            default:
                return new p(rVar, so0Var, 1);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((p) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((p) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        r rVar = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                if (rVar.u == null) {
                    xi1 xi1Var = new xi1();
                    gh2 gh2Var = rVar.h;
                    if (gh2Var != null) {
                        py.F(rVar.getCoroutineScope(), null, null, new k(gh2Var, xi1Var, null, 0), 3);
                    }
                    rVar.u = xi1Var;
                }
                break;
            default:
                g13.O(obj);
                xi1 xi1Var2 = rVar.u;
                if (xi1Var2 != null) {
                    yi1 yi1Var = new yi1(xi1Var2);
                    gh2 gh2Var2 = rVar.h;
                    if (gh2Var2 != null) {
                        py.F(rVar.getCoroutineScope(), null, null, new k(gh2Var2, yi1Var, null, 1), 3);
                    }
                    rVar.u = null;
                }
                break;
        }
        return w84Var;
    }
}
