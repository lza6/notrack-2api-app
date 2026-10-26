package notrack.ai.data.promo;

import defpackage.cv0;
import defpackage.do3;
import defpackage.ff1;
import defpackage.hs0;
import defpackage.lo3;
import defpackage.nk0;
import defpackage.qu1;
import defpackage.tf3;
import defpackage.u41;
import defpackage.xw2;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final /* synthetic */ class PromoCopy$$serializer implements ff1 {
    public static final PromoCopy$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        PromoCopy$$serializer promoCopy$$serializer = new PromoCopy$$serializer();
        INSTANCE = promoCopy$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.promo.PromoCopy", promoCopy$$serializer, 11);
        xw2Var.k("title", true);
        xw2Var.k("bodyComp", true);
        xw2Var.k("bodyMedia", true);
        xw2Var.k("cta", true);
        xw2Var.k("age", true);
        xw2Var.k("disclosure", true);
        xw2Var.k("dismiss", true);
        xw2Var.k("titleVpn", true);
        xw2Var.k("bodyVpn", true);
        xw2Var.k("ctaVpn", true);
        xw2Var.k("discVpn", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var};
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
        String strN4 = null;
        String strN5 = null;
        String strN6 = null;
        String strN7 = null;
        String strN8 = null;
        String strN9 = null;
        String strN10 = null;
        String strN11 = null;
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
                    strN4 = nk0VarB.n(tf3Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN5 = nk0VarB.n(tf3Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strN6 = nk0VarB.n(tf3Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strN7 = nk0VarB.n(tf3Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strN8 = nk0VarB.n(tf3Var, 7);
                    i |= Uuid.SIZE_BITS;
                    break;
                case 8:
                    strN9 = nk0VarB.n(tf3Var, 8);
                    i |= FontInfo.NUMBER_OF_CHAR_CODES;
                    break;
                case 9:
                    strN10 = nk0VarB.n(tf3Var, 9);
                    i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    break;
                case 10:
                    strN11 = nk0VarB.n(tf3Var, 10);
                    i |= 1024;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
        }
        nk0VarB.q(tf3Var);
        return new PromoCopy(i, strN, strN2, strN3, strN4, strN5, strN6, strN7, strN8, strN9, strN10, strN11);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        PromoCopy promoCopy = (PromoCopy) obj;
        promoCopy.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        PromoCopy.write$Self$app_playRelease(promoCopy, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
