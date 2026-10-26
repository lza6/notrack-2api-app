package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi4 extends uo0 {
    public aj4 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ aj4 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi4(aj4 aj4Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = aj4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return aj4.a(this.h, this);
    }
}
