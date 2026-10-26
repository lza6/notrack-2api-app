package notrack.ai.data.voice;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class VoiceButton$$serializer implements ff1 {
    public static final VoiceButton$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoiceButton$$serializer voiceButton$$serializer = new VoiceButton$$serializer();
        INSTANCE = voiceButton$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoiceButton", voiceButton$$serializer, 2);
        xw2Var.k("show", true);
        xw2Var.k("where", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        return new qu1[]{cw.a, lo3.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        boolean zS = false;
        String strN = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                zS = nk0VarB.s(tf3Var, 0);
                i |= 1;
            } else {
                if (iH != 1) {
                    u41.f(iH);
                    return null;
                }
                strN = nk0VarB.n(tf3Var, 1);
                i |= 2;
            }
        }
        nk0VarB.q(tf3Var);
        return new VoiceButton(strN, i, zS);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoiceButton voiceButton = (VoiceButton) obj;
        voiceButton.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoiceButton.write$Self$app_playRelease(voiceButton, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
