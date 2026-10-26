package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ze4 extends uo0 {
    public int c;
    public int d;
    public String h;
    public String l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ef4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze4(ef4 ef4Var, uo0 uo0Var) {
        super(uo0Var);
        this.o = ef4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(0, null, 0, null, false, this);
    }
}
