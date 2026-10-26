package notrack.ai.data.avatars;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.mo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarView {
    public static final Companion Companion = new Companion();
    private static final AvatarView NONE = new AvatarView(null, null, null, null, null, null, null, null, 511);
    private final String bg;
    private final String fg;
    private final int hue;
    private final String initial;
    private final String kind;
    private final String ref;
    private final String slot;
    private final String url;
    private final String urlSm;

    public final class Companion {
        public final qu1 serializer() {
            return AvatarView$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvatarView(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2) {
        this.kind = (i & 1) == 0 ? "none" : str;
        if ((i & 2) == 0) {
            this.slot = "me";
        } else {
            this.slot = str2;
        }
        if ((i & 4) == 0) {
            this.ref = BuildConfig.VERSION_NAME;
        } else {
            this.ref = str3;
        }
        if ((i & 8) == 0) {
            this.url = null;
        } else {
            this.url = str4;
        }
        if ((i & 16) == 0) {
            this.urlSm = null;
        } else {
            this.urlSm = str5;
        }
        if ((i & 32) == 0) {
            this.bg = BuildConfig.VERSION_NAME;
        } else {
            this.bg = str6;
        }
        if ((i & 64) == 0) {
            this.fg = BuildConfig.VERSION_NAME;
        } else {
            this.fg = str7;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.initial = BuildConfig.VERSION_NAME;
        } else {
            this.initial = str8;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.hue = 210;
        } else {
            this.hue = i2;
        }
    }

    public AvatarView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        str = (i & 1) != 0 ? "none" : str;
        str2 = (i & 2) != 0 ? "me" : str2;
        str3 = (i & 4) != 0 ? BuildConfig.VERSION_NAME : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? BuildConfig.VERSION_NAME : str6;
        str7 = (i & 64) != 0 ? BuildConfig.VERSION_NAME : str7;
        str8 = (i & Uuid.SIZE_BITS) != 0 ? BuildConfig.VERSION_NAME : str8;
        str2.getClass();
        str3.getClass();
        str6.getClass();
        str7.getClass();
        this.kind = str;
        this.slot = str2;
        this.ref = str3;
        this.url = str4;
        this.urlSm = str5;
        this.bg = str6;
        this.fg = str7;
        this.initial = str8;
        this.hue = 210;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AvatarView avatarView, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.kind, "none")) {
            do3Var.u(tf3Var, 0, avatarView.kind);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.slot, "me")) {
            do3Var.u(tf3Var, 1, avatarView.slot);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.ref, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, avatarView.ref);
        }
        if (do3Var.w(tf3Var) || avatarView.url != null) {
            do3Var.p(tf3Var, 3, lo3.a, avatarView.url);
        }
        if (do3Var.w(tf3Var) || avatarView.urlSm != null) {
            do3Var.p(tf3Var, 4, lo3.a, avatarView.urlSm);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.bg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, avatarView.bg);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.fg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 6, avatarView.fg);
        }
        if (do3Var.w(tf3Var) || !kr1.n(avatarView.initial, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, avatarView.initial);
        }
        if (!do3Var.w(tf3Var) && avatarView.hue == 210) {
            return;
        }
        do3Var.l(8, avatarView.hue, tf3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarView)) {
            return false;
        }
        AvatarView avatarView = (AvatarView) obj;
        return kr1.n(this.kind, avatarView.kind) && kr1.n(this.slot, avatarView.slot) && kr1.n(this.ref, avatarView.ref) && kr1.n(this.url, avatarView.url) && kr1.n(this.urlSm, avatarView.urlSm) && kr1.n(this.bg, avatarView.bg) && kr1.n(this.fg, avatarView.fg) && kr1.n(this.initial, avatarView.initial) && this.hue == avatarView.hue;
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getFg() {
        return this.fg;
    }

    public final boolean getHasImage() {
        String str;
        String str2 = this.kind;
        return ((!kr1.n(str2, "preset") && !kr1.n(str2, "custom")) || (str = this.url) == null || mo3.C0(str)) ? false : true;
    }

    public final int getHue() {
        return this.hue;
    }

    public final String getInitial() {
        return this.initial;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlSm() {
        return this.urlSm;
    }

    public final int hashCode() {
        int i = ud2.i(ud2.i(this.kind.hashCode() * 31, 31, this.slot), 31, this.ref);
        String str = this.url;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.urlSm;
        return Integer.hashCode(this.hue) + ud2.i(ud2.i(ud2.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.bg), 31, this.fg), 31, this.initial);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("AvatarView(kind=", this.kind, ", slot=", this.slot, ", ref=");
        ud2.v(sbT, this.ref, ", url=", this.url, ", urlSm=");
        ud2.v(sbT, this.urlSm, ", bg=", this.bg, ", fg=");
        ud2.v(sbT, this.fg, ", initial=", this.initial, ", hue=");
        return fq2.q(sbT, this.hue, ")");
    }
}
