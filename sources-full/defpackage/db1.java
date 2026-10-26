package defpackage;

import android.os.Trace;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class db1 extends of2 implements wk0, jn2, rf2, iu0 {
    public final ne1 c;
    public boolean d;
    public boolean h;
    public final int l;

    public db1(int i, int i2, ne1 ne1Var) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.c = (i2 & 2) != 0 ? null : ne1Var;
        this.l = i;
    }

    @Override // defpackage.jn2
    public final void F() {
        y0();
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
    }

    @Override // defpackage.of2
    public final void onDetach() {
        int iOrdinal = x0().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            va1 va1Var = (va1) y64.N(this).getFocusOwner();
            va1Var.b(8, true, false);
            oa1 oa1Var = va1Var.g;
            if (oa1Var.f) {
                return;
            }
            oa1Var.a.invoke(new ia0(0, oa1Var, oa1.class, "invalidateNodes", "invalidateNodes()V", 0, 7));
            oa1Var.f = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final void v0(cb1 cb1Var, cb1 cb1Var2) {
        yd ydVar;
        ne1 ne1Var;
        qa1 focusOwner = y64.N(this).getFocusOwner();
        db1 db1Var = ((va1) focusOwner).l;
        if (!cb1Var.equals(cb1Var2) && (ne1Var = this.c) != null) {
            ne1Var.invoke(cb1Var, cb1Var2);
        }
        of2 node = getNode();
        if (!getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 node2 = getNode();
        ux1 ux1VarM = y64.M(this);
        while (ux1VarM != null) {
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                            ?? E = node2;
                            ?? oi2Var = 0;
                            while (E != 0) {
                                if (E instanceof ga1) {
                                    ga1 ga1Var = (ga1) E;
                                    if (db1Var == ((va1) focusOwner).l) {
                                        ga1Var.U(cb1Var2);
                                    }
                                } else if ((E.getKindSet$ui_release() & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i = 0;
                                    E = E;
                                    oi2Var = oi2Var;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
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
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            ux1VarM = ux1VarM.t();
            node2 = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
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
    /* JADX WARN: Type inference failed for: r8v4 */
    public final xa1 w0() {
        boolean z;
        yd ydVar;
        xa1 xa1Var = new xa1();
        xa1Var.a = true;
        za1 za1Var = za1.b;
        xa1Var.b = za1Var;
        xa1Var.c = za1Var;
        xa1Var.d = za1Var;
        xa1Var.e = za1Var;
        xa1Var.f = za1Var;
        xa1Var.g = za1Var;
        xa1Var.h = za1Var;
        xa1Var.i = za1Var;
        xa1Var.j = sx.H;
        xa1Var.k = sx.I;
        int i = this.l;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((gp1) ((ip1) ((hp1) gm4.t(this, CompositionLocalsKt.getLocalInputModeManager()))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                u41.r("Unknown Focusability");
                return null;
            }
            z = false;
        }
        xa1Var.a = z;
        of2 node = getNode();
        if (!getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 node2 = getNode();
        ux1 ux1VarM = y64.M(this);
        loop0: while (ux1VarM != null) {
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & 2048) != 0) {
                            ?? oi2Var = 0;
                            ?? E = node2;
                            while (E != 0) {
                                if (E instanceof ya1) {
                                    ((ya1) E).Q(xa1Var);
                                } else if ((E.getKindSet$ui_release() & 2048) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i2 = 0;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            ux1VarM = ux1VarM.t();
            node2 = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
        }
        return xa1Var;
    }

    public final cb1 x0() {
        db1 db1Var;
        yd ydVar;
        boolean zIsAttached = isAttached();
        cb1 cb1Var = cb1.l;
        if (!zIsAttached || (db1Var = ((va1) y64.N(this).getFocusOwner()).l) == null) {
            return cb1Var;
        }
        if (this == db1Var) {
            return cb1.c;
        }
        if (db1Var.isAttached()) {
            if (!db1Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release = db1Var.getNode().getParent$ui_release();
            ux1 ux1VarM = y64.M(db1Var);
            while (ux1VarM != null) {
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                            of2 of2VarE = parent$ui_release;
                            oi2 oi2Var = null;
                            while (of2VarE != null) {
                                if (of2VarE instanceof db1) {
                                    if (this == ((db1) of2VarE)) {
                                        return cb1.d;
                                    }
                                } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                    int i = 0;
                                    for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                        if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                of2VarE = child$ui_release;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
        }
        return cb1Var;
    }

    public final void y0() {
        int iOrdinal = x0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            q43 q43Var = new q43();
            p23.M(this, new c9(q43Var, 9, this));
            Object obj = q43Var.c;
            if (obj == null) {
                kr1.n0("focusProperties");
                throw null;
            }
            if (((wa1) obj).c()) {
                return;
            }
            ((va1) y64.N(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean z0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zB0 = false;
            if (!w0().a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = kr1.a0(this, i).ordinal();
            if (iOrdinal == 0) {
                zB0 = kr1.b0(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zB0 = true;
                } else if (iOrdinal != 3) {
                    throw new eg0();
                }
            }
            Trace.endSection();
            return zB0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
