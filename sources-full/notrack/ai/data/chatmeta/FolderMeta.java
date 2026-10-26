package notrack.ai.data.chatmeta;

import app.template.extension.BuildConfig;
import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class FolderMeta {
    public static final Companion Companion = new Companion();
    private final String color;
    private final long createdAt;
    private final String id;
    private final String name;
    private final int order;
    private final long updatedAt;

    public final class Companion {
        public final qu1 serializer() {
            return FolderMeta$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FolderMeta(int i, String str, String str2, String str3, int i2, long j, long j2) {
        if ((i & 1) == 0) {
            this.id = BuildConfig.VERSION_NAME;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = BuildConfig.VERSION_NAME;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.color = null;
        } else {
            this.color = str3;
        }
        if ((i & 8) == 0) {
            this.order = 0;
        } else {
            this.order = i2;
        }
        if ((i & 16) == 0) {
            this.createdAt = 0L;
        } else {
            this.createdAt = j;
        }
        if ((i & 32) == 0) {
            this.updatedAt = 0L;
        } else {
            this.updatedAt = j2;
        }
    }

    public FolderMeta(String str, String str2, String str3, int i, long j, long j2) {
        this.id = str;
        this.name = str2;
        this.color = str3;
        this.order = i;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    public static FolderMeta copy$default(FolderMeta folderMeta, String str, long j) {
        String str2 = folderMeta.id;
        String str3 = folderMeta.color;
        int i = folderMeta.order;
        long j2 = folderMeta.createdAt;
        str2.getClass();
        return new FolderMeta(str2, str, str3, i, j2, j);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(FolderMeta folderMeta, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || !kr1.n(folderMeta.id, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 0, folderMeta.id);
        }
        if (do3Var.w(tf3Var) || !kr1.n(folderMeta.name, BuildConfig.VERSION_NAME)) {
            do3Var.u(tf3Var, 1, folderMeta.name);
        }
        if (do3Var.w(tf3Var) || folderMeta.color != null) {
            do3Var.p(tf3Var, 2, lo3.a, folderMeta.color);
        }
        if (do3Var.w(tf3Var) || folderMeta.order != 0) {
            do3Var.l(3, folderMeta.order, tf3Var);
        }
        if (do3Var.w(tf3Var) || folderMeta.createdAt != 0) {
            do3Var.n(tf3Var, 4, folderMeta.createdAt);
        }
        if (!do3Var.w(tf3Var) && folderMeta.updatedAt == 0) {
            return;
        }
        do3Var.n(tf3Var, 5, folderMeta.updatedAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FolderMeta)) {
            return false;
        }
        FolderMeta folderMeta = (FolderMeta) obj;
        return kr1.n(this.id, folderMeta.id) && kr1.n(this.name, folderMeta.name) && kr1.n(this.color, folderMeta.color) && this.order == folderMeta.order && this.createdAt == folderMeta.createdAt && this.updatedAt == folderMeta.updatedAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int hashCode() {
        int i = ud2.i(this.id.hashCode() * 31, 31, this.name);
        String str = this.color;
        return Long.hashCode(this.updatedAt) + ud2.h(fq2.e(this.order, (i + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.createdAt);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("FolderMeta(id=", this.id, ", name=", this.name, ", color=");
        sbT.append(this.color);
        sbT.append(", order=");
        sbT.append(this.order);
        sbT.append(", createdAt=");
        sbT.append(this.createdAt);
        sbT.append(", updatedAt=");
        sbT.append(this.updatedAt);
        sbT.append(")");
        return sbT.toString();
    }
}
