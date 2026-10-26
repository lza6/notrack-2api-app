package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e33 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ g33 h;
    public final /* synthetic */ pm1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e33(g33 g33Var, pm1 pm1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = g33Var;
        this.l = pm1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        pm1 pm1Var = this.l;
        g33 g33Var = this.h;
        switch (i) {
            case 0:
                return new e33(g33Var, pm1Var, so0Var, 0);
            default:
                return new e33(g33Var, pm1Var, so0Var, 1);
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
        return ((e33) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        pm1 pm1Var = this.l;
        g33 g33Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                int i3 = g33.f;
                Object objA = g33Var.a(pm1Var, 0, this);
                return objA == hq0Var ? hq0Var : objA;
            default:
                int i4 = this.d;
                if (i4 != 0) {
                    if (i4 == 1) {
                        g13.O(obj);
                        return obj;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                this.d = 1;
                int i5 = g33.f;
                Object objA2 = g33Var.a(pm1Var, 1, this);
                return objA2 == hq0Var ? hq0Var : objA2;
        }
    }
}
