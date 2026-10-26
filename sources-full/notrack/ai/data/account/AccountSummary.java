package notrack.ai.data.account;

import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.avatars.AvatarView$$serializer;

/* JADX INFO: loaded from: classes.dex */
public final class AccountSummary {
    public static final Companion Companion = new Companion();
    private final AvatarView avatar;
    private final AvatarView avatarAi;

    public final class Companion {
        public final qu1 serializer() {
            return AccountSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountSummary(int i, AvatarView avatarView, AvatarView avatarView2) {
        if ((i & 1) == 0) {
            this.avatar = null;
        } else {
            this.avatar = avatarView;
        }
        if ((i & 2) == 0) {
            this.avatarAi = null;
        } else {
            this.avatarAi = avatarView2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AccountSummary accountSummary, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || accountSummary.avatar != null) {
            do3Var.p(tf3Var, 0, AvatarView$$serializer.INSTANCE, accountSummary.avatar);
        }
        if (!do3Var.w(tf3Var) && accountSummary.avatarAi == null) {
            return;
        }
        do3Var.p(tf3Var, 1, AvatarView$$serializer.INSTANCE, accountSummary.avatarAi);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSummary)) {
            return false;
        }
        AccountSummary accountSummary = (AccountSummary) obj;
        return kr1.n(this.avatar, accountSummary.avatar) && kr1.n(this.avatarAi, accountSummary.avatarAi);
    }

    public final AvatarView getAvatar() {
        return this.avatar;
    }

    public final AvatarView getAvatarAi() {
        return this.avatarAi;
    }

    public final int hashCode() {
        AvatarView avatarView = this.avatar;
        int iHashCode = (avatarView == null ? 0 : avatarView.hashCode()) * 31;
        AvatarView avatarView2 = this.avatarAi;
        return iHashCode + (avatarView2 != null ? avatarView2.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSummary(avatar=" + this.avatar + ", avatarAi=" + this.avatarAi + ")";
    }
}
