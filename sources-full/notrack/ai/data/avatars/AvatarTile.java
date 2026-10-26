package notrack.ai.data.avatars;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarTile {
    public static final Companion Companion = new Companion();
    private final String bg;
    private final String fg;

    public final class Companion {
        public final qu1 serializer() {
            return AvatarTile$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvatarTile(String str, String str2, int i) {
        this.bg = (i & 1) == 0 ? BuildConfig.VERSION_NAME : str;
        if ((i & 2) == 0) {
            this.fg = "#ffffff";
        } else {
            this.fg = str2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AvatarTile avatarTile, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(avatarTile.bg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, avatarTile.bg);
        }
        if (!do3Var.w(tf3Var) && kr1.n(avatarTile.fg, "#ffffff")) {
            return;
        }
        do3Var.u(tf3Var, 1, avatarTile.fg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarTile)) {
            return false;
        }
        AvatarTile avatarTile = (AvatarTile) obj;
        return kr1.n(this.bg, avatarTile.bg) && kr1.n(this.fg, avatarTile.fg);
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getFg() {
        return this.fg;
    }

    public final int hashCode() {
        return this.fg.hashCode() + (this.bg.hashCode() * 31);
    }

    public final String toString() {
        return "AvatarTile(bg=" + this.bg + ", fg=" + this.fg + ")";
    }
}
