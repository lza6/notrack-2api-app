package defpackage;

import notrack.ai.data.avatars.AvatarView;

/* JADX INFO: loaded from: classes.dex */
public final class tq extends vq {
    public final AvatarView a;

    public tq(AvatarView avatarView) {
        this.a = avatarView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq) && this.a.equals(((tq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ok(view=" + this.a + ")";
    }
}
