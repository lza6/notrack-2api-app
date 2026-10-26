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
import defpackage.xw2;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class ChatEvent$InstrRefused$$serializer implements ff1 {
    public static final ChatEvent$InstrRefused$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        ChatEvent$InstrRefused$$serializer chatEvent$InstrRefused$$serializer = new ChatEvent$InstrRefused$$serializer();
        INSTANCE = chatEvent$InstrRefused$$serializer;
        xw2 xw2Var = new xw2("instr_refused", chatEvent$InstrRefused$$serializer, 6);
        xw2Var.k("reason", true);
        xw2Var.k("scope", true);
        xw2Var.k("plan", true);
        xw2Var.k("limit", true);
        xw2Var.k("retry_after", true);
        xw2Var.k("limits", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = ChatEvent.InstrRefused.$childSerializers;
        lo3 lo3Var = lo3.a;
        oq1 oq1Var = oq1.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, oq1Var, oq1Var, ly1VarArr[5].getValue()};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = ChatEvent.InstrRefused.$childSerializers;
        boolean z = true;
        int i = 0;
        int iW = 0;
        int iW2 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        Map map = null;
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
                    strN3 = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iW2 = nk0VarB.w(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) nk0VarB.v(tf3Var, 5, (qu1) ly1VarArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new ChatEvent.InstrRefused(i, strN, strN2, strN3, iW, iW2, map);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ChatEvent.InstrRefused instrRefused = (ChatEvent.InstrRefused) obj;
        instrRefused.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        ChatEvent.InstrRefused.write$Self$app_playRelease(instrRefused, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
