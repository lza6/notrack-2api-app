package notrack.ai.data.avatars;

import defpackage.cv0;
import defpackage.cw;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.ly1;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class AvatarCatalogue$$serializer implements ff1 {
    public static final AvatarCatalogue$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        AvatarCatalogue$$serializer avatarCatalogue$$serializer = new AvatarCatalogue$$serializer();
        INSTANCE = avatarCatalogue$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.avatars.AvatarCatalogue", avatarCatalogue$$serializer, 6);
        xw2Var.k("ok", true);
        xw2Var.k("version", true);
        xw2Var.k("categories", true);
        xw2Var.k("items", true);
        xw2Var.k("labels", true);
        xw2Var.k("lang", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = AvatarCatalogue.$childSerializers;
        lo3 lo3Var = lo3.a;
        return new qu1[]{cw.a, lo3Var, ly1VarArr[2].getValue(), ly1VarArr[3].getValue(), ly1VarArr[4].getValue(), lo3Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = AvatarCatalogue.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zS = false;
        String strN = null;
        List list = null;
        List list2 = null;
        Map map = null;
        String strN2 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zS = nk0VarB.s(tf3Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strN = nk0VarB.n(tf3Var, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) nk0VarB.v(tf3Var, 2, (qu1) ly1VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) nk0VarB.v(tf3Var, 3, (qu1) ly1VarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) nk0VarB.v(tf3Var, 4, (qu1) ly1VarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    strN2 = nk0VarB.n(tf3Var, 5);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new AvatarCatalogue(i, zS, strN, list, list2, map, strN2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        AvatarCatalogue avatarCatalogue = (AvatarCatalogue) obj;
        avatarCatalogue.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        AvatarCatalogue.write$Self$app_playRelease(avatarCatalogue, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
