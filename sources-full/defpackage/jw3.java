package defpackage;

import app.template.extension.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jw3 {
    public final hg a;
    public final long b;
    public final xy3 c;
    public final nn2 d;
    public final iz3 e;
    public long f;
    public final hg g;
    public final ey3 h;
    public final yy3 i;

    public jw3(ey3 ey3Var, nn2 nn2Var, yy3 yy3Var, iz3 iz3Var) {
        hg hgVar = ey3Var.a;
        long j = ey3Var.b;
        xy3 xy3Var = yy3Var != null ? yy3Var.a : null;
        this.a = hgVar;
        this.b = j;
        this.c = xy3Var;
        this.d = nn2Var;
        this.e = iz3Var;
        this.f = j;
        this.g = hgVar;
        this.h = ey3Var;
        this.i = yy3Var;
    }

    public final List a(le1 le1Var) {
        if (!jz3.c(this.f)) {
            return kr1.U(new wf0(BuildConfig.VERSION_NAME, 0), new lg3(jz3.f(this.f), jz3.f(this.f)));
        }
        n11 n11Var = (n11) le1Var.invoke(this);
        if (n11Var != null) {
            return kr1.T(n11Var);
        }
        return null;
    }

    public final Integer b() {
        xy3 xy3Var = this.c;
        if (xy3Var == null) {
            return null;
        }
        pg2 pg2Var = xy3Var.b;
        int iE = jz3.e(this.f);
        nn2 nn2Var = this.d;
        return Integer.valueOf(nn2Var.n(pg2Var.c(pg2Var.d(nn2Var.o(iE)), true)));
    }

    public final Integer c() {
        xy3 xy3Var = this.c;
        if (xy3Var == null) {
            return null;
        }
        int iF = jz3.f(this.f);
        nn2 nn2Var = this.d;
        return Integer.valueOf(nn2Var.n(xy3Var.g(xy3Var.b.d(nn2Var.o(iF)))));
    }

    public final Integer d() {
        int length;
        xy3 xy3Var = this.c;
        if (xy3Var == null) {
            return null;
        }
        int iQ = q();
        while (true) {
            hg hgVar = this.a;
            if (iQ < hgVar.d.length()) {
                int length2 = this.g.d.length() - 1;
                if (iQ <= length2) {
                    length2 = iQ;
                }
                long j = xy3Var.j(length2);
                int i = jz3.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iQ) {
                    length = this.d.n(i2);
                    break;
                }
                iQ++;
            } else {
                length = hgVar.d.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        xy3 xy3Var = this.c;
        if (xy3Var == null) {
            return null;
        }
        for (int iQ = q(); iQ > 0; iQ--) {
            int length = this.g.d.length() - 1;
            if (iQ <= length) {
                length = iQ;
            }
            long j = xy3Var.j(length);
            int i = jz3.c;
            int i2 = (int) (j >> 32);
            if (i2 < iQ) {
                iN = this.d.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        xy3 xy3Var = this.c;
        return (xy3Var != null ? xy3Var.h(q()) : null) != u53.d;
    }

    public final int g(xy3 xy3Var, int i) {
        int iQ = q();
        iz3 iz3Var = this.e;
        if (iz3Var.a == null) {
            iz3Var.a = Float.valueOf(xy3Var.c(iQ).a);
        }
        pg2 pg2Var = xy3Var.b;
        int iD = pg2Var.d(iQ) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= pg2Var.f) {
            return this.g.d.length();
        }
        float fB = pg2Var.b(iD) - 1.0f;
        Float f = iz3Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= xy3Var.f(iD)) || (!f() && fFloatValue <= xy3Var.e(iD))) {
            return pg2Var.c(iD, true);
        }
        return this.d.n(pg2Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(yy3 yy3Var, int i) {
        h43 h43VarG;
        cx1 cx1Var = yy3Var.b;
        xy3 xy3Var = yy3Var.a;
        if (cx1Var == null) {
            h43VarG = h43.e;
        } else {
            cx1 cx1Var2 = yy3Var.c;
            h43VarG = cx1Var2 != null ? cx1Var2.G(cx1Var, true) : null;
            if (h43VarG == null) {
                h43VarG = h43.e;
            }
        }
        long j = this.h.b;
        int i2 = jz3.c;
        nn2 nn2Var = this.d;
        h43 h43VarC = xy3Var.c(nn2Var.o((int) (j & 4294967295L)));
        float f = h43VarC.a;
        return nn2Var.n(xy3Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (h43VarG.d() & 4294967295L)) * i) + h43VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        iz3 iz3Var = this.e;
        iz3Var.a = null;
        hg hgVar = this.g;
        if (hgVar.d.length() > 0) {
            if (f()) {
                iz3Var.a = null;
                if (hgVar.d.length() > 0) {
                    String str = hgVar.d;
                    long j = this.f;
                    int i = jz3.c;
                    int iZ = sf3.z((int) (j & 4294967295L), str);
                    if (iZ != -1) {
                        p(iZ, iZ);
                        return;
                    }
                    return;
                }
                return;
            }
            iz3Var.a = null;
            if (hgVar.d.length() > 0) {
                String str2 = hgVar.d;
                long j2 = this.f;
                int i2 = jz3.c;
                int iY = sf3.y((int) (j2 & 4294967295L), str2);
                if (iY != -1) {
                    p(iY, iY);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        hg hgVar = this.g;
        String str = hgVar.d;
        String str2 = hgVar.d;
        if (str.length() > 0) {
            int iY = yh4.y(jz3.e(this.f), str2);
            if (iY == jz3.e(this.f) && iY != str2.length()) {
                iY = yh4.y(iY + 1, str2);
            }
            p(iY, iY);
        }
    }

    public final void k() {
        this.e.a = null;
        hg hgVar = this.g;
        String str = hgVar.d;
        String str2 = hgVar.d;
        if (str.length() > 0) {
            int iZ = yh4.z(jz3.f(this.f), str2);
            if (iZ == jz3.f(this.f) && iZ != 0) {
                iZ = yh4.z(iZ - 1, str2);
            }
            p(iZ, iZ);
        }
    }

    public final void l() {
        iz3 iz3Var = this.e;
        iz3Var.a = null;
        hg hgVar = this.g;
        if (hgVar.d.length() > 0) {
            if (f()) {
                iz3Var.a = null;
                if (hgVar.d.length() > 0) {
                    String str = hgVar.d;
                    long j = this.f;
                    int i = jz3.c;
                    int iY = sf3.y((int) (j & 4294967295L), str);
                    if (iY != -1) {
                        p(iY, iY);
                        return;
                    }
                    return;
                }
                return;
            }
            iz3Var.a = null;
            if (hgVar.d.length() > 0) {
                String str2 = hgVar.d;
                long j2 = this.f;
                int i2 = jz3.c;
                int iZ = sf3.z((int) (j2 & 4294967295L), str2);
                if (iZ != -1) {
                    p(iZ, iZ);
                }
            }
        }
    }

    public final void m() {
        Integer numB;
        this.e.a = null;
        if (this.g.d.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        p(iIntValue, iIntValue);
    }

    public final void n() {
        Integer numC;
        this.e.a = null;
        if (this.g.d.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        p(iIntValue, iIntValue);
    }

    public final void o() {
        if (this.g.d.length() > 0) {
            int i = jz3.c;
            this.f = p23.d((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void p(int i, int i2) {
        this.f = p23.d(i, i2);
    }

    public final int q() {
        long j = this.f;
        int i = jz3.c;
        return this.d.o((int) (j & 4294967295L));
    }
}
