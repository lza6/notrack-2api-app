package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ha1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ia1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha1(ia1 ia1Var, int i) {
        super(1);
        this.c = i;
        this.d = ia1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        ia1 ia1Var = this.d;
        switch (i) {
            case 0:
                n00 n00Var = (n00) obj;
                View viewK = vl0.k(ia1Var);
                if (!viewK.isFocused() && !viewK.hasFocus()) {
                    if (!xr0.p0(viewK, xr0.u0(n00Var.a), vl0.j(y64.N(ia1Var).getFocusOwner(), yh4.P(ia1Var), viewK))) {
                        n00Var.b = true;
                    }
                }
                return w84Var;
            default:
                n00 n00Var2 = (n00) obj;
                View viewK2 = vl0.k(ia1Var);
                if (!viewK2.hasFocus()) {
                    return w84Var;
                }
                qa1 focusOwner = y64.N(ia1Var).getFocusOwner();
                View viewP = yh4.P(ia1Var);
                if (viewK2 instanceof ViewGroup) {
                    Rect rectJ = vl0.j(focusOwner, viewP, viewK2);
                    Integer numU0 = xr0.u0(n00Var2.a);
                    int iIntValue = numU0 != null ? numU0.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = ia1Var.c;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewP, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewP, rectJ, iIntValue);
                    if (viewFindNextFocus != null && vl0.i(viewK2, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectJ);
                        n00Var2.b = true;
                        return w84Var;
                    }
                    if (viewP.requestFocus()) {
                        return w84Var;
                    }
                    u41.r("host view did not take focus");
                } else {
                    if (viewP.requestFocus()) {
                        return w84Var;
                    }
                    u41.r("host view did not take focus");
                }
                return null;
        }
    }
}
