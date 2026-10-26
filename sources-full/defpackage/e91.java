package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e91 extends uo0 {
    public ha0 c;
    public /* synthetic */ Object d;
    public int h;
    public final /* synthetic */ ha0 l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e91(ha0 ha0Var, so0 so0Var) {
        super(so0Var);
        this.l = ha0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.h |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
