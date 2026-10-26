package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 extends uo0 {
    public q43 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ym0 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(ym0 ym0Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = ym0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
