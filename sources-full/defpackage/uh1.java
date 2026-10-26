package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public long a;
    public final Object b;

    public uh1(long j, nq2 nq2Var) {
        this.b = nq2Var;
        this.a = j;
    }

    public uh1(ny nyVar) {
        nyVar.getClass();
        this.b = nyVar;
        this.a = 262144L;
    }

    public long a(dx2 dx2Var, float f) {
        long jI = ln2.i(this.a, ln2.h(dx2Var.c, dx2Var.g));
        this.a = jI;
        nq2 nq2Var = (nq2) this.b;
        if ((nq2Var == null ? ln2.d(jI) : Math.abs(b(jI))) < f) {
            return 9205357640488583168L;
        }
        long j = this.a;
        if (nq2Var == null) {
            return ln2.h(this.a, ln2.j(f, ln2.b(ln2.d(j), j)));
        }
        float fB = b(j) - (Math.signum(b(this.a)) * f);
        long j2 = this.a;
        nq2 nq2Var2 = nq2.d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nq2Var == nq2Var2 ? j2 & 4294967295L : j2 >> 32));
        if (nq2Var == nq2Var2) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (((nq2) this.b) == nq2.d ? j >> 32 : j & 4294967295L));
    }

    public th1 c() {
        sh1 sh1Var = new sh1();
        while (true) {
            String strZ = ((ny) this.b).z(this.a);
            this.a -= (long) strZ.length();
            if (strZ.length() == 0) {
                return sh1Var.c();
            }
            int iZ0 = mo3.z0(':', 1, 4, strZ);
            if (iZ0 != -1) {
                sh1Var.a(strZ.substring(0, iZ0), strZ.substring(iZ0 + 1));
            } else if (strZ.charAt(0) == ':') {
                sh1Var.a(BuildConfig.VERSION_NAME, strZ.substring(1));
            } else {
                sh1Var.a(BuildConfig.VERSION_NAME, strZ);
            }
        }
    }
}
