package defpackage;

import androidx.compose.ui.c;
import notrack.ai.data.promo.BonusBar;
import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wv implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wv(Object obj, je1 je1Var, je1 je1Var2, Object obj2, int i, int i2, int i3) {
        this.c = i3;
        this.n = obj;
        this.d = je1Var;
        this.o = je1Var2;
        this.h = obj2;
        this.l = i;
        this.m = i2;
    }

    public /* synthetic */ wv(OwnCard ownCard, OwnConfig ownConfig, int i, je1 je1Var, je1 je1Var2, int i2) {
        this.c = 3;
        this.n = ownCard;
        this.h = ownConfig;
        this.l = i;
        this.d = je1Var;
        this.o = je1Var2;
        this.m = i2;
    }

    public /* synthetic */ wv(r10 r10Var, w10 w10Var, je1 je1Var, c cVar, int i, int i2) {
        this.c = 1;
        this.n = r10Var;
        this.o = w10Var;
        this.d = je1Var;
        this.h = cVar;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = this.l;
        w84 w84Var = w84.a;
        Object obj3 = this.o;
        Object obj4 = this.h;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = sf3.V(i2 | 1);
                xv.BonusBarCard((BonusBar) obj5, this.d, (je1) obj3, (c) obj4, (ck0) obj, iV, this.m);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iV2 = sf3.V(i2 | 1);
                q10.CarryCard((r10) obj5, (w10) obj3, this.d, (c) obj4, (ck0) obj, iV2, this.m);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iV3 = sf3.V(i2 | 1);
                zp1.InstrGateDialog((l50) obj5, this.d, (je1) obj3, (je1) obj4, (ck0) obj, iV3, this.m);
                break;
            default:
                ((Integer) obj2).getClass();
                int iV4 = sf3.V(this.m | 1);
                vr2.OwnCardView((OwnCard) obj5, (OwnConfig) obj4, this.l, this.d, (je1) obj3, (ck0) obj, iV4);
                break;
        }
        return w84Var;
    }
}
