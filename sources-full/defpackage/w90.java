package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w90 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public final /* synthetic */ g22 h;
    public final /* synthetic */ gn3 l;
    public final /* synthetic */ mi2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(g22 g22Var, gn3 gn3Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.h = g22Var;
        this.l = gn3Var;
        this.m = mi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(g22 g22Var, mi2 mi2Var, gn3 gn3Var, so0 so0Var) {
        super(2, so0Var);
        this.h = g22Var;
        this.m = mi2Var;
        this.l = gn3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(gn3 gn3Var, g22 g22Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.l = gn3Var;
        this.h = g22Var;
        this.m = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        mi2 mi2Var = this.m;
        g22 g22Var = this.h;
        gn3 gn3Var = this.l;
        switch (i) {
            case 0:
                return new w90(g22Var, mi2Var, gn3Var, so0Var);
            case 1:
                return new w90(g22Var, gn3Var, mi2Var, so0Var);
            default:
                return new w90(gn3Var, g22Var, mi2Var, so0Var);
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
        return ((w90) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        aq aqVar;
        int i = this.c;
        mi2 mi2Var = this.m;
        g22 g22Var = this.h;
        w84 w84Var = w84.a;
        gn3 gn3Var = this.l;
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
                if (!((Boolean) mi2Var.getValue()).booleanValue() || ((xa0) gn3Var.getValue()).a.isEmpty()) {
                    return w84Var;
                }
                boolean z = !((xa0) gn3Var.getValue()).b;
                n80 n80Var = new n80(7, mi2Var);
                this.d = 1;
                return wa0.v1(g22Var, z, n80Var, this) == hq0Var ? hq0Var : w84Var;
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
                pm0 pm0VarE = cl3.e(new q80(g22Var, 2));
                ha0 ha0Var = new ha0(gn3Var, 0, mi2Var);
                this.d = 1;
                return pm0VarE.a(ha0Var, this) == hq0Var ? hq0Var : w84Var;
            default:
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    if (!((xa0) gn3Var.getValue()).b) {
                        return w84Var;
                    }
                } else {
                    if (i4 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                do {
                    aqVar = new aq(g22Var, 8, mi2Var);
                    this.d = 1;
                } while (yo4.z(getContext()).withFrameNanos(aqVar, this) != hq0Var);
                return hq0Var;
        }
    }
}
