package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class te extends mq3 implements le1 {
    public xf c;
    public l43 d;
    public int h;
    public final /* synthetic */ ue l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ qs3 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(ue ueVar, Object obj, qs3 qs3Var, long j, so0 so0Var) {
        super(1, so0Var);
        this.l = ueVar;
        this.m = obj;
        this.n = qs3Var;
        this.o = j;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        return new te(this.l, this.m, this.n, this.o, so0Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return ((te) create((so0) obj)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        xf xfVar;
        l43 l43Var;
        qs3 qs3Var = this.n;
        int i = this.h;
        int i2 = 1;
        ue ueVar = this.l;
        try {
            if (i == 0) {
                g13.O(obj);
                ueVar.c.h = (cg) ((x64) ueVar.a).a.invoke(this.m);
                ueVar.e.setValue(qs3Var.c);
                ueVar.d.setValue(Boolean.TRUE);
                xf xfVar2 = ueVar.c;
                xf xfVar3 = new xf(xfVar2.c, xfVar2.d.getValue(), gb2.t(xfVar2.h), xfVar2.l, Long.MIN_VALUE, xfVar2.n);
                l43 l43Var2 = new l43();
                long j = this.o;
                ie ieVar = new ie(ueVar, xfVar3, l43Var2, i2);
                this.c = xfVar3;
                this.d = l43Var2;
                this.h = 1;
                Object objN = vl0.n(xfVar3, qs3Var, j, ieVar, this);
                hq0 hq0Var = hq0.c;
                if (objN == hq0Var) {
                    return hq0Var;
                }
                xfVar = xfVar3;
                l43Var = l43Var2;
            } else {
                if (i != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43Var = this.d;
                xfVar = this.c;
                g13.O(obj);
            }
            sf sfVar = l43Var.c ? sf.c : sf.d;
            ue.b(ueVar);
            return new uf(xfVar, sfVar);
        } catch (CancellationException e) {
            ue.b(ueVar);
            throw e;
        }
    }
}
