package notrack.ai.data.avatars;

import defpackage.cv0;
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

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class AvatarItem$$serializer implements ff1 {
    public static final AvatarItem$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        AvatarItem$$serializer avatarItem$$serializer = new AvatarItem$$serializer();
        INSTANCE = avatarItem$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.avatars.AvatarItem", avatarItem$$serializer, 6);
        xw2Var.k("id", false);
        xw2Var.k("cat", true);
        xw2Var.k("tier", true);
        xw2Var.k("url", true);
        xw2Var.k("url_sm", true);
        xw2Var.k("tile", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, vl0.Q(lo3Var), vl0.Q(lo3Var), vl0.Q(AvatarTile$$serializer.INSTANCE)};
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
        String str = null;
        String str2 = null;
        AvatarTile avatarTile = null;
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
                    str = (String) nk0VarB.g(tf3Var, 3, lo3.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) nk0VarB.g(tf3Var, 4, lo3.a, str2);
                    i |= 16;
                    break;
                case 5:
                    avatarTile = (AvatarTile) nk0VarB.g(tf3Var, 5, AvatarTile$$serializer.INSTANCE, avatarTile);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new AvatarItem(i, strN, strN2, strN3, str, str2, avatarTile);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        AvatarItem avatarItem = (AvatarItem) obj;
        avatarItem.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        AvatarItem.write$Self$app_playRelease(avatarItem, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
