package notrack.ai.data.api;

import defpackage.do3;
import defpackage.fq2;
import defpackage.gm4;
import defpackage.kr1;
import defpackage.lo3;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.ud2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ChatDto {
    public static final Companion Companion = new Companion();
    private final String carriedTo;
    private final CarryDto carry;
    private final String chatId;
    private final String createdAt;
    private final String firstMessage;
    private final String instructions;
    private final int messageCount;
    private final String status;
    private final String title;
    private final String updatedAt;

    public final class Companion {
        public final qu1 serializer() {
            return ChatDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatDto(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, CarryDto carryDto, String str8) {
        if (121 != (i & 121)) {
            gm4.P(i, 121, ChatDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.chatId = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.firstMessage = null;
        } else {
            this.firstMessage = str3;
        }
        this.createdAt = str4;
        this.updatedAt = str5;
        this.messageCount = i2;
        this.status = str6;
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.instructions = null;
        } else {
            this.instructions = str7;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.carry = null;
        } else {
            this.carry = carryDto;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.carriedTo = null;
        } else {
            this.carriedTo = str8;
        }
    }

    public static final /* synthetic */ void write$Self$app_playRelease(ChatDto chatDto, do3 do3Var, tf3 tf3Var) {
        String str = chatDto.chatId;
        String str2 = chatDto.carriedTo;
        CarryDto carryDto = chatDto.carry;
        String str3 = chatDto.instructions;
        String str4 = chatDto.firstMessage;
        String str5 = chatDto.title;
        do3Var.u(tf3Var, 0, str);
        if (do3Var.w(tf3Var) || str5 != null) {
            do3Var.p(tf3Var, 1, lo3.a, str5);
        }
        if (do3Var.w(tf3Var) || str4 != null) {
            do3Var.p(tf3Var, 2, lo3.a, str4);
        }
        do3Var.u(tf3Var, 3, chatDto.createdAt);
        do3Var.u(tf3Var, 4, chatDto.updatedAt);
        do3Var.l(5, chatDto.messageCount, tf3Var);
        do3Var.u(tf3Var, 6, chatDto.status);
        if (do3Var.w(tf3Var) || str3 != null) {
            do3Var.p(tf3Var, 7, lo3.a, str3);
        }
        if (do3Var.w(tf3Var) || carryDto != null) {
            do3Var.p(tf3Var, 8, CarryDto$$serializer.INSTANCE, carryDto);
        }
        if (!do3Var.w(tf3Var) && str2 == null) {
            return;
        }
        do3Var.p(tf3Var, 9, lo3.a, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatDto)) {
            return false;
        }
        ChatDto chatDto = (ChatDto) obj;
        return kr1.n(this.chatId, chatDto.chatId) && kr1.n(this.title, chatDto.title) && kr1.n(this.firstMessage, chatDto.firstMessage) && kr1.n(this.createdAt, chatDto.createdAt) && kr1.n(this.updatedAt, chatDto.updatedAt) && this.messageCount == chatDto.messageCount && kr1.n(this.status, chatDto.status) && kr1.n(this.instructions, chatDto.instructions) && kr1.n(this.carry, chatDto.carry) && kr1.n(this.carriedTo, chatDto.carriedTo);
    }

    public final String getCarriedTo() {
        return this.carriedTo;
    }

    public final CarryDto getCarry() {
        return this.carry;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int iHashCode = this.chatId.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstMessage;
        int i = ud2.i(fq2.e(this.messageCount, ud2.i(ud2.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt), 31), 31, this.status);
        String str3 = this.instructions;
        int iHashCode3 = (i + (str3 == null ? 0 : str3.hashCode())) * 31;
        CarryDto carryDto = this.carry;
        int iHashCode4 = (iHashCode3 + (carryDto == null ? 0 : carryDto.hashCode())) * 31;
        String str4 = this.carriedTo;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("ChatDto(chatId=", this.chatId, ", title=", this.title, ", firstMessage=");
        ud2.v(sbT, this.firstMessage, ", createdAt=", this.createdAt, ", updatedAt=");
        sbT.append(this.updatedAt);
        sbT.append(", messageCount=");
        sbT.append(this.messageCount);
        sbT.append(", status=");
        ud2.v(sbT, this.status, ", instructions=", this.instructions, ", carry=");
        sbT.append(this.carry);
        sbT.append(", carriedTo=");
        sbT.append(this.carriedTo);
        sbT.append(")");
        return sbT.toString();
    }
}
