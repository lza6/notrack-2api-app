package notrack.ai.data.api;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.b72;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class VisionQuotaError {
    private final String error;
    private final int limit;
    private final String plan;
    private final Map<String, Integer> quotas;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, yo4.H(q22.c, new b72(19))};

    public final class Companion {
        public final qu1 serializer() {
            return VisionQuotaError$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VisionQuotaError(int i, int i2, String str, String str2, Map map) {
        this.error = (i & 1) == 0 ? BuildConfig.VERSION_NAME : str;
        if ((i & 2) == 0) {
            this.plan = "free";
        } else {
            this.plan = str2;
        }
        this.limit = (i & 4) == 0 ? 0 : i2;
        if ((i & 8) == 0) {
            this.quotas = a31.c;
        } else {
            this.quotas = map;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(VisionQuotaError visionQuotaError, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(visionQuotaError.error, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, visionQuotaError.error);
        }
        if (do3Var.w(tf3Var) || !kr1.n(visionQuotaError.plan, "free")) {
            do3Var.u(tf3Var, 1, visionQuotaError.plan);
        }
        if (do3Var.w(tf3Var) || visionQuotaError.limit != 0) {
            do3Var.l(2, visionQuotaError.limit, tf3Var);
        }
        if (!do3Var.w(tf3Var) && kr1.n(visionQuotaError.quotas, a31.c)) {
            return;
        }
        do3Var.q(tf3Var, 3, (qu1) $childSerializers[3].getValue(), visionQuotaError.quotas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisionQuotaError)) {
            return false;
        }
        VisionQuotaError visionQuotaError = (VisionQuotaError) obj;
        return kr1.n(this.error, visionQuotaError.error) && kr1.n(this.plan, visionQuotaError.plan) && this.limit == visionQuotaError.limit && kr1.n(this.quotas, visionQuotaError.quotas);
    }

    public final String getError() {
        return this.error;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final Map<String, Integer> getQuotas() {
        return this.quotas;
    }

    public final int hashCode() {
        return this.quotas.hashCode() + fq2.e(this.limit, ud2.i(this.error.hashCode() * 31, 31, this.plan), 31);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("VisionQuotaError(error=", this.error, ", plan=", this.plan, ", limit=");
        sbT.append(this.limit);
        sbT.append(", quotas=");
        sbT.append(this.quotas);
        sbT.append(")");
        return sbT.toString();
    }
}
