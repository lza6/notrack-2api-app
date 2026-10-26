package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pq3 extends uo0 {
    public ym3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rq3 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq3(rq3 rq3Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = rq3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.j(0L, null, this);
    }
}
