package notrack.ai.data.promo;

import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import java.util.Locale;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PromoCopy {
    public static final Companion Companion = new Companion();
    private final String age;
    private final String bodyComp;
    private final String bodyMedia;
    private final String bodyVpn;
    private final String cta;
    private final String ctaVpn;
    private final String discVpn;
    private final String disclosure;
    private final String dismiss;
    private final String title;
    private final String titleVpn;

    public final class Companion {
        public final qu1 serializer() {
            return PromoCopy$$serializer.INSTANCE;
        }
    }

    public PromoCopy() {
        String lowerCase = "NoTrack".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strConcat = lowerCase.concat(" is text-only. To see and hear a companion — photos, voice and video — continue below.");
        this.title = "Want more?";
        this.bodyComp = "Loving the chat? See and hear a companion — live photos, voice and video. Continue below.";
        this.bodyMedia = strConcat;
        this.cta = "See & hear →";
        this.age = "I'm 18+ — continue";
        this.disclosure = "Sponsored recommendation · 18+";
        this.dismiss = "Dismiss";
        this.titleVpn = "Keep it private?";
        this.bodyVpn = "This chat is no-log on our side. For full privacy everywhere else, a trusted no-log VPN hides your IP and encrypts your connection.";
        this.ctaVpn = "Get protected →";
        this.discVpn = "Sponsored · privacy tool";
    }

    public /* synthetic */ PromoCopy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.title = (i & 1) == 0 ? "Want more?" : str;
        if ((i & 2) == 0) {
            this.bodyComp = "Loving the chat? See and hear a companion — live photos, voice and video. Continue below.";
        } else {
            this.bodyComp = str2;
        }
        if ((i & 4) == 0) {
            String lowerCase = "NoTrack".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.bodyMedia = lowerCase.concat(" is text-only. To see and hear a companion — photos, voice and video — continue below.");
        } else {
            this.bodyMedia = str3;
        }
        if ((i & 8) == 0) {
            this.cta = "See & hear →";
        } else {
            this.cta = str4;
        }
        if ((i & 16) == 0) {
            this.age = "I'm 18+ — continue";
        } else {
            this.age = str5;
        }
        if ((i & 32) == 0) {
            this.disclosure = "Sponsored recommendation · 18+";
        } else {
            this.disclosure = str6;
        }
        if ((i & 64) == 0) {
            this.dismiss = "Dismiss";
        } else {
            this.dismiss = str7;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.titleVpn = "Keep it private?";
        } else {
            this.titleVpn = str8;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.bodyVpn = "This chat is no-log on our side. For full privacy everywhere else, a trusted no-log VPN hides your IP and encrypts your connection.";
        } else {
            this.bodyVpn = str9;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.ctaVpn = "Get protected →";
        } else {
            this.ctaVpn = str10;
        }
        if ((i & 1024) == 0) {
            this.discVpn = "Sponsored · privacy tool";
        } else {
            this.discVpn = str11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    public static final /* synthetic */ void write$Self$app_playRelease(PromoCopy promoCopy, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.title, "Want more?")) {
            do3Var.u(tf3Var, 0, promoCopy.title);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.bodyComp, "Loving the chat? See and hear a companion — live photos, voice and video. Continue below.")) {
            do3Var.u(tf3Var, 1, promoCopy.bodyComp);
        }
        if (do3Var.w(tf3Var)) {
            do3Var.u(tf3Var, 2, promoCopy.bodyMedia);
        } else {
            String str = promoCopy.bodyMedia;
            String lowerCase = "NoTrack".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!kr1.n(str, lowerCase.concat(" is text-only. To see and hear a companion — photos, voice and video — continue below."))) {
                do3Var.u(tf3Var, 2, promoCopy.bodyMedia);
            }
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.cta, "See & hear →")) {
            do3Var.u(tf3Var, 3, promoCopy.cta);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.age, "I'm 18+ — continue")) {
            do3Var.u(tf3Var, 4, promoCopy.age);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.disclosure, "Sponsored recommendation · 18+")) {
            do3Var.u(tf3Var, 5, promoCopy.disclosure);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.dismiss, "Dismiss")) {
            do3Var.u(tf3Var, 6, promoCopy.dismiss);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.titleVpn, "Keep it private?")) {
            do3Var.u(tf3Var, 7, promoCopy.titleVpn);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.bodyVpn, "This chat is no-log on our side. For full privacy everywhere else, a trusted no-log VPN hides your IP and encrypts your connection.")) {
            do3Var.u(tf3Var, 8, promoCopy.bodyVpn);
        }
        if (do3Var.w(tf3Var) || !kr1.n(promoCopy.ctaVpn, "Get protected →")) {
            do3Var.u(tf3Var, 9, promoCopy.ctaVpn);
        }
        if (!do3Var.w(tf3Var) && kr1.n(promoCopy.discVpn, "Sponsored · privacy tool")) {
            return;
        }
        do3Var.u(tf3Var, 10, promoCopy.discVpn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCopy)) {
            return false;
        }
        PromoCopy promoCopy = (PromoCopy) obj;
        return kr1.n(this.title, promoCopy.title) && kr1.n(this.bodyComp, promoCopy.bodyComp) && kr1.n(this.bodyMedia, promoCopy.bodyMedia) && kr1.n(this.cta, promoCopy.cta) && kr1.n(this.age, promoCopy.age) && kr1.n(this.disclosure, promoCopy.disclosure) && kr1.n(this.dismiss, promoCopy.dismiss) && kr1.n(this.titleVpn, promoCopy.titleVpn) && kr1.n(this.bodyVpn, promoCopy.bodyVpn) && kr1.n(this.ctaVpn, promoCopy.ctaVpn) && kr1.n(this.discVpn, promoCopy.discVpn);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getBodyComp() {
        return this.bodyComp;
    }

    public final String getBodyMedia() {
        return this.bodyMedia;
    }

    public final String getBodyVpn() {
        return this.bodyVpn;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getCtaVpn() {
        return this.ctaVpn;
    }

    public final String getDiscVpn() {
        return this.discVpn;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getDismiss() {
        return this.dismiss;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleVpn() {
        return this.titleVpn;
    }

    public final int hashCode() {
        return this.discVpn.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(ud2.i(this.title.hashCode() * 31, 31, this.bodyComp), 31, this.bodyMedia), 31, this.cta), 31, this.age), 31, this.disclosure), 31, this.dismiss), 31, this.titleVpn), 31, this.bodyVpn), 31, this.ctaVpn);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("PromoCopy(title=", this.title, ", bodyComp=", this.bodyComp, ", bodyMedia=");
        ud2.v(sbT, this.bodyMedia, ", cta=", this.cta, ", age=");
        ud2.v(sbT, this.age, ", disclosure=", this.disclosure, ", dismiss=");
        ud2.v(sbT, this.dismiss, ", titleVpn=", this.titleVpn, ", bodyVpn=");
        ud2.v(sbT, this.bodyVpn, ", ctaVpn=", this.ctaVpn, ", discVpn=");
        return fq2.r(sbT, this.discVpn, ")");
    }
}
