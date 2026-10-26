package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p82 implements cx1 {
    public final o82 c;

    public p82(o82 o82Var) {
        this.c = o82Var;
    }

    @Override // defpackage.cx1
    public final void D(float[] fArr) {
        this.c.t.D(fArr);
    }

    @Override // defpackage.cx1
    public final void F(cx1 cx1Var, float[] fArr) {
        this.c.t.F(cx1Var, fArr);
    }

    @Override // defpackage.cx1
    public final h43 G(cx1 cx1Var, boolean z) {
        return this.c.t.G(cx1Var, z);
    }

    @Override // defpackage.cx1
    public final long J() {
        o82 o82Var = this.c;
        return (((long) o82Var.c) << 32) | (((long) o82Var.d) & 4294967295L);
    }

    @Override // defpackage.cx1
    public final long L(long j) {
        return this.c.t.L(ln2.i(j, a()));
    }

    public final long a() {
        o82 o82Var = this.c;
        o82 o82VarM = kr1.M(o82Var);
        return ln2.h(b(o82VarM.w, 0L), o82Var.t.Y0(o82VarM.t, 0L));
    }

    public final long b(cx1 cx1Var, long j) {
        boolean z = cx1Var instanceof p82;
        o82 o82Var = this.c;
        if (!z) {
            o82 o82VarM = kr1.M(o82Var);
            wl2 wl2Var = o82VarM.t;
            long jB = b(o82VarM.w, j);
            long j2 = o82VarM.u;
            long jH = ln2.h(jB, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!wl2Var.z()) {
                po1.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            wl2Var.a1();
            wl2 wl2Var2 = wl2Var.v;
            if (wl2Var2 != null) {
                wl2Var = wl2Var2;
            }
            return ln2.i(jH, wl2Var.Y0(cx1Var, 0L));
        }
        o82 o82Var2 = ((p82) cx1Var).c;
        wl2 wl2Var3 = o82Var2.t;
        wl2Var3.a1();
        o82 o82VarN0 = o82Var.t.K0(wl2Var3).N0();
        if (o82VarN0 != null) {
            long jB2 = iq1.b(iq1.c(o82Var2.G0(o82VarN0, false), g13.M(j)), o82Var.G0(o82VarN0, false));
            return (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L);
        }
        o82 o82VarM2 = kr1.M(o82Var2);
        long jC = iq1.c(iq1.c(o82Var2.G0(o82VarM2, false), o82VarM2.u), g13.M(j));
        o82 o82VarM3 = kr1.M(o82Var);
        long jB3 = iq1.b(jC, iq1.c(o82Var.G0(o82VarM3, false), o82VarM3.u));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB3 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB3 & 4294967295L))) & 4294967295L;
        wl2 wl2Var4 = o82VarM3.t.v;
        wl2Var4.getClass();
        wl2 wl2Var5 = o82VarM2.t.v;
        wl2Var5.getClass();
        return wl2Var4.Y0(wl2Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.cx1
    public final long e(long j) {
        return ln2.i(this.c.t.e(j), a());
    }

    @Override // defpackage.cx1
    public final long g(long j) {
        return this.c.t.g(ln2.i(j, a()));
    }

    @Override // defpackage.cx1
    public final cx1 j() {
        o82 o82VarN0;
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        wl2 wl2Var = ((wl2) this.c.t.t.N.d).v;
        if (wl2Var == null || (o82VarN0 = wl2Var.N0()) == null) {
            return null;
        }
        return o82VarN0.w;
    }

    @Override // defpackage.cx1
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public final long mo174xf127194(long j) {
        return ln2.i(this.c.t.mo174xf127194(j), a());
    }

    @Override // defpackage.cx1
    public final long y(cx1 cx1Var, long j) {
        return b(cx1Var, j);
    }

    @Override // defpackage.cx1
    public final boolean z() {
        return this.c.t.z();
    }
}
