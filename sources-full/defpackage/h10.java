package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h10 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r10 d;

    public /* synthetic */ h10(r10 r10Var, int i) {
        this.c = i;
        this.d = r10Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        r10 r10Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return q10.CarryGateDialog$lambda$30(r10Var, ck0Var, iIntValue);
            default:
                return q10.CarriedPill$lambda$65$lambda$64(r10Var, ck0Var, iIntValue);
        }
    }
}
