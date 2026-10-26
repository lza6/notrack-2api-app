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
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class OwnConfig$$serializer implements ff1 {
    public static final OwnConfig$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        OwnConfig$$serializer ownConfig$$serializer = new OwnConfig$$serializer();
        INSTANCE = ownConfig$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.promo.OwnConfig", ownConfig$$serializer, 15);
        xw2Var.k("enabled", true);
        xw2Var.k("schedule", true);
        xw2Var.k("repeatEvery", true);
        xw2Var.k("maxPerChat", true);
        xw2Var.k("dismissSkips", true);
        xw2Var.k("busyNoteCooldownMin", true);
        xw2Var.k("busyNoteMaxPerDay", true);
        xw2Var.k("fastMaxPerDay", true);
        xw2Var.k("fastCooldownMin", true);
        xw2Var.k("url", true);
        xw2Var.k("cta", true);
        xw2Var.k("priceLine", true);
        xw2Var.k("facts", true);
        xw2Var.k("plans", true);
        xw2Var.k("cards", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = OwnConfig.$childSerializers;
        oq1 oq1Var = oq1.a;
        lo3 lo3Var = lo3.a;
        return new qu1[]{cw.a, ly1VarArr[1].getValue(), oq1Var, oq1Var, oq1Var, oq1Var, oq1Var, oq1Var, oq1Var, lo3Var, lo3Var, lo3Var, OwnFacts$$serializer.INSTANCE, OwnPlans$$serializer.INSTANCE, ly1VarArr[14].getValue()};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        ly1[] ly1VarArr;
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr2 = OwnConfig.$childSerializers;
        List list = null;
        OwnPlans ownPlans = null;
        boolean z = true;
        OwnFacts ownFacts = null;
        int i = 0;
        boolean zS = false;
        List list2 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        int iW7 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    ly1VarArr = ly1VarArr2;
                    z = false;
                    break;
                case 0:
                    ly1VarArr = ly1VarArr2;
                    zS = nk0VarB.s(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    ly1VarArr = ly1VarArr2;
                    list2 = (List) nk0VarB.v(tf3Var, 1, (qu1) ly1VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    ly1VarArr = ly1VarArr2;
                    iW = nk0VarB.w(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    ly1VarArr = ly1VarArr2;
                    iW2 = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    ly1VarArr = ly1VarArr2;
                    iW3 = nk0VarB.w(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    ly1VarArr = ly1VarArr2;
                    iW4 = nk0VarB.w(tf3Var, 5);
                    i |= 32;
                    break;
                case 6:
                    ly1VarArr = ly1VarArr2;
                    iW5 = nk0VarB.w(tf3Var, 6);
                    i |= 64;
                    break;
                case 7:
                    ly1VarArr = ly1VarArr2;
                    iW6 = nk0VarB.w(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    ly1VarArr = ly1VarArr2;
                    iW7 = nk0VarB.w(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                case 9:
                    ly1VarArr = ly1VarArr2;
                    strN = nk0VarB.n(tf3Var, 9);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    break;
                case 10:
                    ly1VarArr = ly1VarArr2;
                    strN2 = nk0VarB.n(tf3Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    ly1VarArr = ly1VarArr2;
                    strN3 = nk0VarB.n(tf3Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    ly1VarArr = ly1VarArr2;
                    ownFacts = (OwnFacts) nk0VarB.v(tf3Var, 12, OwnFacts$$serializer.INSTANCE, ownFacts);
                    i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    break;
                case 13:
                    ly1VarArr = ly1VarArr2;
                    ownPlans = (OwnPlans) nk0VarB.v(tf3Var, 13, OwnPlans$$serializer.INSTANCE, ownPlans);
                    i |= ConstantsKt.DEFAULT_BUFFER_SIZE;
                    break;
                case 14:
                    ly1VarArr = ly1VarArr2;
                    list = (List) nk0VarB.v(tf3Var, 14, (qu1) ly1VarArr2[14].getValue(), list);
                    i |= 16384;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
            ly1VarArr2 = ly1VarArr;
        }
        nk0VarB.q(tf3Var);
        return new OwnConfig(i, zS, list2, iW, iW2, iW3, iW4, iW5, iW6, iW7, strN, strN2, strN3, ownFacts, ownPlans, list);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        OwnConfig ownConfig = (OwnConfig) obj;
        ownConfig.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        OwnConfig.write$Self$app_playRelease(ownConfig, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
