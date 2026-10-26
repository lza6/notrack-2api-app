package notrack.ai.data.api;

import defpackage.cv0;
import defpackage.cw;
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
public final /* synthetic */ class DeleteFromResponse$$serializer implements ff1 {
    public static final DeleteFromResponse$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        DeleteFromResponse$$serializer deleteFromResponse$$serializer = new DeleteFromResponse$$serializer();
        INSTANCE = deleteFromResponse$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.api.DeleteFromResponse", deleteFromResponse$$serializer, 3);
        xw2Var.k("ok", true);
        xw2Var.k("chat_id", true);
        xw2Var.k("chat_deleted", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        cw cwVar = cw.a;
        return new qu1[]{cwVar, lo3.a, cwVar};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        boolean zS = false;
        boolean zS2 = false;
        String strN = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                zS = nk0VarB.s(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                strN = nk0VarB.n(tf3Var, 1);
                i |= 2;
            } else {
                if (iH != 2) {
                    u41.f(iH);
                    return null;
                }
                zS2 = nk0VarB.s(tf3Var, 2);
                i |= 4;
            }
        }
        nk0VarB.q(tf3Var);
        return new DeleteFromResponse(i, strN, zS, zS2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        DeleteFromResponse deleteFromResponse = (DeleteFromResponse) obj;
        deleteFromResponse.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        DeleteFromResponse.write$Self$app_playRelease(deleteFromResponse, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
