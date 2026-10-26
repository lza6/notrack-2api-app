package notrack.ai.data.voice;

import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceQuota {
    public static final Companion Companion = new Companion();
    private final int left;
    private final int limit;
    private final boolean metered;
    private final String plan;
    private final int used;

    public final class Companion {
        public final qu1 serializer() {
            return VoiceQuota$$serializer.INSTANCE;
        }
    }

    public VoiceQuota() {
        this.plan = "free";
        this.limit = 0;
        this.used = 0;
        this.left = 0;
        this.metered = false;
    }

    public /* synthetic */ VoiceQuota(int i, String str, int i2, int i3, int i4, boolean z) {
        this.plan = (i & 1) == 0 ? "free" : str;
        if ((i & 2) == 0) {
            this.limit = 0;
        } else {
            this.limit = i2;
        }
        if ((i & 4) == 0) {
            this.used = 0;
        } else {
            this.used = i3;
        }
        if ((i & 8) == 0) {
            this.left = 0;
        } else {
            this.left = i4;
        }
        if ((i & 16) == 0) {
            this.metered = false;
        } else {
            this.metered = z;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VoiceQuota voiceQuota, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(voiceQuota.plan, "free")) {
            do3Var.u(tf3Var, 0, voiceQuota.plan);
        }
        if (do3Var.w(tf3Var) || voiceQuota.limit != 0) {
            do3Var.l(1, voiceQuota.limit, tf3Var);
        }
        if (do3Var.w(tf3Var) || voiceQuota.used != 0) {
            do3Var.l(2, voiceQuota.used, tf3Var);
        }
        if (do3Var.w(tf3Var) || voiceQuota.left != 0) {
            do3Var.l(3, voiceQuota.left, tf3Var);
        }
        if (do3Var.w(tf3Var) || voiceQuota.metered) {
            do3Var.c(tf3Var, 4, voiceQuota.metered);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceQuota)) {
            return false;
        }
        VoiceQuota voiceQuota = (VoiceQuota) obj;
        return kr1.n(this.plan, voiceQuota.plan) && this.limit == voiceQuota.limit && this.used == voiceQuota.used && this.left == voiceQuota.left && this.metered == voiceQuota.metered;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.metered) + fq2.e(this.left, fq2.e(this.used, fq2.e(this.limit, this.plan.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "VoiceQuota(plan=" + this.plan + ", limit=" + this.limit + ", used=" + this.used + ", left=" + this.left + ", metered=" + this.metered + ")";
    }
}
