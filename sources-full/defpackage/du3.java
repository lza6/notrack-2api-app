package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class du3 extends ju0 implements lx1, rz0, wk0, nf1, xe3 {
    public boolean h;
    public boolean l;
    public az3 m;
    public c n;
    public wx3 o;
    public yx p;
    public boolean q;
    public rb3 r;
    public nq2 s;
    public dr0 t;
    public ym3 u;
    public jz3 v;
    public h43 w = new h43(-1.0f, -1.0f, -1.0f, -1.0f);
    public int x;
    public final ew3 y;

    public du3(boolean z, boolean z2, az3 az3Var, c cVar, wx3 wx3Var, yx yxVar, boolean z3, rb3 rb3Var, nq2 nq2Var) {
        this.h = z;
        this.l = z2;
        this.m = az3Var;
        this.n = cVar;
        this.o = wx3Var;
        this.p = yxVar;
        this.q = z3;
        this.r = rb3Var;
        this.s = nq2Var;
        ew3 gw3Var = b92.a() ? new gw3(cVar, wx3Var, az3Var, z || z2) : new td();
        v0(gw3Var);
        this.y = gw3Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void y0(du3 du3Var, wu0 wu0Var, int i, int i2, long j, dx1 dx1Var) {
        int iIntValue;
        xy3 xy3VarB;
        Integer num = 0;
        du3Var.r.f(i2 - i);
        jz3 jz3Var = du3Var.v;
        if (jz3Var != null) {
            int i3 = jz3.c;
            int i4 = (int) (j & 4294967295L);
            long j2 = jz3Var.a;
            if (i4 == ((int) (j2 & 4294967295L))) {
                iIntValue = (int) (j >> 32);
                if (iIntValue == ((int) (j2 >> 32)) && i2 == du3Var.x) {
                    iIntValue = -1;
                }
            } else {
                int i5 = jz3.c;
                iIntValue = (int) (j & 4294967295L);
            }
        } else {
            int i6 = jz3.c;
            iIntValue = (int) (j & 4294967295L);
        }
        if (iIntValue < 0 || !du3Var.z0() || (xy3VarB = du3Var.m.b()) == null) {
            return;
        }
        lq1 lq1Var = new lq1(0, xy3VarB.a.a.d.length(), 1);
        if (lq1Var instanceof pd0) {
            iIntValue = ((Number) py.z(Integer.valueOf(iIntValue), (pd0) lq1Var)).intValue();
        } else {
            if (lq1Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + lq1Var + '.');
            }
            if (iIntValue < num.intValue()) {
                iIntValue = num.intValue();
            } else {
                int i7 = lq1Var.d;
                if (iIntValue > Integer.valueOf(i7).intValue()) {
                    iIntValue = Integer.valueOf(i7).intValue();
                }
            }
        }
        h43 h43VarC = xy3VarB.c(iIntValue);
        float f = h43VarC.a;
        float f2 = h43VarC.c;
        boolean z = dx1Var == dx1.d;
        int iO = wu0Var.O(2.0f);
        float f3 = z ? i2 - f2 : f;
        if (z) {
            f = i2 - f2;
        }
        float f4 = 0.0f;
        h43 h43VarA = h43.a(h43VarC, f3, f + iO, 0.0f, 10);
        float f5 = h43VarA.b;
        float f6 = h43VarA.a;
        h43 h43Var = du3Var.w;
        if (f6 == h43Var.a && f5 == h43Var.b && i2 == du3Var.x) {
            return;
        }
        boolean z2 = du3Var.s == nq2.c;
        if (!z2) {
            f5 = f6;
        }
        float f7 = z2 ? h43VarA.d : h43VarA.c;
        int iF = du3Var.r.a.f();
        float f8 = iF + i;
        if (f7 > f8) {
            f4 = f7 - f8;
        } else {
            float f9 = iF;
            if (f5 < f9 && f7 - f5 > i) {
                f4 = f7 - f8;
            } else if (f5 < f9 && f7 - f5 <= i) {
                f4 = f5 - f9;
            }
        }
        du3Var.v = new jz3(j);
        du3Var.w = h43VarA;
        du3Var.x = i2;
        py.F(du3Var.getCoroutineScope(), null, jq0.l, new u90(du3Var, f4, h43VarC, null, 2), 1);
    }

    public final void A0() {
        if (this.t == null) {
            this.t = new dr0(((Boolean) gm4.t(this, CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue());
            kr1.O(this);
        }
        this.u = py.F(getCoroutineScope(), null, null, new f60(this, (so0) null, 14), 3);
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) throws Throwable {
        int iF;
        int iE;
        a10 a10Var = wx1Var.c;
        wx1Var.a();
        au3 au3VarD = this.n.d();
        xy3 xy3VarB = this.m.b();
        if (xy3VarB == null) {
            return;
        }
        ps2 ps2Var = au3VarD.m;
        ps2 ps2Var2 = au3VarD.m;
        long j = au3VarD.h;
        if (ps2Var != null) {
            int i = ((jy3) ps2Var.c).a;
            long j2 = ((jz3) ps2Var.d).a;
            if (!jz3.c(j2)) {
                ic icVarI = xy3VarB.i(jz3.f(j2), jz3.e(j2));
                uz3 uz3Var = xy3VarB.a.b;
                if (i == 1) {
                    yx yxVarB = uz3Var.a.a.b();
                    if (yxVarB != null) {
                        tz0.h(wx1Var, icVarI, yxVarB, 0.2f, null, 56);
                    } else {
                        long jB = uz3Var.b();
                        if (jB == 16) {
                            jB = re0.b;
                        }
                        tz0.H(wx1Var, icVarI, re0.b(re0.d(jB) * 0.2f, jB), null, 60);
                    }
                } else {
                    tz0.H(wx1Var, icVarI, ((lz3) gm4.t(this, mz3.a)).b, null, 60);
                }
            }
        }
        if (jz3.c(j)) {
            gb2.K(a10Var.d.y(), xy3VarB);
            if (ps2Var2 == null) {
                dr0 dr0Var = this.t;
                float f = dr0Var != null ? dr0Var.c.f() : 0.0f;
                if (f != 0.0f && z0()) {
                    h43 h43VarL = this.o.l();
                    float f2 = h43VarL.c;
                    float f3 = h43VarL.a;
                    float f4 = f2 - f3;
                    tz0.V(wx1Var, this.p, (((long) Float.floatToRawIntBits((f4 / 2.0f) + f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(h43VarL.b))), h43VarL.b(), f4, f, 432);
                }
            }
        } else {
            if (ps2Var2 == null && (iF = jz3.f(j)) != (iE = jz3.e(j))) {
                tz0.H(wx1Var, xy3VarB.i(iF, iE), ((lz3) gm4.t(this, mz3.a)).b, null, 60);
            }
            gb2.K(a10Var.d.y(), xy3VarB);
        }
        this.y.L(wx1Var);
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        this.m.e.setValue(wl2Var);
        this.y.a(wl2Var);
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        this.y.applySemantics(gf3Var);
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nq2 nq2Var = this.s;
        nq2 nq2Var2 = nq2.c;
        a31 a31Var = a31.c;
        if (nq2Var == nq2Var2) {
            nv2 nv2VarC = qb2Var.c(um0.a(j, 0, 0, 0, IntCompanionObject.MAX_VALUE, 7));
            int iMin = Math.min(nv2VarC.d, um0.g(j));
            return xb2Var.s(nv2VarC.c, iMin, a31Var, new cu3(this, xb2Var, iMin, nv2VarC, 1));
        }
        nv2 nv2VarC2 = qb2Var.c(um0.a(j, 0, IntCompanionObject.MAX_VALUE, 0, 0, 13));
        int iMin2 = Math.min(nv2VarC2.c, um0.h(j));
        return xb2Var.s(iMin2, nv2VarC2.d, a31Var, new cu3(this, xb2Var, iMin2, nv2VarC2, 0));
    }

    @Override // defpackage.of2
    public final void onAttach() {
        if (this.h && z0()) {
            A0();
        }
    }

    public final boolean z0() {
        if (!this.q) {
            return false;
        }
        if (!this.h && !this.l) {
            return false;
        }
        yx yxVar = this.p;
        return ((yxVar instanceof vl3) && ((vl3) yxVar).a == 16) ? false : true;
    }
}
