package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f33 extends uo0 {
    public o53 c;
    public pm1 d;
    public bg1 h;
    public am1 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g33 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f33(g33 g33Var, uo0 uo0Var) {
        super(uo0Var);
        this.o = g33Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, 0, this);
    }
}
