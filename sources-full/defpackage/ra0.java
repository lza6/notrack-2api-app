package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import app.template.extension.BuildConfig;
import java.util.HashMap;
import java.util.List;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.promo.OwnCard;
import notrack.ai.data.promo.OwnConfig;
import notrack.ai.data.promo.PromoCopy;
import notrack.ai.data.voice.VoiceConfig;
import notrack.ai.data.voice.VoiceStrings;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends ww1 implements pe1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ hb0 d;
    public final /* synthetic */ String h;
    public final /* synthetic */ String l;
    public final /* synthetic */ HashMap m;
    public final /* synthetic */ gn3 n;
    public final /* synthetic */ mi2 o;
    public final /* synthetic */ mi2 p;
    public final /* synthetic */ mi2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra0(List list, hb0 hb0Var, String str, String str2, HashMap map, gn3 gn3Var, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3) {
        super(4);
        this.c = list;
        this.d = hb0Var;
        this.h = str;
        this.l = str2;
        this.m = map;
        this.n = gn3Var;
        this.o = mi2Var;
        this.p = mi2Var2;
        this.q = mi2Var3;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((b02) obj, ((Number) obj2).intValue(), (ck0) obj3, ((Number) obj4).intValue());
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x055b  */
    /* JADX WARN: Code duplicated, block: B:186:0x055e A[PHI: r3
  0x055e: PHI (r3v26 java.lang.String) = (r3v23 java.lang.String), (r3v50 java.lang.String) binds: [B:193:0x0577, B:184:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x0318  */
    public final void invoke(b02 b02Var, int i, ck0 ck0Var, int i2) {
        int i3;
        kk0 kk0Var;
        boolean z;
        String speak;
        VoiceStrings strings;
        String str;
        boolean z2;
        VoiceStrings strings2;
        OwnCard ownCard;
        boolean zJ;
        Object objP;
        boolean zJ2;
        Object objP2;
        HashMap map = this.m;
        String str2 = this.h;
        mi2 mi2Var = this.p;
        mi2 mi2Var2 = this.o;
        gn3 gn3Var = this.n;
        hb0 hb0Var = this.d;
        if ((i2 & 6) == 0) {
            i3 = i2 | (((kk0) ck0Var).h(b02Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((kk0) ck0Var).f(i) ? 32 : 16;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zS = kk0Var2.S(i3 & 1, (i3 & 147) != 146);
        xk xkVar = kk0Var2.a;
        if (!zS) {
            kk0Var2.V();
            return;
        }
        yd2 yd2Var = (yd2) this.c.get(i);
        kk0Var2.a0(173234898);
        r10 r10Var = ((xa0) gn3Var.getValue()).G;
        w10 w10Var = ((xa0) gn3Var.getValue()).S;
        if (r10Var == null || w10Var == null) {
            kk0Var = kk0Var2;
            z = false;
            kk0Var.a0(101858389);
        } else {
            String str3 = yd2Var.a;
            yd2 yd2Var2 = (yd2) ke0.z0(((xa0) gn3Var.getValue()).a);
            if (kr1.n(str3, yd2Var2 != null ? yd2Var2.a : null)) {
                kk0Var2.a0(173191993);
                boolean zJ3 = kk0Var2.j(hb0Var) | kk0Var2.h(w10Var);
                Object objP3 = kk0Var2.P();
                if (zJ3 || objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new h90(hb0Var, 1, w10Var);
                    kk0Var2.l0(objP3);
                }
                q10.CarryCard(r10Var, w10Var, (je1) objP3, a.l(c.i, 16.0f, 8.0f), kk0Var2, 3080, 0);
                kk0Var = kk0Var2;
                z = false;
            } else {
                kk0Var = kk0Var2;
                z = false;
                kk0Var.a0(101858389);
            }
        }
        kk0Var.r(z);
        xd2 xd2Var = yd2Var.d;
        String str4 = yd2Var.a;
        if (xd2Var == xd2.m) {
            kk0Var.a0(173585197);
            String cta = hb0Var.S().getCta();
            xt centerVertically = Alignment$Companion.getCenterVertically();
            Modifier$Companion modifier$Companion = c.i;
            c cVarM = a.m(d.a, 4.0f, 0.0f, 2);
            cl clVar = hl.a;
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar, centerVertically, kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarM);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            String str5 = yd2Var.b;
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str5, (c) new LayoutWeightElement(1.0f, true), ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).l, (ck0) kk0Var, 0, 0, 65528);
            if (mo3.C0(cta)) {
                z2 = false;
                kk0Var.a0(-776702721);
            } else {
                kk0Var.a0(-703864098);
                cm3.Spacer(d.n(modifier$Companion, 8.0f), kk0Var, 6);
                xt centerVertically2 = Alignment$Companion.getCenterVertically();
                c cVarN = xr0.N(modifier$Companion, z73.a(999.0f));
                boolean zJ4 = kk0Var.j(hb0Var);
                Object objP4 = kk0Var.P();
                if (zJ4 || objP4 == Composer$Companion.getEmpty()) {
                    objP4 = new n90(2, hb0Var);
                    kk0Var.l0(objP4);
                }
                c cVarL = a.l(androidx.compose.foundation.a.e(cVarN, false, null, (je1) objP4, 7), 10.0f, 4.0f);
                vb2 vb2VarRowMeasurePolicy2 = e83.rowMeasurePolicy(clVar, centerVertically2, kk0Var, 48);
                int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
                su2 su2VarN2 = kk0Var.n();
                c cVarD2 = b.d(kk0Var, cVarL);
                d4 constructor2 = ComposeUiNode$Companion.getConstructor();
                kk0Var.e0();
                if (kk0Var.O) {
                    kk0Var.m(constructor2);
                } else {
                    kk0Var.o0();
                }
                pe peVarH2 = fq2.h(kk0Var, vb2VarRowMeasurePolicy2, kk0Var, su2VarN2);
                if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                    fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
                }
                xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
                uy3.m1842xe1e389ce(cta, (c) null, gx.getBrandGreen(kk0Var, 0), 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 1, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).o, (ck0) kk0Var, 196608, 3072, 57306);
                cm3.Spacer(d.n(modifier$Companion, 2.0f), kk0Var, 6);
                z2 = false;
                ul1.m1829xf2a7a69(s22.a.getArrowRight(kk0Var, 6), (String) null, d.j(modifier$Companion, 14.0f), gx.getBrandGreen(kk0Var, 0), kk0Var, 432, 0);
                kk0Var.r(true);
            }
            kk0Var.r(z2);
            kk0Var.r(true);
            kk0Var.r(z2);
        } else if (xd2Var == xd2.l) {
            kk0Var.a0(176276865);
            str4.getClass();
            if (hb0Var.l != null) {
                z2 = false;
                if (to3.q0(str4, "own-", false)) {
                    ownCard = hb0Var.l;
                }
                if (ownCard == null) {
                    kk0Var.a0(176483510);
                } else {
                    kk0Var.a0(176483511);
                    OwnConfig ownConfigS = hb0Var.S();
                    int iT = hb0Var.T();
                    zJ = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
                    objP = kk0Var.P();
                    if (zJ || objP == Composer$Companion.getEmpty()) {
                        objP = new oa0(hb0Var, yd2Var, 2);
                        kk0Var.l0(objP);
                    }
                    je1 je1Var = (je1) objP;
                    zJ2 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
                    objP2 = kk0Var.P();
                    if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
                        objP2 = new oa0(hb0Var, yd2Var, 3);
                        kk0Var.l0(objP2);
                    }
                    OwnConfig.Companion companion = OwnConfig.Companion;
                    vr2.OwnCardView(ownCard, ownConfigS, iT, je1Var, (je1) objP2, kk0Var, 64);
                    z2 = false;
                }
                kk0Var.r(z2);
                kk0Var.r(z2);
            } else {
                z2 = false;
            }
            ownCard = null;
            if (ownCard == null) {
                kk0Var.a0(176483510);
            } else {
                kk0Var.a0(176483511);
                OwnConfig ownConfigS2 = hb0Var.S();
                int iT2 = hb0Var.T();
                zJ = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
                objP = kk0Var.P();
                if (zJ) {
                    objP = new oa0(hb0Var, yd2Var, 2);
                    kk0Var.l0(objP);
                } else {
                    objP = new oa0(hb0Var, yd2Var, 2);
                    kk0Var.l0(objP);
                }
                je1 je1Var2 = (je1) objP;
                zJ2 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
                objP2 = kk0Var.P();
                if (zJ2) {
                    objP2 = new oa0(hb0Var, yd2Var, 3);
                    kk0Var.l0(objP2);
                } else {
                    objP2 = new oa0(hb0Var, yd2Var, 3);
                    kk0Var.l0(objP2);
                }
                OwnConfig.Companion companion2 = OwnConfig.Companion;
                vr2.OwnCardView(ownCard, ownConfigS2, iT2, je1Var2, (je1) objP2, kk0Var, 64);
                z2 = false;
            }
            kk0Var.r(z2);
            kk0Var.r(z2);
        } else if (xd2Var == xd2.h) {
            kk0Var.a0(177186746);
            String str6 = yd2Var.b;
            PromoCopy card = hb0Var.b.d.b.getCard();
            boolean z3 = hb0Var.b.d.a.getBoolean("adult", false);
            boolean zJ5 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
            Object objP5 = kk0Var.P();
            if (zJ5 || objP5 == Composer$Companion.getEmpty()) {
                objP5 = new oa0(hb0Var, yd2Var, 4);
                kk0Var.l0(objP5);
            }
            je1 je1Var3 = (je1) objP5;
            boolean zJ6 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
            Object objP6 = kk0Var.P();
            if (zJ6 || objP6 == Composer$Companion.getEmpty()) {
                objP6 = new oa0(hb0Var, yd2Var, 5);
                kk0Var.l0(objP6);
            }
            wa0.PromoCard(str6, card, z3, je1Var3, (je1) objP6, kk0Var, 0);
            z2 = false;
            kk0Var.r(false);
        } else {
            kk0Var.a0(177801569);
            boolean z4 = ((xa0) gn3Var.getValue()).b && kr1.n(str4, str2);
            AvatarView avatarViewI = hb0Var.i("ai");
            AvatarView avatarViewI2 = hb0Var.i("me");
            boolean zJ7 = kk0Var.j(hb0Var);
            Object objP7 = kk0Var.P();
            if (zJ7 || objP7 == Composer$Companion.getEmpty()) {
                objP7 = new l(1, this.d, hb0.class, "openAvatarPicker", "openAvatarPicker(Ljava/lang/String;)V", 0, 25);
                kk0Var.l0(objP7);
            }
            fu1 fu1Var = (fu1) objP7;
            boolean zN = kr1.n(str4, str2);
            boolean z5 = ((xa0) gn3Var.getValue()).c0.getSignedIn() && ((xa0) gn3Var.getValue()).c0.getPlanActive();
            boolean z6 = kr1.n(str4, str2) && !((xa0) gn3Var.getValue()).b;
            boolean zJ8 = kk0Var.j(hb0Var);
            Object objP8 = kk0Var.P();
            if (zJ8 || objP8 == Composer$Companion.getEmpty()) {
                objP8 = new ia0(0, this.d, hb0.class, "regenerateLast", "regenerateLast()V", 0, 6);
                kk0Var.l0(objP8);
            }
            fu1 fu1Var2 = (fu1) objP8;
            boolean z7 = kr1.n(str4, this.l) && !((xa0) gn3Var.getValue()).b && yd2Var.f.isEmpty();
            boolean zN2 = kr1.n((String) mi2Var2.getValue(), str4);
            String str7 = (String) mi2Var.getValue();
            boolean z8 = yd2Var.c == mm3.d && !((xa0) gn3Var.getValue()).b && ((xa0) gn3Var.getValue()).c != null && map.containsKey(str4);
            boolean zN3 = kr1.n(map.get(str4), Boolean.TRUE);
            VoiceConfig voiceConfig = ((xa0) gn3Var.getValue()).l0;
            boolean z9 = (voiceConfig == null || !voiceConfig.getCanDrawButton() || ((xa0) gn3Var.getValue()).b) ? false : true;
            boolean z10 = ((xa0) gn3Var.getValue()).m0.a && kr1.n(((xa0) gn3Var.getValue()).m0.b, str4);
            boolean z11 = ((xa0) gn3Var.getValue()).m0.d;
            we4 we4Var = ((xa0) gn3Var.getValue()).m0;
            double d = we4Var.g;
            float fV = d > 0.0d ? (float) py.v(we4Var.f / d, 0.0d, 1.0d) : 0.0f;
            if (kr1.n(((xa0) gn3Var.getValue()).m0.b, str4)) {
                VoiceConfig voiceConfig2 = ((xa0) gn3Var.getValue()).l0;
                speak = (voiceConfig2 == null || (strings2 = voiceConfig2.getStrings()) == null) ? null : strings2.getStop();
                if (speak == null) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    str = speak;
                }
            } else {
                VoiceConfig voiceConfig3 = ((xa0) gn3Var.getValue()).l0;
                speak = (voiceConfig3 == null || (strings = voiceConfig3.getStrings()) == null) ? null : strings.getSpeak();
                if (speak == null) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    str = speak;
                }
            }
            le1 le1Var = (le1) fu1Var;
            je1 je1Var4 = (je1) fu1Var2;
            boolean zJ9 = kk0Var.j(yd2Var);
            Object objP9 = kk0Var.P();
            if (zJ9 || objP9 == Composer$Companion.getEmpty()) {
                objP9 = new pa0(yd2Var, mi2Var2, mi2Var, this.q);
                kk0Var.l0(objP9);
            }
            le1 le1Var2 = (le1) objP9;
            Object objP10 = kk0Var.P();
            if (objP10 == Composer$Companion.getEmpty()) {
                objP10 = new qa0(0, mi2Var);
                kk0Var.l0(objP10);
            }
            le1 le1Var3 = (le1) objP10;
            boolean zJ10 = kk0Var.j(yd2Var) | kk0Var.j(hb0Var);
            Object objP11 = kk0Var.P();
            if (zJ10 || objP11 == Composer$Companion.getEmpty()) {
                objP11 = new ma0(yd2Var, hb0Var, mi2Var, mi2Var2);
                kk0Var.l0(objP11);
            }
            je1 je1Var5 = (je1) objP11;
            Object objP12 = kk0Var.P();
            if (objP12 == Composer$Companion.getEmpty()) {
                objP12 = new n90(1, mi2Var2);
                kk0Var.l0(objP12);
            }
            je1 je1Var6 = (je1) objP12;
            boolean zJ11 = kk0Var.j(hb0Var);
            Object objP13 = kk0Var.P();
            if (zJ11 || objP13 == Composer$Companion.getEmpty()) {
                objP13 = new na0(hb0Var);
                kk0Var.l0(objP13);
            }
            ne1 ne1Var = (ne1) objP13;
            boolean zJ12 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
            Object objP14 = kk0Var.P();
            if (zJ12 || objP14 == Composer$Companion.getEmpty()) {
                objP14 = new oa0(hb0Var, yd2Var, 0);
                kk0Var.l0(objP14);
            }
            je1 je1Var7 = (je1) objP14;
            boolean zJ13 = kk0Var.j(hb0Var) | kk0Var.j(yd2Var);
            Object objP15 = kk0Var.P();
            if (zJ13 || objP15 == Composer$Companion.getEmpty()) {
                objP15 = new oa0(hb0Var, yd2Var, 1);
                kk0Var.l0(objP15);
            }
            wa0.MessageBubble(yd2Var, avatarViewI, avatarViewI2, le1Var, zN, z5, z6, je1Var4, z7, zN2, str7, le1Var2, le1Var3, je1Var5, je1Var6, ne1Var, z8, zN3, je1Var7, z4, z9, z10, z11, fV, str, (je1) objP15, kk0Var, 0, 24960, 0, 0);
            z2 = false;
            kk0Var.r(false);
        }
        kk0Var.r(z2);
    }
}
