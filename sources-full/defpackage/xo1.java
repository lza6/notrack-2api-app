package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class xo1 extends wl2 {
    public static final bc V;
    public final es3 T;
    public wo1 U;

    static {
        bc bcVarF = vl0.f();
        bcVarF.f(re0.f);
        bcVarF.l(1.0f);
        bcVarF.m(1);
        V = bcVarF;
    }

    public xo1(ux1 ux1Var) {
        super(ux1Var);
        es3 es3Var = new es3();
        es3Var.setAggregateChildKindSet$ui_release(0);
        this.T = es3Var;
        es3Var.updateCoordinator$ui_release(this);
        this.U = ux1Var.p != null ? new wo1(this) : null;
    }

    @Override // defpackage.wl2
    public final void J0() {
        if (this.U == null) {
            this.U = new wo1(this);
        }
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        bi4 bi4VarS = this.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.e((wl2) ux1Var.N.d, ux1Var.m(), i);
    }

    @Override // defpackage.wl2
    public final o82 N0() {
        return this.U;
    }

    @Override // defpackage.wl2
    public final of2 P0() {
        return this.T;
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        bi4 bi4VarS = this.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.b((wl2) ux1Var.N.d, ux1Var.m(), i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        bi4 bi4VarS = this.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.d((wl2) ux1Var.N.d, ux1Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.wl2
    public final void V0(sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        Object[] objArr;
        int i3;
        ux1 ux1Var;
        boolean z4;
        long jB;
        long j2 = j;
        ux1 ux1Var2 = this.t;
        sl2 sl2Var2 = sl2Var;
        if (sl2Var2.p(ux1Var2)) {
            if (n1(j2)) {
                i2 = i;
                z2 = z;
                z3 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(G0(j2, O0())) & IntCompanionObject.MAX_VALUE) < 2139095040) {
                    z3 = true;
                    z2 = false;
                }
            }
            if (z3) {
                int i4 = ii1Var.h;
                oi2 oi2VarW = ux1Var2.w();
                objArr = oi2VarW.c;
                i3 = oi2VarW.h - 1;
                loop0: while (i3 >= 0) {
                    ux1Var = (ux1) objArr[i3];
                    if (ux1Var.G()) {
                        int i5 = i2;
                        z4 = z2;
                        sl2Var2.j(ux1Var, j2, ii1Var, i5, z4);
                        jB = ii1Var.b();
                        if (vl0.K(jB) < 0.0f && vl0.W(jB) && !vl0.V(jB)) {
                            wl2 wl2Var = (wl2) ux1Var.N.d;
                            wl2Var.getClass();
                            of2 of2VarR0 = wl2Var.R0(xl2.h(16));
                            if (of2VarR0 == null || !of2VarR0.isAttached()) {
                                break;
                            }
                            if (!of2VarR0.getNode().isAttached()) {
                                po1.b("visitLocalDescendants called on an unattached node");
                            }
                            of2 node = of2VarR0.getNode();
                            if ((node.getAggregateChildKindSet$ui_release() & 16) == 0) {
                                break;
                            }
                            while (true) {
                                if (node == null) {
                                    break loop0;
                                }
                                if ((node.getKindSet$ui_release() & 16) != 0) {
                                    ?? E = node;
                                    ?? oi2Var = 0;
                                    while (E != 0) {
                                        if (E instanceof hx2) {
                                            if (((hx2) E).X()) {
                                                ii1Var.h = ii1Var.c.b - 1;
                                                break;
                                            }
                                        } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                                            of2 child$ui_release = ((ju0) E).d;
                                            int i6 = 0;
                                            while (child$ui_release != null) {
                                                if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        E = E;
                                                        oi2Var = oi2Var;
                                                        oi2Var = oi2Var;
                                                        E = child$ui_release;
                                                    } else {
                                                        if (oi2Var == 0) {
                                                            oi2Var = new oi2(0, new of2[16]);
                                                        }
                                                        if (E != 0) {
                                                            oi2Var.c(E);
                                                            E = 0;
                                                        }
                                                        oi2Var.c(child$ui_release);
                                                    }
                                                } else {
                                                    E = E;
                                                    oi2Var = oi2Var;
                                                }
                                                child$ui_release = child$ui_release.getChild$ui_release();
                                                E = E;
                                                oi2Var = oi2Var;
                                            }
                                            if (i6 == 1) {
                                                E = E;
                                                oi2Var = oi2Var;
                                            } else {
                                                E = E;
                                                oi2Var = oi2Var;
                                            }
                                        }
                                        E = y64.e(oi2Var);
                                    }
                                }
                                node = node.getChild$ui_release();
                            }
                        }
                    } else {
                        z4 = z2;
                    }
                    i3--;
                    sl2Var2 = sl2Var;
                    j2 = j;
                    z2 = z4;
                    i2 = i;
                }
                ii1Var.h = i4;
            }
        }
        i2 = i;
        z2 = z;
        z3 = false;
        if (z3) {
            int i7 = ii1Var.h;
            oi2 oi2VarW2 = ux1Var2.w();
            objArr = oi2VarW2.c;
            i3 = oi2VarW2.h - 1;
            loop0: while (i3 >= 0) {
                ux1Var = (ux1) objArr[i3];
                if (ux1Var.G()) {
                    int i8 = i2;
                    z4 = z2;
                    sl2Var2.j(ux1Var, j2, ii1Var, i8, z4);
                    jB = ii1Var.b();
                    if (vl0.K(jB) < 0.0f) {
                        continue;
                    }
                } else {
                    z4 = z2;
                }
                i3--;
                sl2Var2 = sl2Var;
                j2 = j;
                z2 = z4;
                i2 = i;
            }
            ii1Var.h = i7;
        }
    }

    @Override // defpackage.qb2
    public final nv2 c(long j) {
        m0(j);
        ux1 ux1Var = this.t;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ux1) objArr[i2]).O.p.t = sx1.h;
        }
        h1(ux1Var.E.c(this, ux1Var.m(), j));
        b1();
        return this;
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        bi4 bi4VarS = this.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.a((wl2) ux1Var.N.d, ux1Var.m(), i);
    }

    @Override // defpackage.wl2
    public final void e1(y00 y00Var, gg1 gg1Var) {
        ux1 ux1Var = this.t;
        yr2 yr2VarA = xx1.a(ux1Var);
        oi2 oi2VarW = ux1Var.w();
        Object[] objArr = oi2VarW.c;
        int i = oi2VarW.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (ux1Var2.G()) {
                ((wl2) ux1Var2.N.d).H0(y00Var, gg1Var);
            }
        }
        if (yr2VarA.getShowLayoutBounds()) {
            long j = this.h;
            y00Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, V);
        }
    }

    @Override // defpackage.nv2
    public final void i0(long j, float f, le1 le1Var) {
        f1(j, f, le1Var);
        if (this.o) {
            return;
        }
        this.t.O.p.x0();
    }

    @Override // defpackage.m82
    public final int n0(ti1 ti1Var) {
        wo1 wo1Var = this.U;
        if (wo1Var != null) {
            return wo1Var.n0(ti1Var);
        }
        ub2 ub2Var = this.t.O.p;
        vx1 vx1Var = ub2Var.F;
        if (!ub2Var.u) {
            if (ub2Var.n.d == qx1.c) {
                vx1Var.f = true;
                if (vx1Var.b) {
                    ub2Var.D = true;
                    ub2Var.E = true;
                }
            } else {
                vx1Var.g = true;
            }
        }
        ub2Var.o().p = true;
        ub2Var.q();
        ub2Var.o().p = false;
        Integer num = (Integer) vx1Var.i.get(ti1Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
