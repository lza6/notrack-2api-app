package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku2 extends uo0 {
    public lu2 c;
    public le1 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ lu2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku2(lu2 lu2Var, so0 so0Var) {
        super(so0Var);
        this.l = lu2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.withFrameNanos(null, this);
    }
}
