package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.mo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BonusBar {
    public static final Companion Companion = new Companion();
    private final String accent;
    private final String bg;
    private final String cta;
    private final String dismiss;
    private final int hideHours;
    private final String icon;
    private final String lang;
    private final String name;
    private final String sub;
    private final String text;
    private final String theme;
    private final String url;

    public final class Companion {
        public final qu1 serializer() {
            return BonusBar$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BonusBar(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, String str9, String str10, String str11) {
        if ((i & 1) == 0) {
            this.url = BuildConfig.VERSION_NAME;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.name = BuildConfig.VERSION_NAME;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.text = BuildConfig.VERSION_NAME;
        } else {
            this.text = str3;
        }
        if ((i & 8) == 0) {
            this.sub = BuildConfig.VERSION_NAME;
        } else {
            this.sub = str4;
        }
        if ((i & 16) == 0) {
            this.cta = BuildConfig.VERSION_NAME;
        } else {
            this.cta = str5;
        }
        if ((i & 32) == 0) {
            this.dismiss = BuildConfig.VERSION_NAME;
        } else {
            this.dismiss = str6;
        }
        if ((i & 64) == 0) {
            this.hideHours = 24;
        } else {
            this.hideHours = i2;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.lang = BuildConfig.VERSION_NAME;
        } else {
            this.lang = str7;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.theme = BuildConfig.VERSION_NAME;
        } else {
            this.theme = str8;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.accent = BuildConfig.VERSION_NAME;
        } else {
            this.accent = str9;
        }
        if ((i & 1024) == 0) {
            this.bg = BuildConfig.VERSION_NAME;
        } else {
            this.bg = str10;
        }
        if ((i & 2048) == 0) {
            this.icon = BuildConfig.VERSION_NAME;
        } else {
            this.icon = str11;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(BonusBar bonusBar, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.url, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, bonusBar.url);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.name, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, bonusBar.name);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.text, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, bonusBar.text);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.sub, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, bonusBar.sub);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.cta, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 4, bonusBar.cta);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.dismiss, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 5, bonusBar.dismiss);
        }
        if (do3Var.w(tf3Var) || bonusBar.hideHours != 24) {
            do3Var.l(6, bonusBar.hideHours, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.lang, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 7, bonusBar.lang);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.theme, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 8, bonusBar.theme);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.accent, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 9, bonusBar.accent);
        }
        if (do3Var.w(tf3Var) || !kr1.n(bonusBar.bg, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 10, bonusBar.bg);
        }
        if (!do3Var.w(tf3Var) && kr1.n(bonusBar.icon, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 11, bonusBar.icon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusBar)) {
            return false;
        }
        BonusBar bonusBar = (BonusBar) obj;
        return kr1.n(this.url, bonusBar.url) && kr1.n(this.name, bonusBar.name) && kr1.n(this.text, bonusBar.text) && kr1.n(this.sub, bonusBar.sub) && kr1.n(this.cta, bonusBar.cta) && kr1.n(this.dismiss, bonusBar.dismiss) && this.hideHours == bonusBar.hideHours && kr1.n(this.lang, bonusBar.lang) && kr1.n(this.theme, bonusBar.theme) && kr1.n(this.accent, bonusBar.accent) && kr1.n(this.bg, bonusBar.bg) && kr1.n(this.icon, bonusBar.icon);
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDismiss() {
        return this.dismiss;
    }

    public final int getHideHours() {
        return this.hideHours;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.icon.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(fq2.e(this.hideHours, ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(this.url.hashCode() * 31, 31, this.name), 31, this.text), 31, this.sub), 31, this.cta), 31, this.dismiss), 31), 31, this.lang), 31, this.theme), 31, this.accent), 31, this.bg);
    }

    public final boolean isValid() {
        return (mo3.C0(this.url) || mo3.C0(this.text)) ? false : true;
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("BonusBar(url=", this.url, ", name=", this.name, ", text=");
        ud2.v(sbT, this.text, ", sub=", this.sub, ", cta=");
        ud2.v(sbT, this.cta, ", dismiss=", this.dismiss, ", hideHours=");
        sbT.append(this.hideHours);
        sbT.append(", lang=");
        sbT.append(this.lang);
        sbT.append(", theme=");
        ud2.v(sbT, this.theme, ", accent=", this.accent, ", bg=");
        sbT.append(this.bg);
        sbT.append(", icon=");
        sbT.append(this.icon);
        sbT.append(")");
        return sbT.toString();
    }
}
