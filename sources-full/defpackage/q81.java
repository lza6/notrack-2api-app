package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q81 extends uo0 {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ r81 h;
    public Object l;
    public l81 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(r81 r81Var, so0 so0Var) {
        super(so0Var);
        this.h = r81Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
