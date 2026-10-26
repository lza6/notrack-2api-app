package defpackage;

import androidx.compose.foundation.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final class xl extends of2 implements lx1 {
    public float c;

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.c) : qb2Var.M(i);
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        long jW0 = w0(j, true);
        if (qq1.a(jW0, 0L)) {
            jW0 = v0(j, true);
            if (qq1.a(jW0, 0L)) {
                jW0 = y0(j, true);
                if (qq1.a(jW0, 0L)) {
                    jW0 = x0(j, true);
                    if (qq1.a(jW0, 0L)) {
                        jW0 = w0(j, false);
                        if (qq1.a(jW0, 0L)) {
                            jW0 = v0(j, false);
                            if (qq1.a(jW0, 0L)) {
                                jW0 = y0(j, false);
                                if (qq1.a(jW0, 0L)) {
                                    jW0 = x0(j, false);
                                    if (qq1.a(jW0, 0L)) {
                                        jW0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!qq1.a(jW0, 0L)) {
            int i = (int) (jW0 >> 32);
            int i2 = (int) (4294967295L & jW0);
            if (!((i >= 0) & (i2 >= 0))) {
                ro1.a("width and height must be >= 0");
            }
            j = wm0.h(i, i, i2, i2);
        }
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 4));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.c) : qb2Var.Q(i);
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.c) : qb2Var.d(i);
    }

    public final long v0(long j, boolean z) {
        int iRound;
        int iG = um0.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.c)) <= 0) {
            return 0L;
        }
        if (!z || a.g(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long w0(long j, boolean z) {
        int iRound;
        int iH = um0.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.c)) <= 0) {
            return 0L;
        }
        if (!z || a.g(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long x0(long j, boolean z) {
        int i = um0.i(j);
        int iRound = Math.round(i * this.c);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || a.g(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long y0(long j, boolean z) {
        int iJ = um0.j(j);
        int iRound = Math.round(iJ / this.c);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || a.g(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.c) : qb2Var.R(i);
    }
}
