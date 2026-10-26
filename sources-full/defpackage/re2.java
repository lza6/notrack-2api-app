package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class re2 extends AbstractComposeView implements vv0 {
    public final Window c;
    public final boolean d;
    public final je1 h;
    public final ue l;
    public final gq0 m;
    public final ft2 n;
    public Object o;
    public boolean p;

    public re2(Context context, Window window, boolean z, je1 je1Var, ue ueVar, gq0 gq0Var) {
        super(context, null, 0, 6, null);
        this.c = window;
        this.d = z;
        this.h = je1Var;
        this.l = ueVar;
        this.m = gq0Var;
        this.n = cl3.d(fj0.b);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(576708319);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && kk0Var.F()) {
            kk0Var.V();
        } else {
            ((ne1) this.n.getValue()).invoke(kk0Var, 0);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uw(i, i3, this));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }

    @Override // defpackage.vv0
    public final Window getWindow() {
        return this.c;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.d || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.o == null) {
            je1 je1Var = this.h;
            this.o = i >= 34 ? i1.k(qe2.a(je1Var, this.l, this.m)) : me2.a(je1Var);
        }
        me2.b(this, this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            me2.c(this, this.o);
        }
        this.o = null;
    }
}
