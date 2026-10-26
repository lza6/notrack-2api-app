package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dk2 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ fk2 d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(fk2 fk2Var, uo0 uo0Var) {
        super(uo0Var);
        this.d = fk2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        return this.d.a(0L, 0L, this);
    }
}
