package notrack.ai.data.notify;

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
import defpackage.yo4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PremiumPushItem {
    private static final ly1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private final Map<String, PushCopy> copy;
    private final Map<String, PushCopy> copyPlay;
    private final String id;
    private final int minCode;

    public final class Companion {
        public final qu1 serializer() {
            return PremiumPushItem$$serializer.INSTANCE;
        }
    }

    static {
        b72 b72Var = new b72(8);
        q22 q22Var = q22.c;
        $childSerializers = new ly1[]{null, null, yo4.H(q22Var, b72Var), yo4.H(q22Var, new b72(9))};
    }

    public /* synthetic */ PremiumPushItem(int i, String str, int i2, Map map, Map map2) {
        this.id = (i & 1) == 0 ? BuildConfig.VERSION_NAME : str;
        if ((i & 2) == 0) {
            this.minCode = 0;
        } else {
            this.minCode = i2;
        }
        int i3 = i & 4;
        a31 a31Var = a31.c;
        if (i3 == 0) {
            this.copy = a31Var;
        } else {
            this.copy = map;
        }
        if ((i & 8) == 0) {
            this.copyPlay = a31Var;
        } else {
            this.copyPlay = map2;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(PremiumPushItem premiumPushItem, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(premiumPushItem.id, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, premiumPushItem.id);
        }
        if (do3Var.w(tf3Var) || premiumPushItem.minCode != 0) {
            do3Var.l(1, premiumPushItem.minCode, tf3Var);
        }
        boolean zW = do3Var.w(tf3Var);
        a31 a31Var = a31.c;
        ly1[] ly1VarArr = $childSerializers;
        if (zW || !kr1.n(premiumPushItem.copy, a31Var)) {
            do3Var.q(tf3Var, 2, (qu1) ly1VarArr[2].getValue(), premiumPushItem.copy);
        }
        if (!do3Var.w(tf3Var) && kr1.n(premiumPushItem.copyPlay, a31Var)) {
            return;
        }
        do3Var.q(tf3Var, 3, (qu1) ly1VarArr[3].getValue(), premiumPushItem.copyPlay);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumPushItem)) {
            return false;
        }
        PremiumPushItem premiumPushItem = (PremiumPushItem) obj;
        return kr1.n(this.id, premiumPushItem.id) && this.minCode == premiumPushItem.minCode && kr1.n(this.copy, premiumPushItem.copy) && kr1.n(this.copyPlay, premiumPushItem.copyPlay);
    }

    public final Map<String, PushCopy> getCopy() {
        return this.copy;
    }

    public final Map<String, PushCopy> getCopyPlay() {
        return this.copyPlay;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMinCode() {
        return this.minCode;
    }

    public final int hashCode() {
        return this.copyPlay.hashCode() + ((this.copy.hashCode() + fq2.e(this.minCode, this.id.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "PremiumPushItem(id=" + this.id + ", minCode=" + this.minCode + ", copy=" + this.copy + ", copyPlay=" + this.copyPlay + ")";
    }
}
