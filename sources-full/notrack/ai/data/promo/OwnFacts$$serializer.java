package notrack.ai.data.promo;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class OwnFacts$$serializer implements ff1 {
    public static final OwnFacts$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        OwnFacts$$serializer ownFacts$$serializer = new OwnFacts$$serializer();
        INSTANCE = ownFacts$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.promo.OwnFacts", ownFacts$$serializer, 7);
        xw2Var.k("freePairs", true);
        xw2Var.k("memMult", true);
        xw2Var.k("paidPairs", true);
        xw2Var.k("plusUsd", true);
        xw2Var.k("proUsd", true);
        xw2Var.k("plusYear", true);
        xw2Var.k("proYear", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        oq1 oq1Var = oq1.a;
        lo3 lo3Var = lo3.a;
        return new qu1[]{oq1Var, oq1Var, oq1Var, lo3Var, lo3Var, lo3Var, lo3Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iW = nk0VarB.w(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iW2 = nk0VarB.w(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iW3 = nk0VarB.w(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strN = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN2 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strN3 = nk0VarB.n(tf3Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strN4 = nk0VarB.n(tf3Var, 6);
                    i |= 64;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new OwnFacts(i, iW, iW2, iW3, strN, strN2, strN3, strN4);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        OwnFacts ownFacts = (OwnFacts) obj;
        ownFacts.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        OwnFacts.write$Self$app_playRelease(ownFacts, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
