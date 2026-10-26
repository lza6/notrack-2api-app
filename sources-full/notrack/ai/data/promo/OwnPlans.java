package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class OwnPlans {
    public static final Companion Companion = new Companion();
    private final String badgePro;
    private final String cellModels;
    private final String cellNoAds;
    private final String cellPlusMem;
    private final String cellProAll;
    private final String cellProLimits;
    private final String cellProQueue;
    private final String now;
    private final String perMonth;

    public final class Companion {
        public final qu1 serializer() {
            return OwnPlans$$serializer.INSTANCE;
        }
    }

    public OwnPlans() {
        this.now = BuildConfig.VERSION_NAME;
        this.perMonth = BuildConfig.VERSION_NAME;
        this.badgePro = BuildConfig.VERSION_NAME;
        this.cellPlusMem = BuildConfig.VERSION_NAME;
        this.cellModels = BuildConfig.VERSION_NAME;
        this.cellProAll = BuildConfig.VERSION_NAME;
        this.cellProLimits = BuildConfig.VERSION_NAME;
        this.cellProQueue = BuildConfig.VERSION_NAME;
        this.cellNoAds = BuildConfig.VERSION_NAME;
    }

    public /* synthetic */ OwnPlans(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if ((i & 1) == 0) {
            this.now = BuildConfig.VERSION_NAME;
        } else {
            this.now = str;
        }
        if ((i & 2) == 0) {
            this.perMonth = BuildConfig.VERSION_NAME;
        } else {
            this.perMonth = str2;
        }
        if ((i & 4) == 0) {
            this.badgePro = BuildConfig.VERSION_NAME;
        } else {
            this.badgePro = str3;
        }
        if ((i & 8) == 0) {
            this.cellPlusMem = BuildConfig.VERSION_NAME;
        } else {
            this.cellPlusMem = str4;
        }
        if ((i & 16) == 0) {
            this.cellModels = BuildConfig.VERSION_NAME;
        } else {
            this.cellModels = str5;
        }
        if ((i & 32) == 0) {
            this.cellProAll = BuildConfig.VERSION_NAME;
        } else {
            this.cellProAll = str6;
        }
        if ((i & 64) == 0) {
            this.cellProLimits = BuildConfig.VERSION_NAME;
        } else {
            this.cellProLimits = str7;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.cellProQueue = BuildConfig.VERSION_NAME;
        } else {
            this.cellProQueue = str8;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.cellNoAds = BuildConfig.VERSION_NAME;
        } else {
            this.cellNoAds = str9;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(OwnPlans ownPlans, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.now, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, ownPlans.now);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.perMonth, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, ownPlans.perMonth);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.badgePro, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, ownPlans.badgePro);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.cellPlusMem, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, ownPlans.cellPlusMem);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.cellModels, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, ownPlans.cellModels);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.cellProAll, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, ownPlans.cellProAll);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.cellProLimits, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 6, ownPlans.cellProLimits);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownPlans.cellProQueue, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, ownPlans.cellProQueue);
        }
        if (!do3Var.w(tf3Var) && kr1.n(ownPlans.cellNoAds, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 8, ownPlans.cellNoAds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnPlans)) {
            return false;
        }
        OwnPlans ownPlans = (OwnPlans) obj;
        return kr1.n(this.now, ownPlans.now) && kr1.n(this.perMonth, ownPlans.perMonth) && kr1.n(this.badgePro, ownPlans.badgePro) && kr1.n(this.cellPlusMem, ownPlans.cellPlusMem) && kr1.n(this.cellModels, ownPlans.cellModels) && kr1.n(this.cellProAll, ownPlans.cellProAll) && kr1.n(this.cellProLimits, ownPlans.cellProLimits) && kr1.n(this.cellProQueue, ownPlans.cellProQueue) && kr1.n(this.cellNoAds, ownPlans.cellNoAds);
    }

    public final String getBadgePro() {
        return this.badgePro;
    }

    public final String getCellModels() {
        return this.cellModels;
    }

    public final String getCellNoAds() {
        return this.cellNoAds;
    }

    public final String getCellPlusMem() {
        return this.cellPlusMem;
    }

    public final String getCellProAll() {
        return this.cellProAll;
    }

    public final String getCellProLimits() {
        return this.cellProLimits;
    }

    public final String getCellProQueue() {
        return this.cellProQueue;
    }

    public final String getNow() {
        return this.now;
    }

    public final String getPerMonth() {
        return this.perMonth;
    }

    public final int hashCode() {
        return this.cellNoAds.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(this.now.hashCode() * 31, 31, this.perMonth), 31, this.badgePro), 31, this.cellPlusMem), 31, this.cellModels), 31, this.cellProAll), 31, this.cellProLimits), 31, this.cellProQueue);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("OwnPlans(now=", this.now, ", perMonth=", this.perMonth, ", badgePro=");
        ud2.v(sbT, this.badgePro, ", cellPlusMem=", this.cellPlusMem, ", cellModels=");
        ud2.v(sbT, this.cellModels, ", cellProAll=", this.cellProAll, ", cellProLimits=");
        ud2.v(sbT, this.cellProLimits, ", cellProQueue=", this.cellProQueue, ", cellNoAds=");
        return fq2.r(sbT, this.cellNoAds, ")");
    }
}
