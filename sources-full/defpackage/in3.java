package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in3 extends uo0 {
    public jn3 c;
    public l81 d;
    public kn3 h;
    public gs1 l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ jn3 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in3(jn3 jn3Var, so0 so0Var) {
        super(so0Var);
        this.o = jn3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        this.o.a(null, this);
        return hq0.c;
    }
}
