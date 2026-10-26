package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc3 extends uo0 {
    public oc3 c;
    public p43 d;
    public /* synthetic */ Object h;
    public final /* synthetic */ oc3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc3(oc3 oc3Var, uo0 uo0Var) {
        super(uo0Var);
        this.l = oc3Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(0L, this);
    }
}
