package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ff2 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ je1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff2(je1 je1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = je1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                ff2 ff2Var = new ff2(this.l, so0Var, 0);
                ff2Var.h = obj;
                return ff2Var;
            default:
                ff2 ff2Var2 = new ff2(this.l, so0Var, 1);
                ff2Var2.h = obj;
                return ff2Var2;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        ix2 ix2Var = (ix2) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ff2) create(ix2Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        je1 je1Var = this.l;
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
                ix2 ix2Var = (ix2) this.h;
                oy0 oy0Var = new oy0(je1Var, 2);
                this.d = 1;
                return os3.f(ix2Var, null, null, oy0Var, this, 7) == hq0Var ? hq0Var : w84Var;
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
                ix2 ix2Var2 = (ix2) this.h;
                oy0 oy0Var2 = new oy0(je1Var, 3);
                this.d = 1;
                return os3.f(ix2Var2, null, null, oy0Var2, this, 7) == hq0Var ? hq0Var : w84Var;
        }
    }
}
