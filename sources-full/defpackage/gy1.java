package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy1 implements gp3 {
    public final /* synthetic */ iy1 a;
    public final /* synthetic */ Object b;

    public gy1(iy1 iy1Var, Object obj) {
        this.a = iy1Var;
        this.b = obj;
    }

    @Override // defpackage.gp3
    public final int a() {
        ux1 ux1Var = (ux1) this.a.r.g(this.b);
        if (ux1Var != null) {
            return ((oi2) ((th2) ux1Var.n()).d).h;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [r91] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // defpackage.gp3
    public final void b(r91 r91Var) {
        yd ydVar;
        of2 of2Var;
        h64 h64Var;
        ux1 ux1Var = (ux1) this.a.r.g(this.b);
        if (ux1Var == null || (ydVar = ux1Var.N) == null || (of2Var = (of2) ydVar.f) == null) {
            return;
        }
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitSubtreeIf called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = of2Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, of2Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        while (true) {
            int i = oi2Var.h;
            if (i == 0) {
                return;
            }
            of2 of2Var2 = (of2) oi2Var.m(i - 1);
            if ((of2Var2.getAggregateChildKindSet$ui_release() & 262144) != 0) {
                of2 child$ui_release2 = of2Var2;
                while (true) {
                    if (child$ui_release2 != null) {
                        if ((child$ui_release2.getKindSet$ui_release() & 262144) != 0) {
                            ?? E = child$ui_release2;
                            ?? oi2Var2 = 0;
                            while (E != 0) {
                                if (E instanceof i64) {
                                    i64 i64Var = (i64) E;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(i64Var.o());
                                    h64 h64Var2 = h64.d;
                                    if (zEquals) {
                                        r91Var.invoke(i64Var);
                                        h64Var = h64Var2;
                                    } else {
                                        h64Var = h64.c;
                                    }
                                    if (h64Var != h64.h) {
                                        if (h64Var == h64Var2) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.getKindSet$ui_release() & 262144) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release3 = ((ju0) E).d;
                                    int i2 = 0;
                                    E = E;
                                    oi2Var2 = oi2Var2;
                                    while (child$ui_release3 != null) {
                                        if ((child$ui_release3.getKindSet$ui_release() & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oi2Var2 = oi2Var2;
                                                E = child$ui_release3;
                                            } else {
                                                if (oi2Var2 == 0) {
                                                    oi2Var2 = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var2.c(E);
                                                    E = 0;
                                                }
                                                oi2Var2.c(child$ui_release3);
                                            }
                                        }
                                        child$ui_release3 = child$ui_release3.getChild$ui_release();
                                        E = E;
                                        oi2Var2 = oi2Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = y64.e(oi2Var2);
                            }
                        }
                        child$ui_release2 = child$ui_release2.getChild$ui_release();
                    }
                }
            }
            y64.d(oi2Var, of2Var2);
        }
    }

    @Override // defpackage.gp3
    public final void c(long j, int i) {
        iy1 iy1Var = this.a;
        ux1 ux1Var = (ux1) iy1Var.r.g(this.b);
        if (ux1Var == null || !ux1Var.F()) {
            return;
        }
        int i2 = ((oi2) ((th2) ux1Var.n()).d).h;
        if (i < 0 || i >= i2) {
            po1.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (ux1Var.G()) {
            po1.a("Pre-measure called on node that is not placed");
        }
        ux1 ux1Var2 = iy1Var.c;
        ux1Var2.y = true;
        xx1.a(ux1Var).mo28x12711d1e((ux1) ((th2) ux1Var.n()).get(i), j);
        ux1Var2.y = false;
    }

    @Override // defpackage.gp3
    public final void dispose() {
        iy1 iy1Var = this.a;
        ux1 ux1Var = iy1Var.c;
        iy1Var.b();
        ux1 ux1Var2 = (ux1) iy1Var.r.j(this.b);
        if (ux1Var2 != null) {
            if (iy1Var.w <= 0) {
                po1.b("No pre-composed items to dispose");
            }
            int iK = ((oi2) ((th2) ux1Var.o()).d).k(ux1Var2);
            if (iK < ((oi2) ((th2) ux1Var.o()).d).h - iy1Var.w) {
                po1.b("Item is not in pre-composed item range");
            }
            iy1Var.v++;
            iy1Var.w--;
            int i = (((oi2) ((th2) ux1Var.o()).d).h - iy1Var.w) - iy1Var.v;
            ux1Var.y = true;
            ux1Var.J(iK, i, 1);
            ux1Var.y = false;
            iy1Var.a(i);
        }
    }
}
