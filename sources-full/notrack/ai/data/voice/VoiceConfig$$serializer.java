package notrack.ai.data.voice;

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
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class VoiceConfig$$serializer implements ff1 {
    public static final VoiceConfig$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        VoiceConfig$$serializer voiceConfig$$serializer = new VoiceConfig$$serializer();
        INSTANCE = voiceConfig$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.voice.VoiceConfig", voiceConfig$$serializer, 15);
        xw2Var.k("enabled", true);
        xw2Var.k("channel", true);
        xw2Var.k("supported", true);
        xw2Var.k("min_version_code", true);
        xw2Var.k("cta", true);
        xw2Var.k("button", true);
        xw2Var.k("voices", true);
        xw2Var.k("default_voice", true);
        xw2Var.k("groups", true);
        xw2Var.k("languages", true);
        xw2Var.k("quota", true);
        xw2Var.k("quotas", true);
        xw2Var.k("strings", true);
        xw2Var.k("playback", true);
        xw2Var.k("ttl_seconds", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = VoiceConfig.$childSerializers;
        cw cwVar = cw.a;
        lo3 lo3Var = lo3.a;
        oq1 oq1Var = oq1.a;
        return new qu1[]{cwVar, lo3Var, cwVar, oq1Var, VoiceCta$$serializer.INSTANCE, VoiceButton$$serializer.INSTANCE, ly1VarArr[6].getValue(), lo3Var, ly1VarArr[8].getValue(), ly1VarArr[9].getValue(), VoiceQuota$$serializer.INSTANCE, ly1VarArr[11].getValue(), VoiceStrings$$serializer.INSTANCE, VoicePlayback$$serializer.INSTANCE, oq1Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = VoiceConfig.$childSerializers;
        VoiceStrings voiceStrings = null;
        Map map = null;
        VoiceQuota voiceQuota = null;
        List list = null;
        VoicePlayback voicePlayback = null;
        Map map2 = null;
        int i = 0;
        boolean zS = false;
        String strN = null;
        boolean zS2 = false;
        int iW = 0;
        VoiceCta voiceCta = null;
        VoiceButton voiceButton = null;
        List list2 = null;
        String strN2 = null;
        boolean z = true;
        int iW2 = 0;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    strN = strN;
                    z = false;
                    strN = strN;
                    break;
                case 0:
                    strN = strN;
                    i |= 1;
                    zS = nk0VarB.s(tf3Var, 0);
                    strN = strN;
                    break;
                case 1:
                    strN = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    zS = zS;
                    break;
                case 2:
                    zS2 = nk0VarB.s(tf3Var, 2);
                    i |= 4;
                    zS = zS;
                    break;
                case 3:
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    zS = zS;
                    break;
                case 4:
                    voiceCta = (VoiceCta) nk0VarB.v(tf3Var, 4, VoiceCta$$serializer.INSTANCE, voiceCta);
                    i |= 16;
                    zS = zS;
                    strN = strN;
                    break;
                case 5:
                    voiceButton = (VoiceButton) nk0VarB.v(tf3Var, 5, VoiceButton$$serializer.INSTANCE, voiceButton);
                    i |= 32;
                    zS = zS;
                    strN = strN;
                    break;
                case 6:
                    list2 = (List) nk0VarB.v(tf3Var, 6, (qu1) ly1VarArr[6].getValue(), list2);
                    i |= 64;
                    zS = zS;
                    strN = strN;
                    break;
                case 7:
                    strN2 = nk0VarB.n(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    zS = zS;
                    break;
                case 8:
                    map2 = (Map) nk0VarB.v(tf3Var, 8, (qu1) ly1VarArr[8].getValue(), map2);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    zS = zS;
                    strN = strN;
                    break;
                case 9:
                    list = (List) nk0VarB.v(tf3Var, 9, (qu1) ly1VarArr[9].getValue(), list);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    zS = zS;
                    strN = strN;
                    break;
                case 10:
                    voiceQuota = (VoiceQuota) nk0VarB.v(tf3Var, 10, VoiceQuota$$serializer.INSTANCE, voiceQuota);
                    i |= 1024;
                    zS = zS;
                    strN = strN;
                    break;
                case 11:
                    map = (Map) nk0VarB.v(tf3Var, 11, (qu1) ly1VarArr[11].getValue(), map);
                    i |= 2048;
                    zS = zS;
                    strN = strN;
                    break;
                case 12:
                    voiceStrings = (VoiceStrings) nk0VarB.v(tf3Var, 12, VoiceStrings$$serializer.INSTANCE, voiceStrings);
                    i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    zS = zS;
                    strN = strN;
                    break;
                case 13:
                    voicePlayback = (VoicePlayback) nk0VarB.v(tf3Var, 13, VoicePlayback$$serializer.INSTANCE, voicePlayback);
                    i |= ConstantsKt.DEFAULT_BUFFER_SIZE;
                    zS = zS;
                    strN = strN;
                    break;
                case 14:
                    iW2 = nk0VarB.w(tf3Var, 14);
                    i |= 16384;
                    zS = zS;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new VoiceConfig(i, zS, strN, zS2, iW, voiceCta, voiceButton, list2, strN2, map2, list, voiceQuota, map, voiceStrings, voicePlayback, iW2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        VoiceConfig voiceConfig = (VoiceConfig) obj;
        voiceConfig.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        VoiceConfig.write$Self$app_playRelease(voiceConfig, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
