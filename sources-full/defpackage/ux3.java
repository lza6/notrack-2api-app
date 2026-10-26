package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux3 extends mq3 implements ne1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ ix2 h;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux3(wx3 wx3Var, ix2 ix2Var, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.d = wx3Var;
        this.h = ix2Var;
        this.l = z;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        ux3 ux3Var = new ux3(this.d, this.h, this.l, so0Var);
        ux3Var.c = obj;
        return ux3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((ux3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        gq0 gq0Var = (gq0) this.c;
        wx3 wx3Var = this.d;
        ix2 ix2Var = this.h;
        mu3 mu3Var = new mu3(wx3Var, ix2Var, null, 4);
        jq0 jq0Var = jq0.l;
        py.F(gq0Var, null, jq0Var, mu3Var, 1);
        boolean z = this.l;
        py.F(gq0Var, null, jq0Var, new tx3(ix2Var, wx3Var, z, (so0) null), 1);
        return py.F(gq0Var, null, jq0Var, new tx3(wx3Var, ix2Var, z, (so0) null), 1);
    }
}
