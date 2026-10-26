package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends fd2 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ g3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(g3 g3Var, Context context, ep3 ep3Var, View view) {
        super(context, ep3Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = g3Var;
        if ((ep3Var.A.x & 32) != 32) {
            View view2 = g3Var.q;
            this.e = view2 == null ? (View) g3Var.p : view2;
        }
        jb jbVar = g3Var.E;
        this.h = jbVar;
        dd2 dd2Var = this.i;
        if (dd2Var != null) {
            dd2Var.d(jbVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(g3 g3Var, Context context, hc2 hc2Var, View view) {
        super(context, hc2Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = g3Var;
        this.f = 8388613;
        jb jbVar = g3Var.E;
        this.h = jbVar;
        dd2 dd2Var = this.i;
        if (dd2Var != null) {
            dd2Var.d(jbVar);
        }
    }

    @Override // defpackage.fd2
    public final void c() {
        int i = this.l;
        g3 g3Var = this.m;
        switch (i) {
            case 0:
                g3Var.B = null;
                super.c();
                break;
            default:
                hc2 hc2Var = g3Var.h;
                if (hc2Var != null) {
                    hc2Var.c(true);
                }
                g3Var.A = null;
                super.c();
                break;
        }
    }
}
