package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
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
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class OwnConfig {
    private static final ly1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private final int busyNoteCooldownMin;
    private final int busyNoteMaxPerDay;
    private final List<OwnCard> cards;
    private final String cta;
    private final int dismissSkips;
    private final boolean enabled;
    private final OwnFacts facts;
    private final int fastCooldownMin;
    private final int fastMaxPerDay;
    private final int maxPerChat;
    private final OwnPlans plans;
    private final String priceLine;
    private final int repeatEvery;
    private final List<OwnSlot> schedule;
    private final String url;

    public final class Companion {
        public final qu1 serializer() {
            return OwnConfig$$serializer.INSTANCE;
        }
    }

    static {
        b72 b72Var = new b72(5);
        q22 q22Var = q22.c;
        $childSerializers = new ly1[]{null, yo4.H(q22Var, b72Var), null, null, null, null, null, null, null, null, null, null, null, null, yo4.H(q22Var, new b72(6))};
    }

    public /* synthetic */ OwnConfig() {
        OwnFacts ownFacts = new OwnFacts();
        OwnPlans ownPlans = new OwnPlans();
        z21 z21Var = z21.c;
        this(false, z21Var, 0, 0, 1, 5, 6, 2, 60, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, ownFacts, ownPlans, z21Var);
    }

    public /* synthetic */ OwnConfig(int i, boolean z, List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, OwnFacts ownFacts, OwnPlans ownPlans, List list2) {
        if ((i & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
        int i9 = i & 2;
        z21 z21Var = z21.c;
        if (i9 == 0) {
            this.schedule = z21Var;
        } else {
            this.schedule = list;
        }
        if ((i & 4) == 0) {
            this.repeatEvery = 0;
        } else {
            this.repeatEvery = i2;
        }
        if ((i & 8) == 0) {
            this.maxPerChat = 0;
        } else {
            this.maxPerChat = i3;
        }
        if ((i & 16) == 0) {
            this.dismissSkips = 1;
        } else {
            this.dismissSkips = i4;
        }
        if ((i & 32) == 0) {
            this.busyNoteCooldownMin = 5;
        } else {
            this.busyNoteCooldownMin = i5;
        }
        if ((i & 64) == 0) {
            this.busyNoteMaxPerDay = 6;
        } else {
            this.busyNoteMaxPerDay = i6;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.fastMaxPerDay = 2;
        } else {
            this.fastMaxPerDay = i7;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.fastCooldownMin = 60;
        } else {
            this.fastCooldownMin = i8;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.url = BuildConfig.VERSION_NAME;
        } else {
            this.url = str;
        }
        if ((i & 1024) == 0) {
            this.cta = BuildConfig.VERSION_NAME;
        } else {
            this.cta = str2;
        }
        if ((i & 2048) == 0) {
            this.priceLine = BuildConfig.VERSION_NAME;
        } else {
            this.priceLine = str3;
        }
        this.facts = (i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 ? new OwnFacts() : ownFacts;
        this.plans = (i & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0 ? new OwnPlans() : ownPlans;
        if ((i & 16384) == 0) {
            this.cards = z21Var;
        } else {
            this.cards = list2;
        }
    }

    public OwnConfig(boolean z, List<OwnSlot> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, OwnFacts ownFacts, OwnPlans ownPlans, List<OwnCard> list2) {
        this.enabled = z;
        this.schedule = list;
        this.repeatEvery = i;
        this.maxPerChat = i2;
        this.dismissSkips = i3;
        this.busyNoteCooldownMin = i4;
        this.busyNoteMaxPerDay = i5;
        this.fastMaxPerDay = i6;
        this.fastCooldownMin = i7;
        this.url = str;
        this.cta = str2;
        this.priceLine = str3;
        this.facts = ownFacts;
        this.plans = ownPlans;
        this.cards = list2;
    }

    public static OwnConfig copy$default(OwnConfig ownConfig, OwnFacts ownFacts, ArrayList arrayList) {
        boolean z = ownConfig.enabled;
        List<OwnSlot> list = ownConfig.schedule;
        int i = ownConfig.repeatEvery;
        int i2 = ownConfig.maxPerChat;
        int i3 = ownConfig.dismissSkips;
        int i4 = ownConfig.busyNoteCooldownMin;
        int i5 = ownConfig.busyNoteMaxPerDay;
        int i6 = ownConfig.fastMaxPerDay;
        int i7 = ownConfig.fastCooldownMin;
        String str = ownConfig.url;
        String str2 = ownConfig.cta;
        OwnPlans ownPlans = ownConfig.plans;
        list.getClass();
        str.getClass();
        str2.getClass();
        ownPlans.getClass();
        return new OwnConfig(z, list, i, i2, i3, i4, i5, i6, i7, str, str2, BuildConfig.VERSION_NAME, ownFacts, ownPlans, arrayList);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(OwnConfig ownConfig, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || ownConfig.enabled) {
            do3Var.c(tf3Var, 0, ownConfig.enabled);
        }
        boolean zW = do3Var.w(tf3Var);
        z21 z21Var = z21.c;
        ly1[] ly1VarArr = $childSerializers;
        if (zW || !kr1.n(ownConfig.schedule, z21Var)) {
            do3Var.q(tf3Var, 1, (qu1) ly1VarArr[1].getValue(), ownConfig.schedule);
        }
        if (do3Var.w(tf3Var) || ownConfig.repeatEvery != 0) {
            do3Var.l(2, ownConfig.repeatEvery, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.maxPerChat != 0) {
            do3Var.l(3, ownConfig.maxPerChat, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.dismissSkips != 1) {
            do3Var.l(4, ownConfig.dismissSkips, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.busyNoteCooldownMin != 5) {
            do3Var.l(5, ownConfig.busyNoteCooldownMin, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.busyNoteMaxPerDay != 6) {
            do3Var.l(6, ownConfig.busyNoteMaxPerDay, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.fastMaxPerDay != 2) {
            do3Var.l(7, ownConfig.fastMaxPerDay, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownConfig.fastCooldownMin != 60) {
            do3Var.l(8, ownConfig.fastCooldownMin, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownConfig.url, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 9, ownConfig.url);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownConfig.cta, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 10, ownConfig.cta);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownConfig.priceLine, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 11, ownConfig.priceLine);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownConfig.facts, new OwnFacts())) {
            do3Var.q(tf3Var, 12, OwnFacts$$serializer.INSTANCE, ownConfig.facts);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownConfig.plans, new OwnPlans())) {
            do3Var.q(tf3Var, 13, OwnPlans$$serializer.INSTANCE, ownConfig.plans);
        }
        if (!do3Var.w(tf3Var) && kr1.n(ownConfig.cards, z21Var)) {
            return;
        }
        do3Var.q(tf3Var, 14, (qu1) ly1VarArr[14].getValue(), ownConfig.cards);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnConfig)) {
            return false;
        }
        OwnConfig ownConfig = (OwnConfig) obj;
        return this.enabled == ownConfig.enabled && kr1.n(this.schedule, ownConfig.schedule) && this.repeatEvery == ownConfig.repeatEvery && this.maxPerChat == ownConfig.maxPerChat && this.dismissSkips == ownConfig.dismissSkips && this.busyNoteCooldownMin == ownConfig.busyNoteCooldownMin && this.busyNoteMaxPerDay == ownConfig.busyNoteMaxPerDay && this.fastMaxPerDay == ownConfig.fastMaxPerDay && this.fastCooldownMin == ownConfig.fastCooldownMin && kr1.n(this.url, ownConfig.url) && kr1.n(this.cta, ownConfig.cta) && kr1.n(this.priceLine, ownConfig.priceLine) && kr1.n(this.facts, ownConfig.facts) && kr1.n(this.plans, ownConfig.plans) && kr1.n(this.cards, ownConfig.cards);
    }

    public final int getBusyNoteCooldownMin() {
        return this.busyNoteCooldownMin;
    }

    public final int getBusyNoteMaxPerDay() {
        return this.busyNoteMaxPerDay;
    }

    public final List<OwnCard> getCards() {
        return this.cards;
    }

    public final String getCta() {
        return this.cta;
    }

    public final int getDismissSkips() {
        return this.dismissSkips;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final OwnFacts getFacts() {
        return this.facts;
    }

    public final int getFastCooldownMin() {
        return this.fastCooldownMin;
    }

    public final int getFastMaxPerDay() {
        return this.fastMaxPerDay;
    }

    public final int getMaxPerChat() {
        return this.maxPerChat;
    }

    public final OwnPlans getPlans() {
        return this.plans;
    }

    public final String getPriceLine() {
        return this.priceLine;
    }

    public final int getRepeatEvery() {
        return this.repeatEvery;
    }

    public final List<OwnSlot> getSchedule() {
        return this.schedule;
    }

    public final int hashCode() {
        return this.cards.hashCode() + ((this.plans.hashCode() + ((this.facts.hashCode() + ud2.i(ud2.i(ud2.i(fq2.e(this.fastCooldownMin, fq2.e(this.fastMaxPerDay, fq2.e(this.busyNoteMaxPerDay, fq2.e(this.busyNoteCooldownMin, fq2.e(this.dismissSkips, fq2.e(this.maxPerChat, fq2.e(this.repeatEvery, ud2.j(Boolean.hashCode(this.enabled) * 31, 31, this.schedule), 31), 31), 31), 31), 31), 31), 31), 31, this.url), 31, this.cta), 31, this.priceLine)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", schedule=");
        sb.append(this.schedule);
        sb.append(", repeatEvery=");
        sb.append(this.repeatEvery);
        sb.append(", maxPerChat=");
        sb.append(this.maxPerChat);
        sb.append(", dismissSkips=");
        sb.append(this.dismissSkips);
        sb.append(", busyNoteCooldownMin=");
        sb.append(this.busyNoteCooldownMin);
        sb.append(", busyNoteMaxPerDay=");
        sb.append(this.busyNoteMaxPerDay);
        sb.append(", fastMaxPerDay=");
        sb.append(this.fastMaxPerDay);
        sb.append(", fastCooldownMin=");
        sb.append(this.fastCooldownMin);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", cta=");
        ud2.v(sb, this.cta, ", priceLine=", this.priceLine, ", facts=");
        sb.append(this.facts);
        sb.append(", plans=");
        sb.append(this.plans);
        sb.append(", cards=");
        sb.append(this.cards);
        sb.append(")");
        return sb.toString();
    }
}
