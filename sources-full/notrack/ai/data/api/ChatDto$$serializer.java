package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatDto$$serializer implements ff1 {
    public static final ChatDto$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatDto$$serializer chatDto$$serializer = new ChatDto$$serializer();
        INSTANCE = chatDto$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.ChatDto", chatDto$$serializer, 10);
        xw2Var.k("chat_id", false);
        xw2Var.k("title", true);
        xw2Var.k("first_message", true);
        xw2Var.k("created_at", false);
        xw2Var.k("updated_at", false);
        xw2Var.k("message_count", false);
        xw2Var.k("status", false);
        xw2Var.k("instructions", true);
        xw2Var.k("carry", true);
        xw2Var.k("carried_to", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, vl0.Q(lo3Var), vl0.Q(lo3Var), lo3Var, lo3Var, oq1.a, lo3Var, vl0.Q(lo3Var), vl0.Q(CarryDto$$serializer.INSTANCE), vl0.Q(lo3Var)};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        String str = null;
        boolean z = true;
        CarryDto carryDto = null;
        int i = 0;
        String strN = null;
        String str2 = null;
        String str3 = null;
        String strN2 = null;
        String strN3 = null;
        int iW = 0;
        String strN4 = null;
        String str4 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strN = nk0VarB.n(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) nk0VarB.g(tf3Var, 1, lo3.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) nk0VarB.g(tf3Var, 2, lo3.a, str3);
                    i |= 4;
                    break;
                case 3:
                    strN2 = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN3 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iW = nk0VarB.w(tf3Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strN4 = nk0VarB.n(tf3Var, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) nk0VarB.g(tf3Var, 7, lo3.a, str4);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    carryDto = (CarryDto) nk0VarB.g(tf3Var, 8, CarryDto$$serializer.INSTANCE, carryDto);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                case 9:
                    str = (String) nk0VarB.g(tf3Var, 9, lo3.a, str);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatDto(i, strN, str2, str3, strN2, strN3, iW, strN4, str4, carryDto, str);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatDto chatDto = (ChatDto) obj;
        chatDto.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatDto.write$Self$app_playRelease(chatDto, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
