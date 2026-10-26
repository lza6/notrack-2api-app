package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class pg4 extends og4 {
    public pp1 m;

    public pg4(wg4 wg4Var, WindowInsets windowInsets) {
        super(wg4Var, windowInsets);
        this.m = null;
    }

    public pg4(wg4 wg4Var, pg4 pg4Var) {
        super(wg4Var, pg4Var);
        this.m = null;
        this.m = pg4Var.m;
    }

    @Override // defpackage.tg4
    public wg4 b() {
        return wg4.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.tg4
    public wg4 c() {
        return wg4.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.tg4
    public final pp1 j() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = pp1.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.tg4
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // defpackage.tg4
    public void u(pp1 pp1Var) {
        this.m = pp1Var;
    }
}
