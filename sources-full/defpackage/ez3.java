package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import okhttp3.Protocol$Companion;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ez3 {
    public final kb1 a;
    public final wu0 b;
    public final dx1 c;
    public final iy2 d;

    public ez3(kb1 kb1Var, wu0 wu0Var, dx1 dx1Var, int i) {
        this.a = kb1Var;
        this.b = wu0Var;
        this.c = dx1Var;
        this.d = i > 0 ? new iy2(i) : null;
    }

    public static xy3 a(ez3 ez3Var, hg hgVar, uz3 uz3Var, boolean z, int i, long j, dx1 dx1Var, wu0 wu0Var, kb1 kb1Var, int i2) {
        xy3 xy3Var;
        int i3 = i2 & 16;
        int iX = IntCompanionObject.MAX_VALUE;
        int i4 = i3 != 0 ? Integer.MAX_VALUE : i;
        long jB = (i2 & 64) != 0 ? wm0.b(0, 0, 15) : j;
        dx1 dx1Var2 = (i2 & Uuid.SIZE_BITS) != 0 ? ez3Var.c : dx1Var;
        wu0 wu0Var2 = (i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? ez3Var.b : wu0Var;
        kb1 kb1Var2 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ez3Var.a : kb1Var;
        iy2 iy2Var = ez3Var.d;
        z21 z21Var = z21.c;
        wy3 wy3Var = new wy3(hgVar, uz3Var, z21Var, i4, z, 1, wu0Var2, dx1Var2, kb1Var2, jB);
        xy3 xy3Var2 = null;
        if (iy2Var != null) {
            wz wzVar = new wz(wy3Var);
            t82 t82Var = (t82) iy2Var.d;
            if (t82Var != null) {
                xy3Var = (xy3) t82Var.a(wzVar);
            } else if (kr1.n((wz) iy2Var.h, wzVar)) {
                xy3Var = (xy3) iy2Var.l;
            }
            if (xy3Var != null && !xy3Var.b.a.b()) {
                xy3Var2 = xy3Var;
            }
        }
        if (xy3Var2 != null) {
            pg2 pg2Var = xy3Var2.b;
            return new xy3(wy3Var, pg2Var, wm0.d(jB, (((long) ((int) Math.ceil(pg2Var.e))) & 4294967295L) | (((long) ((int) Math.ceil(pg2Var.d))) << 32)));
        }
        vu vuVar = new vu(hgVar, yh4.Q(uz3Var, dx1Var2), z21Var, wu0Var2, kb1Var2);
        int iJ = um0.j(jB);
        if (z && um0.d(jB)) {
            iX = um0.h(jB);
        }
        if (iJ != iX) {
            iX = py.x((int) Math.ceil(vuVar.c()), iJ, iX);
        }
        pg2 pg2Var2 = new pg2(vuVar, Protocol$Companion.m1784x4c29bdda(0, iX, 0, um0.g(jB)), i4, 1);
        xy3 xy3Var3 = new xy3(wy3Var, pg2Var2, wm0.d(jB, (((long) ((int) Math.ceil(pg2Var2.e))) & 4294967295L) | (((long) ((int) Math.ceil(pg2Var2.d))) << 32)));
        if (iy2Var != null) {
            t82 t82Var2 = (t82) iy2Var.d;
            if (t82Var2 != null) {
                t82Var2.b(new wz(wy3Var), xy3Var3);
                return xy3Var3;
            }
            iy2Var.h = new wz(wy3Var);
            iy2Var.l = xy3Var3;
        }
        return xy3Var3;
    }
}
