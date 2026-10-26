package defpackage;

import java.util.HashMap;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tz3 extends of2 implements lx1, rz0, xe3 {
    public String c;
    public uz3 d;
    public kb1 h;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public xe0 p;
    public HashMap q;
    public vs2 r;
    public sz3 s;
    public rz3 t;

    public static final void v0(tz3 tz3Var) {
        y64.M(tz3Var).D();
        y64.M(tz3Var).C();
        kr1.O(tz3Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018  */
    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        vs2 vs2VarW0;
        if (isAttached()) {
            rz3 rz3Var = this.t;
            if (rz3Var == null) {
                vs2VarW0 = w0();
            } else {
                if (!rz3Var.c) {
                    rz3Var = null;
                }
                if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                    vs2VarW0 = w0();
                }
            }
            dc dcVar = vs2VarW0.j;
            if (dcVar == null) {
                so1.b("no paragraph (layoutCache=" + this.r + ", textSubstitution=" + this.t + ')');
                u41.p();
                return;
            }
            y00 y00VarY = wx1Var.c.d.y();
            boolean z = vs2VarW0.k;
            if (z) {
                long j = vs2VarW0.l;
                y00VarY.l();
                y00VarY.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                em3 em3Var = this.d.a;
                tt3 tt3Var = em3Var.m;
                if (tt3Var == null) {
                    tt3Var = tt3.b;
                }
                tt3 tt3Var2 = tt3Var;
                pg3 pg3Var = em3Var.n;
                if (pg3Var == null) {
                    pg3Var = pg3.d;
                }
                pg3 pg3Var2 = pg3Var;
                uz0 uz0Var = em3Var.p;
                if (uz0Var == null) {
                    uz0Var = b71.a;
                }
                uz0 uz0Var2 = uz0Var;
                yx yxVarB = em3Var.a.b();
                if (yxVarB != null) {
                    dcVar.g(y00VarY, yxVarB, this.d.a.a.getAlpha(), pg3Var2, tt3Var2, uz0Var2);
                } else {
                    xe0 xe0Var = this.p;
                    long jA = xe0Var != null ? xe0Var.a() : re0.i;
                    if (jA == 16) {
                        jA = this.d.b() != 16 ? this.d.b() : re0.b;
                    }
                    dcVar.f(y00VarY, jA, pg3Var2, tt3Var2, uz0Var2);
                }
            } finally {
                if (z) {
                    y00VarY.i();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        vs2 vs2VarW0;
        rz3 rz3Var = this.t;
        if (rz3Var == null) {
            vs2VarW0 = w0();
        } else {
            if (!rz3Var.c) {
                rz3Var = null;
            }
            if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                vs2VarW0 = w0();
            }
        }
        vs2VarW0.c(m82Var);
        return g13.q(vs2VarW0.d(m82Var.getLayoutDirection()).a());
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        sz3 sz3Var = this.s;
        if (sz3Var == null) {
            sz3Var = new sz3(this, 0);
            this.s = sz3Var;
        }
        hg hgVar = new hg(this.c);
        pu1[] pu1VarArr = ef3.a;
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(cf3.z, kr1.T(hgVar));
        rz3 rz3Var = this.t;
        if (rz3Var != null) {
            boolean z = rz3Var.c;
            ff3 ff3Var = cf3.B;
            pu1[] pu1VarArr2 = ef3.a;
            pu1 pu1Var = pu1VarArr2[15];
            ff3Var.a(gf3Var, Boolean.valueOf(z));
            hg hgVar2 = new hg(rz3Var.b);
            ff3 ff3Var2 = cf3.A;
            pu1 pu1Var2 = pu1VarArr2[14];
            ff3Var2.a(gf3Var, hgVar2);
        }
        ue3Var.j(te3.k, new z0(null, new sz3(this, 1)));
        ue3Var.j(te3.l, new z0(null, new sz3(this, 2)));
        ue3Var.j(te3.m, new z0(null, new i43(16, this)));
        ef3.d(gf3Var, sz3Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        vs2 vs2VarW0;
        us2 us2Var;
        long j2;
        boolean z;
        us2 us2Var2;
        vy3 vy3Var;
        HashMap map;
        rz3 rz3Var = this.t;
        if (rz3Var == null) {
            vs2VarW0 = w0();
        } else {
            if (!rz3Var.c) {
                rz3Var = null;
            }
            if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                vs2VarW0 = w0();
            }
        }
        vs2VarW0.c(xb2Var);
        dx1 layoutDirection = xb2Var.getLayoutDirection();
        long jE = vs2VarW0.g > 1 ? vs2.e(vs2VarW0, j, layoutDirection) : j;
        dc dcVar = vs2VarW0.j;
        if (dcVar != null && (us2Var = vs2VarW0.n) != null && !us2Var.b() && layoutDirection == vs2VarW0.o) {
            if (!um0.b(jE, vs2VarW0.p)) {
                j2 = 4294967295L;
                if (um0.h(jE) == um0.h(vs2VarW0.p) && um0.j(jE) == um0.j(vs2VarW0.p) && um0.g(jE) >= dcVar.b() && !dcVar.d.d) {
                }
                us2Var2 = vs2VarW0.n;
                if (us2Var2 != null) {
                    us2Var2.b();
                }
                dc dcVar2 = vs2VarW0.j;
                dcVar2.getClass();
                vy3Var = dcVar2.d;
                long j3 = vs2VarW0.l;
                if (z) {
                    y64.K(this, 2).W0();
                    map = this.q;
                    if (map == null) {
                        map = new HashMap(2);
                        this.q = map;
                    }
                    map.put(d8.a, Integer.valueOf(Math.round(vy3Var.d(0))));
                    map.put(d8.b, Integer.valueOf(Math.round(vy3Var.d(vy3Var.g - 1))));
                }
                int i = (int) (j3 >> 32);
                int i2 = (int) (j3 & j2);
                nv2 nv2VarC = qb2Var.c(Protocol$Companion.m1784x4c29bdda(i, i, i2, i2));
                HashMap map2 = this.q;
                map2.getClass();
                return xb2Var.s(i, i2, map2, new xc(nv2VarC, 17));
            }
            j2 = 4294967295L;
            if (!um0.b(jE, vs2VarW0.p)) {
                dc dcVar3 = vs2VarW0.j;
                dcVar3.getClass();
                long jD = wm0.d(jE, (((long) g13.q(dcVar3.b())) & j2) | (((long) g13.q(Math.min(dcVar3.a.q.c(), dcVar3.d()))) << 32));
                vs2VarW0.l = jD;
                vs2VarW0.k = vs2VarW0.d != 3 && (((float) ((int) (jD >> 32))) < dcVar3.d() || ((float) ((int) (jD & j2))) < dcVar3.b());
                vs2VarW0.p = jE;
            }
            z = false;
            us2Var2 = vs2VarW0.n;
            if (us2Var2 != null) {
                us2Var2.b();
            }
            dc dcVar4 = vs2VarW0.j;
            dcVar4.getClass();
            vy3Var = dcVar4.d;
            long j4 = vs2VarW0.l;
            if (z) {
                y64.K(this, 2).W0();
                map = this.q;
                if (map == null) {
                    map = new HashMap(2);
                    this.q = map;
                }
                map.put(d8.a, Integer.valueOf(Math.round(vy3Var.d(0))));
                map.put(d8.b, Integer.valueOf(Math.round(vy3Var.d(vy3Var.g - 1))));
            }
            int i3 = (int) (j4 >> 32);
            int i4 = (int) (j4 & j2);
            nv2 nv2VarC2 = qb2Var.c(Protocol$Companion.m1784x4c29bdda(i3, i3, i4, i4));
            HashMap map3 = this.q;
            map3.getClass();
            return xb2Var.s(i3, i4, map3, new xc(nv2VarC2, 17));
        }
        j2 = 4294967295L;
        us2 us2VarD = vs2VarW0.d(layoutDirection);
        long jV = gm4.v(jE, vs2VarW0.e, vs2VarW0.d, us2VarD.c());
        boolean z2 = vs2VarW0.e;
        int i5 = vs2VarW0.d;
        int i6 = vs2VarW0.f;
        dc dcVar5 = new dc((hc) us2VarD, ((z2 || !(i5 == 2 || i5 == 4 || i5 == 5)) && i6 >= 1) ? i6 : 1, i5, jV);
        vs2VarW0.p = jE;
        long jD2 = wm0.d(jE, (((long) g13.q(dcVar5.b())) & j2) | (((long) g13.q(dcVar5.d())) << 32));
        vs2VarW0.l = jD2;
        vs2VarW0.k = vs2VarW0.d != 3 && (((float) ((int) (jD2 >> 32))) < dcVar5.d() || ((float) ((int) (jD2 & j2))) < dcVar5.b());
        vs2VarW0.j = dcVar5;
        z = true;
        us2Var2 = vs2VarW0.n;
        if (us2Var2 != null) {
            us2Var2.b();
        }
        dc dcVar6 = vs2VarW0.j;
        dcVar6.getClass();
        vy3Var = dcVar6.d;
        long j5 = vs2VarW0.l;
        if (z) {
            y64.K(this, 2).W0();
            map = this.q;
            if (map == null) {
                map = new HashMap(2);
                this.q = map;
            }
            map.put(d8.a, Integer.valueOf(Math.round(vy3Var.d(0))));
            map.put(d8.b, Integer.valueOf(Math.round(vy3Var.d(vy3Var.g - 1))));
        }
        int i7 = (int) (j5 >> 32);
        int i8 = (int) (j5 & j2);
        nv2 nv2VarC3 = qb2Var.c(Protocol$Companion.m1784x4c29bdda(i7, i7, i8, i8));
        HashMap map4 = this.q;
        map4.getClass();
        return xb2Var.s(i7, i8, map4, new xc(nv2VarC3, 17));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        vs2 vs2VarW0;
        rz3 rz3Var = this.t;
        if (rz3Var == null) {
            vs2VarW0 = w0();
        } else {
            if (!rz3Var.c) {
                rz3Var = null;
            }
            if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                vs2VarW0 = w0();
            }
        }
        vs2VarW0.c(m82Var);
        return g13.q(vs2VarW0.d(m82Var.getLayoutDirection()).c());
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        vs2 vs2VarW0;
        rz3 rz3Var = this.t;
        if (rz3Var == null) {
            vs2VarW0 = w0();
        } else {
            if (!rz3Var.c) {
                rz3Var = null;
            }
            if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                vs2VarW0 = w0();
            }
        }
        vs2VarW0.c(m82Var);
        return vs2VarW0.a(i, m82Var.getLayoutDirection());
    }

    public final vs2 w0() {
        if (this.r == null) {
            this.r = new vs2(this.c, this.d, this.h, this.l, this.m, this.n, this.o);
        }
        vs2 vs2Var = this.r;
        vs2Var.getClass();
        return vs2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        vs2 vs2VarW0;
        rz3 rz3Var = this.t;
        if (rz3Var == null) {
            vs2VarW0 = w0();
        } else {
            if (!rz3Var.c) {
                rz3Var = null;
            }
            if (rz3Var == null || (vs2VarW0 = rz3Var.d) == null) {
                vs2VarW0 = w0();
            }
        }
        vs2VarW0.c(m82Var);
        return vs2VarW0.a(i, m82Var.getLayoutDirection());
    }
}
