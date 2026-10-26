package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class op0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ ix2 h;
    public final /* synthetic */ xt3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op0(ix2 ix2Var, xt3 xt3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = ix2Var;
        this.l = xt3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new op0(this.h, this.l, so0Var, 0);
            case 1:
                return new op0(this.h, this.l, so0Var, 1);
            default:
                return new op0(this.h, this.l, so0Var, 2);
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
        return ((op0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        ix2 ix2Var = this.h;
        xt3 xt3Var = this.l;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        so0 so0Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (xp1.k(ix2Var, xt3Var, this) == hq0Var) {
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
                    Object objL = p23.l(ix2Var, new nc1(xt3Var, so0Var, i2), this);
                    if (objL != hq0Var) {
                        objL = w84Var;
                    }
                    if (objL == hq0Var) {
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
            default:
                int i5 = this.d;
                if (i5 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    Object objF = uy0.f(this.h, new f82(xt3Var, 0), new g82(xt3Var, 0), new g82(xt3Var, 1), new ea(6, xt3Var), this);
                    if (objF != hq0Var) {
                        objF = w84Var;
                    }
                    if (objF == hq0Var) {
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
        }
    }
}
