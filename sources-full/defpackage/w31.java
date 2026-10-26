package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w31 extends uo0 {
    public vg0 c;
    public pm1 d;
    public Object h;
    public jq2 l;
    public bg1 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ y31 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(y31 y31Var, uo0 uo0Var) {
        super(uo0Var);
        this.p = y31Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(null, null, null, null, null, this);
    }
}
