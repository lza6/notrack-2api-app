package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class za extends uo0 {
    public bb c;
    public long d;
    public /* synthetic */ Object h;
    public final /* synthetic */ bb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(bb bbVar, uo0 uo0Var) {
        super(uo0Var);
        this.l = bbVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(0L, null, this);
    }
}
