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
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class DeletePreview {
    public static final Companion Companion = new Companion();
    private final boolean blocked;
    private final String code;
    private final int daysLeft;
    private final boolean hasPlan;
    private final String nickname;
    private final boolean ok;
    private final String plan;
    private final String source;
    private final boolean willCancel;
    private final boolean willForfeit;

    public final class Companion {
        public final qu1 serializer() {
            return DeletePreview$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeletePreview(int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, int i2, boolean z4, boolean z5, String str4) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        if ((i & 2) == 0) {
            this.blocked = false;
        } else {
            this.blocked = z2;
        }
        if ((i & 4) == 0) {
            this.code = BuildConfig.VERSION_NAME;
        } else {
            this.code = str;
        }
        if ((i & 8) == 0) {
            this.hasPlan = false;
        } else {
            this.hasPlan = z3;
        }
        if ((i & 16) == 0) {
            this.plan = "free";
        } else {
            this.plan = str2;
        }
        if ((i & 32) == 0) {
            this.source = BuildConfig.VERSION_NAME;
        } else {
            this.source = str3;
        }
        if ((i & 64) == 0) {
            this.daysLeft = 0;
        } else {
            this.daysLeft = i2;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.willCancel = false;
        } else {
            this.willCancel = z4;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.willForfeit = false;
        } else {
            this.willForfeit = z5;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str4;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(DeletePreview deletePreview, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || deletePreview.ok) {
            do3Var.c(tf3Var, 0, deletePreview.ok);
        }
        if (do3Var.w(tf3Var) || deletePreview.blocked) {
            do3Var.c(tf3Var, 1, deletePreview.blocked);
        }
        if (do3Var.w(tf3Var) || !kr1.n(deletePreview.code, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, deletePreview.code);
        }
        if (do3Var.w(tf3Var) || deletePreview.hasPlan) {
            do3Var.c(tf3Var, 3, deletePreview.hasPlan);
        }
        if (do3Var.w(tf3Var) || !kr1.n(deletePreview.plan, "free")) {
            do3Var.u(tf3Var, 4, deletePreview.plan);
        }
        if (do3Var.w(tf3Var) || !kr1.n(deletePreview.source, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, deletePreview.source);
        }
        if (do3Var.w(tf3Var) || deletePreview.daysLeft != 0) {
            do3Var.l(6, deletePreview.daysLeft, tf3Var);
        }
        if (do3Var.w(tf3Var) || deletePreview.willCancel) {
            do3Var.c(tf3Var, 7, deletePreview.willCancel);
        }
        if (do3Var.w(tf3Var) || deletePreview.willForfeit) {
            do3Var.c(tf3Var, 8, deletePreview.willForfeit);
        }
        if (!do3Var.w(tf3Var) && deletePreview.nickname == null) {
            return;
        }
        do3Var.p(tf3Var, 9, lo3.a, deletePreview.nickname);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletePreview)) {
            return false;
        }
        DeletePreview deletePreview = (DeletePreview) obj;
        return this.ok == deletePreview.ok && this.blocked == deletePreview.blocked && kr1.n(this.code, deletePreview.code) && this.hasPlan == deletePreview.hasPlan && kr1.n(this.plan, deletePreview.plan) && kr1.n(this.source, deletePreview.source) && this.daysLeft == deletePreview.daysLeft && this.willCancel == deletePreview.willCancel && this.willForfeit == deletePreview.willForfeit && kr1.n(this.nickname, deletePreview.nickname);
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

    public final int getDaysLeft() {
        return this.daysLeft;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final boolean getWillCancel() {
        return this.willCancel;
    }

    public final boolean getWillForfeit() {
        return this.willForfeit;
    }

    public final int hashCode() {
        int iK = ud2.k(ud2.k(fq2.e(this.daysLeft, ud2.i(ud2.i(ud2.k(ud2.i(ud2.k(Boolean.hashCode(this.ok) * 31, 31, this.blocked), 31, this.code), 31, this.hasPlan), 31, this.plan), 31, this.source), 31), 31, this.willCancel), 31, this.willForfeit);
        String str = this.nickname;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeletePreview(ok=");
        sb.append(this.ok);
        sb.append(", blocked=");
        sb.append(this.blocked);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", hasPlan=");
        sb.append(this.hasPlan);
        sb.append(", plan=");
        ud2.v(sb, this.plan, ", source=", this.source, ", daysLeft=");
        sb.append(this.daysLeft);
        sb.append(", willCancel=");
        sb.append(this.willCancel);
        sb.append(", willForfeit=");
        sb.append(this.willForfeit);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(")");
        return sb.toString();
    }
}
