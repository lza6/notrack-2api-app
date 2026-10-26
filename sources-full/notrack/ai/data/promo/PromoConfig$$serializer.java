package notrack.ai.data.promo;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class PromoConfig$$serializer implements ff1 {
    public static final PromoConfig$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        PromoConfig$$serializer promoConfig$$serializer = new PromoConfig$$serializer();
        INSTANCE = promoConfig$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.promo.PromoConfig", promoConfig$$serializer, 13);
        xw2Var.k("enabled", true);
        xw2Var.k("linkCandy", true);
        xw2Var.k("linkSmart", true);
        xw2Var.k("geoPrimary", true);
        xw2Var.k("maxPerSession", true);
        xw2Var.k("cooldownH", true);
        xw2Var.k("compThreshold", true);
        xw2Var.k("verticalOf", true);
        xw2Var.k("verticalCooldownH", true);
        xw2Var.k("regex", true);
        xw2Var.k("copy", true);
        xw2Var.k("pickSlot", true);
        xw2Var.k("own", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = PromoConfig.$childSerializers;
        lo3 lo3Var = lo3.a;
        oq1 oq1Var = oq1.a;
        return new qu1[]{cw.a, lo3Var, lo3Var, lo3Var, oq1Var, oq1Var, oq1Var, ly1VarArr[7].getValue(), oq1Var, PromoRegex$$serializer.INSTANCE, PromoCopy$$serializer.INSTANCE, PickSlot$$serializer.INSTANCE, OwnConfig$$serializer.INSTANCE};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = PromoConfig.$childSerializers;
        OwnConfig ownConfig = null;
        PickSlot pickSlot = null;
        PromoCopy promoCopy = null;
        PromoRegex promoRegex = null;
        boolean z = true;
        Map map = null;
        int i = 0;
        boolean zS = false;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    zS = zS;
                    z = false;
                    zS = zS;
                    break;
                case 0:
                    i |= 1;
                    zS = nk0VarB.s(tf3Var, 0);
                    z = z;
                    break;
                case 1:
                    strN = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    z = z;
                    break;
                case 2:
                    strN2 = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    z = z;
                    break;
                case 3:
                    strN3 = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    z = z;
                    break;
                case 4:
                    iW = nk0VarB.w(tf3Var, 4);
                    i |= 16;
                    z = z;
                    break;
                case 5:
                    iW2 = nk0VarB.w(tf3Var, 5);
                    i |= 32;
                    z = z;
                    break;
                case 6:
                    iW3 = nk0VarB.w(tf3Var, 6);
                    i |= 64;
                    z = z;
                    break;
                case 7:
                    map = (Map) nk0VarB.v(tf3Var, 7, (qu1) ly1VarArr[7].getValue(), map);
                    i |= Uuid.SIZE_BITS;
                    z = z;
                    zS = zS;
                    break;
                case 8:
                    iW4 = nk0VarB.w(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    z = z;
                    break;
                case 9:
                    promoRegex = (PromoRegex) nk0VarB.v(tf3Var, 9, PromoRegex$$serializer.INSTANCE, promoRegex);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    z = z;
                    zS = zS;
                    break;
                case 10:
                    promoCopy = (PromoCopy) nk0VarB.v(tf3Var, 10, PromoCopy$$serializer.INSTANCE, promoCopy);
                    i |= 1024;
                    z = z;
                    zS = zS;
                    break;
                case 11:
                    pickSlot = (PickSlot) nk0VarB.v(tf3Var, 11, PickSlot$$serializer.INSTANCE, pickSlot);
                    i |= 2048;
                    z = z;
                    zS = zS;
                    break;
                case 12:
                    ownConfig = (OwnConfig) nk0VarB.v(tf3Var, 12, OwnConfig$$serializer.INSTANCE, ownConfig);
                    i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    z = z;
                    zS = zS;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new PromoConfig(i, zS, strN, strN2, strN3, iW, iW2, iW3, map, iW4, promoRegex, promoCopy, pickSlot, ownConfig);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        PromoConfig promoConfig = (PromoConfig) obj;
        promoConfig.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        PromoConfig.write$Self$app_playRelease(promoConfig, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
