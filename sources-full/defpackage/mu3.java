package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu3 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ wx3 h;
    public final /* synthetic */ ix2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(ix2 ix2Var, wx3 wx3Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 3;
        this.l = ix2Var;
        this.h = wx3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu3(wx3 wx3Var, ix2 ix2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = wx3Var;
        this.l = ix2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        ix2 ix2Var = this.l;
        wx3 wx3Var = this.h;
        switch (i) {
            case 0:
                return new mu3(wx3Var, ix2Var, so0Var, 0);
            case 1:
                return new mu3(wx3Var, ix2Var, so0Var, 1);
            case 2:
                return new mu3(wx3Var, ix2Var, so0Var, 2);
            case 3:
                return new mu3(ix2Var, wx3Var, so0Var);
            default:
                return new mu3(wx3Var, ix2Var, so0Var, 4);
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
        }
        return ((mu3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        ix2 ix2Var = this.l;
        w84 w84Var = w84.a;
        wx3 wx3Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return wx3Var.j(ix2Var, this) == hq0Var ? hq0Var : w84Var;
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
                    this.d = 1;
                    return wx3Var.j(ix2Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return wx3.a(wx3Var, ix2Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i4 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    gs gsVar = new gs(wx3Var, 1);
                    this.d = 1;
                    return os3.f(this.l, null, null, gsVar, this, 7) == hq0Var ? hq0Var : w84Var;
                }
                if (i5 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i6 = this.d;
                if (i6 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return wx3Var.j(ix2Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i6 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
