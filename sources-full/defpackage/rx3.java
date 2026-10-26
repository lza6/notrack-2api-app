package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx3 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ wx3 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx3(wx3 wx3Var, uo0 uo0Var) {
        super(uo0Var);
        this.d = wx3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.t(this);
    }
}
