package notrack.ai.data.notify;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lg;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Announcement {
    private final Map<String, AnnouncementCopy> copy;
    private final String id;
    private final int minCode;
    private final String publishedAt;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, yo4.H(q22.c, new lg(0))};

    public final class Companion {
        public final qu1 serializer() {
            return Announcement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Announcement(int i, int i2, String str, String str2, Map map) {
        if ((i & 1) == 0) {
            this.id = BuildConfig.VERSION_NAME;
        } else {
            this.id = str;
        }
        this.minCode = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.publishedAt = BuildConfig.VERSION_NAME;
        } else {
            this.publishedAt = str2;
        }
        if ((i & 8) == 0) {
            this.copy = a31.c;
        } else {
            this.copy = map;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(Announcement announcement, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(announcement.id, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, announcement.id);
        }
        if (do3Var.w(tf3Var) || announcement.minCode != 0) {
            do3Var.l(1, announcement.minCode, tf3Var);
        }
        if (do3Var.w(tf3Var) || !kr1.n(announcement.publishedAt, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 2, announcement.publishedAt);
        }
        if (!do3Var.w(tf3Var) && kr1.n(announcement.copy, a31.c)) {
            return;
        }
        do3Var.q(tf3Var, 3, (qu1) $childSerializers[3].getValue(), announcement.copy);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) obj;
        return kr1.n(this.id, announcement.id) && this.minCode == announcement.minCode && kr1.n(this.publishedAt, announcement.publishedAt) && kr1.n(this.copy, announcement.copy);
    }

    public final Map<String, AnnouncementCopy> getCopy() {
        return this.copy;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMinCode() {
        return this.minCode;
    }

    public final int hashCode() {
        return this.copy.hashCode() + ud2.i(fq2.e(this.minCode, this.id.hashCode() * 31, 31), 31, this.publishedAt);
    }

    public final String toString() {
        return "Announcement(id=" + this.id + ", minCode=" + this.minCode + ", publishedAt=" + this.publishedAt + ", copy=" + this.copy + ")";
    }
}
