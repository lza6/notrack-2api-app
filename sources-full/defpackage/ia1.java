package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ia1 extends of2 implements ya1, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View c;
    public ViewTreeObserver d;
    public final ha1 h = new ha1(this, 0);
    public final ha1 l = new ha1(this, 1);

    @Override // defpackage.ya1
    public final void Q(wa1 wa1Var) {
        wa1Var.d(false);
        wa1Var.b(this.h);
        wa1Var.a(this.l);
    }

    @Override // defpackage.of2
    public final void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = yh4.P(this).getViewTreeObserver();
        this.d = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.of2
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.d = null;
        yh4.P(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.c = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (y64.M(this).v == null) {
            return;
        }
        View viewK = vl0.k(this);
        qa1 focusOwner = y64.N(this).getFocusOwner();
        yr2 yr2VarN = y64.N(this);
        boolean z = (view == null || view.equals(yr2VarN) || !vl0.i(viewK, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(yr2VarN) || !vl0.i(viewK, view2)) ? false : true;
        if (z && z2) {
            this.c = view2;
            return;
        }
        if (z2) {
            this.c = view2;
            db1 db1VarV0 = v0();
            if (db1VarV0.x0().a()) {
                return;
            }
            kr1.b0(db1VarV0);
            return;
        }
        if (!z) {
            this.c = null;
            return;
        }
        this.c = null;
        if (v0().x0().b()) {
            ((va1) focusOwner).b(8, false, false);
        }
    }

    public final db1 v0() {
        if (!getNode().isAttached()) {
            po1.b("visitLocalDescendants called on an unattached node");
        }
        of2 node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & 1024) != 0) {
            boolean z = false;
            for (of2 child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & 1024) != 0) {
                    of2 of2VarE = child$ui_release;
                    oi2 oi2Var = null;
                    while (of2VarE != null) {
                        if (of2VarE instanceof db1) {
                            db1 db1Var = (db1) of2VarE;
                            if (z) {
                                return db1Var;
                            }
                            z = true;
                        } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                            int i = 0;
                            for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        of2VarE = child$ui_release2;
                                    } else {
                                        if (oi2Var == null) {
                                            oi2Var = new oi2(0, new of2[16]);
                                        }
                                        if (of2VarE != null) {
                                            oi2Var.c(of2VarE);
                                            of2VarE = null;
                                        }
                                        oi2Var.c(child$ui_release2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        of2VarE = y64.e(oi2Var);
                    }
                }
            }
        }
        u41.r("Could not find focus target of embedded view wrapper");
        return null;
    }
}
