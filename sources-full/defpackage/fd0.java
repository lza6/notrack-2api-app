package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends mq3 implements oe1 {
    public final /* synthetic */ int c;
    public int d;
    public /* synthetic */ py2 h;
    public /* synthetic */ long l;
    public final /* synthetic */ r m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd0(r rVar, so0 so0Var, int i) {
        super(3, so0Var);
        this.c = i;
        this.m = rVar;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        w84 w84Var = w84.a;
        r rVar = this.m;
        py2 py2Var = (py2) obj;
        ln2 ln2Var = (ln2) obj2;
        switch (i) {
            case 0:
                long j = ln2Var.a;
                fd0 fd0Var = new fd0((gd0) rVar, (so0) obj3, 0);
                fd0Var.h = py2Var;
                fd0Var.l = j;
                return fd0Var.invokeSuspend(w84Var);
            default:
                long j2 = ln2Var.a;
                fd0 fd0Var2 = new fd0((sf0) rVar, (so0) obj3, 1);
                fd0Var2.h = py2Var;
                fd0Var2.l = j2;
                return fd0Var2.invokeSuspend(w84Var);
        }
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objQ;
        Object objQ2;
        int i = this.c;
        r rVar = this.m;
        hq0 hq0Var = hq0.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 == 0) {
                    g13.O(obj);
                    py2 py2Var = this.h;
                    long j = this.l;
                    gd0 gd0Var = (gd0) rVar;
                    if (gd0Var.o) {
                        this.d = 1;
                        gh2 gh2Var = gd0Var.h;
                        if (gh2Var == null || (objQ = yo4.q(new n(py2Var, j, gh2Var, gd0Var, null), this)) != hq0Var) {
                            objQ = w84Var;
                        }
                        if (objQ == hq0Var) {
                            return hq0Var;
                        }
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
                    py2 py2Var2 = this.h;
                    long j2 = this.l;
                    sf0 sf0Var = (sf0) rVar;
                    if (sf0Var.o) {
                        this.d = 1;
                        gh2 gh2Var2 = sf0Var.h;
                        if (gh2Var2 == null || (objQ2 = yo4.q(new n(py2Var2, j2, gh2Var2, sf0Var, null), this)) != hq0Var) {
                            objQ2 = w84Var;
                        }
                        if (objQ2 == hq0Var) {
                            return hq0Var;
                        }
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
