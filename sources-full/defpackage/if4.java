package defpackage;

import notrack.ai.data.voice.VoiceQuota;

/* JADX INFO: loaded from: classes.dex */
public final class if4 extends jf4 {
    public final VoiceQuota a;

    public if4(VoiceQuota voiceQuota) {
        voiceQuota.getClass();
        this.a = voiceQuota;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if4) && kr1.n(this.a, ((if4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QuotaOut(quota=" + this.a + ")";
    }
}
