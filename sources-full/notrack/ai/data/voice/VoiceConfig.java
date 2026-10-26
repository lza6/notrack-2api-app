package notrack.ai.data.voice;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.b72;
import defpackage.do3;
import defpackage.fb1;
import defpackage.fq2;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceConfig {
    private static final ly1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private final VoiceButton button;
    private final String channel;
    private final VoiceCta cta;
    private final String defaultVoice;
    private final boolean enabled;
    private final Map<String, String> groups;
    private final List<String> languages;
    private final int minVersionCode;
    private final VoicePlayback playback;
    private final VoiceQuota quota;
    private final Map<String, Integer> quotas;
    private final VoiceStrings strings;
    private final boolean supported;
    private final int ttlSeconds;
    private final List<VoiceOption> voices;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceConfig$$serializer.INSTANCE;
        }
    }

    static {
        b72 b72Var = new b72(20);
        q22 q22Var = q22.c;
        $childSerializers = new ly1[]{null, null, null, null, null, null, yo4.H(q22Var, b72Var), null, yo4.H(q22Var, new b72(21)), yo4.H(q22Var, new b72(22)), null, yo4.H(q22Var, new b72(23)), null, null, null};
    }

    public /* synthetic */ VoiceConfig(int i, boolean z, String str, boolean z2, int i2, VoiceCta voiceCta, VoiceButton voiceButton, List list, String str2, Map map, List list2, VoiceQuota voiceQuota, Map map2, VoiceStrings voiceStrings, VoicePlayback voicePlayback, int i3) {
        if ((i & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
        if ((i & 2) == 0) {
            this.channel = BuildConfig.VERSION_NAME;
        } else {
            this.channel = str;
        }
        if ((i & 4) == 0) {
            this.supported = true;
        } else {
            this.supported = z2;
        }
        if ((i & 8) == 0) {
            this.minVersionCode = 0;
        } else {
            this.minVersionCode = i2;
        }
        if ((i & 16) == 0) {
            this.cta = new VoiceCta();
        } else {
            this.cta = voiceCta;
        }
        if ((i & 32) == 0) {
            this.button = new VoiceButton();
        } else {
            this.button = voiceButton;
        }
        int i4 = i & 64;
        z21 z21Var = z21.c;
        if (i4 == 0) {
            this.voices = z21Var;
        } else {
            this.voices = list;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.defaultVoice = BuildConfig.VERSION_NAME;
        } else {
            this.defaultVoice = str2;
        }
        int i5 = i & FontInfo.NUMBER_OF_CHAR_CODES;
        a31 a31Var = a31.c;
        if (i5 == 0) {
            this.groups = a31Var;
        } else {
            this.groups = map;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.languages = z21Var;
        } else {
            this.languages = list2;
        }
        if ((i & 1024) == 0) {
            this.quota = new VoiceQuota();
        } else {
            this.quota = voiceQuota;
        }
        if ((i & 2048) == 0) {
            this.quotas = a31Var;
        } else {
            this.quotas = map2;
        }
        this.strings = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 ? new VoiceStrings() : voiceStrings;
        this.playback = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0 ? new VoicePlayback() : voicePlayback;
        this.ttlSeconds = (i & 16384) == 0 ? 900 : i3;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceConfig voiceConfig, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || voiceConfig.enabled) {
            do3Var.c(tf3Var, 0, voiceConfig.enabled);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.channel, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, voiceConfig.channel);
        }
        if (do3Var.w(tf3Var) || !voiceConfig.supported) {
            do3Var.c(tf3Var, 2, voiceConfig.supported);
        }
        if (do3Var.w(tf3Var) || voiceConfig.minVersionCode != 0) {
            do3Var.l(3, voiceConfig.minVersionCode, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.cta, new VoiceCta())) {
            do3Var.q(tf3Var, 4, VoiceCta$$serializer.INSTANCE, voiceConfig.cta);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.button, new VoiceButton())) {
            do3Var.q(tf3Var, 5, VoiceButton$$serializer.INSTANCE, voiceConfig.button);
        }
        boolean zW = do3Var.w(tf3Var);
        z21 z21Var = z21.c;
        ly1[] ly1VarArr = $childSerializers;
        if (zW || !kr1.n(voiceConfig.voices, z21Var)) {
            do3Var.q(tf3Var, 6, (qu1) ly1VarArr[6].getValue(), voiceConfig.voices);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.defaultVoice, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, voiceConfig.defaultVoice);
        }
        boolean zW2 = do3Var.w(tf3Var);
        a31 a31Var = a31.c;
        if (zW2 || !kr1.n(voiceConfig.groups, a31Var)) {
            do3Var.q(tf3Var, 8, (qu1) ly1VarArr[8].getValue(), voiceConfig.groups);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.languages, z21Var)) {
            do3Var.q(tf3Var, 9, (qu1) ly1VarArr[9].getValue(), voiceConfig.languages);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.quota, new VoiceQuota())) {
            do3Var.q(tf3Var, 10, VoiceQuota$$serializer.INSTANCE, voiceConfig.quota);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.quotas, a31Var)) {
            do3Var.q(tf3Var, 11, (qu1) ly1VarArr[11].getValue(), voiceConfig.quotas);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.strings, new VoiceStrings())) {
            do3Var.q(tf3Var, 12, VoiceStrings$$serializer.INSTANCE, voiceConfig.strings);
        }
        if (do3Var.w(tf3Var) || !kr1.n(voiceConfig.playback, new VoicePlayback())) {
            do3Var.q(tf3Var, 13, VoicePlayback$$serializer.INSTANCE, voiceConfig.playback);
        }
        if (!do3Var.w(tf3Var) && voiceConfig.ttlSeconds == 900) {
            return;
        }
        do3Var.l(14, voiceConfig.ttlSeconds, tf3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceConfig)) {
            return false;
        }
        VoiceConfig voiceConfig = (VoiceConfig) obj;
        return this.enabled == voiceConfig.enabled && kr1.n(this.channel, voiceConfig.channel) && this.supported == voiceConfig.supported && this.minVersionCode == voiceConfig.minVersionCode && kr1.n(this.cta, voiceConfig.cta) && kr1.n(this.button, voiceConfig.button) && kr1.n(this.voices, voiceConfig.voices) && kr1.n(this.defaultVoice, voiceConfig.defaultVoice) && kr1.n(this.groups, voiceConfig.groups) && kr1.n(this.languages, voiceConfig.languages) && kr1.n(this.quota, voiceConfig.quota) && kr1.n(this.quotas, voiceConfig.quotas) && kr1.n(this.strings, voiceConfig.strings) && kr1.n(this.playback, voiceConfig.playback) && this.ttlSeconds == voiceConfig.ttlSeconds;
    }

    public final boolean getCanDrawButton() {
        return this.enabled && this.supported && this.button.getShow() && !getShownVoices().isEmpty();
    }

    public final String getDefaultVoice() {
        return this.defaultVoice;
    }

    public final Map<String, String> getGroups() {
        return this.groups;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final Map<String, Integer> getQuotas() {
        return this.quotas;
    }

    public final List<VoiceOption> getShownVoices() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.voices) {
            if (((VoiceOption) obj).getShow()) {
                arrayList.add(obj);
            }
        }
        return ke0.K0(arrayList, new fb1(10));
    }

    public final VoiceStrings getStrings() {
        return this.strings;
    }

    public final int getTtlSeconds() {
        return this.ttlSeconds;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ttlSeconds) + ((this.playback.hashCode() + ((this.strings.hashCode() + ((this.quotas.hashCode() + ((this.quota.hashCode() + ud2.j((this.groups.hashCode() + ud2.i(ud2.j((this.button.hashCode() + ((this.cta.hashCode() + fq2.e(this.minVersionCode, ud2.k(ud2.i(Boolean.hashCode(this.enabled) * 31, 31, this.channel), 31, this.supported), 31)) * 31)) * 31, 31, this.voices), 31, this.defaultVoice)) * 31, 31, this.languages)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(", supported=");
        sb.append(this.supported);
        sb.append(", minVersionCode=");
        sb.append(this.minVersionCode);
        sb.append(", cta=");
        sb.append(this.cta);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", voices=");
        sb.append(this.voices);
        sb.append(", defaultVoice=");
        sb.append(this.defaultVoice);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", languages=");
        sb.append(this.languages);
        sb.append(", quota=");
        sb.append(this.quota);
        sb.append(", quotas=");
        sb.append(this.quotas);
        sb.append(", strings=");
        sb.append(this.strings);
        sb.append(", playback=");
        sb.append(this.playback);
        sb.append(", ttlSeconds=");
        return fq2.q(sb, this.ttlSeconds, ")");
    }
}
