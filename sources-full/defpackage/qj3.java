package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qj3 extends mq3 implements oe1 {
    public /* synthetic */ long c;
    public final /* synthetic */ uj3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj3(uj3 uj3Var, so0 so0Var) {
        super(3, so0Var);
        this.d = uj3Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        long j = ((ln2) obj2).a;
        qj3 qj3Var = new qj3(this.d, (so0) obj3);
        qj3Var.c = j;
        w84 w84Var = w84.a;
        qj3Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        long j = this.c;
        uj3 uj3Var = this.d;
        uj3Var.n.h((uj3Var.h ? uj3Var.g.f() - ln2.f(j) : ln2.f(j)) - uj3Var.m.f());
        return w84.a;
    }
}
