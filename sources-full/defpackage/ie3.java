package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class ie3 {
    public static final zf a = new zf(Float.NaN, Float.NaN);
    public static final x64 b;
    public static final long c;
    public static final tm3 d;

    static {
        ba3 ba3Var = ba3.B;
        ba3 ba3Var2 = ba3.C;
        x64 x64Var = mb4.a;
        b = new x64(ba3Var, ba3Var2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new tm3(new ln2(jFloatToRawIntBits));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gn3 rememberAnimatedMagnifierPosition(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.b(je1Var);
            kk0Var.l0(objP);
        }
        gn3 gn3Var = (gn3) objP;
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ue(new ln2(((ln2) gn3Var.getValue()).a), b, new ln2(c), 8);
            kk0Var.l0(objP2);
        }
        ue ueVar = (ue) objP2;
        boolean zJ = kk0Var.j(ueVar);
        Object objP3 = kk0Var.P();
        if (zJ || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new q8(gn3Var, ueVar, (so0) null, 28);
            kk0Var.l0(objP3);
        }
        r11.LaunchedEffect(w84.a, (ne1) objP3, kk0Var, 6);
        return ueVar.c;
    }
}
