package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jx3 extends uo0 {
    public wx3 c;
    public p43 d;
    public p43 h;
    public /* synthetic */ Object l;
    public final /* synthetic */ wx3 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx3(wx3 wx3Var, uo0 uo0Var) {
        super(uo0Var);
        this.m = wx3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return wx3.a(this.m, null, this);
    }
}
