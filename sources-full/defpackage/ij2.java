package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h01 d;
    public final /* synthetic */ gq0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij2(int i, gq0 gq0Var, h01 h01Var) {
        super(0);
        this.c = i;
        this.d = h01Var;
        this.h = gq0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        gq0 gq0Var = this.h;
        i01 i01Var = i01.c;
        h01 h01Var = this.d;
        so0 so0Var = null;
        switch (i) {
            case 0:
                if (((Boolean) ((le1) h01Var.a.d).invoke(i01Var)).booleanValue()) {
                    py.F(gq0Var, null, null, new da0(h01Var, so0Var, 5), 3);
                }
                break;
            default:
                if (((Boolean) ((le1) h01Var.a.d).invoke(i01Var)).booleanValue()) {
                    py.F(gq0Var, null, null, new da0(h01Var, so0Var, 7), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
