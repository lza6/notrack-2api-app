package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aj1 extends uo0 {
    public dj1 c;
    public xi1 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ dj1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(dj1 dj1Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = dj1Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return dj1.v0(this.l, this);
    }
}
