package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 extends mq3 implements le1 {
    public int c;
    public final /* synthetic */ le1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo1(le1 le1Var, so0 so0Var) {
        super(1, so0Var);
        this.d = le1Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        return new bo1(this.d, so0Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return ((bo1) create((so0) obj)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                g13.O(obj);
                return obj;
            }
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        this.c = 1;
        Object objWithFrameNanos = yo4.z(getContext()).withFrameNanos(this.d, this);
        hq0 hq0Var = hq0.c;
        return objWithFrameNanos == hq0Var ? hq0Var : objWithFrameNanos;
    }
}
