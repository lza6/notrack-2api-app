package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ gq0 h;
    public final /* synthetic */ wx3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(wx3 wx3Var, gq0 gq0Var, wx3 wx3Var2, int i) {
        super(0);
        this.c = i;
        switch (i) {
            case 1:
                this.d = wx3Var;
                this.h = gq0Var;
                this.l = wx3Var2;
                super(0);
                break;
            case 2:
                this.d = wx3Var;
                this.h = gq0Var;
                this.l = wx3Var2;
                super(0);
                break;
            default:
                this.d = wx3Var;
                this.h = gq0Var;
                this.l = wx3Var2;
                break;
        }
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        vz3 vz3Var = vz3.c;
        wx3 wx3Var = this.d;
        wx3 wx3Var2 = this.l;
        jq0 jq0Var = jq0.l;
        so0 so0Var = null;
        gq0 gq0Var = this.h;
        int i2 = 1;
        switch (i) {
            case 0:
                py.F(gq0Var, null, jq0Var, new ls(wx3Var2, so0Var, 0), 1);
                wx3Var.x(vz3Var);
                break;
            case 1:
                py.F(gq0Var, null, jq0Var, new ls(wx3Var2, so0Var, i2), 1);
                wx3Var.x(vz3Var);
                break;
            default:
                py.F(gq0Var, null, jq0Var, new ls(wx3Var2, so0Var, 2), 1);
                wx3Var.x(vz3Var);
                break;
        }
        return w84Var;
    }
}
