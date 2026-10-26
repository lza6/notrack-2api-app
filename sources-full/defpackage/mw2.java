package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mw2 extends uo0 {
    public zi2 c;
    public int d;
    public /* synthetic */ Object h;
    public final /* synthetic */ tw2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(tw2 tw2Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = tw2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
