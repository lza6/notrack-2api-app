package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gs extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs(wx3 wx3Var, int i) {
        super(1);
        this.c = i;
        this.d = wx3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        wx3 wx3Var = this.d;
        switch (i) {
            case 0:
                return new g4(4, wx3Var);
            default:
                long j = ((ln2) obj).a;
                vz3 vz3VarR = wx3Var.r();
                vz3 vz3Var = vz3.d;
                if (vz3VarR == vz3Var) {
                    vz3Var = vz3.c;
                }
                wx3Var.x(vz3Var);
                return w84.a;
        }
    }
}
