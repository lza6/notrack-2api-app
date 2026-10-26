package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y43 extends uo0 {
    public ui1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ui1 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y43(ui1 ui1Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = ui1Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.b(0.0f, this);
    }
}
