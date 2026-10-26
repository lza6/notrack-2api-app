package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g01 extends mq3 implements pe1 {
    public int c;
    public /* synthetic */ y8 d;
    public /* synthetic */ r92 h;
    public /* synthetic */ i01 l;
    public final /* synthetic */ h01 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ wf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(h01 h01Var, float f, wf wfVar, so0 so0Var) {
        super(4, so0Var);
        this.m = h01Var;
        this.n = f;
        this.o = wfVar;
    }

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.n;
        wf wfVar = this.o;
        g01 g01Var = new g01(this.m, f, wfVar, (so0) obj4);
        g01Var.d = (y8) obj;
        g01Var.h = (r92) obj2;
        g01Var.l = (i01) obj3;
        return g01Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        ji4 ji4Var = this.m.a;
        int i = this.c;
        int i2 = 1;
        if (i == 0) {
            g13.O(obj);
            y8 y8Var = this.d;
            float fD = this.h.d(this.l);
            if (!Float.isNaN(fD)) {
                n43 n43Var = new n43();
                float f = Float.isNaN(((bt2) ji4Var.j).f()) ? 0.0f : ((bt2) ji4Var.j).f();
                n43Var.c = f;
                n8 n8Var = new n8(y8Var, n43Var, i2);
                this.d = null;
                this.h = null;
                this.c = 1;
                Object objM = vl0.m(f, fD, this.n, this.o, n8Var, this);
                hq0 hq0Var = hq0.c;
                if (objM == hq0Var) {
                    return hq0Var;
                }
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }
}
