package notrack.ai.data.chatmeta;

import defpackage.do3;
import defpackage.fq2;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;

/* JADX INFO: loaded from: classes.dex */
public final class ChatEntry {
    public static final Companion Companion = new Companion();
    private final boolean archived;
    private final String folderId;
    private final int order;
    private final boolean pinned;
    private final String titleOverride;
    private final long updatedAt;

    public final class Companion {
        public final qu1 serializer() {
            return ChatEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatEntry(int i, String str, boolean z, boolean z2, int i2, String str2, long j) {
        if ((i & 1) == 0) {
            this.folderId = null;
        } else {
            this.folderId = str;
        }
        if ((i & 2) == 0) {
            this.pinned = false;
        } else {
            this.pinned = z;
        }
        if ((i & 4) == 0) {
            this.archived = false;
        } else {
            this.archived = z2;
        }
        if ((i & 8) == 0) {
            this.order = 0;
        } else {
            this.order = i2;
        }
        if ((i & 16) == 0) {
            this.titleOverride = null;
        } else {
            this.titleOverride = str2;
        }
        if ((i & 32) == 0) {
            this.updatedAt = 0L;
        } else {
            this.updatedAt = j;
        }
    }

    public ChatEntry(String str, boolean z, boolean z2, int i, String str2, long j) {
        this.folderId = str;
        this.pinned = z;
        this.archived = z2;
        this.order = i;
        this.titleOverride = str2;
        this.updatedAt = j;
    }

    public static ChatEntry copy$default(ChatEntry chatEntry, String str, boolean z, String str2, long j, int i) {
        if ((i & 1) != 0) {
            str = chatEntry.folderId;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            z = chatEntry.pinned;
        }
        boolean z2 = z;
        boolean z3 = chatEntry.archived;
        int i2 = chatEntry.order;
        if ((i & 16) != 0) {
            str2 = chatEntry.titleOverride;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            j = chatEntry.updatedAt;
        }
        chatEntry.getClass();
        return new ChatEntry(str3, z2, z3, i2, str4, j);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ChatEntry chatEntry, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || chatEntry.folderId != null) {
            do3Var.p(tf3Var, 0, lo3.a, chatEntry.folderId);
        }
        if (do3Var.w(tf3Var) || chatEntry.pinned) {
            do3Var.c(tf3Var, 1, chatEntry.pinned);
        }
        if (do3Var.w(tf3Var) || chatEntry.archived) {
            do3Var.c(tf3Var, 2, chatEntry.archived);
        }
        if (do3Var.w(tf3Var) || chatEntry.order != 0) {
            do3Var.l(3, chatEntry.order, tf3Var);
        }
        if (do3Var.w(tf3Var) || chatEntry.titleOverride != null) {
            do3Var.p(tf3Var, 4, lo3.a, chatEntry.titleOverride);
        }
        if (!do3Var.w(tf3Var) && chatEntry.updatedAt == 0) {
            return;
        }
        do3Var.n(tf3Var, 5, chatEntry.updatedAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntry)) {
            return false;
        }
        ChatEntry chatEntry = (ChatEntry) obj;
        return kr1.n(this.folderId, chatEntry.folderId) && this.pinned == chatEntry.pinned && this.archived == chatEntry.archived && this.order == chatEntry.order && kr1.n(this.titleOverride, chatEntry.titleOverride) && this.updatedAt == chatEntry.updatedAt;
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final String getTitleOverride() {
        return this.titleOverride;
    }

    public final int hashCode() {
        String str = this.folderId;
        int iE = fq2.e(this.order, ud2.k(ud2.k((str == null ? 0 : str.hashCode()) * 31, 31, this.pinned), 31, this.archived), 31);
        String str2 = this.titleOverride;
        return Long.hashCode(this.updatedAt) + ((iE + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChatEntry(folderId=" + this.folderId + ", pinned=" + this.pinned + ", archived=" + this.archived + ", order=" + this.order + ", titleOverride=" + this.titleOverride + ", updatedAt=" + this.updatedAt + ")";
    }
}
