package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ uq1 h;
    public final /* synthetic */ ml3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy(uq1 uq1Var, ml3 ml3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = uq1Var;
        this.l = ml3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new wy(this.h, this.l, so0Var, 0);
            case 1:
                return new wy(this.h, this.l, so0Var, 1);
            default:
                return new wy(this.h, this.l, so0Var, 2);
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
        return ((wy) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        ml3 ml3Var = this.l;
        uq1 uq1Var = this.h;
        w84 w84Var = w84.a;
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
                ah3 ah3Var = ((hh2) uq1Var).a;
                vy vyVar = new vy(ml3Var, 0);
                this.d = 1;
                ah3Var.getClass();
                ah3.p(ah3Var, vyVar, this);
                return hq0Var;
            case 1:
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
                ah3 ah3Var2 = ((hh2) uq1Var).a;
                vy vyVar2 = new vy(ml3Var, 1);
                this.d = 1;
                ah3Var2.getClass();
                ah3.p(ah3Var2, vyVar2, this);
                return hq0Var;
            default:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                ah3 ah3Var3 = ((hh2) uq1Var).a;
                vy vyVar3 = new vy(ml3Var, 2);
                this.d = 1;
                ah3Var3.getClass();
                ah3.p(ah3Var3, vyVar3, this);
                return hq0Var;
        }
    }
}
