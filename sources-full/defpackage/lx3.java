package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx3 extends uo0 {
    public wx3 c;
    public p43 d;
    public p43 h;
    public ah1 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ wx3 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx3(wx3 wx3Var, uo0 uo0Var) {
        super(uo0Var);
        this.n = wx3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return wx3.b(this.n, null, false, this);
    }
}
