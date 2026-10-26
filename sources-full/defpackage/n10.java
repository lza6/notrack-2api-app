package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n10 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r10 d;

    public /* synthetic */ n10(r10 r10Var, int i) {
        this.c = i;
        this.d = r10Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        r10 r10Var = this.d;
        g83 g83Var = (g83) obj;
        ck0 ck0Var = (ck0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return q10.CarryCard$lambda$55$lambda$54$lambda$53$lambda$52(r10Var, g83Var, ck0Var, iIntValue);
            case 1:
                return q10.CarryGateDialog$lambda$28$lambda$27$lambda$25(r10Var, g83Var, ck0Var, iIntValue);
            default:
                return q10.CarryGateDialog$lambda$28$lambda$27$lambda$26(r10Var, g83Var, ck0Var, iIntValue);
        }
    }
}
