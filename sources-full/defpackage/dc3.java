package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dc3 extends mq3 implements ne1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc3(long j, so0 so0Var) {
        super(2, so0Var);
        this.d = j;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        dc3 dc3Var = new dc3(this.d, so0Var);
        dc3Var.c = obj;
        return dc3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dc3 dc3Var = (dc3) create((mc3) obj, (so0) obj2);
        w84 w84Var = w84.a;
        dc3Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        oc3 oc3Var = ((mc3) this.c).a;
        oc3.a(oc3Var, oc3Var.j, this.d, 1);
        return w84.a;
    }
}
