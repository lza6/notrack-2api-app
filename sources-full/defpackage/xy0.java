package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends uo0 {
    public bz0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bz0 h;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(bz0 bz0Var, uo0 uo0Var) {
        super(uo0Var);
        this.h = bz0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.l |= Integer.MIN_VALUE;
        return bz0.y0(this.h, this);
    }
}
