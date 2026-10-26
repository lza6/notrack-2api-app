package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dk3 extends uo0 {
    public le1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hk3 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk3(hk3 hk3Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = hk3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.c(null, 0.0f, null, this);
    }
}
