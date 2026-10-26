package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gn3 d;

    public /* synthetic */ i70(gn3 gn3Var, int i) {
        this.c = i;
        this.d = gn3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        gn3 gn3Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return wa0.ChatScreen$lambda$386$lambda$304$lambda$303$lambda$287(gn3Var, ck0Var, iIntValue);
            default:
                return wa0.ChatScreen$lambda$386$lambda$304$lambda$303$lambda$296$lambda$293(gn3Var, ck0Var, iIntValue);
        }
    }
}
