package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface rf2 extends sf2, iu0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [iu0, rf2] */
    @Override // defpackage.sf2
    default Object c(p13 p13Var) {
        yd ydVar;
        of2 of2Var = (of2) this;
        if (!of2Var.getNode().isAttached()) {
            po1.a("ModifierLocal accessed from an unattached node");
        }
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 parent$ui_release = of2Var.getNode().getParent$ui_release();
        ux1 ux1VarM = y64.M(this);
        while (ux1VarM != null) {
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 32) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 32) != 0) {
                        ?? E = parent$ui_release;
                        ?? oi2Var = 0;
                        while (E != 0) {
                            if (E instanceof rf2) {
                                rf2 rf2Var = (rf2) E;
                                if (rf2Var.i().n(p13Var)) {
                                    return rf2Var.i().A(p13Var);
                                }
                            } else if ((E.getKindSet$ui_release() & 32) != 0 && (E instanceof ju0)) {
                                of2 child$ui_release = ((ju0) E).d;
                                int i = 0;
                                E = E;
                                oi2Var = oi2Var;
                                while (child$ui_release != null) {
                                    if ((child$ui_release.getKindSet$ui_release() & 32) != 0) {
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
        return p13Var.a.invoke();
    }

    default gm4 i() {
        return b31.r;
    }
}
