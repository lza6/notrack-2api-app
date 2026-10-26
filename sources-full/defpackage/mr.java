package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class mr extends of2 implements lx1, rz0, xe3, hx2, rf2, sf2, gt2, ax1, nf1, ga1, ya1, ab1, zr2, qy {
    public nf2 c;
    public kr d;
    public HashSet h;

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        boolean z;
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ci4 ci4Var = ((lx2) nf2Var).l;
        ci4Var.getClass();
        List list = yw2Var.a;
        lx2 lx2Var = (lx2) ci4Var.l;
        if (lx2Var.h) {
            z = true;
            break;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            dx2 dx2Var = (dx2) list.get(i);
            if (py.s(dx2Var) || py.u(dx2Var)) {
                z = true;
                break;
            }
            i++;
        }
        jx2 jx2Var = (jx2) ci4Var.h;
        jx2 jx2Var2 = jx2.h;
        zw2 zw2Var2 = zw2.h;
        if (jx2Var != jx2Var2) {
            if (zw2Var == zw2.c && z) {
                ci4Var.t(yw2Var);
            }
            if (zw2Var == zw2Var2 && !z) {
                ci4Var.t(yw2Var);
            }
        }
        if (zw2Var == zw2Var2) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!py.u((dx2) list.get(i2))) {
                    return;
                }
            }
            ci4Var.h = jx2.c;
            lx2Var.h = false;
        }
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ((yn1) nf2Var).c.c(wx1Var);
    }

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return ((jx1) nf2Var).d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, yb2.c, zb2.c, 1), wm0.b(0, i, 7)).getWidth();
    }

    @Override // defpackage.ya1
    public final void Q(wa1 wa1Var) {
        nf2 nf2Var = this.c;
        po1.b("applyFocusProperties called on wrong node");
        nf2Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ga1
    public final void U(cb1 cb1Var) {
        nf2 nf2Var = this.c;
        po1.b("onFocusEvent called on wrong node");
        nf2Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.hx2
    public final boolean X() {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ((lx2) nf2Var).l.getClass();
        return true;
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ((lo2) nf2Var).a(wl2Var);
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ue3 ue3VarL0 = ((ve3) nf2Var).l0();
        gf3Var.getClass();
        ue3 ue3Var = (ue3) gf3Var;
        fi2 fi2Var = ue3Var.c;
        if (ue3VarL0.h) {
            ue3Var.h = true;
        }
        if (ue3VarL0.l) {
            ue3Var.l = true;
        }
        fi2 fi2Var2 = ue3VarL0.c;
        Object[] objArr = fi2Var2.b;
        Object[] objArr2 = fi2Var2.c;
        long[] jArr = fi2Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ff3 ff3Var = (ff3) obj;
                        if (!fi2Var.b(ff3Var)) {
                            fi2Var.l(ff3Var, obj2);
                        } else if (obj2 instanceof z0) {
                            Object objG = fi2Var.g(ff3Var);
                            objG.getClass();
                            z0 z0Var = (z0) objG;
                            String str = z0Var.a;
                            if (str == null) {
                                str = ((z0) obj2).a;
                            }
                            se1 se1Var = z0Var.b;
                            if (se1Var == null) {
                                se1Var = ((z0) obj2).b;
                            }
                            fi2Var.l(ff3Var, new z0(str, se1Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.qy
    public final long b() {
        return y64.W(y64.K(this, Uuid.SIZE_BITS).h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [of2] */
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
    @Override // defpackage.rf2, defpackage.sf2
    public final Object c(p13 p13Var) {
        yd ydVar;
        this.h.add(p13Var);
        if (!getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 parent$ui_release = getNode().getParent$ui_release();
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

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return ((jx1) nf2Var).d(xb2Var, qb2Var, j);
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return ((jx1) nf2Var).d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, yb2.d, zb2.c, 1), wm0.b(0, i, 7)).getWidth();
    }

    @Override // defpackage.qy
    public final wu0 getDensity() {
        return y64.M(this).G;
    }

    @Override // defpackage.qy
    public final dx1 getLayoutDirection() {
        return y64.M(this).H;
    }

    @Override // defpackage.hx2
    public final void h0() {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ci4 ci4Var = ((lx2) nf2Var).l;
        jx2 jx2Var = (jx2) ci4Var.h;
        lx2 lx2Var = (lx2) ci4Var.l;
        if (jx2Var == jx2.d) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            kx2 kx2Var = new kx2(lx2Var, 1);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            kx2Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            ci4Var.h = jx2.c;
            lx2Var.h = false;
        }
    }

    @Override // defpackage.rf2
    public final gm4 i() {
        kr krVar = this.d;
        return krVar != null ? krVar : b31.r;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return ((jx1) nf2Var).d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, yb2.d, zb2.d, 1), wm0.b(i, 0, 13)).getHeight();
    }

    @Override // defpackage.ax1
    public final void n(cx1 cx1Var) {
    }

    @Override // defpackage.gt2
    public final Object n0(Object obj) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return (kz3) nf2Var;
    }

    @Override // defpackage.rz0
    public final void o0() {
        kr1.O(this);
    }

    @Override // defpackage.of2
    public final void onAttach() {
        v0(true);
    }

    @Override // defpackage.iu0
    public final void onDensityChange() {
        if (this.c instanceof lx2) {
            h0();
        }
    }

    @Override // defpackage.of2
    public final void onDetach() {
        w0();
    }

    @Override // defpackage.hx2
    public final void p0() {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        ((lx2) nf2Var).l.getClass();
    }

    @Override // defpackage.ax1
    public final void q(long j) {
    }

    public final String toString() {
        return this.c.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    public final void v0(boolean z) {
        es3 es3Var;
        if (!isAttached()) {
            po1.b("initializeModifier called on unattached node");
        }
        nf2 nf2Var = this.c;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (nf2Var instanceof pf2) {
                sideEffect(new lr(this, 0));
            }
            if (nf2Var instanceof sp1) {
                sp1 sp1Var = (sp1) nf2Var;
                kr krVar = this.d;
                if (krVar != null) {
                    p13 p13Var = fh4.a;
                    if (krVar.n(p13Var)) {
                        krVar.r = sp1Var;
                        qf2 modifierLocalManager = y64.N(this).getModifierLocalManager();
                        modifierLocalManager.b.c(this);
                        modifierLocalManager.c.c(p13Var);
                        modifierLocalManager.a();
                    } else {
                        kr krVar2 = new kr();
                        krVar2.r = sp1Var;
                        this.d = krVar2;
                        es3Var = (es3) y64.M(this).N.e;
                        es3Var.getClass();
                        if (es3Var.c) {
                            qf2 modifierLocalManager2 = y64.N(this).getModifierLocalManager();
                            p13 p13Var2 = fh4.a;
                            modifierLocalManager2.b.c(this);
                            modifierLocalManager2.c.c(p13Var2);
                            modifierLocalManager2.a();
                        }
                    }
                } else {
                    kr krVar3 = new kr();
                    krVar3.r = sp1Var;
                    this.d = krVar3;
                    es3Var = (es3) y64.M(this).N.e;
                    es3Var.getClass();
                    if (es3Var.c) {
                        qf2 modifierLocalManager3 = y64.N(this).getModifierLocalManager();
                        p13 p13Var3 = fh4.a;
                        modifierLocalManager3.b.c(this);
                        modifierLocalManager3.c.c(p13Var3);
                        modifierLocalManager3.a();
                    }
                }
            }
        }
        if ((getKindSet$ui_release() & 4) != 0 && !z) {
            y64.K(this, 2).W0();
        }
        if ((getKindSet$ui_release() & 2) != 0) {
            es3 es3Var2 = (es3) y64.M(this).N.e;
            es3Var2.getClass();
            if (es3Var2.c) {
                wl2 coordinator$ui_release = getCoordinator$ui_release();
                coordinator$ui_release.getClass();
                ((nx1) coordinator$ui_release).o1(this);
                wr2 wr2Var = coordinator$ui_release.N;
                if (wr2Var != null) {
                    wr2Var.invalidate();
                }
            }
            if (!z) {
                y64.K(this, 2).W0();
                y64.M(this).C();
            }
        }
        if (nf2Var instanceof uz1) {
            uz1 uz1Var = (uz1) nf2Var;
            ux1 ux1VarM = y64.M(this);
            switch (uz1Var.c) {
                case 0:
                    ((wz1) uz1Var.d).j = ux1VarM;
                    break;
                default:
                    ((g22) uz1Var.d).j = ux1VarM;
                    break;
            }
        }
        getKindSet$ui_release();
        if ((getKindSet$ui_release() & FontInfo.NUMBER_OF_CHAR_CODES) != 0 && (nf2Var instanceof lo2)) {
            es3 es3Var3 = (es3) y64.M(this).N.e;
            es3Var3.getClass();
            if (es3Var3.c) {
                y64.M(this).C();
            }
        }
        if ((getKindSet$ui_release() & 16) != 0 && (nf2Var instanceof lx2)) {
            ((lx2) nf2Var).l.d = getCoordinator$ui_release();
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            y64.N(this).onSemanticsChange();
        }
    }

    public final void w0() {
        if (!isAttached()) {
            po1.b("unInitializeModifier called on unattached node");
        }
        nf2 nf2Var = this.c;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (nf2Var instanceof sp1) {
                qf2 modifierLocalManager = y64.N(this).getModifierLocalManager();
                p13 p13Var = fh4.a;
                modifierLocalManager.d.c(y64.M(this));
                modifierLocalManager.e.c(p13Var);
                modifierLocalManager.a();
            }
            if (nf2Var instanceof pf2) {
                ((pf2) nf2Var).g(nr.a);
            }
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            y64.N(this).onSemanticsChange();
        }
    }

    public final void x0() {
        if (isAttached()) {
            this.h.clear();
            y64.N(this).getSnapshotObserver().a(this, v1.D, new lr(this, 1));
        }
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        nf2 nf2Var = this.c;
        nf2Var.getClass();
        return ((jx1) nf2Var).d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, yb2.c, zb2.d, 1), wm0.b(i, 0, 13)).getHeight();
    }
}
