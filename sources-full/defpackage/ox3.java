package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ox3 extends mq3 implements oe1 {
    public int c;
    public /* synthetic */ py2 d;
    public /* synthetic */ long h;
    public final /* synthetic */ gh2 l;
    public final /* synthetic */ wx3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox3(gh2 gh2Var, wx3 wx3Var, so0 so0Var) {
        super(3, so0Var);
        this.l = gh2Var;
        this.m = wx3Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((ln2) obj2).a;
        ox3 ox3Var = new ox3(this.l, this.m, (so0) obj3);
        ox3Var.d = (py2) obj;
        ox3Var.h = j;
        return ox3Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            g13.O(obj);
            py2 py2Var = this.d;
            long j = this.h;
            gh2 gh2Var = this.l;
            if (gh2Var != null) {
                nx3 nx3Var = new nx3(py2Var, this.m, j, gh2Var, null);
                this.c = 1;
                Object objQ = yo4.q(nx3Var, this);
                hq0 hq0Var = hq0.c;
                if (objQ == hq0Var) {
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
