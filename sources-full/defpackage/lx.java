package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx extends uo0 {
    public h43 c;
    public Object[] d;
    public int h;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mx n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(mx mxVar, uo0 uo0Var) {
        super(uo0Var);
        this.n = mxVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
