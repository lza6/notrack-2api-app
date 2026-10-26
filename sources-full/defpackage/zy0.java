package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends uo0 {
    public bz0 c;
    public ey0 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ bz0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(bz0 bz0Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = bz0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return bz0.A0(this.l, null, this);
    }
}
