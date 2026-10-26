package notrack.ai.data.api;

import app.template.extension.BuildConfig;
import defpackage.a31;
import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lg;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ChatEvent {
    public static final Companion Companion = new Companion();
    private static final ly1 $cachedSerializer$delegate = yo4.H(q22.c, new lg(8));

    public final class Busy extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String ab;
        private final String text;
        private final String why;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Busy$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Busy(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.why = BuildConfig.VERSION_NAME;
            } else {
                this.why = str;
            }
            if ((i & 2) == 0) {
                this.text = BuildConfig.VERSION_NAME;
            } else {
                this.text = str2;
            }
            if ((i & 4) == 0) {
                this.ab = BuildConfig.VERSION_NAME;
            } else {
                this.ab = str3;
            }
        }

        public static final /* synthetic */ void write$Self$app_playRelease(Busy busy, do3 do3Var, tf3 tf3Var) {
            if (do3Var.w(tf3Var) || !kr1.n(busy.why, BuildConfig.VERSION_NAME)) {
                do3Var.u(tf3Var, 0, busy.why);
            }
            if (do3Var.w(tf3Var) || !kr1.n(busy.text, BuildConfig.VERSION_NAME)) {
                do3Var.u(tf3Var, 1, busy.text);
            }
            if (!do3Var.w(tf3Var) && kr1.n(busy.ab, BuildConfig.VERSION_NAME)) {
                return;
            }
            do3Var.u(tf3Var, 2, busy.ab);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Busy)) {
                return false;
            }
            Busy busy = (Busy) obj;
            return kr1.n(this.why, busy.why) && kr1.n(this.text, busy.text) && kr1.n(this.ab, busy.ab);
        }

        public final String getAb() {
            return this.ab;
        }

        public final String getText() {
            return this.text;
        }

        public final String getWhy() {
            return this.why;
        }

        public final int hashCode() {
            return this.ab.hashCode() + ud2.i(this.why.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            return fq2.r(fq2.t("Busy(why=", this.why, ", text=", this.text, ", ab="), this.ab, ")");
        }
    }

    public final class CarryHint extends ChatEvent {
        public static final CarryHint INSTANCE = new CarryHint();
        private static final /* synthetic */ ly1 $cachedSerializer$delegate = yo4.H(q22.c, new lg(9));

        public final qu1 serializer() {
            return (qu1) $cachedSerializer$delegate.getValue();
        }
    }

    public final class ChatMeta extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String chatId;
        private final String mode;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$ChatMeta$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ChatMeta(String str, String str2, int i) {
            if (3 != (i & 3)) {
                gm4.P(i, 3, ChatEvent$ChatMeta$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.chatId = str;
            this.mode = str2;
        }

        public static final /* synthetic */ void write$Self$app_playRelease(ChatMeta chatMeta, do3 do3Var, tf3 tf3Var) {
            do3Var.u(tf3Var, 0, chatMeta.chatId);
            do3Var.u(tf3Var, 1, chatMeta.mode);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatMeta)) {
                return false;
            }
            ChatMeta chatMeta = (ChatMeta) obj;
            return kr1.n(this.chatId, chatMeta.chatId) && kr1.n(this.mode, chatMeta.mode);
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final int hashCode() {
            return this.mode.hashCode() + (this.chatId.hashCode() * 31);
        }

        public final String toString() {
            return "ChatMeta(chatId=" + this.chatId + ", mode=" + this.mode + ")";
        }
    }

    public final class Companion {
        public final qu1 serializer() {
            return (qu1) ChatEvent.$cachedSerializer$delegate.getValue();
        }
    }

    public final class Delta extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String chunk;
        private final String speaker;
        private final int turn;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Delta$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Delta(int i, int i2, String str, String str2) {
            if (7 != (i & 7)) {
                gm4.P(i, 7, ChatEvent$Delta$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.speaker = str;
            this.turn = i2;
            this.chunk = str2;
        }

        public static final /* synthetic */ void write$Self$app_playRelease(Delta delta, do3 do3Var, tf3 tf3Var) {
            do3Var.u(tf3Var, 0, delta.speaker);
            do3Var.l(1, delta.turn, tf3Var);
            do3Var.u(tf3Var, 2, delta.chunk);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Delta)) {
                return false;
            }
            Delta delta = (Delta) obj;
            return kr1.n(this.speaker, delta.speaker) && this.turn == delta.turn && kr1.n(this.chunk, delta.chunk);
        }

        public final String getChunk() {
            return this.chunk;
        }

        public final int hashCode() {
            return this.chunk.hashCode() + fq2.e(this.turn, this.speaker.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Delta(speaker=");
            sb.append(this.speaker);
            sb.append(", turn=");
            sb.append(this.turn);
            sb.append(", chunk=");
            return fq2.r(sb, this.chunk, ")");
        }
    }

    public final class Done extends ChatEvent {
        public static final Done INSTANCE = new Done();
        private static final /* synthetic */ ly1 $cachedSerializer$delegate = yo4.H(q22.c, new lg(10));

        public final qu1 serializer() {
            return (qu1) $cachedSerializer$delegate.getValue();
        }
    }

    public final class Error extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String code;
        private final String content;
        private final String cta;
        private final String speaker;
        private final int turn;
        private final String url;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str, int i2, String str2, String str3, String str4, String str5) {
            if (4 != (i & 4)) {
                gm4.P(i, 4, ChatEvent$Error$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.speaker = (i & 1) == 0 ? "system" : str;
            if ((i & 2) == 0) {
                this.turn = 0;
            } else {
                this.turn = i2;
            }
            this.content = str2;
            if ((i & 8) == 0) {
                this.code = null;
            } else {
                this.code = str3;
            }
            if ((i & 16) == 0) {
                this.url = null;
            } else {
                this.url = str4;
            }
            if ((i & 32) == 0) {
                this.cta = null;
            } else {
                this.cta = str5;
            }
        }

        public Error(String str, String str2, String str3, String str4) {
            this.speaker = "system";
            this.turn = 0;
            this.content = str;
            this.code = str2;
            this.url = str3;
            this.cta = str4;
        }

        public static final /* synthetic */ void write$Self$app_playRelease(Error error, do3 do3Var, tf3 tf3Var) {
            if (do3Var.w(tf3Var) || !kr1.n(error.speaker, "system")) {
                do3Var.u(tf3Var, 0, error.speaker);
            }
            if (do3Var.w(tf3Var) || error.turn != 0) {
                do3Var.l(1, error.turn, tf3Var);
            }
            String str = error.content;
            String str2 = error.cta;
            String str3 = error.url;
            String str4 = error.code;
            do3Var.u(tf3Var, 2, str);
            if (do3Var.w(tf3Var) || str4 != null) {
                do3Var.p(tf3Var, 3, lo3.a, str4);
            }
            if (do3Var.w(tf3Var) || str3 != null) {
                do3Var.p(tf3Var, 4, lo3.a, str3);
            }
            if (!do3Var.w(tf3Var) && str2 == null) {
                return;
            }
            do3Var.p(tf3Var, 5, lo3.a, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return kr1.n(this.speaker, error.speaker) && this.turn == error.turn && kr1.n(this.content, error.content) && kr1.n(this.code, error.code) && kr1.n(this.url, error.url) && kr1.n(this.cta, error.cta);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getCta() {
            return this.cta;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int i = ud2.i(fq2.e(this.turn, this.speaker.hashCode() * 31, 31), 31, this.content);
            String str = this.code;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.url;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cta;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(speaker=");
            sb.append(this.speaker);
            sb.append(", turn=");
            sb.append(this.turn);
            sb.append(", content=");
            ud2.v(sb, this.content, ", code=", this.code, ", url=");
            sb.append(this.url);
            sb.append(", cta=");
            sb.append(this.cta);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class InstrRefused extends ChatEvent {
        private final int limit;
        private final Map<String, Integer> limits;
        private final String plan;
        private final String reason;
        private final int retryAfter;
        private final String scope;
        public static final Companion Companion = new Companion();
        private static final ly1[] $childSerializers = {null, null, null, null, null, yo4.H(q22.c, new lg(11))};

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$InstrRefused$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InstrRefused(int i, String str, String str2, String str3, int i2, int i3, Map map) {
            this.reason = (i & 1) == 0 ? "refused" : str;
            if ((i & 2) == 0) {
                this.scope = BuildConfig.VERSION_NAME;
            } else {
                this.scope = str2;
            }
            if ((i & 4) == 0) {
                this.plan = BuildConfig.VERSION_NAME;
            } else {
                this.plan = str3;
            }
            if ((i & 8) == 0) {
                this.limit = 0;
            } else {
                this.limit = i2;
            }
            if ((i & 16) == 0) {
                this.retryAfter = 0;
            } else {
                this.retryAfter = i3;
            }
            if ((i & 32) == 0) {
                this.limits = a31.c;
            } else {
                this.limits = map;
            }
        }

        public static final /* synthetic */ void write$Self$app_playRelease(InstrRefused instrRefused, do3 do3Var, tf3 tf3Var) {
            if (do3Var.w(tf3Var) || !kr1.n(instrRefused.reason, "refused")) {
                do3Var.u(tf3Var, 0, instrRefused.reason);
            }
            if (do3Var.w(tf3Var) || !kr1.n(instrRefused.scope, BuildConfig.VERSION_NAME)) {
                do3Var.u(tf3Var, 1, instrRefused.scope);
            }
            if (do3Var.w(tf3Var) || !kr1.n(instrRefused.plan, BuildConfig.VERSION_NAME)) {
                do3Var.u(tf3Var, 2, instrRefused.plan);
            }
            if (do3Var.w(tf3Var) || instrRefused.limit != 0) {
                do3Var.l(3, instrRefused.limit, tf3Var);
            }
            if (do3Var.w(tf3Var) || instrRefused.retryAfter != 0) {
                do3Var.l(4, instrRefused.retryAfter, tf3Var);
            }
            if (!do3Var.w(tf3Var) && kr1.n(instrRefused.limits, a31.c)) {
                return;
            }
            do3Var.q(tf3Var, 5, (qu1) $childSerializers[5].getValue(), instrRefused.limits);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrRefused)) {
                return false;
            }
            InstrRefused instrRefused = (InstrRefused) obj;
            return kr1.n(this.reason, instrRefused.reason) && kr1.n(this.scope, instrRefused.scope) && kr1.n(this.plan, instrRefused.plan) && this.limit == instrRefused.limit && this.retryAfter == instrRefused.retryAfter && kr1.n(this.limits, instrRefused.limits);
        }

        public final int getLimit() {
            return this.limit;
        }

        public final Map<String, Integer> getLimits() {
            return this.limits;
        }

        public final String getPlan() {
            return this.plan;
        }

        public final String getReason() {
            return this.reason;
        }

        public final int getRetryAfter() {
            return this.retryAfter;
        }

        public final String getScope() {
            return this.scope;
        }

        public final int hashCode() {
            return this.limits.hashCode() + fq2.e(this.retryAfter, fq2.e(this.limit, ud2.i(ud2.i(this.reason.hashCode() * 31, 31, this.scope), 31, this.plan), 31), 31);
        }

        public final String toString() {
            StringBuilder sbT = fq2.t("InstrRefused(reason=", this.reason, ", scope=", this.scope, ", plan=");
            sbT.append(this.plan);
            sbT.append(", limit=");
            sbT.append(this.limit);
            sbT.append(", retryAfter=");
            sbT.append(this.retryAfter);
            sbT.append(", limits=");
            sbT.append(this.limits);
            sbT.append(")");
            return sbT.toString();
        }
    }

    public final class Message extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String content;
        private final String speaker;
        private final int turn;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Message$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Message(int i, int i2, String str, String str2) {
            if (7 != (i & 7)) {
                gm4.P(i, 7, ChatEvent$Message$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.speaker = str;
            this.turn = i2;
            this.content = str2;
        }

        public static final /* synthetic */ void write$Self$app_playRelease(Message message, do3 do3Var, tf3 tf3Var) {
            do3Var.u(tf3Var, 0, message.speaker);
            do3Var.l(1, message.turn, tf3Var);
            do3Var.u(tf3Var, 2, message.content);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return kr1.n(this.speaker, message.speaker) && this.turn == message.turn && kr1.n(this.content, message.content);
        }

        public final String getContent() {
            return this.content;
        }

        public final int hashCode() {
            return this.content.hashCode() + fq2.e(this.turn, this.speaker.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Message(speaker=");
            sb.append(this.speaker);
            sb.append(", turn=");
            sb.append(this.turn);
            sb.append(", content=");
            return fq2.r(sb, this.content, ")");
        }
    }

    public final class Thinking extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String speaker;
        private final int turn;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Thinking$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Thinking(int i, int i2, String str) {
            if (3 != (i & 3)) {
                gm4.P(i, 3, ChatEvent$Thinking$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.speaker = str;
            this.turn = i2;
        }

        public static final /* synthetic */ void write$Self$app_playRelease(Thinking thinking, do3 do3Var, tf3 tf3Var) {
            do3Var.u(tf3Var, 0, thinking.speaker);
            do3Var.l(1, thinking.turn, tf3Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Thinking)) {
                return false;
            }
            Thinking thinking = (Thinking) obj;
            return kr1.n(this.speaker, thinking.speaker) && this.turn == thinking.turn;
        }

        public final int hashCode() {
            return Integer.hashCode(this.turn) + (this.speaker.hashCode() * 31);
        }

        public final String toString() {
            return "Thinking(speaker=" + this.speaker + ", turn=" + this.turn + ")";
        }
    }

    public final class Unknown extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String type;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$Unknown$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Unknown(int i, String str) {
            if (1 == (i & 1)) {
                this.type = str;
            } else {
                gm4.P(i, 1, ChatEvent$Unknown$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public Unknown(String str) {
            str.getClass();
            this.type = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && kr1.n(this.type, ((Unknown) obj).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return fq2.n("Unknown(type=", this.type, ")");
        }
    }

    public final class UserEcho extends ChatEvent {
        public static final Companion Companion = new Companion();
        private final String content;
        private final String messageId;
        private final int turn;

        public final class Companion {
            public final qu1 serializer() {
                return ChatEvent$UserEcho$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UserEcho(int i, int i2, String str, String str2) {
            if (3 != (i & 3)) {
                gm4.P(i, 3, ChatEvent$UserEcho$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.turn = i2;
            this.content = str;
            if ((i & 4) == 0) {
                this.messageId = null;
            } else {
                this.messageId = str2;
            }
        }

        public static final /* synthetic */ void write$Self$app_playRelease(UserEcho userEcho, do3 do3Var, tf3 tf3Var) {
            int i = userEcho.turn;
            String str = userEcho.messageId;
            do3Var.l(0, i, tf3Var);
            do3Var.u(tf3Var, 1, userEcho.content);
            if (!do3Var.w(tf3Var) && str == null) {
                return;
            }
            do3Var.p(tf3Var, 2, lo3.a, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserEcho)) {
                return false;
            }
            UserEcho userEcho = (UserEcho) obj;
            return this.turn == userEcho.turn && kr1.n(this.content, userEcho.content) && kr1.n(this.messageId, userEcho.messageId);
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final int hashCode() {
            int i = ud2.i(Integer.hashCode(this.turn) * 31, 31, this.content);
            String str = this.messageId;
            return i + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserEcho(turn=");
            sb.append(this.turn);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", messageId=");
            return fq2.r(sb, this.messageId, ")");
        }
    }
}
