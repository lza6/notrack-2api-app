package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class et extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cz3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(cz3 cz3Var, int i) {
        super(0);
        this.c = i;
        this.d = cz3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        int i2 = 2;
        cz3 cz3Var = this.d;
        switch (i) {
            case 0:
                return Boolean.valueOf(cz3Var != null ? ((Boolean) new et(cz3Var, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(cz3Var != null ? ((Boolean) new et(cz3Var, i2).invoke()).booleanValue() : false);
            default:
                hg hgVar = cz3Var.b;
                xy3 xy3Var = (xy3) cz3Var.a.getValue();
                return Boolean.valueOf(kr1.n(hgVar, xy3Var != null ? xy3Var.a.a : null));
        }
    }
}
