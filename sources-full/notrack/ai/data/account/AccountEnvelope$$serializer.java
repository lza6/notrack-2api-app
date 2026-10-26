package notrack.ai.data.account;

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
import defpackage.vl0;
import defpackage.xw2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class AccountEnvelope$$serializer implements ff1 {
    public static final AccountEnvelope$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        AccountEnvelope$$serializer accountEnvelope$$serializer = new AccountEnvelope$$serializer();
        INSTANCE = accountEnvelope$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.account.AccountEnvelope", accountEnvelope$$serializer, 10);
        xw2Var.k("ok", true);
        xw2Var.k("entitlements", true);
        xw2Var.k("account", true);
        xw2Var.k("nickname", true);
        xw2Var.k("code", true);
        xw2Var.k("error", true);
        xw2Var.k("message", true);
        xw2Var.k("recovery_code", true);
        xw2Var.k("suggestion", true);
        xw2Var.k("created", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        qu1 qu1VarQ = vl0.Q(AccountSummary$$serializer.INSTANCE);
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ2 = vl0.Q(lo3Var);
        qu1 qu1VarQ3 = vl0.Q(lo3Var);
        qu1 qu1VarQ4 = vl0.Q(lo3Var);
        qu1 qu1VarQ5 = vl0.Q(lo3Var);
        qu1 qu1VarQ6 = vl0.Q(lo3Var);
        qu1 qu1VarQ7 = vl0.Q(lo3Var);
        cw cwVar = cw.a;
        return new qu1[]{cwVar, Entitlements$$serializer.INSTANCE, qu1VarQ, qu1VarQ2, qu1VarQ3, qu1VarQ4, qu1VarQ5, qu1VarQ6, qu1VarQ7, cwVar};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        Entitlements entitlements = null;
        AccountSummary accountSummary = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean zS = false;
        boolean zS2 = false;
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
                    entitlements = (Entitlements) nk0VarB.v(tf3Var, 1, Entitlements$$serializer.INSTANCE, entitlements);
                    i |= 2;
                    break;
                case 2:
                    accountSummary = (AccountSummary) nk0VarB.g(tf3Var, 2, AccountSummary$$serializer.INSTANCE, accountSummary);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) nk0VarB.g(tf3Var, 3, lo3.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) nk0VarB.g(tf3Var, 4, lo3.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) nk0VarB.g(tf3Var, 5, lo3.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) nk0VarB.g(tf3Var, 6, lo3.a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) nk0VarB.g(tf3Var, 7, lo3.a, str6);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    str = (String) nk0VarB.g(tf3Var, 8, lo3.a, str);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                case 9:
                    zS2 = nk0VarB.s(tf3Var, 9);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    break;
                default:
                    u41.f(iH);
                    return obj;
            }
            obj = null;
        }
        nk0VarB.q(tf3Var);
        return new AccountEnvelope(i, zS, entitlements, accountSummary, str2, str3, str4, str5, str6, str, zS2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        AccountEnvelope accountEnvelope = (AccountEnvelope) obj;
        accountEnvelope.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        AccountEnvelope.write$Self$app_playRelease(accountEnvelope, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
