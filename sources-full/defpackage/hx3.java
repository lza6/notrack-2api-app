package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx3 extends uo0 {
    public wx3 c;
    public boolean d;
    public /* synthetic */ Object h;
    public final /* synthetic */ wx3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx3(wx3 wx3Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = wx3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(false, this);
    }
}
