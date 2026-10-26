package defpackage;

import notrack.ai.data.promo.PromoCopy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g80 implements oe1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ gn3 l;

    public /* synthetic */ g80(hb0 hb0Var, boolean z, gn3 gn3Var) {
        this.h = hb0Var;
        this.d = z;
        this.l = gn3Var;
    }

    public /* synthetic */ g80(boolean z, PromoCopy promoCopy, mi2 mi2Var) {
        this.d = z;
        this.h = promoCopy;
        this.l = mi2Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return wa0.PromoCard$lambda$402$lambda$401$lambda$400(this.d, (PromoCopy) obj4, (mi2) this.l, (g83) obj, (ck0) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wa0.ChatScreen$lambda$386$lambda$385$lambda$384$lambda$373$lambda$372$lambda$371((hb0) obj4, this.d, this.l, (b02) obj, (ck0) obj2, iIntValue2);
        }
    }
}
