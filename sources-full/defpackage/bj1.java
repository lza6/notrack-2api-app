package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends uo0 {
    public dj1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dj1 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj1(dj1 dj1Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = dj1Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return dj1.w0(this.h, this);
    }
}
