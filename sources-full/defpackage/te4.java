package defpackage;

import notrack.ai.data.voice.VoiceQuota;

/* JADX INFO: loaded from: classes.dex */
public final class te4 extends ve4 {
    public final VoiceQuota a;

    public te4(VoiceQuota voiceQuota) {
        voiceQuota.getClass();
        this.a = voiceQuota;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te4) && kr1.n(this.a, ((te4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QuotaOut(quota=" + this.a + ")";
    }
}
