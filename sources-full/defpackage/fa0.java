package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa0(mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        mi2 mi2Var = this.d;
        switch (i) {
            case 0:
                return new fa0(mi2Var, so0Var, 0);
            default:
                return new fa0(mi2Var, so0Var, 1);
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
                ((fa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((fa0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                mi2Var.setValue(null);
                break;
            default:
                g13.O(obj);
                mi2Var.setValue(Boolean.TRUE);
                break;
        }
        return w84Var;
    }
}
