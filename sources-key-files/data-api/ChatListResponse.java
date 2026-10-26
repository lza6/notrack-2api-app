package notrack.ai.data.api;

import defpackage.do3;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lg;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.yo4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ChatListResponse {
    private final List<ChatDto> chats;
    private final String userId;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, yo4.H(q22.c, new lg(13))};

    public final class Companion {
        public final qu1 serializer() {
            return ChatListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatListResponse(int i, String str, List list) {
        if (3 != (i & 3)) {
            gm4.P(i, 3, ChatListResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.chats = list;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ChatListResponse chatListResponse, do3 do3Var, tf3 tf3Var) {
        do3Var.u(tf3Var, 0, chatListResponse.userId);
        do3Var.q(tf3Var, 1, (qu1) $childSerializers[1].getValue(), chatListResponse.chats);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatListResponse)) {
            return false;
        }
        ChatListResponse chatListResponse = (ChatListResponse) obj;
        return kr1.n(this.userId, chatListResponse.userId) && kr1.n(this.chats, chatListResponse.chats);
    }

    public final List<ChatDto> getChats() {
        return this.chats;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return this.chats.hashCode() + (this.userId.hashCode() * 31);
    }

    public final String toString() {
        return "ChatListResponse(userId=" + this.userId + ", chats=" + this.chats + ")";
    }
}
