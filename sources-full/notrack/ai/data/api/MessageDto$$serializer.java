package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class MessageDto$$serializer implements ff1 {
    public static final MessageDto$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        MessageDto$$serializer messageDto$$serializer = new MessageDto$$serializer();
        INSTANCE = messageDto$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.MessageDto", messageDto$$serializer, 9);
        xw2Var.k(TeXSymbolParser.TYPE_ATTR, false);
        xw2Var.k("speaker", false);
        xw2Var.k("turn", false);
        xw2Var.k("content", false);
        xw2Var.k("created_at", false);
        xw2Var.k("duration_ms", true);
        xw2Var.k("attachments", true);
        xw2Var.k("message_id", true);
        xw2Var.k("via", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = MessageDto.$childSerializers;
        lo3 lo3Var = lo3.a;
        oq1 oq1Var = oq1.a;
        return new qu1[]{lo3Var, lo3Var, oq1Var, lo3Var, lo3Var, vl0.Q(oq1Var), vl0.Q((qu1) ly1VarArr[6].getValue()), vl0.Q(lo3Var), vl0.Q(lo3Var)};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = MessageDto.$childSerializers;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String strN = null;
        String strN2 = null;
        int iW = 0;
        String strN3 = null;
        String strN4 = null;
        Integer num = null;
        List list = null;
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
                    strN2 = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iW = nk0VarB.w(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strN3 = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN4 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) nk0VarB.g(tf3Var, 5, oq1.a, num);
                    i |= 32;
                    break;
                case 6:
                    list = (List) nk0VarB.g(tf3Var, 6, (qu1) ly1VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) nk0VarB.g(tf3Var, 7, lo3.a, str2);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    str = (String) nk0VarB.g(tf3Var, 8, lo3.a, str);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new MessageDto(i, strN, strN2, iW, strN3, strN4, num, list, str2, str);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        MessageDto messageDto = (MessageDto) obj;
        messageDto.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        MessageDto.write$Self$app_playRelease(messageDto, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
