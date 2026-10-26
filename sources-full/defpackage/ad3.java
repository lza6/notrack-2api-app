package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ad3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ad3(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    private final gn3 animateElevation(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        float f;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new ml3();
            kk0Var.l0(objP);
        }
        ml3 ml3Var = (ml3) objP;
        Object objP2 = kk0Var.P();
        so0 so0Var = null;
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = cl3.d(null);
            kk0Var.l0(objP2);
        }
        mi2 mi2Var = (mi2) objP2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && kk0Var.h(uq1Var)) || (i & 48) == 32;
        Object objP3 = kk0Var.P();
        if (z3 || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new wy(uq1Var, ml3Var, so0Var, 2);
            kk0Var.l0(objP3);
        }
        r11.LaunchedEffect(uq1Var, (ne1) objP3, kk0Var, (i >> 3) & 14);
        tq1 tq1Var = (tq1) ke0.F0(ml3Var);
        if (!z) {
            f = this.f;
        } else if (tq1Var instanceof ry2) {
            f = this.b;
        } else if (tq1Var instanceof xi1) {
            f = this.d;
        } else if (tq1Var instanceof ja1) {
            f = this.c;
        } else {
            f = tq1Var instanceof dz0 ? this.e : this.a;
        }
        float f2 = f;
        Object objP4 = kk0Var.P();
        if (objP4 == Composer$Companion.getEmpty()) {
            objP4 = new ue(new rx0(f2), mb4.c, null, 12);
            kk0Var.l0(objP4);
        }
        ue ueVar = (ue) objP4;
        rx0 rx0Var = new rx0(f2);
        boolean zJ = kk0Var.j(ueVar) | kk0Var.e(f2);
        if ((((i & 14) ^ 6) <= 4 || !kk0Var.i(z)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean zJ2 = zJ | z2 | kk0Var.j(tq1Var);
        Object objP5 = kk0Var.P();
        if (zJ2 || objP5 == Composer$Companion.getEmpty()) {
            yb0 yb0Var = new yb0(ueVar, f2, z, tq1Var, mi2Var, null, 1);
            kk0Var.l0(yb0Var);
            objP5 = yb0Var;
        }
        r11.LaunchedEffect(rx0Var, (ne1) objP5, kk0Var, 0);
        return ueVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ad3)) {
            return false;
        }
        ad3 ad3Var = (ad3) obj;
        return rx0.a(this.a, ad3Var.a) && rx0.a(this.b, ad3Var.b) && rx0.a(this.c, ad3Var.c) && rx0.a(this.d, ad3Var.d) && rx0.a(this.f, ad3Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fq2.d(this.d, fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final gn3 shadowElevation$material3_release(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        return animateElevation(z, uq1Var, ck0Var, i & 1022);
    }
}
