package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g73 {
    public static final un3 a = new un3(bb2.q);
    public static final dl0 b = new dl0(bb2.p);
    public static final j73 c;
    public static final j73 d;

    static {
        long j = re0.i;
        c = new j73(true, Float.NaN, j);
        d = new j73(false, Float.NaN, j);
    }

    /* JADX INFO: renamed from: rippleOrFallbackImplementation-9IZ8Weo, reason: not valid java name */
    public static final vn1 m194xaeb141ad(boolean z, float f, long j, ck0 ck0Var, int i, int i2) {
        vn1 j73Var;
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = re0.i;
        }
        long j2 = j;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1280632857);
        if (((Boolean) kk0Var.l(a)).booleanValue()) {
            j73Var = h73.m205x1702383(z2, f, j2, kk0Var, i & 1022, 0);
        } else if (rx0.a(f, Float.NaN) && re0.c(j2, re0.i)) {
            j73Var = z2 ? c : d;
        } else {
            j73Var = new j73(z2, f, j2);
        }
        kk0Var.r(false);
        return j73Var;
    }
}
