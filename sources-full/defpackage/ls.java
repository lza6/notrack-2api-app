package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ls extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ wx3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls(wx3 wx3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = wx3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        wx3 wx3Var = this.h;
        switch (i) {
            case 0:
                return new ls(wx3Var, so0Var, 0);
            case 1:
                return new ls(wx3Var, so0Var, 1);
            case 2:
                return new ls(wx3Var, so0Var, 2);
            case 3:
                return new ls(wx3Var, so0Var, 3);
            case 4:
                return new ls(wx3Var, so0Var, 4);
            default:
                return new ls(wx3Var, so0Var, 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((ls) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        wx3 wx3Var = this.h;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (wx3Var.f(true, this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            case 1:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (wx3Var.t(this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i4 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            case 2:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (wx3Var.g(this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i5 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            case 3:
                int i6 = this.d;
                if (i6 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (wx3Var.y(this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i6 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            case 4:
                int i7 = this.d;
                if (i7 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    pm0 pm0VarE = cl3.e(new ts(wx3Var, 3));
                    px3 px3Var = px3.c;
                    y64.l(2, px3Var);
                    Object objA = new bx0(pm0VarE, px3Var).a(new ha0(new o43(), 2, new qx3(wx3Var, 0)), this);
                    if (objA != hq0Var) {
                        objA = w84Var;
                    }
                    if (objA != hq0Var) {
                        objA = w84Var;
                    }
                    if (objA == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i7 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            default:
                int i8 = this.d;
                if (i8 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    Object objA2 = cl3.e(new ts(wx3Var, 4)).a(new qx3(wx3Var, i2), this);
                    if (objA2 != hq0Var) {
                        objA2 = w84Var;
                    }
                    if (objA2 == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i8 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
        }
    }
}
