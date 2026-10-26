package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw2 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ tw2 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw2(tw2 tw2Var, uo0 uo0Var) {
        super(uo0Var);
        this.d = tw2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
