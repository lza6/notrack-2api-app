package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vx3 extends uo0 {
    public wx3 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wx3 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx3(wx3 wx3Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = wx3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.y(this);
    }
}
