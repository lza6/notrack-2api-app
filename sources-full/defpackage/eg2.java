package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eg2 extends uo0 {
    public lv0 c;
    public oc3 d;
    public n43 h;
    public float l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lv0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(lv0 lv0Var, uo0 uo0Var) {
        super(uo0Var);
        this.n = lv0Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return lv0.b(this.n, null, null, 0.0f, 0.0f, this);
    }
}
