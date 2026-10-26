package defpackage;

import notrack.ai.data.promo.OwnConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s00 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s00(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ s00(zi2 zi2Var, yi2 yi2Var) {
        this.c = 4;
        this.d = zi2Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((s) obj4).invoke((Throwable) obj);
                return w84Var;
            case 1:
                return wa0.DeleteAccountBody$lambda$1013((xa0) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 2:
                return wa0.ChatScreen$lambda$208$lambda$206$lambda$205((e94) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 3:
                return wa0.AccountSheet$lambda$1073$lambda$1072$lambda$1071((mi2) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 4:
                zi2 zi2Var = (zi2) obj4;
                zi2.j.set(zi2Var, null);
                zi2Var.i(null);
                return w84Var;
            case 5:
                return vr2.OwnCardView$lambda$5$lambda$4$lambda$3((OwnConfig) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            case 6:
                return uv2.PlanCard$lambda$35$lambda$34$lambda$33((uw2) obj4, (g83) obj, (ck0) obj2, ((Integer) obj3).intValue());
            default:
                ((jf3) obj4).c();
                return w84Var;
        }
    }
}
