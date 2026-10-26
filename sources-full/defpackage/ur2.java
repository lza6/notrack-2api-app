package defpackage;

import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;
import notrack.ai.data.voice.VoiceConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur2 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ur2(OwnConfig ownConfig, je1 je1Var, je1 je1Var2, OwnCard ownCard, int i) {
        this.l = ownConfig;
        this.d = je1Var;
        this.m = je1Var2;
        this.n = ownCard;
        this.h = i;
    }

    public /* synthetic */ ur2(VoiceConfig voiceConfig, String str, le1 le1Var, je1 je1Var, int i) {
        this.l = voiceConfig;
        this.m = str;
        this.n = le1Var;
        this.d = je1Var;
        this.h = i;
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
                return vr2.OwnCardView$lambda$5((OwnConfig) obj5, this.d, (je1) obj4, (OwnCard) obj3, this.h, (ck0) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                pe4.VoiceMenuSheet((VoiceConfig) obj5, (String) obj4, (le1) obj3, this.d, (ck0) obj, sf3.V(this.h | 1));
                return w84.a;
        }
    }
}
