package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f20 implements Runnable {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public f20(View view, ig4 ig4Var, mi4 mi4Var, ValueAnimator valueAnimator) {
        this.d = view;
        this.h = ig4Var;
        this.l = mi4Var;
        this.m = valueAnimator;
    }

    public f20(jb jbVar, g20 g20Var, mc2 mc2Var, hc2 hc2Var) {
        this.m = jbVar;
        this.d = g20Var;
        this.h = mc2Var;
        this.l = hc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                h20 h20Var = (h20) ((jb) obj).d;
                mc2 mc2Var = (mc2) obj3;
                g20 g20Var = (g20) obj4;
                if (g20Var != null) {
                    h20Var.H = true;
                    g20Var.b.c(false);
                    h20Var.H = false;
                }
                if (mc2Var.isEnabled() && mc2Var.hasSubMenu()) {
                    ((hc2) obj2).q(mc2Var, null, 4);
                    break;
                }
                break;
            default:
                dg4.g((View) obj4, (ig4) obj3, (mi4) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }
}
