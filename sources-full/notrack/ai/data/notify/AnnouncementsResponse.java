package notrack.ai.data.notify;

import defpackage.do3;
import defpackage.kr1;
import defpackage.lg;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.yo4;
import defpackage.z21;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnnouncementsResponse {
    private final List<Announcement> items;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {yo4.H(q22.c, new lg(1))};

    public final class Companion {
        public final qu1 serializer() {
            return AnnouncementsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnouncementsResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.items = z21.c;
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(AnnouncementsResponse announcementsResponse, do3 do3Var, tf3 tf3Var) {
        if (!do3Var.w(tf3Var) && kr1.n(announcementsResponse.items, z21.c)) {
            return;
        }
        do3Var.q(tf3Var, 0, (qu1) $childSerializers[0].getValue(), announcementsResponse.items);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnnouncementsResponse) && kr1.n(this.items, ((AnnouncementsResponse) obj).items);
    }

    public final List<Announcement> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return "AnnouncementsResponse(items=" + this.items + ")";
    }
}
