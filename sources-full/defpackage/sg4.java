package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class sg4 extends rg4 {
    public static final wg4 q = wg4.c(WindowInsets.CONSUMED, null);

    public sg4(wg4 wg4Var, WindowInsets windowInsets) {
        super(wg4Var, windowInsets);
    }

    public sg4(wg4 wg4Var, sg4 sg4Var) {
        super(wg4Var, sg4Var);
    }

    @Override // defpackage.og4, defpackage.tg4
    public final void d(View view) {
    }

    @Override // defpackage.og4, defpackage.tg4
    public pp1 g(int i) {
        return pp1.c(this.c.getInsets(vg4.a(i)));
    }

    @Override // defpackage.og4, defpackage.tg4
    public pp1 h(int i) {
        return pp1.c(this.c.getInsetsIgnoringVisibility(vg4.a(i)));
    }

    @Override // defpackage.og4, defpackage.tg4
    public boolean q(int i) {
        return this.c.isVisible(vg4.a(i));
    }
}
