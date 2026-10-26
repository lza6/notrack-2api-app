package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.b72;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PromoConfig {
    private final PromoCopy card;
    private final int compThreshold;
    private final int cooldownH;
    private final boolean enabled;
    private final String geoPrimary;
    private final String linkCandy;
    private final String linkSmart;
    private final int maxPerSession;
    private final OwnConfig own;
    private final PickSlot pickSlot;
    private final PromoRegex regex;
    private final int verticalCooldownH;
    private final Map<String, String> verticalOf;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, null, null, null, null, yo4.H(q22.c, new b72(11)), null, null, null, null, null};
    private static final PromoConfig DEFAULT = new PromoConfig(new PromoRegex(24576));

    public final class Companion {
        public final qu1 serializer() {
            return PromoConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PromoConfig(int i, boolean z, String str, String str2, String str3, int i2, int i3, int i4, Map map, int i5, PromoRegex promoRegex, PromoCopy promoCopy, PickSlot pickSlot, OwnConfig ownConfig) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.linkCandy = BuildConfig.VERSION_NAME;
        } else {
            this.linkCandy = str;
        }
        if ((i & 4) == 0) {
            this.linkSmart = BuildConfig.VERSION_NAME;
        } else {
            this.linkSmart = str2;
        }
        if ((i & 8) == 0) {
            this.geoPrimary = "smart";
        } else {
            this.geoPrimary = str3;
        }
        if ((i & 16) == 0) {
            this.maxPerSession = 1;
        } else {
            this.maxPerSession = i2;
        }
        if ((i & 32) == 0) {
            this.cooldownH = 24;
        } else {
            this.cooldownH = i3;
        }
        if ((i & 64) == 0) {
            this.compThreshold = 3;
        } else {
            this.compThreshold = i4;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.verticalOf = a31.c;
        } else {
            this.verticalOf = map;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.verticalCooldownH = 24;
        } else {
            this.verticalCooldownH = i5;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.regex = new PromoRegex(131071);
        } else {
            this.regex = promoRegex;
        }
        if ((i & 1024) == 0) {
            this.card = new PromoCopy();
        } else {
            this.card = promoCopy;
        }
        if ((i & 2048) == 0) {
            this.pickSlot = new PickSlot();
        } else {
            this.pickSlot = pickSlot;
        }
        if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0) {
            this.own = new OwnConfig();
        } else {
            this.own = ownConfig;
        }
    }

    public PromoConfig(PromoRegex promoRegex) {
        PromoCopy promoCopy = new PromoCopy();
        PickSlot pickSlot = new PickSlot();
        OwnConfig ownConfig = new OwnConfig();
        this.enabled = false;
        this.linkCandy = "https://notrack.ai/b.php";
        this.linkSmart = "https://notrack.ai/b.php";
        this.geoPrimary = "smart";
        this.maxPerSession = 1;
        this.cooldownH = 24;
        this.compThreshold = 3;
        this.verticalOf = a31.c;
        this.verticalCooldownH = 24;
        this.regex = promoRegex;
        this.card = promoCopy;
        this.pickSlot = pickSlot;
        this.own = ownConfig;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PromoConfig promoConfig, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || promoConfig.enabled) {
            do3Var.c(tf3Var, 0, promoConfig.enabled);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.linkCandy, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, promoConfig.linkCandy);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.linkSmart, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, promoConfig.linkSmart);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.geoPrimary, "smart")) {
            do3Var.u(tf3Var, 3, promoConfig.geoPrimary);
        }
        if (do3Var.w(tf3Var) || promoConfig.maxPerSession != 1) {
            do3Var.l(4, promoConfig.maxPerSession, tf3Var);
        }
        if (do3Var.w(tf3Var) || promoConfig.cooldownH != 24) {
            do3Var.l(5, promoConfig.cooldownH, tf3Var);
        }
        if (do3Var.w(tf3Var) || promoConfig.compThreshold != 3) {
            do3Var.l(6, promoConfig.compThreshold, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.verticalOf, a31.c)) {
            do3Var.q(tf3Var, 7, (qu1) $childSerializers[7].getValue(), promoConfig.verticalOf);
        }
        if (do3Var.w(tf3Var) || promoConfig.verticalCooldownH != 24) {
            do3Var.l(8, promoConfig.verticalCooldownH, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.regex, new PromoRegex(131071))) {
            do3Var.q(tf3Var, 9, PromoRegex$$serializer.INSTANCE, promoConfig.regex);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.card, new PromoCopy())) {
            do3Var.q(tf3Var, 10, PromoCopy$$serializer.INSTANCE, promoConfig.card);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoConfig.pickSlot, new PickSlot())) {
            do3Var.q(tf3Var, 11, PickSlot$$serializer.INSTANCE, promoConfig.pickSlot);
        }
        if (!do3Var.w(tf3Var) && kr1.n(promoConfig.own, new OwnConfig())) {
            return;
        }
        do3Var.q(tf3Var, 12, OwnConfig$$serializer.INSTANCE, promoConfig.own);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoConfig)) {
            return false;
        }
        PromoConfig promoConfig = (PromoConfig) obj;
        return this.enabled == promoConfig.enabled && kr1.n(this.linkCandy, promoConfig.linkCandy) && kr1.n(this.linkSmart, promoConfig.linkSmart) && kr1.n(this.geoPrimary, promoConfig.geoPrimary) && this.maxPerSession == promoConfig.maxPerSession && this.cooldownH == promoConfig.cooldownH && this.compThreshold == promoConfig.compThreshold && kr1.n(this.verticalOf, promoConfig.verticalOf) && this.verticalCooldownH == promoConfig.verticalCooldownH && kr1.n(this.regex, promoConfig.regex) && kr1.n(this.card, promoConfig.card) && kr1.n(this.pickSlot, promoConfig.pickSlot) && kr1.n(this.own, promoConfig.own);
    }

    public final PromoCopy getCard() {
        return this.card;
    }

    public final int getCompThreshold() {
        return this.compThreshold;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getGeoPrimary() {
        return this.geoPrimary;
    }

    public final String getLinkCandy() {
        return this.linkCandy;
    }

    public final String getLinkSmart() {
        return this.linkSmart;
    }

    public final OwnConfig getOwn() {
        return this.own;
    }

    public final PickSlot getPickSlot() {
        return this.pickSlot;
    }

    public final PromoRegex getRegex() {
        return this.regex;
    }

    public final int getVerticalCooldownH() {
        return this.verticalCooldownH;
    }

    public final Map<String, String> getVerticalOf() {
        return this.verticalOf;
    }

    public final int hashCode() {
        return this.own.hashCode() + ((this.pickSlot.hashCode() + ((this.card.hashCode() + ((this.regex.hashCode() + fq2.e(this.verticalCooldownH, (this.verticalOf.hashCode() + fq2.e(this.compThreshold, fq2.e(this.cooldownH, fq2.e(this.maxPerSession, ud2.i(ud2.i(ud2.i(Boolean.hashCode(this.enabled) * 31, 31, this.linkCandy), 31, this.linkSmart), 31, this.geoPrimary), 31), 31), 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", linkCandy=");
        sb.append(this.linkCandy);
        sb.append(", linkSmart=");
        ud2.v(sb, this.linkSmart, ", geoPrimary=", this.geoPrimary, ", maxPerSession=");
        sb.append(this.maxPerSession);
        sb.append(", cooldownH=");
        sb.append(this.cooldownH);
        sb.append(", compThreshold=");
        sb.append(this.compThreshold);
        sb.append(", verticalOf=");
        sb.append(this.verticalOf);
        sb.append(", verticalCooldownH=");
        sb.append(this.verticalCooldownH);
        sb.append(", regex=");
        sb.append(this.regex);
        sb.append(", card=");
        sb.append(this.card);
        sb.append(", pickSlot=");
        sb.append(this.pickSlot);
        sb.append(", own=");
        sb.append(this.own);
        sb.append(")");
        return sb.toString();
    }
}
