package notrack.ai.data.promo;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class OwnCard {
    public static final Companion Companion = new Companion();
    private final String body;
    private final String id;
    private final int minPairs;
    private final boolean needsAdSeen;
    private final String title;

    public final class Companion {
        public final qu1 serializer() {
            return OwnCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OwnCard(int i, int i2, String str, String str2, String str3, boolean z) {
        if ((i & 1) == 0) {
            this.id = BuildConfig.VERSION_NAME;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.minPairs = 0;
        } else {
            this.minPairs = i2;
        }
        if ((i & 4) == 0) {
            this.needsAdSeen = false;
        } else {
            this.needsAdSeen = z;
        }
        if ((i & 8) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str2;
        }
        if ((i & 16) == 0) {
            this.body = BuildConfig.VERSION_NAME;
        } else {
            this.body = str3;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(OwnCard ownCard, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(ownCard.id, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, ownCard.id);
        }
        if (do3Var.w(tf3Var) || ownCard.minPairs != 0) {
            do3Var.l(1, ownCard.minPairs, tf3Var);
        }
        if (do3Var.w(tf3Var) || ownCard.needsAdSeen) {
            do3Var.c(tf3Var, 2, ownCard.needsAdSeen);
        }
        if (do3Var.w(tf3Var) || !kr1.n(ownCard.title, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 3, ownCard.title);
        }
        if (!do3Var.w(tf3Var) && kr1.n(ownCard.body, BuildConfig.VERSION_NAME)) {
            return;
        }
        do3Var.u(tf3Var, 4, ownCard.body);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnCard)) {
            return false;
        }
        OwnCard ownCard = (OwnCard) obj;
        return kr1.n(this.id, ownCard.id) && this.minPairs == ownCard.minPairs && this.needsAdSeen == ownCard.needsAdSeen && kr1.n(this.title, ownCard.title) && kr1.n(this.body, ownCard.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMinPairs() {
        return this.minPairs;
    }

    public final boolean getNeedsAdSeen() {
        return this.needsAdSeen;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.body.hashCode() + ud2.i(ud2.k(fq2.e(this.minPairs, this.id.hashCode() * 31, 31), 31, this.needsAdSeen), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnCard(id=");
        sb.append(this.id);
        sb.append(", minPairs=");
        sb.append(this.minPairs);
        sb.append(", needsAdSeen=");
        sb.append(this.needsAdSeen);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        return fq2.r(sb, this.body, ")");
    }
}
