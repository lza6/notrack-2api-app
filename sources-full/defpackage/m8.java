package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends mq3 implements oe1 {
    public /* synthetic */ gq0 c;
    public /* synthetic */ float d;
    public final /* synthetic */ ji4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(ji4 ji4Var, so0 so0Var) {
        super(3, so0Var);
        this.h = ji4Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        float fFloatValue = ((Number) obj2).floatValue();
        m8 m8Var = new m8(this.h, (so0) obj3);
        m8Var.c = (gq0) obj;
        m8Var.d = fFloatValue;
        w84 w84Var = w84.a;
        m8Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        py.F(this.c, null, null, new l8(this.h, this.d, null, 0), 3);
        return w84.a;
    }
}
