package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ns2 extends of2 implements lx1, rz0 {
    public ms2 c;
    public boolean d;
    public a8 h;
    public sn0 l;
    public float m;
    public te0 n;

    public static boolean w0(long j) {
        return !bi3.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & IntCompanionObject.MAX_VALUE) < 2139095040;
    }

    public static boolean x0(long j) {
        return !bi3.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & IntCompanionObject.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        a10 a10Var = wx1Var.c;
        long jH = this.c.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (a10Var.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(w0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)))) & 4294967295L);
        long jE0 = (Float.intBitsToFloat((int) (a10Var.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)) == 0.0f) ? 0L : vl0.e0(jFloatToRawIntBits, this.l.b(jFloatToRawIntBits, a10Var.b()));
        long jA = this.h.a((((long) Math.round(Float.intBitsToFloat((int) (jE0 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jE0 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (a10Var.b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)))) & 4294967295L), wx1Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((jb) a10Var.d.d).B(f, f2);
        try {
            this.c.g(wx1Var, jE0, this.m, this.n);
            ((jb) a10Var.d.d).B(-f, -f2);
            wx1Var.a();
        } catch (Throwable th) {
            ((jb) a10Var.d.d).B(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        if (!v0()) {
            return qb2Var.M(i);
        }
        long jY0 = y0(wm0.b(0, i, 7));
        return Math.max(um0.j(jY0), qb2Var.M(i));
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(y0(j));
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 11));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        if (!v0()) {
            return qb2Var.Q(i);
        }
        long jY0 = y0(wm0.b(0, i, 7));
        return Math.max(um0.j(jY0), qb2Var.Q(i));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        if (!v0()) {
            return qb2Var.d(i);
        }
        long jY0 = y0(wm0.b(i, 0, 13));
        return Math.max(um0.i(jY0), qb2Var.d(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.c + ", sizeToIntrinsics=" + this.d + ", alignment=" + this.h + ", alpha=" + this.m + ", colorFilter=" + this.n + ')';
    }

    public final boolean v0() {
        return this.d && this.c.h() != 9205357640488583168L;
    }

    public final long y0(long j) {
        boolean z = false;
        boolean z2 = um0.d(j) && um0.c(j);
        if (um0.f(j) && um0.e(j)) {
            z = true;
        }
        if ((!v0() && z2) || z) {
            return um0.a(j, um0.h(j), 0, um0.g(j), 0, 10);
        }
        long jH = this.c.h();
        int iRound = x0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : um0.j(j);
        int iRound2 = w0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : um0.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(wm0.f(j, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(wm0.g(j, iRound))) << 32);
        if (v0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!x0(this.c.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.c.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!w0(this.c.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.c.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : vl0.e0(jFloatToRawIntBits2, this.l.b(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return um0.a(j, wm0.g(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, wm0.f(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        if (!v0()) {
            return qb2Var.R(i);
        }
        long jY0 = y0(wm0.b(i, 0, 13));
        return Math.max(um0.i(jY0), qb2Var.R(i));
    }
}
