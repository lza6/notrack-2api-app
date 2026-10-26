package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc3 extends mq3 implements ne1 {
    public oc3 c;
    public p43 d;
    public long h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ oc3 n;
    public final /* synthetic */ p43 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc3(oc3 oc3Var, p43 p43Var, long j, so0 so0Var) {
        super(2, so0Var);
        this.n = oc3Var;
        this.o = p43Var;
        this.p = j;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        lc3 lc3Var = new lc3(this.n, this.o, this.p, so0Var);
        lc3Var.m = obj;
        return lc3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((lc3) create((mc3) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        oc3 oc3Var;
        p43 p43Var;
        oc3 oc3Var2;
        long j;
        int i = this.l;
        nq2 nq2Var = nq2.d;
        if (i == 0) {
            g13.O(obj);
            mc3 mc3Var = (mc3) this.m;
            oc3Var = this.n;
            c22 c22Var = new c22(oc3Var, 1, mc3Var);
            w71 w71Var = oc3Var.c;
            p43 p43Var2 = this.o;
            long j2 = p43Var2.c;
            nq2 nq2Var2 = oc3Var.d;
            long j3 = this.p;
            float fD = oc3Var.d(nq2Var2 == nq2Var ? dc4.b(j3) : dc4.c(j3));
            this.m = oc3Var;
            this.c = oc3Var;
            this.d = p43Var2;
            this.h = j2;
            this.l = 1;
            obj = w71Var.a(c22Var, fD, this);
            hq0 hq0Var = hq0.c;
            if (obj == hq0Var) {
                return hq0Var;
            }
            p43Var = p43Var2;
            oc3Var2 = oc3Var;
            j = j2;
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.h;
            p43Var = this.d;
            oc3Var = this.c;
            oc3Var2 = (oc3) this.m;
            g13.O(obj);
        }
        float fD2 = oc3Var2.d(((Number) obj).floatValue());
        p43Var.c = oc3Var.d == nq2Var ? dc4.a(fD2, 0.0f, 2, j) : dc4.a(0.0f, fD2, 1, j);
        return w84.a;
    }
}
