package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends AbstractComposeView implements vv0, wn2 {
    public final Window c;
    public final ft2 d;
    public boolean h;
    public boolean l;
    public boolean m;
    public boolean n;

    public tv0(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.c = window;
        this.d = cl3.d(bh0.a);
        WeakHashMap weakHashMap = zc4.a;
        sc4.i(this, this);
        zc4.j(this, new ee(this, 1));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1735448596);
        fq2.w(0, (ne1) this.d.getValue(), kk0Var, false);
    }

    @Override // defpackage.wn2
    public final wg4 f(View view, wg4 wg4Var) {
        if (!this.l) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return wg4Var.a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return wg4Var;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }

    @Override // defpackage.vv0
    public final Window getWindow() {
        return this.c;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int i, int i2) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.c;
        int i3 = (mode != Integer.MIN_VALUE || this.h || this.l || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.h || this.l || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
