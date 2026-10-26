package notrack.ai.data.account;

import defpackage.do3;
import defpackage.fq2;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class PlanLimits {
    public static final Companion Companion = new Companion();
    private final int historyTokens;
    private final boolean priority;
    private final int voicePerDay;

    public final class Companion {
        public final qu1 serializer() {
            return PlanLimits$$serializer.INSTANCE;
        }
    }

    public PlanLimits() {
        this.historyTokens = 0;
        this.priority = false;
        this.voicePerDay = 0;
    }

    public /* synthetic */ PlanLimits(int i, int i2, int i3, boolean z) {
        if ((i & 1) == 0) {
            this.historyTokens = 0;
        } else {
            this.historyTokens = i2;
        }
        if ((i & 2) == 0) {
            this.priority = false;
        } else {
            this.priority = z;
        }
        if ((i & 4) == 0) {
            this.voicePerDay = 0;
        } else {
            this.voicePerDay = i3;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PlanLimits planLimits, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || planLimits.historyTokens != 0) {
            do3Var.l(0, planLimits.historyTokens, tf3Var);
        }
        if (do3Var.w(tf3Var) || planLimits.priority) {
            do3Var.c(tf3Var, 1, planLimits.priority);
        }
        if (!do3Var.w(tf3Var) && planLimits.voicePerDay == 0) {
            return;
        }
        do3Var.l(2, planLimits.voicePerDay, tf3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanLimits)) {
            return false;
        }
        PlanLimits planLimits = (PlanLimits) obj;
        return this.historyTokens == planLimits.historyTokens && this.priority == planLimits.priority && this.voicePerDay == planLimits.voicePerDay;
    }

    public final int hashCode() {
        return Integer.hashCode(this.voicePerDay) + ud2.k(Integer.hashCode(this.historyTokens) * 31, 31, this.priority);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlanLimits(historyTokens=");
        sb.append(this.historyTokens);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", voicePerDay=");
        return fq2.q(sb, this.voicePerDay, ")");
    }
}
