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
public final /* synthetic */ class PromoRegex$$serializer implements ff1 {
    public static final PromoRegex$$serializer INSTANCE;
    private static final tf3 descriptor;

    static {
        PromoRegex$$serializer promoRegex$$serializer = new PromoRegex$$serializer();
        INSTANCE = promoRegex$$serializer;
        xw2 xw2Var = new xw2("notrack.ai.data.promo.PromoRegex", promoRegex$$serializer, 17);
        xw2Var.k("media", true);
        xw2Var.k("mediaCjk", true);
        xw2Var.k("comp", true);
        xw2Var.k("compCjk", true);
        xw2Var.k("explicit", true);
        xw2Var.k("explCjk", true);
        xw2Var.k("explRu", true);
        xw2Var.k("imggen", true);
        xw2Var.k("imggenCjk", true);
        xw2Var.k("live", true);
        xw2Var.k("liveCjk", true);
        xw2Var.k("more", true);
        xw2Var.k("moreCjk", true);
        xw2Var.k("vpn", true);
        xw2Var.k("vpnCjk", true);
        xw2Var.k("block", true);
        xw2Var.k("blockCjk", true);
        descriptor = xw2Var;
    }

    @Override // defpackage.ff1
    public final qu1[] childSerializers() {
        lo3 lo3Var = lo3.a;
        return new qu1[]{lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var, lo3Var};
    }

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        int i;
        tf3 tf3Var = descriptor;
        nk0 nk0VarB = hs0Var.B(tf3Var);
        boolean z = true;
        int i2 = 0;
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
        String strN12 = null;
        String strN13 = null;
        String strN14 = null;
        String strN15 = null;
        String strN16 = null;
        String strN17 = null;
        while (z) {
            int iH = nk0VarB.h(tf3Var);
            switch (iH) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strN = nk0VarB.n(tf3Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strN2 = nk0VarB.n(tf3Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strN3 = nk0VarB.n(tf3Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strN4 = nk0VarB.n(tf3Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strN5 = nk0VarB.n(tf3Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strN6 = nk0VarB.n(tf3Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strN7 = nk0VarB.n(tf3Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strN8 = nk0VarB.n(tf3Var, 7);
                    i2 |= Uuid.SIZE_BITS;
                    continue;
                case 8:
                    strN9 = nk0VarB.n(tf3Var, 8);
                    i2 |= FontInfo.NUMBER_OF_CHAR_CODES;
                    continue;
                case 9:
                    strN10 = nk0VarB.n(tf3Var, 9);
                    i2 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                    continue;
                case 10:
                    strN11 = nk0VarB.n(tf3Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strN12 = nk0VarB.n(tf3Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strN13 = nk0VarB.n(tf3Var, 12);
                    i2 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    continue;
                case 13:
                    strN14 = nk0VarB.n(tf3Var, 13);
                    i2 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
                    continue;
                case 14:
                    strN15 = nk0VarB.n(tf3Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strN16 = nk0VarB.n(tf3Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strN17 = nk0VarB.n(tf3Var, 16);
                    i = 65536;
                    break;
                default:
                    u41.f(iH);
                    return null;
            }
            i2 |= i;
        }
        nk0VarB.q(tf3Var);
        return new PromoRegex(i2, strN, strN2, strN3, strN4, strN5, strN6, strN7, strN8, strN9, strN10, strN11, strN12, strN13, strN14, strN15, strN16, strN17);
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        PromoRegex promoRegex = (PromoRegex) obj;
        promoRegex.getClass();
        tf3 tf3Var = descriptor;
        do3 do3VarA = do3Var.a(tf3Var);
        PromoRegex.write$Self$app_playRelease(promoRegex, do3VarA, tf3Var);
        do3VarA.v(tf3Var);
    }
}
