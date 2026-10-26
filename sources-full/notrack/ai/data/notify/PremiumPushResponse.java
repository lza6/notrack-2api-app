package notrack.ai.data.notify;

import defpackage.b72;
import defpackage.do3;
import defpackage.kr1;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.yo4;
import defpackage.z21;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumPushResponse {
    private final boolean enabled;
    private final List<PremiumPushItem> items;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, yo4.H(q22.c, new b72(10))};

    public final class Companion {
        public final qu1 serializer() {
            return PremiumPushResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PremiumPushResponse(int i, boolean z, List list) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.items = z21.c;
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PremiumPushResponse premiumPushResponse, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || premiumPushResponse.enabled) {
            do3Var.c(tf3Var, 0, premiumPushResponse.enabled);
        }
        if (!do3Var.w(tf3Var) && kr1.n(premiumPushResponse.items, z21.c)) {
            return;
        }
        do3Var.q(tf3Var, 1, (qu1) $childSerializers[1].getValue(), premiumPushResponse.items);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumPushResponse)) {
            return false;
        }
        PremiumPushResponse premiumPushResponse = (PremiumPushResponse) obj;
        return this.enabled == premiumPushResponse.enabled && kr1.n(this.items, premiumPushResponse.items);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<PremiumPushItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public final String toString() {
        return "PremiumPushResponse(enabled=" + this.enabled + ", items=" + this.items + ")";
    }
}
