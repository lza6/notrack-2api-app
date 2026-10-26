package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends ju0 implements xe3, nf1, wk0, jn2, i64 {
    public static final rn0 r = new rn0(10);
    public gh2 h;
    public final le1 l;
    public ja1 m;
    public w02 n;
    public wl2 o;
    public final db1 p;
    public j q;

    public gb1(gh2 gh2Var, int i, l lVar) {
        this.h = gh2Var;
        this.l = lVar;
        db1 db1Var = new db1(i, 4, new ca0(2, this, gb1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 7));
        v0(db1Var);
        this.p = db1Var;
    }

    public final void A0(gh2 gh2Var) {
        ja1 ja1Var;
        if (kr1.n(this.h, gh2Var)) {
            return;
        }
        gh2 gh2Var2 = this.h;
        if (gh2Var2 != null && (ja1Var = this.m) != null) {
            ((hh2) gh2Var2).b(new ka1(ja1Var));
        }
        this.m = null;
        this.h = gh2Var;
    }

    @Override // defpackage.jn2
    public final void F() {
        q43 q43Var = new q43();
        p23.M(this, new c9(q43Var, 10, this));
        w02 w02Var = (w02) q43Var.c;
        if (this.p.x0().b()) {
            w02 w02Var2 = this.n;
            if (w02Var2 != null) {
                w02Var2.b();
            }
            if (w02Var != null) {
                w02Var.a();
            } else {
                w02Var = null;
            }
            this.n = w02Var;
        }
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        hb1 hb1VarZ0;
        this.o = wl2Var;
        if (this.p.x0().b()) {
            if (!wl2Var.z()) {
                hb1 hb1VarZ1 = z0();
                if (hb1VarZ1 != null) {
                    hb1VarZ1.v0(null);
                    return;
                }
                return;
            }
            wl2 wl2Var2 = this.o;
            if (wl2Var2 == null || !wl2Var2.z() || (hb1VarZ0 = z0()) == null) {
                return;
            }
            hb1VarZ0.v0(this.o);
        }
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        boolean zB = this.p.x0().b();
        pu1[] pu1VarArr = ef3.a;
        ff3 ff3Var = cf3.k;
        pu1 pu1Var = ef3.a[4];
        ff3Var.a(gf3Var, Boolean.valueOf(zB));
        if (this.q == null) {
            this.q = new j(14, this);
        }
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(te3.v, new z0(null, this.q));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.i64
    public final Object o() {
        return r;
    }

    @Override // defpackage.of2
    public final void onReset() {
        w02 w02Var = this.n;
        if (w02Var != null) {
            w02Var.b();
        }
        this.n = null;
    }

    public final void y0(gh2 gh2Var, tq1 tq1Var) {
        if (!isAttached()) {
            ((hh2) gh2Var).b(tq1Var);
            return;
        }
        gs1 gs1Var = (gs1) getCoroutineScope().getCoroutineContext().get(bg1.s);
        py.F(getCoroutineScope(), null, null, new q8(gh2Var, tq1Var, gs1Var != null ? gs1Var.A(new rc(gh2Var, 18, tq1Var)) : null, (so0) null, 20), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final hb1 z0() {
        i64 i64Var;
        yd ydVar;
        if (isAttached()) {
            if (!getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release = getNode().getParent$ui_release();
            ux1 ux1VarM = y64.M(this);
            loop0: while (true) {
                if (ux1VarM == null) {
                    i64Var = null;
                    break;
                }
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                            ?? E = parent$ui_release;
                            ?? oi2Var = 0;
                            while (E != 0) {
                                if (E instanceof i64) {
                                    i64Var = (i64) E;
                                    if (hb1.d == i64Var.o()) {
                                        break loop0;
                                    }
                                } else if ((E.getKindSet$ui_release() & 262144) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i = 0;
                                    E = E;
                                    oi2Var = oi2Var;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                        }
                                        child$ui_release = child$ui_release.getChild$ui_release();
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
            if (i64Var instanceof hb1) {
                return (hb1) i64Var;
            }
        }
        return null;
    }
}
