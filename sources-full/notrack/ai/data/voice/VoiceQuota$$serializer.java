package notrack.ai.data.voice;

import defpackage.cv0;
import defpackage.cw;
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
public final /* synthetic */ class VoiceQuota$$serializer implements ff1 {
    public static final VoiceQuota$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoiceQuota$$serializer voiceQuota$$serializer = new VoiceQuota$$serializer();
        INSTANCE = voiceQuota$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoiceQuota", voiceQuota$$serializer, 5);
        xw2Var.k("plan", true);
        xw2Var.k("limit", true);
        xw2Var.k("used", true);
        xw2Var.k("left", true);
        xw2Var.k("metered", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        oq1 oq1Var = oq1.a;
        return new qu1[]{lo3.a, oq1Var, oq1Var, oq1Var, cw.a};
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
        boolean zS = false;
        String strN = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strN = nk0VarB.n(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                iW = nk0VarB.w(tf3Var, 1);
                i |= 2;
            } else if (iH == 2) {
                iW2 = nk0VarB.w(tf3Var, 2);
                i |= 4;
            } else if (iH == 3) {
                iW3 = nk0VarB.w(tf3Var, 3);
                i |= 8;
            } else {
                if (iH != 4) {
                    u41.f(iH);
                    return null;
                }
                zS = nk0VarB.s(tf3Var, 4);
                i |= 16;
            }
        }
        nk0VarB.q(tf3Var);
        return new VoiceQuota(i, strN, iW, iW2, iW3, zS);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoiceQuota voiceQuota = (VoiceQuota) obj;
        voiceQuota.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoiceQuota.write$Self$app_playRelease(voiceQuota, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
