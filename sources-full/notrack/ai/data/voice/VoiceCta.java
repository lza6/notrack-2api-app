package notrack.ai.data.voice;

import defpackage.do3;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceCta {
    public static final Companion Companion = new Companion();
    private final String kind;
    private final String url;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceCta$$serializer.INSTANCE;
        }
    }

    public VoiceCta() {
        this.kind = "none";
        this.url = null;
    }

    public /* synthetic */ VoiceCta(String str, String str2, int i) {
        this.kind = (i & 1) == 0 ? "none" : str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceCta voiceCta, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(voiceCta.kind, "none")) {
            do3Var.u(tf3Var, 0, voiceCta.kind);
        }
        if (!do3Var.w(tf3Var) && voiceCta.url == null) {
            return;
        }
        do3Var.p(tf3Var, 1, lo3.a, voiceCta.url);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceCta)) {
            return false;
        }
        VoiceCta voiceCta = (VoiceCta) obj;
        return kr1.n(this.kind, voiceCta.kind) && kr1.n(this.url, voiceCta.url);
    }

    public final int hashCode() {
        int iHashCode = this.kind.hashCode() * 31;
        String str = this.url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VoiceCta(kind=" + this.kind + ", url=" + this.url + ")";
    }
}
