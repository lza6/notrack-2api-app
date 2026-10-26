package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ r70(je1 je1Var, mi2 mi2Var, int i) {
        this.c = i;
        this.d = je1Var;
        this.h = mi2Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        mi2 mi2Var = this.h;
        je1 je1Var = this.d;
        ck0 ck0Var = (ck0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return wa0.ChatDrawer$lambda$730(je1Var, mi2Var, ck0Var, iIntValue);
            default:
                return wa0.MessageBubble$lambda$488(je1Var, mi2Var, ck0Var, iIntValue);
        }
    }
}
