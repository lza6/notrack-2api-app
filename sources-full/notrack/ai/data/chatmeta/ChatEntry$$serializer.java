package notrack.ai.data.chatmeta;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.h82;
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
public final /* synthetic */ class ChatEntry$$serializer implements ff1 {
    public static final ChatEntry$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEntry$$serializer chatEntry$$serializer = new ChatEntry$$serializer();
        INSTANCE = chatEntry$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.chatmeta.ChatEntry", chatEntry$$serializer, 6);
        xw2Var.k("folderId", true);
        xw2Var.k("pinned", true);
        xw2Var.k("archived", true);
        xw2Var.k("order", true);
        xw2Var.k("titleOverride", true);
        xw2Var.k("updatedAt", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ = vl0.Q(lo3Var);
        qu1 qu1VarQ2 = vl0.Q(lo3Var);
        cw cwVar = cw.a;
        return new qu1[]{qu1VarQ, cwVar, cwVar, oq1.a, qu1VarQ2, h82.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        int i = 0;
        boolean zS = false;
        boolean zS2 = false;
        int iW = 0;
        String str = null;
        String str2 = null;
        long jA = 0;
        boolean z = true;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) nk0VarB.g(tf3Var, 0, lo3.a, str);
                    i |= 1;
                    break;
                case 1:
                    zS = nk0VarB.s(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zS2 = nk0VarB.s(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) nk0VarB.g(tf3Var, 4, lo3.a, str2);
                    i |= 16;
                    break;
                case 5:
                    jA = nk0VarB.A(tf3Var, 5);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEntry(i, str, zS, zS2, iW, str2, jA);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEntry chatEntry = (ChatEntry) obj;
        chatEntry.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatEntry.write$Self$app_playRelease(chatEntry, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
