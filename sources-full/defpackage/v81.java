package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v81 extends uo0 {
    public ha0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ha0 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v81(ha0 ha0Var, so0 so0Var) {
        super(so0Var);
        this.h = ha0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.emit(null, this);
    }
}
