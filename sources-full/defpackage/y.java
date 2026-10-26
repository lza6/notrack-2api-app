package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y extends uo0 {
    public p83 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pm0 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(pm0 pm0Var, so0 so0Var) {
        super(so0Var);
        this.h = pm0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
