package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ r h;
    public final /* synthetic */ ry2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, ry2 ry2Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = rVar;
        this.l = ry2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        ry2 ry2Var = this.l;
        r rVar = this.h;
        switch (i) {
            case 0:
                return new o(rVar, ry2Var, so0Var, 0);
            case 1:
                return new o(rVar, ry2Var, so0Var, 1);
            default:
                return new o(rVar, ry2Var, so0Var, 2);
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
        return ((o) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        ry2 ry2Var = this.l;
        r rVar = this.h;
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
                gh2 gh2Var = rVar.h;
                if (gh2Var == null) {
                    return w84Var;
                }
                qy2 qy2Var = new qy2(ry2Var);
                this.d = 1;
                return ((hh2) gh2Var).a(qy2Var, this) == hq0Var ? hq0Var : w84Var;
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
                gh2 gh2Var2 = rVar.h;
                if (gh2Var2 == null) {
                    return w84Var;
                }
                this.d = 1;
                return ((hh2) gh2Var2).a(ry2Var, this) == hq0Var ? hq0Var : w84Var;
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
                gh2 gh2Var3 = rVar.h;
                if (gh2Var3 == null) {
                    return w84Var;
                }
                sy2 sy2Var = new sy2(ry2Var);
                this.d = 1;
                return ((hh2) gh2Var3).a(sy2Var, this) == hq0Var ? hq0Var : w84Var;
        }
    }
}
