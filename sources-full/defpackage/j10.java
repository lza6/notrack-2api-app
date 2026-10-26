package defpackage;

import notrack.ai.data.promo.PickSlot;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j10 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ se1 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ j10(int i, je1 je1Var, lh1 lh1Var, le1 le1Var) {
        this.c = 5;
        this.l = i;
        this.d = je1Var;
        this.m = lh1Var;
        this.h = le1Var;
    }

    public /* synthetic */ j10(Object obj, je1 je1Var, je1 je1Var2, int i, int i2) {
        this.c = i2;
        this.m = obj;
        this.d = je1Var;
        this.h = je1Var2;
        this.l = i;
    }

    public /* synthetic */ j10(String str, le1 le1Var, je1 je1Var, int i) {
        this.c = 3;
        this.m = str;
        this.h = le1Var;
        this.d = je1Var;
        this.l = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        je1 je1Var = this.d;
        se1 se1Var = this.h;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q10.CarryHintBar((r10) obj3, je1Var, (je1) se1Var, (ck0) obj, sf3.V(i2 | 1));
                return w84Var;
            case 1:
                ((Integer) obj2).getClass();
                wa0.a((PickSlot) obj3, je1Var, (je1) se1Var, (ck0) obj, i2);
                return w84Var;
            case 2:
                ((Integer) obj2).getClass();
                wa0.UpdateBanner((w94) obj3, je1Var, (je1) se1Var, (ck0) obj, sf3.V(i2 | 1));
                return w84Var;
            case 3:
                ((Integer) obj2).getClass();
                wa0.B((String) obj3, (le1) se1Var, je1Var, (ck0) obj, i2);
                return w84Var;
            case 4:
                ((Integer) obj2).getClass();
                qj1.a(je1Var, (je1) se1Var, (String) obj3, (ck0) obj, i2);
                return w84Var;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return qz3.TextSizePanel$lambda$16(this.l, this.d, (lh1) obj3, (le1) se1Var, (ck0) obj, iIntValue);
        }
    }
}
