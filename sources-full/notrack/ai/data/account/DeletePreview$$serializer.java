package notrack.ai.data.account;

import defpackage.cv0;
import defpackage.cw;
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
public final /* synthetic */ class DeletePreview$$serializer implements ff1 {
    public static final DeletePreview$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        DeletePreview$$serializer deletePreview$$serializer = new DeletePreview$$serializer();
        INSTANCE = deletePreview$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.account.DeletePreview", deletePreview$$serializer, 10);
        xw2Var.k("ok", true);
        xw2Var.k("blocked", true);
        xw2Var.k("code", true);
        xw2Var.k("has_plan", true);
        xw2Var.k("plan", true);
        xw2Var.k("source", true);
        xw2Var.k("days_left", true);
        xw2Var.k("will_cancel", true);
        xw2Var.k("will_forfeit", true);
        xw2Var.k("nickname", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ = vl0.Q(lo3Var);
        cw cwVar = cw.a;
        return new qu1[]{cwVar, cwVar, lo3Var, cwVar, lo3Var, lo3Var, oq1.a, cwVar, cwVar, qu1VarQ};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        int i = 0;
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        int iW = 0;
        boolean zS4 = false;
        boolean zS5 = false;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zS = nk0VarB.s(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zS2 = nk0VarB.s(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strN = nk0VarB.n(tf3Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zS3 = nk0VarB.s(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN2 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strN3 = nk0VarB.n(tf3Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iW = nk0VarB.w(tf3Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zS4 = nk0VarB.s(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    zS5 = nk0VarB.s(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                case 9:
                    str = (String) nk0VarB.g(tf3Var, 9, lo3.a, str);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    break;
                default:
                    u41.f(iH);
                    return obj;
            }
            obj = null;
        }
        nk0VarB.q(tf3Var);
        return new DeletePreview(i, zS, zS2, strN, zS3, strN2, strN3, iW, zS4, zS5, str);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        DeletePreview deletePreview = (DeletePreview) obj;
        deletePreview.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        DeletePreview.write$Self$app_playRelease(deletePreview, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
