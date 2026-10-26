package notrack.ai.data.api;

import defpackage.b72;
import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.oq1;
import defpackage.q22;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import defpackage.yo4;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class MessageDto {
    private final List<UploadResponse> attachments;
    private final String content;
    private final String createdAt;
    private final Integer durationMs;
    private final String messageId;
    private final String speaker;
    private final int turn;
    private final String type;
    private final String via;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, null, null, null, yo4.H(q22.c, new b72(2)), null, null};

    public final class Companion {
        public final qu1 serializer() {
            return MessageDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageDto(int i, String str, String str2, int i2, String str3, String str4, Integer num, List list, String str5, String str6) {
        if (31 != (i & 31)) {
            gm4.P(i, 31, MessageDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.speaker = str2;
        this.turn = i2;
        this.content = str3;
        this.createdAt = str4;
        if ((i & 32) == 0) {
            this.durationMs = null;
        } else {
            this.durationMs = num;
        }
        if ((i & 64) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str5;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.via = null;
        } else {
            this.via = str6;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(MessageDto messageDto, do3 do3Var, tf3 tf3Var) {
        String str = messageDto.type;
        String str2 = messageDto.via;
        String str3 = messageDto.messageId;
        List<UploadResponse> list = messageDto.attachments;
        Integer num = messageDto.durationMs;
        do3Var.u(tf3Var, 0, str);
        do3Var.u(tf3Var, 1, messageDto.speaker);
        do3Var.l(2, messageDto.turn, tf3Var);
        do3Var.u(tf3Var, 3, messageDto.content);
        do3Var.u(tf3Var, 4, messageDto.createdAt);
        if (do3Var.w(tf3Var) || num != null) {
            do3Var.p(tf3Var, 5, oq1.a, num);
        }
        if (do3Var.w(tf3Var) || list != null) {
            do3Var.p(tf3Var, 6, (qu1) $childSerializers[6].getValue(), list);
        }
        if (do3Var.w(tf3Var) || str3 != null) {
            do3Var.p(tf3Var, 7, lo3.a, str3);
        }
        if (!do3Var.w(tf3Var) && str2 == null) {
            return;
        }
        do3Var.p(tf3Var, 8, lo3.a, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageDto)) {
            return false;
        }
        MessageDto messageDto = (MessageDto) obj;
        return kr1.n(this.type, messageDto.type) && kr1.n(this.speaker, messageDto.speaker) && this.turn == messageDto.turn && kr1.n(this.content, messageDto.content) && kr1.n(this.createdAt, messageDto.createdAt) && kr1.n(this.durationMs, messageDto.durationMs) && kr1.n(this.attachments, messageDto.attachments) && kr1.n(this.messageId, messageDto.messageId) && kr1.n(this.via, messageDto.via);
    }

    public final List<UploadResponse> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSpeaker() {
        return this.speaker;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVia() {
        return this.via;
    }

    public final int hashCode() {
        int i = ud2.i(ud2.i(fq2.e(this.turn, ud2.i(this.type.hashCode() * 31, 31, this.speaker), 31), 31, this.content), 31, this.createdAt);
        Integer num = this.durationMs;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        List<UploadResponse> list = this.attachments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.messageId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.via;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("MessageDto(type=", this.type, ", speaker=", this.speaker, ", turn=");
        sbT.append(this.turn);
        sbT.append(", content=");
        sbT.append(this.content);
        sbT.append(", createdAt=");
        sbT.append(this.createdAt);
        sbT.append(", durationMs=");
        sbT.append(this.durationMs);
        sbT.append(", attachments=");
        sbT.append(this.attachments);
        sbT.append(", messageId=");
        sbT.append(this.messageId);
        sbT.append(", via=");
        return fq2.r(sbT, this.via, ")");
    }
}
