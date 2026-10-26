package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ c70(String str, int i) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        String str = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return wa0.EmptyState$lambda$1097$lambda$1095$lambda$1092$lambda$1091(str, ck0Var, iIntValue);
            case 1:
                return wa0.DeleteAccountBody$lambda$1009(str, ck0Var, iIntValue);
            case 2:
                return wa0.PersonaPill$lambda$612$lambda$604(str, ck0Var, iIntValue);
            case 3:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1031$lambda$1030$lambda$1029(str, ck0Var, iIntValue);
            case 4:
                return wa0.ChatScreen$lambda$163$lambda$162$lambda$161$lambda$160(str, ck0Var, iIntValue);
            default:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1031(str, ck0Var, iIntValue);
        }
    }
}
