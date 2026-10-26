package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj1 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ dj1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj1(dj1 dj1Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.h = dj1Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        dj1 dj1Var = this.h;
        switch (i) {
            case 0:
                return new cj1(dj1Var, so0Var, 0);
            default:
                return new cj1(dj1Var, so0Var, 1);
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
        return ((cj1) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        dj1 dj1Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return dj1.v0(dj1Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i2 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return dj1.w0(dj1Var, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
