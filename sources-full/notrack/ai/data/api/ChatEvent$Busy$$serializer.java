package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatEvent$Busy$$serializer implements ff1 {
    public static final ChatEvent$Busy$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEvent$Busy$$serializer chatEvent$Busy$$serializer = new ChatEvent$Busy$$serializer();
        INSTANCE = chatEvent$Busy$$serializer;
        xw2 xw2Var = new xw2("busy", chatEvent$Busy$$serializer, 3);
        xw2Var.k("why", true);
        xw2Var.k("text", true);
        xw2Var.k("ab", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strN = nk0VarB.n(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                strN2 = nk0VarB.n(tf3Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    u41.f(iH);
                    return null;
                }
                strN3 = nk0VarB.n(tf3Var, 2);
                i |= 4;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEvent.Busy(i, strN, strN2, strN3);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEvent.Busy busy = (ChatEvent.Busy) obj;
        busy.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatEvent.Busy.write$Self$app_playRelease(busy, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
