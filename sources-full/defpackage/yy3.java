package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yy3 {
    public final xy3 a;
    public cx1 b = null;
    public cx1 c;

    public yy3(xy3 xy3Var, cx1 cx1Var) {
        this.a = xy3Var;
        this.c = cx1Var;
    }

    public final long a(long j) {
        h43 h43VarG;
        cx1 cx1Var = this.b;
        h43 h43Var = h43.e;
        if (cx1Var != null) {
            if (cx1Var.z()) {
                cx1 cx1Var2 = this.c;
                h43VarG = cx1Var2 != null ? cx1Var2.G(cx1Var, true) : null;
            } else {
                h43VarG = h43Var;
            }
            if (h43VarG != null) {
                h43Var = h43VarG;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = h43Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = h43Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = h43Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = h43Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        xy3 xy3Var = this.a;
        int iE = xy3Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= xy3Var.e(iE) && Float.intBitsToFloat(i) <= xy3Var.f(iE);
    }

    public final long d(long j) {
        cx1 cx1Var;
        cx1 cx1Var2 = this.b;
        if (cx1Var2 != null) {
            if (!cx1Var2.z()) {
                cx1Var2 = null;
            }
            if (cx1Var2 != null && (cx1Var = this.c) != null) {
                cx1 cx1Var3 = cx1Var.z() ? cx1Var : null;
                if (cx1Var3 != null) {
                    return cx1Var2.y(cx1Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        cx1 cx1Var;
        cx1 cx1Var2 = this.b;
        if (cx1Var2 != null) {
            if (!cx1Var2.z()) {
                cx1Var2 = null;
            }
            if (cx1Var2 != null && (cx1Var = this.c) != null) {
                cx1 cx1Var3 = cx1Var.z() ? cx1Var : null;
                if (cx1Var3 != null) {
                    return cx1Var3.y(cx1Var2, j);
                }
            }
        }
        return j;
    }
}
