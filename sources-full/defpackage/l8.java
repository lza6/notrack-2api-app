package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public final /* synthetic */ float h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(Object obj, float f, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = obj;
        this.h = f;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        switch (this.c) {
            case 0:
                return new l8((ji4) this.l, this.h, so0Var, 0);
            default:
                return new l8((hh3) this.l, this.h, so0Var, 1);
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
        return ((l8) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        float f = this.h;
        Object obj2 = this.l;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    if (((ji4) obj2).x(f, this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i2 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    Object objX = ((hh3) obj2).c.x(f, this);
                    if (objX != hq0Var) {
                        objX = w84Var;
                    }
                    if (objX == hq0Var) {
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
        }
    }
}
