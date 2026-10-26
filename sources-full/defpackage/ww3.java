package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xw3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww3(xw3 xw3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = xw3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        xw3 xw3Var = this.d;
        switch (i) {
            case 0:
                return new ww3(xw3Var, so0Var, 0);
            case 1:
                return new ww3(xw3Var, so0Var, 1);
            default:
                return new ww3(xw3Var, so0Var, 2);
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
                ((ww3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 1:
                ((ww3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((ww3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        xw3 xw3Var = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                xw3Var.b(true);
                break;
            case 1:
                g13.O(obj);
                xw3Var.d();
                break;
            default:
                g13.O(obj);
                xw3Var.m();
                break;
        }
        return w84Var;
    }
}
