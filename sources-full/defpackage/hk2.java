package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 extends uo0 {
    public ik2 c;
    public long d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ik2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk2(ik2 ik2Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = ik2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.mo113x43e5835a(0L, this);
    }
}
