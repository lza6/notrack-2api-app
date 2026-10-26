package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends uo0 {
    public wz2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e00 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(e00 e00Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = e00Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}
