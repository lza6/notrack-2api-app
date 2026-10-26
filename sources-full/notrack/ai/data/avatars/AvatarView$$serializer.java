package notrack.ai.data.avatars;

import defpackage.cv0;
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
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class AvatarView$$serializer implements ff1 {
    public static final AvatarView$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        AvatarView$$serializer avatarView$$serializer = new AvatarView$$serializer();
        INSTANCE = avatarView$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.avatars.AvatarView", avatarView$$serializer, 9);
        xw2Var.k("kind", true);
        xw2Var.k("slot", true);
        xw2Var.k("ref", true);
        xw2Var.k("url", true);
        xw2Var.k("url_sm", true);
        xw2Var.k("bg", true);
        xw2Var.k("fg", true);
        xw2Var.k("initial", true);
        xw2Var.k("hue", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, vl0.Q(lo3Var), vl0.Q(lo3Var), lo3Var, lo3Var, lo3Var, oq1.a};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iW = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String str = null;
        String str2 = null;
        String strN4 = null;
        String strN5 = null;
        String strN6 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    continue;
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
                    strN4 = nk0VarB.n(tf3Var, 5);
                    i |= 32;
                    continue;
                case 6:
                    strN5 = nk0VarB.n(tf3Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    strN6 = nk0VarB.n(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    continue;
                case 8:
                    iW = nk0VarB.w(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    continue;
                default:
                    u41.f(iH);
                    return obj;
            }
            obj = null;
        }
        nk0VarB.q(tf3Var);
        return new AvatarView(i, strN, strN2, strN3, str, str2, strN4, strN5, strN6, iW);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        AvatarView avatarView = (AvatarView) obj;
        avatarView.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        AvatarView.write$Self$app_playRelease(avatarView, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
