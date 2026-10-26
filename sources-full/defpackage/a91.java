package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a91 extends uo0 {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ pm0 h;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a91(pm0 pm0Var, so0 so0Var) {
        super(so0Var);
        this.h = pm0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
