package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class xl2 {
    public static final rh2 a;

    static {
        rh2 rh2Var = cn2.a;
        a = new rh2();
    }

    public static final void a(of2 of2Var) {
        if (!of2Var.isAttached()) {
            po1.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(of2Var, -1, 1);
    }

    public static final void b(of2 of2Var, int i, int i2) {
        if (!(of2Var instanceof ju0)) {
            c(of2Var, i & of2Var.getKindSet$ui_release(), i2);
            return;
        }
        ju0 ju0Var = (ju0) of2Var;
        int i3 = ju0Var.c;
        c(of2Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (of2 child$ui_release = ju0Var.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            b(child$ui_release, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(of2 of2Var, int i, int i2) {
        if (i2 != 0 || of2Var.getShouldAutoInvalidate()) {
            if ((i & 2) != 0 && (of2Var instanceof lx1)) {
                y64.M((lx1) of2Var).C();
                if (i2 == 2) {
                    wl2 wl2VarK = y64.K(of2Var, 2);
                    wl2VarK.w = true;
                    wl2VarK.L.invoke();
                    if (wl2VarK.N != null) {
                        wl2VarK.l1(null, false);
                        wl2VarK.t.R(false);
                    }
                }
            }
            if ((i & Uuid.SIZE_BITS) != 0 && (of2Var instanceof ax1) && i2 != 2) {
                y64.M(of2Var).C();
            }
            if ((i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 && (of2Var instanceof nf1) && i2 != 2) {
                ux1 ux1VarM = y64.M(of2Var);
                if (!ux1VarM.p() && !ux1VarM.q() && !ux1VarM.W) {
                    xx1.a(ux1VarM).requestOnPositionedCallback(ux1VarM);
                }
            }
            if ((i & 4) != 0 && (of2Var instanceof rz0)) {
                kr1.O((rz0) of2Var);
            }
            if ((i & 8) != 0 && (of2Var instanceof xe3)) {
                y64.M(of2Var).z = true;
            }
            if ((i & 64) != 0 && (of2Var instanceof gt2)) {
                yx1 yx1Var = y64.M((gt2) of2Var).O;
                yx1Var.p.y = true;
                s82 s82Var = yx1Var.q;
                if (s82Var != null) {
                    s82Var.D = true;
                }
            }
            if ((i & 2048) != 0 && (of2Var instanceof ya1)) {
                ya1 ya1Var = (ya1) of2Var;
                l00.b = null;
                ya1Var.Q(l00.a);
                if (l00.b != null) {
                    of2 of2Var2 = (of2) ya1Var;
                    if (!of2Var2.getNode().isAttached()) {
                        po1.b("visitChildren called on an unattached node");
                    }
                    oi2 oi2Var = new oi2(0, new of2[16]);
                    of2 child$ui_release = of2Var2.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        y64.d(oi2Var, of2Var2.getNode());
                    } else {
                        oi2Var.c(child$ui_release);
                    }
                    while (true) {
                        int i3 = oi2Var.h;
                        if (i3 == 0) {
                            break;
                        }
                        of2 of2VarE = (of2) oi2Var.m(i3 - 1);
                        if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                            y64.d(oi2Var, of2VarE);
                        } else {
                            while (of2VarE != null) {
                                if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                                    oi2 oi2Var2 = null;
                                    while (of2VarE != null) {
                                        if (of2VarE instanceof db1) {
                                            db1 db1Var = (db1) of2VarE;
                                            oa1 oa1Var = ((va1) y64.N(db1Var).getFocusOwner()).g;
                                            if (oa1Var.d.a(db1Var) && !oa1Var.f) {
                                                oa1Var.a.invoke(new ia0(0, oa1Var, oa1.class, "invalidateNodes", "invalidateNodes()V", 0, 7));
                                                oa1Var.f = true;
                                            }
                                        } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                            int i4 = 0;
                                            for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                                if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        of2VarE = child$ui_release2;
                                                    } else {
                                                        if (oi2Var2 == null) {
                                                            oi2Var2 = new oi2(0, new of2[16]);
                                                        }
                                                        if (of2VarE != null) {
                                                            oi2Var2.c(of2VarE);
                                                            of2VarE = null;
                                                        }
                                                        oi2Var2.c(child$ui_release2);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        of2VarE = y64.e(oi2Var2);
                                    }
                                    break;
                                }
                                of2VarE = of2VarE.getChild$ui_release();
                            }
                        }
                    }
                }
            }
            if ((i & ConstantsKt.DEFAULT_BLOCK_SIZE) == 0 || !(of2Var instanceof ga1)) {
                return;
            }
            ga1 ga1Var = (ga1) of2Var;
            oa1 oa1Var2 = ((va1) y64.N(ga1Var).getFocusOwner()).g;
            if (!oa1Var2.e.a(ga1Var) || oa1Var2.f) {
                return;
            }
            oa1Var2.a.invoke(new ia0(0, oa1Var2, oa1.class, "invalidateNodes", "invalidateNodes()V", 0, 7));
            oa1Var2.f = true;
        }
    }

    public static final void d(of2 of2Var) {
        if (!of2Var.isAttached()) {
            po1.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(of2Var, -1, 0);
    }

    public static final int e(nf2 nf2Var) {
        int i = nf2Var instanceof jx1 ? 3 : 1;
        if (nf2Var instanceof yn1) {
            i |= 4;
        }
        if (nf2Var instanceof ve3) {
            i |= 8;
        }
        if (nf2Var instanceof lx2) {
            i |= 16;
        }
        if ((nf2Var instanceof pf2) || (nf2Var instanceof sp1)) {
            i |= 32;
        }
        if (nf2Var instanceof lo2) {
            i |= FontInfo.NUMBER_OF_CHAR_CODES;
        }
        if (nf2Var instanceof kz3) {
            i |= 64;
        }
        return nf2Var instanceof ix ? 524288 | i : i;
    }

    public static final int f(of2 of2Var) {
        if (of2Var.getKindSet$ui_release() != 0) {
            return of2Var.getKindSet$ui_release();
        }
        Class<?> cls = of2Var.getClass();
        rh2 rh2Var = a;
        int iD = rh2Var.d(cls);
        if (iD >= 0) {
            return rh2Var.c[iD];
        }
        int i = of2Var instanceof lx1 ? 3 : 1;
        if (of2Var instanceof rz0) {
            i |= 4;
        }
        if (of2Var instanceof xe3) {
            i |= 8;
        }
        if (of2Var instanceof hx2) {
            i |= 16;
        }
        if (of2Var instanceof rf2) {
            i |= 32;
        }
        if (of2Var instanceof gt2) {
            i |= 64;
        }
        if (of2Var instanceof ax1) {
            i |= Uuid.SIZE_BITS;
        }
        if (of2Var instanceof nf1) {
            i |= FontInfo.NUMBER_OF_CHAR_CODES;
        }
        if (of2Var instanceof db1) {
            i |= 1024;
        }
        if (of2Var instanceof ya1) {
            i |= 2048;
        }
        if (of2Var instanceof ga1) {
            i |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        }
        if (of2Var instanceof cv1) {
            i |= ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if (of2Var instanceof v73) {
            i |= 16384;
        }
        if (of2Var instanceof wk0) {
            i |= 32768;
        }
        if (of2Var instanceof i64) {
            i |= 262144;
        }
        if (of2Var instanceof ix) {
            i |= 524288;
        }
        rh2Var.h(i, cls);
        return i;
    }

    public static final int g(of2 of2Var) {
        if (!(of2Var instanceof ju0)) {
            return f(of2Var);
        }
        ju0 ju0Var = (ju0) of2Var;
        int iG = ju0Var.c;
        for (of2 child$ui_release = ju0Var.d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            iG |= g(child$ui_release);
        }
        return iG;
    }

    public static final boolean h(int i) {
        return (i & Uuid.SIZE_BITS) != 0;
    }
}
