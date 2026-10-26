package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uk2 extends uo0 {
    public q43 c;
    public q43 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ xk2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk2(xk2 xk2Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = xk2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
