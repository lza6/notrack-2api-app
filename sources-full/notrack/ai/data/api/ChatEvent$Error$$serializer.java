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

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatEvent$Error$$serializer implements ff1 {
    public static final ChatEvent$Error$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEvent$Error$$serializer chatEvent$Error$$serializer = new ChatEvent$Error$$serializer();
        INSTANCE = chatEvent$Error$$serializer;
        xw2 xw2Var = new xw2("error", chatEvent$Error$$serializer, 6);
        xw2Var.k("speaker", true);
        xw2Var.k("turn", true);
        xw2Var.k("content", false);
        xw2Var.k("code", true);
        xw2Var.k("url", true);
        xw2Var.k("cta", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, oq1.a, lo3Var, vl0.Q(lo3Var), vl0.Q(lo3Var), vl0.Q(lo3Var)};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        int iW = 0;
        String strN = null;
        String strN2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    iW = nk0VarB.w(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strN2 = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) nk0VarB.g(tf3Var, 3, lo3.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) nk0VarB.g(tf3Var, 4, lo3.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) nk0VarB.g(tf3Var, 5, lo3.a, str3);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEvent.Error(i, strN, iW, strN2, str, str2, str3);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEvent.Error error = (ChatEvent.Error) obj;
        error.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatEvent.Error.write$Self$app_playRelease(error, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
