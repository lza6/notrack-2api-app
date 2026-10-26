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
public final class ChatHistoryResponse {
    private final ChatDto chat;
    private final List<MessageDto> messages;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, yo4.H(q22.c, new lg(12))};

    public final class Companion {
        public final qu1 serializer() {
            return ChatHistoryResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatHistoryResponse(int i, ChatDto chatDto, List list) {
        if (3 != (i & 3)) {
            gm4.P(i, 3, ChatHistoryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.chat = chatDto;
        this.messages = list;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ChatHistoryResponse chatHistoryResponse, do3 do3Var, tf3 tf3Var) {
        do3Var.q(tf3Var, 0, ChatDto$$serializer.INSTANCE, chatHistoryResponse.chat);
        do3Var.q(tf3Var, 1, (qu1) $childSerializers[1].getValue(), chatHistoryResponse.messages);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistoryResponse)) {
            return false;
        }
        ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) obj;
        return kr1.n(this.chat, chatHistoryResponse.chat) && kr1.n(this.messages, chatHistoryResponse.messages);
    }

    public final ChatDto getChat() {
        return this.chat;
    }

    public final List<MessageDto> getMessages() {
        return this.messages;
    }

    public final int hashCode() {
        return this.messages.hashCode() + (this.chat.hashCode() * 31);
    }

    public final String toString() {
        return "ChatHistoryResponse(chat=" + this.chat + ", messages=" + this.messages + ")";
    }
}
