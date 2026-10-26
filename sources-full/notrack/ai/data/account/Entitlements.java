package notrack.ai.data.account;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.avatars.AvatarView$$serializer;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class Entitlements {
    private static final Entitlements ANONYMOUS;
    public static final Companion Companion;
    private final String accountId;
    private final boolean ads;
    private final boolean ageVerified;
    private final AvatarView avatar;
    private final AvatarView avatarAi;
    private final int credits;
    private final PlanLimits limits;
    private final String nickname;
    private final String periodEnd;
    private final String plan;
    private final boolean planActive;
    private final boolean signedIn;
    private final String source;

    public final class Companion {
        public final qu1 serializer() {
            return Entitlements$$serializer.INSTANCE;
        }
    }

    static {
        System.loadLibrary("null");
        Companion = new Companion();
        ANONYMOUS = new Entitlements(null, null, false, false, null, null, 8191);
    }

    public /* synthetic */ Entitlements(int i, boolean z, String str, String str2, String str3, boolean z2, String str4, int i2, boolean z3, boolean z4, String str5, PlanLimits planLimits, AvatarView avatarView, AvatarView avatarView2) {
        if ((i & 1) == 0) {
            this.signedIn = false;
        } else {
            this.signedIn = z;
        }
        if ((i & 2) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
        if ((i & 4) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str2;
        }
        if ((i & 8) == 0) {
            this.plan = "free";
        } else {
            this.plan = str3;
        }
        if ((i & 16) == 0) {
            this.planActive = false;
        } else {
            this.planActive = z2;
        }
        if ((i & 32) == 0) {
            this.periodEnd = null;
        } else {
            this.periodEnd = str4;
        }
        if ((i & 64) == 0) {
            this.credits = 0;
        } else {
            this.credits = i2;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.ads = true;
        } else {
            this.ads = z3;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.ageVerified = false;
        } else {
            this.ageVerified = z4;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.source = BuildConfig.VERSION_NAME;
        } else {
            this.source = str5;
        }
        if ((i & 1024) == 0) {
            this.limits = new PlanLimits();
        } else {
            this.limits = planLimits;
        }
        if ((i & 2048) == 0) {
            this.avatar = null;
        } else {
            this.avatar = avatarView;
        }
        if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
            this.avatarAi = null;
        } else {
            this.avatarAi = avatarView2;
        }
    }

    public /* synthetic */ Entitlements(String str, String str2, boolean z, boolean z2, AvatarView avatarView, AvatarView avatarView2, int i) {
        this((i & 1) == 0, null, (i & 4) != 0 ? null : str, (i & 8) != 0 ? "free" : str2, (i & 16) != 0 ? false : z, null, 0, (i & Uuid.SIZE_BITS) != 0 ? true : z2, false, BuildConfig.VERSION_NAME, new PlanLimits(), (i & 2048) != 0 ? null : avatarView, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : avatarView2);
    }

    public Entitlements(boolean z, String str, String str2, String str3, boolean z2, String str4, int i, boolean z3, boolean z4, String str5, PlanLimits planLimits, AvatarView avatarView, AvatarView avatarView2) {
        str3.getClass();
        this.signedIn = z;
        this.accountId = str;
        this.nickname = str2;
        this.plan = str3;
        this.planActive = z2;
        this.periodEnd = str4;
        this.credits = i;
        this.ads = z3;
        this.ageVerified = z4;
        this.source = str5;
        this.limits = planLimits;
        this.avatar = avatarView;
        this.avatarAi = avatarView2;
    }

    public static Entitlements copy$default(Entitlements entitlements, AvatarView avatarView, AvatarView avatarView2, int i) {
        boolean z = entitlements.signedIn;
        String str = entitlements.accountId;
        String str2 = entitlements.nickname;
        String str3 = entitlements.plan;
        boolean z2 = entitlements.planActive;
        String str4 = entitlements.periodEnd;
        int i2 = entitlements.credits;
        boolean z3 = entitlements.ads;
        boolean z4 = entitlements.ageVerified;
        String str5 = entitlements.source;
        PlanLimits planLimits = entitlements.limits;
        AvatarView avatarView3 = (i & 2048) != 0 ? entitlements.avatar : avatarView;
        AvatarView avatarView4 = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? entitlements.avatarAi : avatarView2;
        entitlements.getClass();
        str3.getClass();
        str5.getClass();
        planLimits.getClass();
        return new Entitlements(z, str, str2, str3, z2, str4, i2, z3, z4, str5, planLimits, avatarView3, avatarView4);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(Entitlements entitlements, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || entitlements.signedIn) {
            do3Var.c(tf3Var, 0, entitlements.signedIn);
        }
        if (do3Var.w(tf3Var) || entitlements.accountId != null) {
            do3Var.p(tf3Var, 1, lo3.a, entitlements.accountId);
        }
        if (do3Var.w(tf3Var) || entitlements.nickname != null) {
            do3Var.p(tf3Var, 2, lo3.a, entitlements.nickname);
        }
        if (do3Var.w(tf3Var) || !kr1.n(entitlements.plan, "free")) {
            do3Var.u(tf3Var, 3, entitlements.plan);
        }
        if (do3Var.w(tf3Var) || entitlements.planActive) {
            do3Var.c(tf3Var, 4, entitlements.planActive);
        }
        if (do3Var.w(tf3Var) || entitlements.periodEnd != null) {
            do3Var.p(tf3Var, 5, lo3.a, entitlements.periodEnd);
        }
        if (do3Var.w(tf3Var) || entitlements.credits != 0) {
            do3Var.l(6, entitlements.credits, tf3Var);
        }
        if (do3Var.w(tf3Var) || !entitlements.ads) {
            do3Var.c(tf3Var, 7, entitlements.ads);
        }
        if (do3Var.w(tf3Var) || entitlements.ageVerified) {
            do3Var.c(tf3Var, 8, entitlements.ageVerified);
        }
        if (do3Var.w(tf3Var) || !kr1.n(entitlements.source, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 9, entitlements.source);
        }
        if (do3Var.w(tf3Var) || !kr1.n(entitlements.limits, new PlanLimits())) {
            do3Var.q(tf3Var, 10, PlanLimits$$serializer.INSTANCE, entitlements.limits);
        }
        if (do3Var.w(tf3Var) || entitlements.avatar != null) {
            do3Var.p(tf3Var, 11, AvatarView$$serializer.INSTANCE, entitlements.avatar);
        }
        if (!do3Var.w(tf3Var) && entitlements.avatarAi == null) {
            return;
        }
        do3Var.p(tf3Var, 12, AvatarView$$serializer.INSTANCE, entitlements.avatarAi);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entitlements)) {
            return false;
        }
        Entitlements entitlements = (Entitlements) obj;
        return this.signedIn == entitlements.signedIn && kr1.n(this.accountId, entitlements.accountId) && kr1.n(this.nickname, entitlements.nickname) && kr1.n(this.plan, entitlements.plan) && this.planActive == entitlements.planActive && kr1.n(this.periodEnd, entitlements.periodEnd) && this.credits == entitlements.credits && this.ads == entitlements.ads && this.ageVerified == entitlements.ageVerified && kr1.n(this.source, entitlements.source) && kr1.n(this.limits, entitlements.limits) && kr1.n(this.avatar, entitlements.avatar) && kr1.n(this.avatarAi, entitlements.avatarAi);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final boolean getAds() {
        return false;
    }

    public final AvatarView getAvatar() {
        return this.avatar;
    }

    public final AvatarView getAvatarAi() {
        return this.avatarAi;
    }

    public final native int getCredits();

    public final String getNickname() {
        return this.nickname;
    }

    public final String getPeriodEnd() {
        return this.periodEnd;
    }

    public final String getPlan() {
        return "pro";
    }

    public final boolean getPlanActive() {
        return true;
    }

    public final boolean getSignedIn() {
        return true;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.signedIn) * 31;
        String str = this.accountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int iK = ud2.k(ud2.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.plan), 31, this.planActive);
        String str3 = this.periodEnd;
        int iHashCode3 = (this.limits.hashCode() + ud2.i(ud2.k(ud2.k(fq2.e(this.credits, (iK + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.ads), 31, this.ageVerified), 31, this.source)) * 31;
        AvatarView avatarView = this.avatar;
        int iHashCode4 = (iHashCode3 + (avatarView == null ? 0 : avatarView.hashCode())) * 31;
        AvatarView avatarView2 = this.avatarAi;
        return iHashCode4 + (avatarView2 != null ? avatarView2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entitlements(signedIn=");
        sb.append(this.signedIn);
        sb.append(", accountId=");
        sb.append(this.accountId);
        sb.append(", nickname=");
        ud2.v(sb, this.nickname, ", plan=", this.plan, ", planActive=");
        sb.append(this.planActive);
        sb.append(", periodEnd=");
        sb.append(this.periodEnd);
        sb.append(", credits=");
        sb.append(this.credits);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", ageVerified=");
        sb.append(this.ageVerified);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", limits=");
        sb.append(this.limits);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", avatarAi=");
        sb.append(this.avatarAi);
        sb.append(")");
        return sb.toString();
    }
}
