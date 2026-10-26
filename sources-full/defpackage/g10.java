package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g10 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;

    public /* synthetic */ g10(je1 je1Var, int i) {
        this.c = i;
        this.d = je1Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        je1 je1Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return q10.CarryGateDialog$lambda$29(je1Var, ck0Var, iIntValue);
            case 1:
                return wa0.LockedOverlay$lambda$1076(je1Var, ck0Var, iIntValue);
            case 2:
                return wa0.ReportDialog$lambda$452(je1Var, ck0Var, iIntValue);
            case 3:
                return wa0.ChatScreen$lambda$386$lambda$385$lambda$384$lambda$342(je1Var, ck0Var, iIntValue);
            case 4:
                return fm1.ImageGateDialog$lambda$4(je1Var, ck0Var, iIntValue);
            case 5:
                return zp1.InstrGateDialog$lambda$3(je1Var, ck0Var, iIntValue);
            case 6:
                return h92.NotifPrimerDialog$lambda$0(je1Var, ck0Var, iIntValue);
            case 7:
                return h92.NotifPrimerDialog$lambda$1(je1Var, ck0Var, iIntValue);
            default:
                return pe4.VoiceGateDialog$lambda$30(je1Var, ck0Var, iIntValue);
        }
    }
}
