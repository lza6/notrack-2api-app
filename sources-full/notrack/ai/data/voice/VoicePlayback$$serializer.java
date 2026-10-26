package notrack.ai.data.voice;

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
public final /* synthetic */ class VoicePlayback$$serializer implements ff1 {
    public static final VoicePlayback$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoicePlayback$$serializer voicePlayback$$serializer = new VoicePlayback$$serializer();
        INSTANCE = voicePlayback$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoicePlayback", voicePlayback$$serializer, 3);
        xw2Var.k("prefetch_next", true);
        xw2Var.k("first_chunk_seconds", true);
        xw2Var.k("max_chunk_seconds", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        oq1 oq1Var = oq1.a;
        return new qu1[]{cw.a, oq1Var, oq1Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        boolean zS = false;
        int iW = 0;
        int iW2 = 0;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                zS = nk0VarB.s(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                iW = nk0VarB.w(tf3Var, 1);
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
        return new VoicePlayback(i, iW, iW2, zS);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoicePlayback voicePlayback = (VoicePlayback) obj;
        voicePlayback.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoicePlayback.write$Self$app_playRelease(voicePlayback, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
