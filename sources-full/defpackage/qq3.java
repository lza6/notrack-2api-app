package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq3 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ rq3 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq3(rq3 rq3Var, wr wrVar) {
        super(wrVar);
        this.d = rq3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.n(0L, null, this);
    }
}
