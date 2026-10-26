package notrack.ai.data.notify;

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
public final /* synthetic */ class Announcement$$serializer implements ff1 {
    public static final Announcement$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        Announcement$$serializer announcement$$serializer = new Announcement$$serializer();
        INSTANCE = announcement$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.notify.Announcement", announcement$$serializer, 4);
        xw2Var.k("id", true);
        xw2Var.k("minCode", true);
        xw2Var.k("publishedAt", true);
        xw2Var.k("copy", true);
        descriptor = xw2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        ly1[] ly1VarArr = Announcement.$childSerializers;
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, oq1.a, lo3Var, ly1VarArr[3].getValue()};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        ly1[] ly1VarArr = Announcement.$childSerializers;
        boolean z = true;
        int i = 0;
        int iW = 0;
        String strN = null;
        String strN2 = null;
        Map map = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            if (iH == -1) {
                z = false;
            } else if (iH == 0) {
                strN = nk0VarB.n(tf3Var, 0);
                i |= 1;
            } else if (iH == 1) {
                iW = nk0VarB.w(tf3Var, 1);
                i |= 2;
            } else if (iH == 2) {
                strN2 = nk0VarB.n(tf3Var, 2);
                i |= 4;
            } else {
                if (iH != 3) {
                    u41.f(iH);
                    return null;
                }
                map = (Map) nk0VarB.v(tf3Var, 3, (qu1) ly1VarArr[3].getValue(), map);
                i |= 8;
            }
        }
        nk0VarB.q(tf3Var);
        return new Announcement(i, iW, strN, strN2, map);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        Announcement announcement = (Announcement) obj;
        announcement.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        Announcement.write$Self$app_playRelease(announcement, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
