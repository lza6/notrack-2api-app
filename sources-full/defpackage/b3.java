package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class b3 extends sc1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ View s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.s = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(f3 f3Var, f3 f3Var2) {
        super(f3Var2);
        this.s = f3Var;
    }

    @Override // defpackage.sc1
    public final mh3 b() {
        d3 d3Var;
        int i = this.r;
        View view = this.s;
        switch (i) {
            case 0:
                c3 c3Var = ((ActionMenuItemView) view).u;
                if (c3Var == null || (d3Var = ((e3) c3Var).a.B) == null) {
                    return null;
                }
                return d3Var.a();
            default:
                d3 d3Var2 = ((f3) view).l.A;
                if (d3Var2 == null) {
                    return null;
                }
                return d3Var2.a();
        }
    }

    @Override // defpackage.sc1
    public final boolean c() {
        mh3 mh3VarB;
        int i = this.r;
        View view = this.s;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                gc2 gc2Var = actionMenuItemView.s;
                return gc2Var != null && gc2Var.a(actionMenuItemView.p) && (mh3VarB = b()) != null && mh3VarB.a();
            default:
                ((f3) view).l.l();
                return true;
        }
    }

    @Override // defpackage.sc1
    public boolean d() {
        switch (this.r) {
            case 1:
                g3 g3Var = ((f3) this.s).l;
                if (g3Var.C != null) {
                    return false;
                }
                g3Var.g();
                return true;
            default:
                return super.d();
        }
    }
}
