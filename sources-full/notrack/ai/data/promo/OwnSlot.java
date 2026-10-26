package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;

/* JADX INFO: loaded from: classes.dex */
public final class OwnSlot {
    public static final Companion Companion = new Companion();
    private final int at;
    private final String card;

    public final class Companion {
        public final qu1 serializer() {
            return OwnSlot$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OwnSlot(int i, int i2, String str) {
        this.at = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.card = BuildConfig.VERSION_NAME;
        } else {
            this.card = str;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(OwnSlot ownSlot, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || ownSlot.at != 0) {
            do3Var.l(0, ownSlot.at, tf3Var);
        }
        if (!do3Var.w(tf3Var) && kr1.n(ownSlot.card, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 1, ownSlot.card);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnSlot)) {
            return false;
        }
        OwnSlot ownSlot = (OwnSlot) obj;
        return this.at == ownSlot.at && kr1.n(this.card, ownSlot.card);
    }

    public final int getAt() {
        return this.at;
    }

    public final String getCard() {
        return this.card;
    }

    public final int hashCode() {
        return this.card.hashCode() + (Integer.hashCode(this.at) * 31);
    }

    public final String toString() {
        return "OwnSlot(at=" + this.at + ", card=" + this.card + ")";
    }
}
