package notrack.ai.data.api;

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
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class DispatchRequest {
    private final List<String> attachments;
    private final String chatId;
    private final boolean edit;
    private final String instructions;
    private final String locale;
    private final int maxTurns;
    private final String mode;
    private final String model;
    private final String persona;
    private final boolean regenerate;
    private final String userInput;
    private final String via;
    public static final Companion Companion = new Companion();
    private static final ly1[] $childSerializers = {null, null, null, null, null, yo4.H(q22.c, new lg(19)), null, null, null, null, null, null};

    public final class Companion {
        public final qu1 serializer() {
            return DispatchRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DispatchRequest(int i, String str, String str2, String str3, int i2, String str4, List list, boolean z, boolean z2, String str5, String str6, String str7, String str8) {
        if (1 != (i & 1)) {
            gm4.P(i, 1, DispatchRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userInput = str;
        if ((i & 2) == 0) {
            this.mode = "usual";
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.model = "C";
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.maxTurns = 1;
        } else {
            this.maxTurns = i2;
        }
        if ((i & 16) == 0) {
            this.chatId = null;
        } else {
            this.chatId = str4;
        }
        if ((i & 32) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list;
        }
        if ((i & 64) == 0) {
            this.regenerate = false;
        } else {
            this.regenerate = z;
        }
        if ((i & Uuid.SIZE_BITS) == 0) {
            this.edit = false;
        } else {
            this.edit = z2;
        }
        if ((i & FontInfo.NUMBER_OF_CHAR_CODES) == 0) {
            this.via = null;
        } else {
            this.via = str5;
        }
        if ((i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.locale = null;
        } else {
            this.locale = str6;
        }
        if ((i & 1024) == 0) {
            this.instructions = null;
        } else {
            this.instructions = str7;
        }
        if ((i & 2048) == 0) {
            this.persona = null;
        } else {
            this.persona = str8;
        }
    }

    public DispatchRequest(String str, String str2, ArrayList arrayList, boolean z, boolean z2, String str3, String str4, String str5, String str6) {
        str.getClass();
        this.userInput = str;
        this.mode = "usual";
        this.model = "C";
        this.maxTurns = 1;
        this.chatId = str2;
        this.attachments = arrayList;
        this.regenerate = z;
        this.edit = z2;
        this.via = str3;
        this.locale = str4;
        this.instructions = str5;
        this.persona = str6;
    }

    public static final /* synthetic */ void write$Self$app_playRelease(DispatchRequest dispatchRequest, do3 do3Var, tf3 tf3Var) {
        String str = dispatchRequest.userInput;
        String str2 = dispatchRequest.persona;
        String str3 = dispatchRequest.instructions;
        String str4 = dispatchRequest.locale;
        String str5 = dispatchRequest.via;
        boolean z = dispatchRequest.edit;
        boolean z2 = dispatchRequest.regenerate;
        List<String> list = dispatchRequest.attachments;
        String str6 = dispatchRequest.chatId;
        int i = dispatchRequest.maxTurns;
        String str7 = dispatchRequest.model;
        String str8 = dispatchRequest.mode;
        do3Var.u(tf3Var, 0, str);
        if (do3Var.w(tf3Var) || !kr1.n(str8, "usual")) {
            do3Var.u(tf3Var, 1, str8);
        }
        if (do3Var.w(tf3Var) || !kr1.n(str7, "C")) {
            do3Var.u(tf3Var, 2, str7);
        }
        if (do3Var.w(tf3Var) || i != 1) {
            do3Var.l(3, i, tf3Var);
        }
        if (do3Var.w(tf3Var) || str6 != null) {
            do3Var.p(tf3Var, 4, lo3.a, str6);
        }
        if (do3Var.w(tf3Var) || list != null) {
            do3Var.p(tf3Var, 5, (qu1) $childSerializers[5].getValue(), list);
        }
        if (do3Var.w(tf3Var) || z2) {
            do3Var.c(tf3Var, 6, z2);
        }
        if (do3Var.w(tf3Var) || z) {
            do3Var.c(tf3Var, 7, z);
        }
        if (do3Var.w(tf3Var) || str5 != null) {
            do3Var.p(tf3Var, 8, lo3.a, str5);
        }
        if (do3Var.w(tf3Var) || str4 != null) {
            do3Var.p(tf3Var, 9, lo3.a, str4);
        }
        if (do3Var.w(tf3Var) || str3 != null) {
            do3Var.p(tf3Var, 10, lo3.a, str3);
        }
        if (!do3Var.w(tf3Var) && str2 == null) {
            return;
        }
        do3Var.p(tf3Var, 11, lo3.a, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DispatchRequest)) {
            return false;
        }
        DispatchRequest dispatchRequest = (DispatchRequest) obj;
        return kr1.n(this.userInput, dispatchRequest.userInput) && kr1.n(this.mode, dispatchRequest.mode) && kr1.n(this.model, dispatchRequest.model) && this.maxTurns == dispatchRequest.maxTurns && kr1.n(this.chatId, dispatchRequest.chatId) && kr1.n(this.attachments, dispatchRequest.attachments) && this.regenerate == dispatchRequest.regenerate && this.edit == dispatchRequest.edit && kr1.n(this.via, dispatchRequest.via) && kr1.n(this.locale, dispatchRequest.locale) && kr1.n(this.instructions, dispatchRequest.instructions) && kr1.n(this.persona, dispatchRequest.persona);
    }

    public final int hashCode() {
        int iE = fq2.e(this.maxTurns, ud2.i(ud2.i(this.userInput.hashCode() * 31, 31, this.mode), 31, this.model), 31);
        String str = this.chatId;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.attachments;
        int iK = ud2.k(ud2.k((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.regenerate), 31, this.edit);
        String str2 = this.via;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locale;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.instructions;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.persona;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("DispatchRequest(userInput=", this.userInput, ", mode=", this.mode, ", model=");
        sbT.append(this.model);
        sbT.append(", maxTurns=");
        sbT.append(this.maxTurns);
        sbT.append(", chatId=");
        sbT.append(this.chatId);
        sbT.append(", attachments=");
        sbT.append(this.attachments);
        sbT.append(", regenerate=");
        sbT.append(this.regenerate);
        sbT.append(", edit=");
        sbT.append(this.edit);
        sbT.append(", via=");
        ud2.v(sbT, this.via, ", locale=", this.locale, ", instructions=");
        sbT.append(this.instructions);
        sbT.append(", persona=");
        sbT.append(this.persona);
        sbT.append(")");
        return sbT.toString();
    }
}
