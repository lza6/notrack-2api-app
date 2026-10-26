package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wk2 extends uo0 {
    public b33 c;
    public gl2 d;
    public gl2 h;
    public sz0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xk2 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk2(xk2 xk2Var, uo0 uo0Var) {
        super(uo0Var);
        this.n = xk2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return xk2.c(this.n, null, null, null, this);
    }
}
