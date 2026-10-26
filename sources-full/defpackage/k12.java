package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k12 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public /* synthetic */ int h;
    public final /* synthetic */ of2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k12(du3 du3Var, so0 so0Var) {
        super(2, so0Var);
        this.l = du3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k12(l12 l12Var, int i, so0 so0Var) {
        super(2, so0Var);
        this.l = l12Var;
        this.h = i;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        of2 of2Var = this.l;
        switch (i) {
            case 0:
                return new k12((l12) of2Var, this.h, so0Var);
            default:
                k12 k12Var = new k12((du3) of2Var, so0Var);
                k12Var.h = ((Number) obj).intValue();
                return k12Var;
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return ((k12) create((gq0) obj, (so0) obj2)).invokeSuspend(w84Var);
            default:
                return ((k12) create(Integer.valueOf(((Number) obj).intValue()), (so0) obj2)).invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        dr0 dr0Var;
        int i = this.c;
        of2 of2Var = this.l;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        so0 so0Var = null;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    g12 g12Var = ((l12) of2Var).d;
                    int i3 = this.h;
                    this.d = 1;
                    if (g12Var.d(i3, this) == hq0Var) {
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
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    if (Math.abs(this.h) == 1 && (dr0Var = ((du3) of2Var).t) != null) {
                        this.d = 1;
                        Object objQ = yo4.q(new h2(dr0Var, so0Var, 4), this);
                        if (objQ != hq0Var) {
                            objQ = w84Var;
                        }
                        if (objQ == hq0Var) {
                            return hq0Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                return w84Var;
        }
    }
}
