package notrack.ai.data.account;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;
import notrack.ai.data.avatars.AvatarView;
import notrack.ai.data.avatars.AvatarView$$serializer;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class AccountSummary$$serializer implements ff1 {
    public static final AccountSummary$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        AccountSummary$$serializer accountSummary$$serializer = new AccountSummary$$serializer();
        INSTANCE = accountSummary$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.account.AccountSummary", accountSummary$$serializer, 2);
        xw2Var.k("avatar", true);
        xw2Var.k("avatar_ai", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        AvatarView$$serializer avatarView$$serializer = AvatarView$$serializer.INSTANCE;
        return new qu1[]{vl0.Q(avatarView$$serializer), vl0.Q(avatarView$$serializer)};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i = 0;
        AvatarView avatarView = null;
        AvatarView avatarView2 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                avatarView = (AvatarView) nk0VarB.g(tf3Var, 0, AvatarView$$serializer.INSTANCE, avatarView);
                i |= 1;
            } else {
                if (iH != 1) {
                    u41.f(iH);
                    return null;
                }
                avatarView2 = (AvatarView) nk0VarB.g(tf3Var, 1, AvatarView$$serializer.INSTANCE, avatarView2);
                i |= 2;
            }
        }
        nk0VarB.q(tf3Var);
        return new AccountSummary(i, avatarView, avatarView2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        AccountSummary accountSummary = (AccountSummary) obj;
        accountSummary.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        AccountSummary.write$Self$app_playRelease(accountSummary, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
