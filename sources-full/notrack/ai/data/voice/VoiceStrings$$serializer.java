package notrack.ai.data.voice;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class VoiceStrings$$serializer implements ff1 {
    public static final VoiceStrings$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoiceStrings$$serializer voiceStrings$$serializer = new VoiceStrings$$serializer();
        INSTANCE = voiceStrings$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoiceStrings", voiceStrings$$serializer, 7);
        xw2Var.k("speak", true);
        xw2Var.k("stop", true);
        xw2Var.k("voice_pick", true);
        xw2Var.k("auto_hint", true);
        xw2Var.k("failed", true);
        xw2Var.k("quota_out", true);
        xw2Var.k("no_lang", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, vl0.Q(lo3Var), vl0.Q(lo3Var)};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        String strN5 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strN = nk0VarB.n(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strN2 = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strN3 = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strN4 = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN5 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) nk0VarB.g(tf3Var, 5, lo3.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) nk0VarB.g(tf3Var, 6, lo3.a, str2);
                    i |= 64;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new VoiceStrings(i, strN, strN2, strN3, strN4, strN5, str, str2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoiceStrings voiceStrings = (VoiceStrings) obj;
        voiceStrings.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoiceStrings.write$Self$app_playRelease(voiceStrings, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
