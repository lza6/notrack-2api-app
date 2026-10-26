package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class xy {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public xy(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    private final gn3 animateElevation(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        float f;
        ue ueVar;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new ml3();
            kk0Var.l0(objP);
        }
        ml3 ml3Var = (ml3) objP;
        boolean z2 = true;
        int i2 = 0;
        boolean z3 = (((i & 112) ^ 48) > 32 && kk0Var.h(uq1Var)) || (i & 48) == 32;
        Object objP2 = kk0Var.P();
        so0 so0Var = null;
        if (z3 || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new wy(uq1Var, ml3Var, so0Var, i2);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(uq1Var, (ne1) objP2, kk0Var, (i >> 3) & 14);
        tq1 tq1Var = (tq1) ke0.F0(ml3Var);
        if (!z) {
            f = this.e;
        } else if (tq1Var instanceof ry2) {
            f = this.b;
        } else if (tq1Var instanceof xi1) {
            f = this.d;
        } else {
            f = tq1Var instanceof ja1 ? this.c : this.a;
        }
        float f2 = f;
        Object objP3 = kk0Var.P();
        if (objP3 == Composer$Companion.getEmpty()) {
            objP3 = new ue(new rx0(f2), mb4.c, null, 12);
            kk0Var.l0(objP3);
        }
        ue ueVar2 = (ue) objP3;
        rx0 rx0Var = new rx0(f2);
        boolean zJ = kk0Var.j(ueVar2) | kk0Var.e(f2) | ((((i & 14) ^ 6) > 4 && kk0Var.i(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !kk0Var.h(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zJ2 = zJ | z2 | kk0Var.j(tq1Var);
        Object objP4 = kk0Var.P();
        if (zJ2 || objP4 == Composer$Companion.getEmpty()) {
            ueVar = ueVar2;
            yb0 yb0Var = new yb0(ueVar, f2, z, this, tq1Var, null);
            kk0Var.l0(yb0Var);
            objP4 = yb0Var;
        } else {
            ueVar = ueVar2;
        }
        r11.LaunchedEffect(rx0Var, (ne1) objP4, kk0Var, 0);
        return ueVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xy)) {
            return false;
        }
        xy xyVar = (xy) obj;
        return rx0.a(this.a, xyVar.a) && rx0.a(this.b, xyVar.b) && rx0.a(this.c, xyVar.c) && rx0.a(this.d, xyVar.d) && rx0.a(this.e, xyVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + fq2.d(this.d, fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final gn3 shadowElevation$material3_release(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        return animateElevation(z, uq1Var, ck0Var, i & 1022);
    }
}
