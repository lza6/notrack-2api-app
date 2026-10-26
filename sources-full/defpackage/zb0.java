package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public zb0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    private final gn3 animateElevation(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        Object obj;
        float f;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        Object obj2 = objP;
        if (objP == Composer$Companion.getEmpty()) {
            ml3 ml3Var = new ml3();
            kk0Var.l0(ml3Var);
            obj2 = ml3Var;
        }
        ml3 ml3Var2 = (ml3) obj2;
        Object objP2 = kk0Var.P();
        so0 so0Var = null;
        Object obj3 = objP2;
        if (objP2 == Composer$Companion.getEmpty()) {
            ft2 ft2VarD = cl3.d(null);
            kk0Var.l0(ft2VarD);
            obj3 = ft2VarD;
        }
        mi2 mi2Var = (mi2) obj3;
        int i2 = 1;
        boolean z2 = (((i & 112) ^ 48) > 32 && kk0Var.h(uq1Var)) || (i & 48) == 32;
        Object objP3 = kk0Var.P();
        if (z2 || objP3 == Composer$Companion.getEmpty()) {
            obj = objP3;
            wy wyVar = new wy(uq1Var, ml3Var2, so0Var, i2);
            kk0Var.l0(wyVar);
            obj = wyVar;
        }
        obj = objP3;
        r11.LaunchedEffect(uq1Var, (ne1) obj, kk0Var, (i >> 3) & 14);
        tq1 tq1Var = (tq1) ke0.F0(ml3Var2);
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
        Object obj4 = objP4;
        if (objP4 == Composer$Companion.getEmpty()) {
            ue ueVar = new ue(new rx0(f2), mb4.c, null, 12);
            kk0Var.l0(ueVar);
            obj4 = ueVar;
        }
        ue ueVar2 = (ue) obj4;
        rx0 rx0Var = new rx0(f2);
        int i3 = (kk0Var.j(ueVar2) ? 1 : 0) | (kk0Var.e(f2) ? 1 : 0);
        if ((((i & 14) ^ 6) <= 4 || !kk0Var.i(z)) && (i & 6) != 4) {
            i2 = 0;
        }
        int i4 = i3 | i2 | (kk0Var.j(tq1Var) ? 1 : 0);
        Object objP5 = kk0Var.P();
        if (i4 != 0 || objP5 == Composer$Companion.getEmpty()) {
            yb0 yb0Var = new yb0(ueVar2, f2, z, tq1Var, mi2Var, null, 0);
            kk0Var.l0(yb0Var);
            objP5 = yb0Var;
        }
        r11.LaunchedEffect(rx0Var, (ne1) objP5, kk0Var, 0);
        return ueVar2.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return rx0.a(this.a, zb0Var.a) && rx0.a(this.b, zb0Var.b) && rx0.a(this.c, zb0Var.c) && rx0.a(this.d, zb0Var.d) && rx0.a(this.f, zb0Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fq2.d(this.d, fq2.d(this.c, fq2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final gn3 shadowElevation$material3_release(boolean z, uq1 uq1Var, ck0 ck0Var, int i) {
        return animateElevation(z, uq1Var, ck0Var, i & 1022);
    }
}
