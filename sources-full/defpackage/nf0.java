package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ of0 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(of0 of0Var, so0 so0Var) {
        super(so0Var);
        this.d = of0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
