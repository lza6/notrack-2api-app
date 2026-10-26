package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends mq3 implements pe1 {
    public int c;
    public /* synthetic */ y8 d;
    public /* synthetic */ r92 h;
    public /* synthetic */ Object l;
    public final /* synthetic */ ji4 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(ji4 ji4Var, float f, so0 so0Var) {
        super(4, so0Var);
        this.m = ji4Var;
        this.n = f;
    }

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        o8 o8Var = new o8(this.m, this.n, (so0) obj4);
        o8Var.d = (y8) obj;
        o8Var.h = (r92) obj2;
        o8Var.l = obj3;
        return o8Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            g13.O(obj);
            y8 y8Var = this.d;
            float fD = this.h.d(this.l);
            if (!Float.isNaN(fD)) {
                n43 n43Var = new n43();
                ji4 ji4Var = this.m;
                float f = Float.isNaN(((bt2) ji4Var.j).f()) ? 0.0f : ((bt2) ji4Var.j).f();
                n43Var.c = f;
                wf wfVar = (wf) ji4Var.c;
                n8 n8Var = new n8(y8Var, n43Var, 0);
                this.d = null;
                this.h = null;
                this.c = 1;
                Object objM = vl0.m(f, fD, this.n, wfVar, n8Var, this);
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
