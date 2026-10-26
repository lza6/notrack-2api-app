package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class lg4 extends ng4 {
    public final WindowInsets.Builder c;

    public lg4() {
        this.c = kg4.b();
    }

    public lg4(wg4 wg4Var) {
        super(wg4Var);
        WindowInsets windowInsetsB = wg4Var.b();
        this.c = windowInsetsB != null ? kg4.c(windowInsetsB) : kg4.b();
    }

    @Override // defpackage.ng4
    public wg4 b() {
        a();
        wg4 wg4VarC = wg4.c(this.c.build(), null);
        wg4VarC.a.r(this.b);
        return wg4VarC;
    }

    @Override // defpackage.ng4
    public void d(pp1 pp1Var) {
        this.c.setMandatorySystemGestureInsets(pp1Var.d());
    }

    @Override // defpackage.ng4
    public void e(pp1 pp1Var) {
        this.c.setStableInsets(pp1Var.d());
    }

    @Override // defpackage.ng4
    public void f(pp1 pp1Var) {
        this.c.setSystemGestureInsets(pp1Var.d());
    }

    @Override // defpackage.ng4
    public void g(pp1 pp1Var) {
        this.c.setSystemWindowInsets(pp1Var.d());
    }

    @Override // defpackage.ng4
    public void h(pp1 pp1Var) {
        this.c.setTappableElementInsets(pp1Var.d());
    }
}
