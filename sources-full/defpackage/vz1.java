package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends uo0 {
    public wz1 c;
    public ri2 d;
    public mq3 h;
    public /* synthetic */ Object l;
    public final /* synthetic */ wz1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(wz1 wz1Var, uo0 uo0Var) {
        super(uo0Var);
        this.m = wz1Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
