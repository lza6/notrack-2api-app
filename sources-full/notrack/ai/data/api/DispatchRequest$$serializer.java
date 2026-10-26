package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.cw;
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
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class DispatchRequest$$serializer implements ff1 {
    public static final DispatchRequest$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        DispatchRequest$$serializer dispatchRequest$$serializer = new DispatchRequest$$serializer();
        INSTANCE = dispatchRequest$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.DispatchRequest", dispatchRequest$$serializer, 12);
        xw2Var.k("user_input", false);
        xw2Var.k("mode", true);
        xw2Var.k("model", true);
        xw2Var.k("max_turns", true);
        xw2Var.k("chat_id", true);
        xw2Var.k("attachments", true);
        xw2Var.k("regenerate", true);
        xw2Var.k("edit", true);
        xw2Var.k("via", true);
        xw2Var.k("locale", true);
        xw2Var.k("instructions", true);
        xw2Var.k("persona", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = DispatchRequest.$childSerializers;
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ = vl0.Q(lo3Var);
        qu1 qu1VarQ2 = vl0.Q((qu1) ly1VarArr[5].getValue());
        qu1 qu1VarQ3 = vl0.Q(lo3Var);
        qu1 qu1VarQ4 = vl0.Q(lo3Var);
        qu1 qu1VarQ5 = vl0.Q(lo3Var);
        qu1 qu1VarQ6 = vl0.Q(lo3Var);
        cw cwVar = cw.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, oq1.a, qu1VarQ, qu1VarQ2, cwVar, cwVar, qu1VarQ3, qu1VarQ4, qu1VarQ5, qu1VarQ6};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        ly1[] ly1VarArr;
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr2 = DispatchRequest.$childSerializers;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        String str4 = null;
        int i = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        int iW = 0;
        String str5 = null;
        List list = null;
        boolean zS = false;
        boolean zS2 = false;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ly1VarArr = ly1VarArr2;
                    strN = nk0VarB.n(tf3Var, 0);
                    i |= 1;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 1:
                    strN2 = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    ly1VarArr2 = ly1VarArr2;
                    break;
                case 2:
                    strN3 = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    ly1VarArr2 = ly1VarArr2;
                    break;
                case 3:
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    ly1VarArr2 = ly1VarArr2;
                    break;
                case 4:
                    ly1VarArr = ly1VarArr2;
                    str5 = (String) nk0VarB.g(tf3Var, 4, lo3.a, str5);
                    i |= 16;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 5:
                    ly1VarArr = ly1VarArr2;
                    list = (List) nk0VarB.g(tf3Var, 5, (qu1) ly1VarArr[5].getValue(), list);
                    i |= 32;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 6:
                    zS = nk0VarB.s(tf3Var, 6);
                    i |= 64;
                    ly1VarArr2 = ly1VarArr2;
                    break;
                case 7:
                    zS2 = nk0VarB.s(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    ly1VarArr2 = ly1VarArr2;
                    break;
                case 8:
                    ly1VarArr = ly1VarArr2;
                    str4 = (String) nk0VarB.g(tf3Var, 8, lo3.a, str4);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 9:
                    ly1VarArr = ly1VarArr2;
                    str3 = (String) nk0VarB.g(tf3Var, 9, lo3.a, str3);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 10:
                    ly1VarArr = ly1VarArr2;
                    str2 = (String) nk0VarB.g(tf3Var, 10, lo3.a, str2);
                    i |= 1024;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                case 11:
                    ly1VarArr = ly1VarArr2;
                    str = (String) nk0VarB.g(tf3Var, 11, lo3.a, str);
                    i |= 2048;
                    ly1VarArr2 = ly1VarArr;
                    z = z;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new DispatchRequest(i, strN, strN2, strN3, iW, str5, list, zS, zS2, str4, str3, str2, str);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        DispatchRequest dispatchRequest = (DispatchRequest) obj;
        dispatchRequest.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        DispatchRequest.write$Self$app_playRelease(dispatchRequest, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
