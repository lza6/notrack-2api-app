package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nw2 extends uo0 {
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ tw2 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw2(tw2 tw2Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = tw2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
