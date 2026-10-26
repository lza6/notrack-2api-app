package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ g22 h;
    public final /* synthetic */ mi2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga0(g22 g22Var, mi2 mi2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = g22Var;
        this.l = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new ga0(this.h, this.l, so0Var, 0);
            default:
                return new ga0(this.h, this.l, so0Var, 1);
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
        return ((ga0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.l;
        g22 g22Var = this.h;
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
                ah3 ah3Var = g22Var.f.a;
                nb nbVar = new nb(2, mi2Var);
                this.d = 1;
                ah3Var.getClass();
                ah3.p(ah3Var, nbVar, this);
                return hq0Var;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (wa0.v1(g22Var, true, new lg(18), this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                mi2Var.setValue(Boolean.TRUE);
                return w84Var;
        }
    }
}
