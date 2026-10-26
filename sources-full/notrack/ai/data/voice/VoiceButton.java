package notrack.ai.data.voice;

import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceButton {
    public static final Companion Companion = new Companion();
    private final boolean show;
    private final String where;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceButton$$serializer.INSTANCE;
        }
    }

    public VoiceButton() {
        this.show = false;
        this.where = "message_actions";
    }

    public /* synthetic */ VoiceButton(String str, int i, boolean z) {
        this.show = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.where = "message_actions";
        } else {
            this.where = str;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceButton voiceButton, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || voiceButton.show) {
            do3Var.c(tf3Var, 0, voiceButton.show);
        }
        if (!do3Var.w(tf3Var) && kr1.n(voiceButton.where, "message_actions")) {
            return;
        }
        do3Var.u(tf3Var, 1, voiceButton.where);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceButton)) {
            return false;
        }
        VoiceButton voiceButton = (VoiceButton) obj;
        return this.show == voiceButton.show && kr1.n(this.where, voiceButton.where);
    }

    public final boolean getShow() {
        return this.show;
    }

    public final int hashCode() {
        return this.where.hashCode() + (Boolean.hashCode(this.show) * 31);
    }

    public final String toString() {
        return "VoiceButton(show=" + this.show + ", where=" + this.where + ")";
    }
}
