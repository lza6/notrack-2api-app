package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f22 extends uo0 {
    public g22 c;
    public ri2 d;
    public mq3 h;
    public /* synthetic */ Object l;
    public final /* synthetic */ g22 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f22(g22 g22Var, uo0 uo0Var) {
        super(uo0Var);
        this.m = g22Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
