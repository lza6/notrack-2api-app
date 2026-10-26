package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz0 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ of2 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(ci3 ci3Var, long j, ei3 ei3Var, so0 so0Var) {
        super(2, so0Var);
        this.c = 2;
        this.h = ci3Var;
        this.m = j;
        this.l = ei3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz0(mz0 mz0Var, long j, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.l = mz0Var;
        this.m = j;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        of2 of2Var = this.l;
        switch (i) {
            case 0:
                lz0 lz0Var = new lz0((mz0) of2Var, this.m, so0Var, 0);
                lz0Var.h = obj;
                return lz0Var;
            case 1:
                lz0 lz0Var2 = new lz0((mz0) of2Var, this.m, so0Var, 1);
                lz0Var2.h = obj;
                return lz0Var2;
            default:
                return new lz0((ci3) this.h, this.m, (ei3) of2Var, so0Var);
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
        return ((lz0) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        long j = this.m;
        hq0 hq0Var = hq0.c;
        of2 of2Var = this.l;
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
                gq0 gq0Var = (gq0) this.h;
                oe1 oe1Var = ((mz0) of2Var).v;
                ln2 ln2Var = new ln2(j);
                this.d = 1;
                return oe1Var.invoke(gq0Var, ln2Var, this) == hq0Var ? hq0Var : w84Var;
            case 1:
                mz0 mz0Var = (mz0) of2Var;
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
                gq0 gq0Var2 = (gq0) this.h;
                oe1 oe1Var2 = mz0Var.w;
                long jF = dc4.f(mz0Var.x ? -1.0f : 1.0f, j);
                nq2 nq2Var = mz0Var.t;
                iz0 iz0Var = kz0.a;
                Float f = new Float(nq2Var == nq2.c ? dc4.c(jF) : dc4.b(jF));
                this.d = 1;
                return oe1Var2.invoke(gq0Var2, f, this) == hq0Var ? hq0Var : w84Var;
            default:
                ei3 ei3Var = (ei3) of2Var;
                ci3 ci3Var = (ci3) this.h;
                int i4 = this.d;
                if (i4 == 0) {
                    g13.O(obj);
                    ue ueVar = ci3Var.a;
                    qq1 qq1Var = new qq1(j);
                    t64 t64Var = ei3Var.c;
                    this.d = 1;
                    obj = ue.c(ueVar, qq1Var, t64Var, this, 12);
                    if (obj == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i4 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                sf sfVar = ((uf) obj).b;
                return w84Var;
        }
    }
}
