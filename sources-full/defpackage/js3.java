package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class js3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ py2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js3(py2 py2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = py2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        py2 py2Var = this.d;
        switch (i) {
            case 0:
                return new js3(py2Var, so0Var, 0);
            case 1:
                return new js3(py2Var, so0Var, 1);
            case 2:
                return new js3(py2Var, so0Var, 2);
            case 3:
                return new js3(py2Var, so0Var, 3);
            case 4:
                return new js3(py2Var, so0Var, 4);
            case 5:
                return new js3(py2Var, so0Var, 5);
            case 6:
                return new js3(py2Var, so0Var, 6);
            default:
                return new js3(py2Var, so0Var, 7);
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
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 1:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 2:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 3:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 4:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 5:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            case 6:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((js3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        py2 py2Var = this.d;
        switch (i) {
            case 0:
                g13.O(obj);
                py2Var.h = true;
                zi2 zi2Var = py2Var.l;
                if (zi2Var.e()) {
                    zi2Var.i(null);
                }
                break;
            case 1:
                g13.O(obj);
                py2Var.a();
                break;
            case 2:
                g13.O(obj);
                py2Var.a();
                break;
            case 3:
                g13.O(obj);
                py2Var.h = true;
                zi2 zi2Var2 = py2Var.l;
                if (zi2Var2.e()) {
                    zi2Var2.i(null);
                }
                break;
            case 4:
                g13.O(obj);
                py2Var.a();
                break;
            case 5:
                g13.O(obj);
                py2Var.a();
                break;
            case 6:
                g13.O(obj);
                py2Var.h = true;
                zi2 zi2Var3 = py2Var.l;
                if (zi2Var3.e()) {
                    zi2Var3.i(null);
                }
                break;
            default:
                g13.O(obj);
                py2Var.a();
                break;
        }
        return w84Var;
    }
}
