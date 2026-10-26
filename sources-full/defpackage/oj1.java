package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ String h;
    public final /* synthetic */ je1 l;

    public /* synthetic */ oj1(je1 je1Var, String str, je1 je1Var2, int i) {
        this.c = i;
        this.d = je1Var;
        this.h = str;
        this.l = je1Var2;
    }

    public /* synthetic */ oj1(je1 je1Var, je1 je1Var2, String str) {
        this.c = 0;
        this.d = je1Var;
        this.l = je1Var2;
        this.h = str;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        je1 je1Var = this.l;
        String str = this.h;
        je1 je1Var2 = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return qj1.PreviewHeader$lambda$2(je1Var2, je1Var, str, ck0Var, iIntValue);
            case 1:
                return fm1.ImageGateDialog$lambda$3(je1Var2, str, je1Var, ck0Var, iIntValue);
            case 2:
                return zp1.InstrGateDialog$lambda$2(je1Var2, str, je1Var, ck0Var, iIntValue);
            default:
                return pe4.VoiceGateDialog$lambda$29(je1Var2, str, je1Var, ck0Var, iIntValue);
        }
    }
}
