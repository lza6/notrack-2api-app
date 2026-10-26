package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fk3 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ hk3 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk3(hk3 hk3Var, uo0 uo0Var) {
        super(uo0Var);
        this.d = hk3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.d(null, 0.0f, null, this);
    }
}
