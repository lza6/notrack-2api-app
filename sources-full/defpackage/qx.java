package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx extends of2 implements ix, ax1 {
    public jn0 c;
    public boolean d;

    public static final h43 v0(qx qxVar, wl2 wl2Var, c9 c9Var) {
        h43 h43Var;
        if (qxVar.isAttached() && qxVar.d) {
            wl2 wl2VarL = y64.L(qxVar);
            if (!wl2Var.z()) {
                wl2Var = null;
            }
            if (wl2Var != null && (h43Var = (h43) c9Var.invoke()) != null) {
                return h43Var.j(wl2VarL.G(wl2Var, false).e());
            }
        }
        return null;
    }

    @Override // defpackage.ix
    public final Object bringIntoView(cx1 cx1Var, je1 je1Var, so0 so0Var) {
        wl2 wl2Var = (wl2) cx1Var;
        c9 c9Var = (c9) je1Var;
        Object objQ = yo4.q(new px(this, wl2Var, c9Var, new oh(this, wl2Var, c9Var, 1), null), so0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.ax1
    public final void n(cx1 cx1Var) {
        this.d = true;
    }
}
