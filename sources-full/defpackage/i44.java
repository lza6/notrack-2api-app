package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i44 implements nd2 {
    public hc2 c;
    public mc2 d;
    public final /* synthetic */ Toolbar h;

    public i44(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.nd2
    public final void b(hc2 hc2Var, boolean z) {
    }

    @Override // defpackage.nd2
    public final boolean c(mc2 mc2Var) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.q;
        if (callback instanceof ge0) {
            ((oc2) ((ge0) callback)).c.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.q);
        toolbar.removeView(toolbar.p);
        toolbar.q = null;
        ArrayList arrayList = toolbar.M;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.d = null;
        toolbar.requestLayout();
        mc2Var.C = false;
        mc2Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.nd2
    public final boolean e(mc2 mc2Var) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.p.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.p);
            }
            toolbar.addView(toolbar.p);
        }
        View actionView = mc2Var.getActionView();
        toolbar.q = actionView;
        this.d = mc2Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.q);
            }
            j44 j44VarH = Toolbar.h();
            j44VarH.a = (toolbar.v & 112) | 8388611;
            j44VarH.b = 2;
            toolbar.q.setLayoutParams(j44VarH);
            toolbar.addView(toolbar.q);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((j44) childAt.getLayoutParams()).b != 2 && childAt != toolbar.c) {
                toolbar.removeViewAt(childCount);
                toolbar.M.add(childAt);
            }
        }
        toolbar.requestLayout();
        mc2Var.C = true;
        mc2Var.n.p(false);
        KeyEvent.Callback callback = toolbar.q;
        if (callback instanceof ge0) {
            ((oc2) ((ge0) callback)).c.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.nd2
    public final void f() {
        if (this.d != null) {
            hc2 hc2Var = this.c;
            if (hc2Var != null) {
                int size = hc2Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.c.getItem(i) == this.d) {
                        return;
                    }
                }
            }
            c(this.d);
        }
    }

    @Override // defpackage.nd2
    public final void h(Context context, hc2 hc2Var) {
        mc2 mc2Var;
        hc2 hc2Var2 = this.c;
        if (hc2Var2 != null && (mc2Var = this.d) != null) {
            hc2Var2.d(mc2Var);
        }
        this.c = hc2Var;
    }

    @Override // defpackage.nd2
    public final boolean i(ep3 ep3Var) {
        return false;
    }

    @Override // defpackage.nd2
    public final boolean j() {
        return false;
    }
}
