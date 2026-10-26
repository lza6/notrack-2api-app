package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm0 extends uo0 {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ om0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(om0 om0Var, so0 so0Var) {
        super(so0Var);
        this.h = om0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.h.emit(null, this);
    }
}
