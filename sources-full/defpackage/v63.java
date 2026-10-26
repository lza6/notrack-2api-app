package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class v63 implements vn1 {
    public final boolean a;
    public final float b;
    public final gn3 c;

    public v63(boolean z, float f, gn3 gn3Var) {
        this.a = z;
        this.b = f;
        this.c = gn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return false;
        }
        v63 v63Var = (v63) obj;
        return this.a == v63Var.a && rx0.a(this.b, v63Var.b) && kr1.n(this.c, v63Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fq2.d(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.vn1
    @cv0
    public final wn1 rememberUpdatedInstance(uq1 uq1Var, ck0 ck0Var, int i) {
        long jMo219x45d49245;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(988743187);
        k73 k73Var = (k73) kk0Var.l(l73.a);
        gn3 gn3Var = this.c;
        if (((re0) gn3Var.getValue()).a != 16) {
            kk0Var.a0(-303571590);
            kk0Var.r(false);
            jMo219x45d49245 = ((re0) gn3Var.getValue()).a;
        } else {
            kk0Var.a0(-303521246);
            jMo219x45d49245 = k73Var.mo219x45d49245(kk0Var, 0);
            kk0Var.r(false);
        }
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(jMo219x45d49245), kk0Var, 0);
        gn3 gn3VarRememberUpdatedState2 = cl3.rememberUpdatedState(k73Var.rippleAlpha(kk0Var, 0), kk0Var, 0);
        int i2 = i & 14;
        f73 f73VarMo204x4f4c327b = mo204x4f4c327b(uq1Var, this.a, this.b, gn3VarRememberUpdatedState, gn3VarRememberUpdatedState2, kk0Var, i2 | ((i << 12) & 458752));
        boolean zJ = (((i2 ^ 6) > 4 && kk0Var.h(uq1Var)) || (i & 6) == 4) | kk0Var.j(f73VarMo204x4f4c327b);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new q8(uq1Var, f73VarMo204x4f4c327b, (so0) null, 25);
            kk0Var.l0(objP);
        }
        r11.LaunchedEffect(f73VarMo204x4f4c327b, uq1Var, (ne1) objP, kk0Var, (i << 3) & 112);
        kk0Var.r(false);
        return f73VarMo204x4f4c327b;
    }

    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract f73 mo204x4f4c327b(uq1 uq1Var, boolean z, float f, gn3 gn3Var, gn3 gn3Var2, ck0 ck0Var, int i);
}
