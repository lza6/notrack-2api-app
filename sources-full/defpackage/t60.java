package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t60 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xa0 d;

    public /* synthetic */ t60(xa0 xa0Var, int i) {
        this.c = i;
        this.d = xa0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        xa0 xa0Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$774$lambda$773$lambda$772(xa0Var, ck0Var, iIntValue);
            default:
                return wa0.ChatDrawer$lambda$734(xa0Var, ck0Var, iIntValue);
        }
    }
}
