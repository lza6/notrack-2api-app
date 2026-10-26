package notrack.ai.data.voice;

import defpackage.do3;
import defpackage.fq2;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class VoicePlayback {
    public static final Companion Companion = new Companion();
    private final int firstChunkSeconds;
    private final int maxChunkSeconds;
    private final boolean prefetchNext;

    public final class Companion {
        public final qu1 serializer() {
            return VoicePlayback$$serializer.INSTANCE;
        }
    }

    public VoicePlayback() {
        this.prefetchNext = true;
        this.firstChunkSeconds = 2;
        this.maxChunkSeconds = 28;
    }

    public /* synthetic */ VoicePlayback(int i, int i2, int i3, boolean z) {
        this.prefetchNext = (i & 1) == 0 ? true : z;
        this.firstChunkSeconds = (i & 2) == 0 ? 2 : i2;
        if ((i & 4) == 0) {
            this.maxChunkSeconds = 28;
        } else {
            this.maxChunkSeconds = i3;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoicePlayback voicePlayback, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !voicePlayback.prefetchNext) {
            do3Var.c(tf3Var, 0, voicePlayback.prefetchNext);
        }
        if (do3Var.w(tf3Var) || voicePlayback.firstChunkSeconds != 2) {
            do3Var.l(1, voicePlayback.firstChunkSeconds, tf3Var);
        }
        if (!do3Var.w(tf3Var) && voicePlayback.maxChunkSeconds == 28) {
            return;
        }
        do3Var.l(2, voicePlayback.maxChunkSeconds, tf3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoicePlayback)) {
            return false;
        }
        VoicePlayback voicePlayback = (VoicePlayback) obj;
        return this.prefetchNext == voicePlayback.prefetchNext && this.firstChunkSeconds == voicePlayback.firstChunkSeconds && this.maxChunkSeconds == voicePlayback.maxChunkSeconds;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxChunkSeconds) + fq2.e(this.firstChunkSeconds, Boolean.hashCode(this.prefetchNext) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoicePlayback(prefetchNext=");
        sb.append(this.prefetchNext);
        sb.append(", firstChunkSeconds=");
        sb.append(this.firstChunkSeconds);
        sb.append(", maxChunkSeconds=");
        return fq2.q(sb, this.maxChunkSeconds, ")");
    }
}
