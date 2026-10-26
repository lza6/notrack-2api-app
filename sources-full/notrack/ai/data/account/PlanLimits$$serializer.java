package notrack.ai.data.account;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class PlanLimits$$serializer implements ff1 {
    public static final PlanLimits$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        PlanLimits$$serializer planLimits$$serializer = new PlanLimits$$serializer();
        INSTANCE = planLimits$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.account.PlanLimits", planLimits$$serializer, 3);
        xw2Var.k("history_tokens", true);
        xw2Var.k("priority", true);
        xw2Var.k("voice_per_day", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        oq1 oq1Var = oq1.a;
        return new qu1[]{oq1Var, cw.a, oq1Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        int iW = 0;
        boolean zS = false;
        int iW2 = 0;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                iW = nk0VarB.w(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                zS = nk0VarB.s(tf3Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    u41.f(iH);
                    return null;
                }
                iW2 = nk0VarB.w(tf3Var, 2);
                i |= 4;
            }
        }
        nk0VarB.q(tf3Var);
        return new PlanLimits(i, iW, iW2, zS);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        PlanLimits planLimits = (PlanLimits) obj;
        planLimits.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        PlanLimits.write$Self$app_playRelease(planLimits, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
