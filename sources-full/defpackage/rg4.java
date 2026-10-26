package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class rg4 extends qg4 {
    public pp1 n;
    public pp1 o;
    public pp1 p;

    public rg4(wg4 wg4Var, WindowInsets windowInsets) {
        super(wg4Var, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public rg4(wg4 wg4Var, rg4 rg4Var) {
        super(wg4Var, rg4Var);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.tg4
    public pp1 i() {
        if (this.o == null) {
            this.o = pp1.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.tg4
    public pp1 k() {
        if (this.n == null) {
            this.n = pp1.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.tg4
    public pp1 m() {
        if (this.p == null) {
            this.p = pp1.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.og4, defpackage.tg4
    public wg4 n(int i, int i2, int i3, int i4) {
        return wg4.c(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.pg4, defpackage.tg4
    public void u(pp1 pp1Var) {
    }
}
