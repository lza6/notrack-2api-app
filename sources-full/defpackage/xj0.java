package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 extends uo0 {
    public zj0 c;
    public Object d;
    public mq1 h;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ zj0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(zj0 zj0Var, uo0 uo0Var) {
        super(uo0Var);
        this.o = zj0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return zj0.a(this.o, null, null, this);
    }
}
