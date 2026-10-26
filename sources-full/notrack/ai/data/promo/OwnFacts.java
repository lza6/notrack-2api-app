package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class OwnFacts {
    public static final Companion Companion = new Companion();
    private final int freePairs;
    private final int memMult;
    private final int paidPairs;
    private final String plusUsd;
    private final String plusYear;
    private final String proUsd;
    private final String proYear;

    public final class Companion {
        public final qu1 serializer() {
            return OwnFacts$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OwnFacts() {
        this(0, 0, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
    }

    public /* synthetic */ OwnFacts(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.freePairs = 0;
        } else {
            this.freePairs = i2;
        }
        if ((i & 2) == 0) {
            this.memMult = 0;
        } else {
            this.memMult = i3;
        }
        if ((i & 4) == 0) {
            this.paidPairs = 0;
        } else {
            this.paidPairs = i4;
        }
        if ((i & 8) == 0) {
            this.plusUsd = BuildConfig.VERSION_NAME;
        } else {
            this.plusUsd = str;
        }
        if ((i & 16) == 0) {
            this.proUsd = BuildConfig.VERSION_NAME;
        } else {
            this.proUsd = str2;
        }
        if ((i & 32) == 0) {
            this.plusYear = BuildConfig.VERSION_NAME;
        } else {
            this.plusYear = str3;
        }
        if ((i & 64) == 0) {
            this.proYear = BuildConfig.VERSION_NAME;
        } else {
            this.proYear = str4;
        }
    }

    public OwnFacts(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.freePairs = i;
        this.memMult = i2;
        this.paidPairs = i3;
        this.plusUsd = str;
        this.proUsd = str2;
        this.plusYear = str3;
        this.proYear = str4;
    }

    public static OwnFacts copy$default(OwnFacts ownFacts) {
        int i = ownFacts.freePairs;
        int i2 = ownFacts.memMult;
        int i3 = ownFacts.paidPairs;
        ownFacts.getClass();
        return new OwnFacts(i, i2, i3, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(OwnFacts ownFacts, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || ownFacts.freePairs != 0) {
            do3Var.l(0, ownFacts.freePairs, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownFacts.memMult != 0) {
            do3Var.l(1, ownFacts.memMult, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownFacts.paidPairs != 0) {
            do3Var.l(2, ownFacts.paidPairs, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownFacts.plusUsd, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, ownFacts.plusUsd);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownFacts.proUsd, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, ownFacts.proUsd);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownFacts.plusYear, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, ownFacts.plusYear);
        }
        if (!do3Var.w(tf3Var) && kr1.n(ownFacts.proYear, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 6, ownFacts.proYear);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnFacts)) {
            return false;
        }
        OwnFacts ownFacts = (OwnFacts) obj;
        return this.freePairs == ownFacts.freePairs && this.memMult == ownFacts.memMult && this.paidPairs == ownFacts.paidPairs && kr1.n(this.plusUsd, ownFacts.plusUsd) && kr1.n(this.proUsd, ownFacts.proUsd) && kr1.n(this.plusYear, ownFacts.plusYear) && kr1.n(this.proYear, ownFacts.proYear);
    }

    public final int getFreePairs() {
        return this.freePairs;
    }

    public final int getMemMult() {
        return this.memMult;
    }

    public final int getPaidPairs() {
        return this.paidPairs;
    }

    public final String getPlusUsd() {
        return this.plusUsd;
    }

    public final String getProUsd() {
        return this.proUsd;
    }

    public final int hashCode() {
        return this.proYear.hashCode() + ud2.i(ud2.i(ud2.i(fq2.e(this.paidPairs, fq2.e(this.memMult, Integer.hashCode(this.freePairs) * 31, 31), 31), 31, this.plusUsd), 31, this.proUsd), 31, this.plusYear);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnFacts(freePairs=");
        sb.append(this.freePairs);
        sb.append(", memMult=");
        sb.append(this.memMult);
        sb.append(", paidPairs=");
        sb.append(this.paidPairs);
        sb.append(", plusUsd=");
        sb.append(this.plusUsd);
        sb.append(", proUsd=");
        ud2.v(sb, this.proUsd, ", plusYear=", this.plusYear, ", proYear=");
        return fq2.r(sb, this.proYear, ")");
    }
}
