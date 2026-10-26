package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class wj extends j62 implements yj {
    public CharSequence J;
    public tj K;
    public final Rect L;
    public int M;
    public final /* synthetic */ zj N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(zj zjVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.N = zjVar;
        this.L = new Rect();
        this.w = zjVar;
        this.F = true;
        this.G.setFocusable(true);
        this.x = new uj(this);
    }

    @Override // defpackage.yj
    public final void d(CharSequence charSequence) {
        this.J = charSequence;
    }

    @Override // defpackage.yj
    public final void j(int i) {
        this.M = i;
    }

    @Override // defpackage.yj
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        jj jjVar = this.G;
        boolean zIsShowing = jjVar.isShowing();
        r();
        jjVar.setInputMethodMode(2);
        show();
        p01 p01Var = this.h;
        p01Var.setChoiceMode(1);
        p01Var.setTextDirection(i);
        p01Var.setTextAlignment(i2);
        zj zjVar = this.N;
        int selectedItemPosition = zjVar.getSelectedItemPosition();
        p01 p01Var2 = this.h;
        if (jjVar.isShowing() && p01Var2 != null) {
            p01Var2.setListSelectionHidden(false);
            p01Var2.setSelection(selectedItemPosition);
            if (p01Var2.getChoiceMode() != 0) {
                p01Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = zjVar.getViewTreeObserver()) == null) {
            return;
        }
        qj qjVar = new qj(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(qjVar);
        jjVar.setOnDismissListener(new vj(this, qjVar));
    }

    @Override // defpackage.yj
    public final CharSequence n() {
        return this.J;
    }

    @Override // defpackage.j62, defpackage.yj
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.K = (tj) listAdapter;
    }

    public final void r() {
        int i;
        jj jjVar = this.G;
        Drawable background = jjVar.getBackground();
        zj zjVar = this.N;
        Rect rect = zjVar.p;
        if (background != null) {
            background.getPadding(rect);
            boolean z = yd4.a;
            i = zjVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = zjVar.getPaddingLeft();
        int paddingRight = zjVar.getPaddingRight();
        int width = zjVar.getWidth();
        int i2 = zjVar.o;
        if (i2 == -2) {
            int iA = zjVar.a(this.K, jjVar.getBackground());
            int i3 = (zjVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = yd4.a;
        this.n = zjVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.m) - this.M) + i : paddingLeft + this.M + i;
    }
}
