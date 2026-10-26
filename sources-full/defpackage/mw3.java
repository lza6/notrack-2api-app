package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mw3 extends mq3 implements oe1 {
    public int c;
    public /* synthetic */ py2 d;
    public /* synthetic */ long h;
    public final /* synthetic */ gq0 l;
    public final /* synthetic */ mi2 m;
    public final /* synthetic */ gh2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw3(gq0 gq0Var, mi2 mi2Var, gh2 gh2Var, so0 so0Var) {
        super(3, so0Var);
        this.l = gq0Var;
        this.m = mi2Var;
        this.n = gh2Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((ln2) obj2).a;
        mi2 mi2Var = this.m;
        gh2 gh2Var = this.n;
        mw3 mw3Var = new mw3(this.l, mi2Var, gh2Var, (so0) obj3);
        mw3Var.d = (py2) obj;
        mw3Var.h = j;
        return mw3Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        gq0 gq0Var = this.l;
        if (i == 0) {
            g13.O(obj);
            py2 py2Var = this.d;
            py.F(gq0Var, null, null, new m(this.m, this.h, this.n, null, 2), 3);
            this.c = 1;
            obj = py2Var.d(this);
            hq0 hq0Var = hq0.c;
            if (obj == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        py.F(gq0Var, null, null, new u30(this.m, ((Boolean) obj).booleanValue(), this.n, null), 3);
        return w84.a;
    }
}
