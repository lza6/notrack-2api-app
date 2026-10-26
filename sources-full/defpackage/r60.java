package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r60 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;

    public /* synthetic */ r60(int i, mi2 mi2Var) {
        this.c = i;
        this.d = mi2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        mi2 mi2Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1059$lambda$1058(mi2Var, ck0Var, iIntValue);
            case 1:
                return wa0.ChatDrawer$lambda$733(mi2Var, ck0Var, iIntValue);
            case 2:
                return wa0.ChatDrawer$lambda$743(mi2Var, ck0Var, iIntValue);
            case 3:
                return wa0.ChatDrawer$lambda$754(mi2Var, ck0Var, iIntValue);
            case 4:
                return wa0.ChatScreen$lambda$157(mi2Var, ck0Var, iIntValue);
            case 5:
                return wa0.ChatScreen$lambda$233(mi2Var, ck0Var, iIntValue);
            case 6:
                return wa0.MessageBubble$lambda$491(mi2Var, ck0Var, iIntValue);
            default:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1059(mi2Var, ck0Var, iIntValue);
        }
    }
}
