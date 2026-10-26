package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ja0 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ g22 d;
    public int h;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(int i, so0 so0Var, g22 g22Var) {
        super(2, so0Var);
        this.d = g22Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(g22 g22Var, int i, int i2, so0 so0Var) {
        super(2, so0Var);
        this.d = g22Var;
        this.h = i;
        this.l = i2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        int i2 = this.l;
        g22 g22Var = this.d;
        switch (i) {
            case 0:
                return new ja0(i2, so0Var, g22Var);
            default:
                return new ja0(g22Var, this.h, i2, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((ja0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                ((ja0) create((pb3) obj, (so0) obj2)).invokeSuspend(w84Var);
                return w84Var;
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        g22 g22Var = this.d;
        switch (i) {
            case 0:
                int i3 = this.h;
                if (i3 != 0) {
                    if (i3 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.h = 1;
                fp1 fp1Var = g22.w;
                g22Var.getClass();
                Object objD = g22Var.d(ri2.c, new gb0(i2, null, g22Var), this);
                hq0 hq0Var = hq0.c;
                if (objD != hq0Var) {
                    objD = w84Var;
                }
                return objD == hq0Var ? hq0Var : w84Var;
            default:
                g13.O(obj);
                g22Var.j(this.h, i2, true);
                return w84Var;
        }
    }
}
