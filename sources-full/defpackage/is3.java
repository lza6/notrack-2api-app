package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class is3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ oe1 h;
    public final /* synthetic */ py2 l;
    public final /* synthetic */ dx2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is3(oe1 oe1Var, py2 py2Var, dx2 dx2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = oe1Var;
        this.l = py2Var;
        this.m = dx2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new is3(this.h, this.l, this.m, so0Var, 0);
            case 1:
                return new is3(this.h, this.l, this.m, so0Var, 1);
            default:
                return new is3(this.h, this.l, this.m, so0Var, 2);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((is3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        dx2 dx2Var = this.m;
        py2 py2Var = this.l;
        oe1 oe1Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    ln2 ln2Var = new ln2(dx2Var.c);
                    this.d = 1;
                    return oe1Var.invoke(py2Var, ln2Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    ln2 ln2Var2 = new ln2(dx2Var.c);
                    this.d = 1;
                    return oe1Var.invoke(py2Var, ln2Var2, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    ln2 ln2Var3 = new ln2(dx2Var.c);
                    this.d = 1;
                    return oe1Var.invoke(py2Var, ln2Var3, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i4 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
