package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h91 extends mq3 implements ne1 {
    public /* synthetic */ int c;

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        h91 h91Var = new h91(2, so0Var);
        h91Var.c = ((Number) obj).intValue();
        return h91Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((h91) create(Integer.valueOf(((Number) obj).intValue()), (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        return Boolean.valueOf(this.c > 0);
    }
}
