package notrack.ai.data.voice;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceStrings {
    public static final Companion Companion = new Companion();
    private final String autoHint;
    private final String failed;
    private final String noLang;
    private final String quotaOut;
    private final String speak;
    private final String stop;
    private final String voicePick;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceStrings$$serializer.INSTANCE;
        }
    }

    public VoiceStrings() {
        this.speak = BuildConfig.VERSION_NAME;
        this.stop = BuildConfig.VERSION_NAME;
        this.voicePick = BuildConfig.VERSION_NAME;
        this.autoHint = BuildConfig.VERSION_NAME;
        this.failed = BuildConfig.VERSION_NAME;
        this.quotaOut = null;
        this.noLang = null;
    }

    public /* synthetic */ VoiceStrings(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.speak = BuildConfig.VERSION_NAME;
        } else {
            this.speak = str;
        }
        if ((i & 2) == 0) {
            this.stop = BuildConfig.VERSION_NAME;
        } else {
            this.stop = str2;
        }
        if ((i & 4) == 0) {
            this.voicePick = BuildConfig.VERSION_NAME;
        } else {
            this.voicePick = str3;
        }
        if ((i & 8) == 0) {
            this.autoHint = BuildConfig.VERSION_NAME;
        } else {
            this.autoHint = str4;
        }
        if ((i & 16) == 0) {
            this.failed = BuildConfig.VERSION_NAME;
        } else {
            this.failed = str5;
        }
        if ((i & 32) == 0) {
            this.quotaOut = null;
        } else {
            this.quotaOut = str6;
        }
        if ((i & 64) == 0) {
            this.noLang = null;
        } else {
            this.noLang = str7;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceStrings voiceStrings, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(voiceStrings.speak, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, voiceStrings.speak);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceStrings.stop, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, voiceStrings.stop);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceStrings.voicePick, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, voiceStrings.voicePick);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceStrings.autoHint, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, voiceStrings.autoHint);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceStrings.failed, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, voiceStrings.failed);
        }
        if (do3Var.w(tf3Var) || voiceStrings.quotaOut != null) {
            do3Var.p(tf3Var, 5, lo3.a, voiceStrings.quotaOut);
        }
        if (!do3Var.w(tf3Var) && voiceStrings.noLang == null) {
            return;
        }
        do3Var.p(tf3Var, 6, lo3.a, voiceStrings.noLang);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceStrings)) {
            return false;
        }
        VoiceStrings voiceStrings = (VoiceStrings) obj;
        return kr1.n(this.speak, voiceStrings.speak) && kr1.n(this.stop, voiceStrings.stop) && kr1.n(this.voicePick, voiceStrings.voicePick) && kr1.n(this.autoHint, voiceStrings.autoHint) && kr1.n(this.failed, voiceStrings.failed) && kr1.n(this.quotaOut, voiceStrings.quotaOut) && kr1.n(this.noLang, voiceStrings.noLang);
    }

    public final String getAutoHint() {
        return this.autoHint;
    }

    public final String getFailed() {
        return this.failed;
    }

    public final String getNoLang() {
        return this.noLang;
    }

    public final String getSpeak() {
        return this.speak;
    }

    public final String getStop() {
        return this.stop;
    }

    public final String getVoicePick() {
        return this.voicePick;
    }

    public final int hashCode() {
        int i = ud2.i(ud2.i(ud2.i(ud2.i(this.speak.hashCode() * 31, 31, this.stop), 31, this.voicePick), 31, this.autoHint), 31, this.failed);
        String str = this.quotaOut;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.noLang;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("VoiceStrings(speak=", this.speak, ", stop=", this.stop, ", voicePick=");
        ud2.v(sbT, this.voicePick, ", autoHint=", this.autoHint, ", failed=");
        ud2.v(sbT, this.failed, ", quotaOut=", this.quotaOut, ", noLang=");
        return fq2.r(sbT, this.noLang, ")");
    }
}
