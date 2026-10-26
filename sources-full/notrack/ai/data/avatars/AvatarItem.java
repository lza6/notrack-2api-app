package notrack.ai.data.avatars;

import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarItem {
    public static final Companion Companion = new Companion();
    private final String cat;
    private final String id;
    private final String tier;
    private final AvatarTile tile;
    private final String url;
    private final String urlSm;

    public final class Companion {
        public final qu1 serializer() {
            return AvatarItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AvatarItem(int i, String str, String str2, String str3, String str4, String str5, AvatarTile avatarTile) {
        if (1 != (i & 1)) {
            gm4.P(i, 1, AvatarItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.cat = "basic";
        } else {
            this.cat = str2;
        }
        if ((i & 4) == 0) {
            this.tier = "plus";
        } else {
            this.tier = str3;
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
            this.tile = null;
        } else {
            this.tile = avatarTile;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AvatarItem avatarItem, do3 do3Var, tf3 tf3Var) {
        String str = avatarItem.id;
        AvatarTile avatarTile = avatarItem.tile;
        String str2 = avatarItem.urlSm;
        String str3 = avatarItem.url;
        String str4 = avatarItem.tier;
        String str5 = avatarItem.cat;
        do3Var.u(tf3Var, 0, str);
        if (do3Var.w(tf3Var) || !kr1.n(str5, "basic")) {
            do3Var.u(tf3Var, 1, str5);
        }
        if (do3Var.w(tf3Var) || !kr1.n(str4, "plus")) {
            do3Var.u(tf3Var, 2, str4);
        }
        if (do3Var.w(tf3Var) || str3 != null) {
            do3Var.p(tf3Var, 3, lo3.a, str3);
        }
        if (do3Var.w(tf3Var) || str2 != null) {
            do3Var.p(tf3Var, 4, lo3.a, str2);
        }
        if (!do3Var.w(tf3Var) && avatarTile == null) {
            return;
        }
        do3Var.p(tf3Var, 5, AvatarTile$$serializer.INSTANCE, avatarTile);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarItem)) {
            return false;
        }
        AvatarItem avatarItem = (AvatarItem) obj;
        return kr1.n(this.id, avatarItem.id) && kr1.n(this.cat, avatarItem.cat) && kr1.n(this.tier, avatarItem.tier) && kr1.n(this.url, avatarItem.url) && kr1.n(this.urlSm, avatarItem.urlSm) && kr1.n(this.tile, avatarItem.tile);
    }

    public final String getCat() {
        return this.cat;
    }

    public final String getId() {
        return this.id;
    }

    public final AvatarTile getTile() {
        return this.tile;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlSm() {
        return this.urlSm;
    }

    public final int hashCode() {
        int i = ud2.i(ud2.i(this.id.hashCode() * 31, 31, this.cat), 31, this.tier);
        String str = this.url;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.urlSm;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AvatarTile avatarTile = this.tile;
        return iHashCode2 + (avatarTile != null ? avatarTile.hashCode() : 0);
    }

    public final boolean isFree() {
        return kr1.n(this.tier, "free");
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("AvatarItem(id=", this.id, ", cat=", this.cat, ", tier=");
        ud2.v(sbT, this.tier, ", url=", this.url, ", urlSm=");
        sbT.append(this.urlSm);
        sbT.append(", tile=");
        sbT.append(this.tile);
        sbT.append(")");
        return sbT.toString();
    }
}
