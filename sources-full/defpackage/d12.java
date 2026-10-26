package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d12 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ sz0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d12(sz0 sz0Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = sz0Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        sz0 sz0Var = this.h;
        switch (i) {
            case 0:
                return new d12(sz0Var, so0Var, 0);
            default:
                return new d12(sz0Var, so0Var, 1);
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
        }
        return ((d12) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        sz0 sz0Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                xf xfVar = (xf) sz0Var.c;
                Float f = new Float(0.0f);
                tm3 tm3VarL0 = kr1.l0(1, new Float(0.5f));
                this.d = 1;
                return vl0.r(xfVar, f, tm3VarL0, true, null, this, 8) == hq0Var ? hq0Var : w84Var;
            default:
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                xf xfVar2 = (xf) sz0Var.c;
                Float f2 = new Float(0.0f);
                tm3 tm3VarL1 = kr1.l0(1, new Float(0.5f));
                this.d = 1;
                return vl0.r(xfVar2, f2, tm3VarL1, true, null, this, 8) == hq0Var ? hq0Var : w84Var;
        }
    }
}
