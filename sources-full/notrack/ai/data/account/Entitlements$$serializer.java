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
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.avatars.AvatarView$$serializer;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class Entitlements$$serializer implements ff1 {
    public static final Entitlements$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        Entitlements$$serializer entitlements$$serializer = new Entitlements$$serializer();
        INSTANCE = entitlements$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.account.Entitlements", entitlements$$serializer, 13);
        xw2Var.k("signed_in", true);
        xw2Var.k("account_id", true);
        xw2Var.k("nickname", true);
        xw2Var.k("plan", true);
        xw2Var.k("plan_active", true);
        xw2Var.k("period_end", true);
        xw2Var.k("credits", true);
        xw2Var.k("ads", true);
        xw2Var.k("age_verified", true);
        xw2Var.k("source", true);
        xw2Var.k("limits", true);
        xw2Var.k("avatar", true);
        xw2Var.k("avatar_ai", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ = vl0.Q(lo3Var);
        qu1 qu1VarQ2 = vl0.Q(lo3Var);
        qu1 qu1VarQ3 = vl0.Q(lo3Var);
        AvatarView$$serializer avatarView$$serializer = AvatarView$$serializer.INSTANCE;
        qu1 qu1VarQ4 = vl0.Q(avatarView$$serializer);
        qu1 qu1VarQ5 = vl0.Q(avatarView$$serializer);
        cw cwVar = cw.a;
        return new qu1[]{cwVar, qu1VarQ, qu1VarQ2, lo3Var, cwVar, qu1VarQ3, oq1.a, cwVar, cwVar, lo3Var, PlanLimits$$serializer.INSTANCE, qu1VarQ4, qu1VarQ5};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        AvatarView avatarView = null;
        AvatarView avatarView2 = null;
        boolean z = true;
        PlanLimits planLimits = null;
        int i = 0;
        boolean zS = false;
        String str = null;
        String str2 = null;
        String strN = null;
        boolean zS2 = false;
        String str3 = null;
        int iW = 0;
        boolean zS3 = false;
        boolean zS4 = false;
        String strN2 = null;
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
                    str = (String) nk0VarB.g(tf3Var, 1, lo3.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) nk0VarB.g(tf3Var, 2, lo3.a, str2);
                    i |= 4;
                    break;
                case 3:
                    strN = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    continue;
                case 4:
                    zS2 = nk0VarB.s(tf3Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    str3 = (String) nk0VarB.g(tf3Var, 5, lo3.a, str3);
                    i |= 32;
                    break;
                case 6:
                    iW = nk0VarB.w(tf3Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    zS3 = nk0VarB.s(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    continue;
                case 8:
                    zS4 = nk0VarB.s(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    continue;
                case 9:
                    strN2 = nk0VarB.n(tf3Var, 9);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    continue;
                case 10:
                    planLimits = (PlanLimits) nk0VarB.v(tf3Var, 10, PlanLimits$$serializer.INSTANCE, planLimits);
                    i |= 1024;
                    break;
                case 11:
                    avatarView2 = (AvatarView) nk0VarB.g(tf3Var, 11, AvatarView$$serializer.INSTANCE, avatarView2);
                    i |= 2048;
                    break;
                case 12:
                    avatarView = (AvatarView) nk0VarB.g(tf3Var, 12, AvatarView$$serializer.INSTANCE, avatarView);
                    i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
            z = z;
        }
        nk0VarB.q(tf3Var);
        return new Entitlements(i, zS, str, str2, strN, zS2, str3, iW, zS3, zS4, strN2, planLimits, avatarView2, avatarView);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        Entitlements entitlements = (Entitlements) obj;
        entitlements.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        Entitlements.write$Self$app_playRelease(entitlements, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
