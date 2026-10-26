package defpackage;

import notrack.ai.data.promo.PickSlot;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v60 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ v60(je1 je1Var, xa0 xa0Var, boolean z, mi2 mi2Var, mi2 mi2Var2) {
        this.h = je1Var;
        this.l = xa0Var;
        this.d = z;
        this.m = mi2Var;
        this.n = mi2Var2;
    }

    public /* synthetic */ v60(boolean z, je1 je1Var, PickSlot pickSlot, je1 je1Var2, xj3 xj3Var) {
        this.d = z;
        this.h = je1Var;
        this.l = pickSlot;
        this.m = je1Var2;
        this.n = xj3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$815(this.h, (xa0) obj5, this.d, (mi2) obj4, (mi2) obj3, (ck0) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return wa0.PickSlotCard$lambda$850(this.d, this.h, (PickSlot) obj5, (je1) obj4, (xj3) obj3, (ck0) obj, iIntValue2);
        }
    }
}
