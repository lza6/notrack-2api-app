package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class yd implements fn1 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public yd(gj gjVar, c cVar, fy2 fy2Var, le1 le1Var, br0 br0Var, az3 az3Var, je1 je1Var, ViewConfiguration viewConfiguration) {
        this.c = cVar;
        this.d = fy2Var;
        this.e = le1Var;
        this.f = br0Var;
        this.g = az3Var;
        this.h = je1Var;
        this.i = viewConfiguration;
        this.b = gjVar;
    }

    public yd(ux1 ux1Var) {
        this.b = ux1Var;
        xo1 xo1Var = new xo1(ux1Var);
        this.c = xo1Var;
        this.d = xo1Var;
        es3 es3Var = xo1Var.T;
        this.e = es3Var;
        this.f = es3Var;
    }

    public static final void c(yd ydVar, of2 of2Var, wl2 wl2Var) {
        for (of2 parent$ui_release = of2Var.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == rl2.a) {
                ux1 ux1VarT = ((ux1) ydVar.b).t();
                wl2Var.v = ux1VarT != null ? (xo1) ux1VarT.N.c : null;
                ydVar.d = wl2Var;
                return;
            } else {
                if ((parent$ui_release.getKindSet$ui_release() & 2) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(wl2Var);
            }
        }
    }

    public static of2 d(nf2 nf2Var, of2 of2Var) {
        of2 of2VarCreate;
        if (nf2Var instanceof tf2) {
            of2VarCreate = ((tf2) nf2Var).create();
            of2VarCreate.setKindSet$ui_release(xl2.g(of2VarCreate));
        } else {
            mr mrVar = new mr();
            mrVar.setKindSet$ui_release(xl2.e(nf2Var));
            mrVar.c = nf2Var;
            mrVar.h = new HashSet();
            of2VarCreate = mrVar;
        }
        if (of2VarCreate.isAttached()) {
            po1.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        of2VarCreate.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        of2 child$ui_release = of2Var.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(of2VarCreate);
            of2VarCreate.setChild$ui_release(child$ui_release);
        }
        of2Var.setChild$ui_release(of2VarCreate);
        of2VarCreate.setParent$ui_release(of2Var);
        return of2VarCreate;
    }

    public static of2 e(of2 of2Var) {
        if (of2Var.isAttached()) {
            rh2 rh2Var = xl2.a;
            if (!of2Var.isAttached()) {
                po1.b("autoInvalidateRemovedNode called on unattached node");
            }
            xl2.b(of2Var, -1, 2);
            of2Var.runDetachLifecycle$ui_release();
            of2Var.markAsDetached$ui_release();
        }
        of2 child$ui_release = of2Var.getChild$ui_release();
        of2 parent$ui_release = of2Var.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            of2Var.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            of2Var.setParent$ui_release(null);
        }
        parent$ui_release.getClass();
        return parent$ui_release;
    }

    public static void l(nf2 nf2Var, nf2 nf2Var2, of2 of2Var) {
        if ((nf2Var instanceof tf2) && (nf2Var2 instanceof tf2)) {
            ql2 ql2Var = rl2.a;
            of2Var.getClass();
            ((tf2) nf2Var2).update(of2Var);
            if (of2Var.isAttached()) {
                xl2.d(of2Var);
                return;
            } else {
                of2Var.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(of2Var instanceof mr)) {
            po1.b("Unknown Modifier.Node type");
            return;
        }
        mr mrVar = (mr) of2Var;
        if (mrVar.isAttached()) {
            mrVar.w0();
        }
        mrVar.c = nf2Var2;
        mrVar.setKindSet$ui_release(xl2.e(nf2Var2));
        if (mrVar.isAttached()) {
            mrVar.v0(false);
        }
        if (of2Var.isAttached()) {
            xl2.d(of2Var);
        } else {
            of2Var.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    @Override // defpackage.fn1
    public long a(long j) {
        return ((c) ((gj) this.b).c).e(j);
    }

    @Override // defpackage.fn1
    public long b(long j) {
        return ((c) ((gj) this.b).c).f(j);
    }

    public void f(le1 le1Var) {
        gj gjVar = (gj) this.b;
        gjVar.b++;
        ((oi2) gjVar.d).c(le1Var);
        gjVar.g();
    }

    public boolean g(int i) {
        return (((of2) this.f).getAggregateChildKindSet$ui_release() & i) != 0;
    }

    public void h() {
        wl2 wl2Var = (wl2) this.d;
        xo1 xo1Var = (xo1) this.c;
        while (wl2Var != xo1Var) {
            wl2Var.Z0();
            wl2Var = wl2Var.u;
            wl2Var.getClass();
        }
        xo1Var.Z0();
        for (of2 child$ui_release = (of2) this.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.runAttachLifecycle$ui_release();
            if (child$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                xl2.a(child$ui_release);
            }
            if (child$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                xl2.d(child$ui_release);
            }
            child$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            child$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public void i() {
        for (of2 parent$ui_release = (es3) this.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release.isAttached()) {
                parent$ui_release.runDetachLifecycle$ui_release();
            }
        }
        wl2 wl2Var = (xo1) this.c;
        wl2 wl2Var2 = (wl2) this.d;
        while (wl2Var != wl2Var2) {
            wr2 wr2Var = wl2Var.N;
            if (wr2Var != null) {
                wr2Var.destroy();
            }
            wl2Var.N = null;
            wl2Var = wl2Var.v;
            wl2Var.getClass();
        }
        wr2 wr2Var2 = wl2Var2.N;
        if (wr2Var2 != null) {
            wr2Var2.destroy();
        }
        wl2Var2.N = null;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void j(int r32, defpackage.oi2 r33, defpackage.oi2 r34, defpackage.of2 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd.j(int, oi2, oi2, of2, boolean):void");
    }

    public void k() {
        nx1 nx1Var;
        wr2 wr2Var;
        ux1 ux1Var = (ux1) this.b;
        wl2 wl2Var = (xo1) this.c;
        for (of2 parent$ui_release = ((es3) this.e).getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            lx1 lx1VarI = y64.i(parent$ui_release);
            if (lx1VarI != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    wl2 coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    coordinator$ui_release.getClass();
                    nx1Var = (nx1) coordinator$ui_release;
                    lx1 lx1Var = nx1Var.T;
                    nx1Var.o1(lx1VarI);
                    if (lx1Var != parent$ui_release && (wr2Var = nx1Var.N) != null) {
                        wr2Var.invalidate();
                    }
                } else {
                    nx1Var = new nx1(ux1Var, lx1VarI);
                    parent$ui_release.updateCoordinator$ui_release(nx1Var);
                }
                wl2Var.v = nx1Var;
                nx1Var.u = wl2Var;
                wl2Var = nx1Var;
            } else {
                parent$ui_release.updateCoordinator$ui_release(wl2Var);
            }
        }
        ux1 ux1VarT = ux1Var.t();
        wl2Var.v = ux1VarT != null ? (xo1) ux1VarT.N.c : null;
        this.d = wl2Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                of2 child$ui_release = (of2) this.f;
                es3 es3Var = (es3) this.e;
                if (child$ui_release == es3Var) {
                    sb.append("]");
                } else {
                    while (child$ui_release != null && child$ui_release != es3Var) {
                        sb.append(String.valueOf(child$ui_release));
                        if (child$ui_release.getChild$ui_release() == es3Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            child$ui_release = child$ui_release.getChild$ui_release();
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
