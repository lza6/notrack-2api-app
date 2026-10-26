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
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatEvent$Message$$serializer implements ff1 {
    public static final ChatEvent$Message$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEvent$Message$$serializer chatEvent$Message$$serializer = new ChatEvent$Message$$serializer();
        INSTANCE = chatEvent$Message$$serializer;
        xw2 xw2Var = new xw2("message", chatEvent$Message$$serializer, 3);
        xw2Var.k("speaker", false);
        xw2Var.k("turn", false);
        xw2Var.k("content", false);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, oq1.a, lo3Var};
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
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strN = nk0VarB.n(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                iW = nk0VarB.w(tf3Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    u41.f(iH);
                    return null;
                }
                strN2 = nk0VarB.n(tf3Var, 2);
                i |= 4;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEvent.Message(i, iW, strN, strN2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEvent.Message message = (ChatEvent.Message) obj;
        message.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatEvent.Message.write$Self$app_playRelease(message, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
