package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends uo0 {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ ha0 h;
    public Object l;
    public l81 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(ha0 ha0Var, so0 so0Var) {
        super(so0Var);
        this.h = ha0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.h.emit(null, this);
    }
}
