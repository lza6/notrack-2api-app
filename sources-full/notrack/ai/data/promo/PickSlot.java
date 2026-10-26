package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PickSlot {
    public static final Companion Companion = new Companion();
    private final String accent;
    private final String bg;
    private final String bgDark;
    private final String clickUrl;
    private final String cta;
    private final int dismissDays;
    private final boolean enabled;
    private final String fg;
    private final String icon;
    private final String label;
    private final String style;
    private final String sub;
    private final String theme;
    private final String title;

    public final class Companion {
        public final qu1 serializer() {
            return PickSlot$$serializer.INSTANCE;
        }
    }

    public PickSlot() {
        this.enabled = false;
        this.clickUrl = BuildConfig.VERSION_NAME;
        this.label = "Sponsored";
        this.title = BuildConfig.VERSION_NAME;
        this.sub = BuildConfig.VERSION_NAME;
        this.cta = BuildConfig.VERSION_NAME;
        this.dismissDays = 7;
        this.theme = BuildConfig.VERSION_NAME;
        this.accent = BuildConfig.VERSION_NAME;
        this.bg = BuildConfig.VERSION_NAME;
        this.bgDark = BuildConfig.VERSION_NAME;
        this.fg = BuildConfig.VERSION_NAME;
        this.icon = BuildConfig.VERSION_NAME;
        this.style = BuildConfig.VERSION_NAME;
    }

    public /* synthetic */ PickSlot(int i, boolean z, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.clickUrl = BuildConfig.VERSION_NAME;
        } else {
            this.clickUrl = str;
        }
        if ((i & 4) == 0) {
            this.label = "Sponsored";
        } else {
            this.label = str2;
        }
        if ((i & 8) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.sub = BuildConfig.VERSION_NAME;
        } else {
            this.sub = str4;
        }
        if ((i & 32) == 0) {
            this.cta = BuildConfig.VERSION_NAME;
        } else {
            this.cta = str5;
        }
        if ((i & 64) == 0) {
            this.dismissDays = 7;
        } else {
            this.dismissDays = i2;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.theme = BuildConfig.VERSION_NAME;
        } else {
            this.theme = str6;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.accent = BuildConfig.VERSION_NAME;
        } else {
            this.accent = str7;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.bg = BuildConfig.VERSION_NAME;
        } else {
            this.bg = str8;
        }
        if ((i & 1024) == 0) {
            this.bgDark = BuildConfig.VERSION_NAME;
        } else {
            this.bgDark = str9;
        }
        if ((i & 2048) == 0) {
            this.fg = BuildConfig.VERSION_NAME;
        } else {
            this.fg = str10;
        }
        if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
            this.icon = BuildConfig.VERSION_NAME;
        } else {
            this.icon = str11;
        }
        if ((i & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
            this.style = BuildConfig.VERSION_NAME;
        } else {
            this.style = str12;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PickSlot pickSlot, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || pickSlot.enabled) {
            do3Var.c(tf3Var, 0, pickSlot.enabled);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.clickUrl, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, pickSlot.clickUrl);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.label, "Sponsored")) {
            do3Var.u(tf3Var, 2, pickSlot.label);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.title, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, pickSlot.title);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.sub, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, pickSlot.sub);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.cta, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, pickSlot.cta);
        }
        if (do3Var.w(tf3Var) || pickSlot.dismissDays != 7) {
            do3Var.l(6, pickSlot.dismissDays, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.theme, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, pickSlot.theme);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.accent, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 8, pickSlot.accent);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.bg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 9, pickSlot.bg);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.bgDark, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 10, pickSlot.bgDark);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.fg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 11, pickSlot.fg);
        }
        if (do3Var.w(tf3Var) || !kr1.n(pickSlot.icon, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 12, pickSlot.icon);
        }
        if (!do3Var.w(tf3Var) && kr1.n(pickSlot.style, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 13, pickSlot.style);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickSlot)) {
            return false;
        }
        PickSlot pickSlot = (PickSlot) obj;
        return this.enabled == pickSlot.enabled && kr1.n(this.clickUrl, pickSlot.clickUrl) && kr1.n(this.label, pickSlot.label) && kr1.n(this.title, pickSlot.title) && kr1.n(this.sub, pickSlot.sub) && kr1.n(this.cta, pickSlot.cta) && this.dismissDays == pickSlot.dismissDays && kr1.n(this.theme, pickSlot.theme) && kr1.n(this.accent, pickSlot.accent) && kr1.n(this.bg, pickSlot.bg) && kr1.n(this.bgDark, pickSlot.bgDark) && kr1.n(this.fg, pickSlot.fg) && kr1.n(this.icon, pickSlot.icon) && kr1.n(this.style, pickSlot.style);
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getBgDark() {
        return this.bgDark;
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getCta() {
        return this.cta;
    }

    public final int getDismissDays() {
        return this.dismissDays;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFg() {
        return this.fg;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.style.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(fq2.e(this.dismissDays, ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(Boolean.hashCode(this.enabled) * 31, 31, this.clickUrl), 31, this.label), 31, this.title), 31, this.sub), 31, this.cta), 31), 31, this.theme), 31, this.accent), 31, this.bg), 31, this.bgDark), 31, this.fg), 31, this.icon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickSlot(enabled=");
        sb.append(this.enabled);
        sb.append(", clickUrl=");
        sb.append(this.clickUrl);
        sb.append(", label=");
        ud2.v(sb, this.label, ", title=", this.title, ", sub=");
        ud2.v(sb, this.sub, ", cta=", this.cta, ", dismissDays=");
        sb.append(this.dismissDays);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", accent=");
        ud2.v(sb, this.accent, ", bg=", this.bg, ", bgDark=");
        ud2.v(sb, this.bgDark, ", fg=", this.fg, ", icon=");
        sb.append(this.icon);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(")");
        return sb.toString();
    }
}
