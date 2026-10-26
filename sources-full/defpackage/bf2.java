package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf2 extends mq3 implements oe1 {
    public /* synthetic */ float c;
    public final /* synthetic */ le1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf2(le1 le1Var, so0 so0Var) {
        super(3, so0Var);
        this.d = le1Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        float fFloatValue = ((Number) obj2).floatValue();
        bf2 bf2Var = new bf2(this.d, (so0) obj3);
        bf2Var.c = fFloatValue;
        w84 w84Var = w84.a;
        bf2Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        this.d.invoke(new Float(this.c));
        return w84.a;
    }
}
