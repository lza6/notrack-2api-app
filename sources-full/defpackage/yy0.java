package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 extends uo0 {
    public bz0 c;
    public dy0 d;
    public dz0 h;
    public /* synthetic */ Object l;
    public final /* synthetic */ bz0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(bz0 bz0Var, uo0 uo0Var) {
        super(uo0Var);
        this.m = bz0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return bz0.z0(this.m, null, this);
    }
}
