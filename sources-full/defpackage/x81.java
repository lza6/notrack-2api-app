package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x81 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ ha0 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(ha0 ha0Var, so0 so0Var) {
        super(so0Var);
        this.d = ha0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
