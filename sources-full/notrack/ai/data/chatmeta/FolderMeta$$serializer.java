package notrack.ai.data.chatmeta;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.h82;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.oq1;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.vl0;
import defpackage.xw2;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class FolderMeta$$serializer implements ff1 {
    public static final FolderMeta$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        FolderMeta$$serializer folderMeta$$serializer = new FolderMeta$$serializer();
        INSTANCE = folderMeta$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.chatmeta.FolderMeta", folderMeta$$serializer, 6);
        xw2Var.k("id", true);
        xw2Var.k("name", true);
        xw2Var.k("color", true);
        xw2Var.k("order", true);
        xw2Var.k("createdAt", true);
        xw2Var.k("updatedAt", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        qu1 qu1VarQ = vl0.Q(lo3Var);
        h82 h82Var = h82.a;
        return new qu1[]{lo3Var, lo3Var, qu1VarQ, oq1.a, h82Var, h82Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        int i = 0;
        int iW = 0;
        String strN = null;
        String strN2 = null;
        String str = null;
        long jA = 0;
        long jA2 = 0;
        boolean z = true;
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
                    str = (String) nk0VarB.g(tf3Var, 2, lo3.a, str);
                    i |= 4;
                    break;
                case 3:
                    iW = nk0VarB.w(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jA = nk0VarB.A(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jA2 = nk0VarB.A(tf3Var, 5);
                    i |= 32;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new FolderMeta(i, strN, strN2, str, iW, jA, jA2);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        FolderMeta folderMeta = (FolderMeta) obj;
        folderMeta.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        FolderMeta.write$Self$app_playRelease(folderMeta, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
