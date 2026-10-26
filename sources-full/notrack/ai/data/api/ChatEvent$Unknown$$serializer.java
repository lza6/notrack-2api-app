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
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatEvent$Unknown$$serializer implements ff1 {
    public static final ChatEvent$Unknown$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEvent$Unknown$$serializer chatEvent$Unknown$$serializer = new ChatEvent$Unknown$$serializer();
        INSTANCE = chatEvent$Unknown$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.ChatEvent.Unknown", chatEvent$Unknown$$serializer, 1);
        xw2Var.k(TeXSymbolParser.TYPE_ATTR, false);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        return new qu1[]{lo3.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        String strN = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else {
                if (iH != 0) {
                    u41.f(iH);
                    return null;
                }
                strN = nk0VarB.n(tf3Var, 0);
                i = 1;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEvent.Unknown(i, strN);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEvent.Unknown unknown = (ChatEvent.Unknown) obj;
        unknown.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        do3VarA.u(tf3Var, 0, unknown.type);
        do3VarA.v(tf3Var);
    }
}
