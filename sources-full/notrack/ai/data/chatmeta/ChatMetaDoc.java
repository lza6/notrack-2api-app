package notrack.ai.data.chatmeta;

import defpackage.a31;
import defpackage.do3;
import defpackage.kr1;
import defpackage.lg;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import defpackage.z21;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ChatMetaDoc {
    private static final ly1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private final Map<String, ChatEntry> chats;
    private final List<FolderMeta> folders;
    private final long updatedAt;
    private final int v;

    public final class Companion {
        public final qu1 serializer() {
            return ChatMetaDoc$$serializer.INSTANCE;
        }
    }

    static {
        lg lgVar = new lg(14);
        q22 q22Var = q22.c;
        $childSerializers = new ly1[]{null, yo4.H(q22Var, lgVar), yo4.H(q22Var, new lg(15)), null};
    }

    public /* synthetic */ ChatMetaDoc() {
        this(1, z21.c, a31.c, 0L);
    }

    public /* synthetic */ ChatMetaDoc(int i, int i2, List list, Map map, long j) {
        this.v = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.folders = z21.c;
        } else {
            this.folders = list;
        }
        if ((i & 4) == 0) {
            this.chats = a31.c;
        } else {
            this.chats = map;
        }
        if ((i & 8) == 0) {
            this.updatedAt = 0L;
        } else {
            this.updatedAt = j;
        }
    }

    public ChatMetaDoc(int i, List<FolderMeta> list, Map<String, ChatEntry> map, long j) {
        this.v = i;
        this.folders = list;
        this.chats = map;
        this.updatedAt = j;
    }

    public static ChatMetaDoc copy$default(ChatMetaDoc chatMetaDoc, ArrayList arrayList, Map map, long j, int i) {
        List<FolderMeta> list = arrayList;
        int i2 = chatMetaDoc.v;
        if ((i & 2) != 0) {
            list = chatMetaDoc.folders;
        }
        if ((i & 4) != 0) {
            map = chatMetaDoc.chats;
        }
        if ((i & 8) != 0) {
            j = chatMetaDoc.updatedAt;
        }
        long j2 = j;
        list.getClass();
        map.getClass();
        return new ChatMetaDoc(i2, list, map, j2);
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ChatMetaDoc chatMetaDoc, do3 do3Var, tf3 tf3Var) {
        if (do3Var.w(tf3Var) || chatMetaDoc.v != 1) {
            do3Var.l(0, chatMetaDoc.v, tf3Var);
        }
        boolean zW = do3Var.w(tf3Var);
        ly1[] ly1VarArr = $childSerializers;
        if (zW || !kr1.n(chatMetaDoc.folders, z21.c)) {
            do3Var.q(tf3Var, 1, (qu1) ly1VarArr[1].getValue(), chatMetaDoc.folders);
        }
        if (do3Var.w(tf3Var) || !kr1.n(chatMetaDoc.chats, a31.c)) {
            do3Var.q(tf3Var, 2, (qu1) ly1VarArr[2].getValue(), chatMetaDoc.chats);
        }
        if (!do3Var.w(tf3Var) && chatMetaDoc.updatedAt == 0) {
            return;
        }
        do3Var.n(tf3Var, 3, chatMetaDoc.updatedAt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMetaDoc)) {
            return false;
        }
        ChatMetaDoc chatMetaDoc = (ChatMetaDoc) obj;
        return this.v == chatMetaDoc.v && kr1.n(this.folders, chatMetaDoc.folders) && kr1.n(this.chats, chatMetaDoc.chats) && this.updatedAt == chatMetaDoc.updatedAt;
    }

    public final Map<String, ChatEntry> getChats() {
        return this.chats;
    }

    public final List<FolderMeta> getFolders() {
        return this.folders;
    }

    public final int hashCode() {
        return Long.hashCode(this.updatedAt) + ((this.chats.hashCode() + ud2.j(Integer.hashCode(this.v) * 31, 31, this.folders)) * 31);
    }

    public final String toString() {
        return "ChatMetaDoc(v=" + this.v + ", folders=" + this.folders + ", chats=" + this.chats + ", updatedAt=" + this.updatedAt + ")";
    }
}
