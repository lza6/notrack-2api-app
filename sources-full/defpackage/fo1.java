package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo1 extends mq3 implements ne1 {
    public /* synthetic */ float c;

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        fo1 fo1Var = new fo1(2, so0Var);
        fo1Var.c = ((Number) obj).floatValue();
        return fo1Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((fo1) create(Float.valueOf(((Number) obj).floatValue()), (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        return Boolean.valueOf(this.c > 0.0f);
    }
}
