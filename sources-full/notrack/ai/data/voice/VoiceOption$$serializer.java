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
public final /* synthetic */ class VoiceOption$$serializer implements ff1 {
    public static final VoiceOption$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoiceOption$$serializer voiceOption$$serializer = new VoiceOption$$serializer();
        INSTANCE = voiceOption$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoiceOption", voiceOption$$serializer, 6);
        xw2Var.k("name", false);
        xw2Var.k("label", false);
        xw2Var.k("sex", true);
        xw2Var.k("hz", true);
        xw2Var.k("order", true);
        xw2Var.k("show", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        oq1 oq1Var = oq1.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, oq1Var, oq1Var, cw.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        int iW = 0;
        int iW2 = 0;
        boolean zS = false;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
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
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iW2 = nk0VarB.w(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zS = nk0VarB.s(tf3Var, 5);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new VoiceOption(i, strN, strN2, strN3, iW, iW2, zS);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoiceOption voiceOption = (VoiceOption) obj;
        voiceOption.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoiceOption.write$Self$app_playRelease(voiceOption, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
