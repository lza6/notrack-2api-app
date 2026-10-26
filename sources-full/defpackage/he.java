package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class he implements vb2 {
    public final /* synthetic */ bd4 a;
    public final /* synthetic */ ux1 b;

    public he(bd4 bd4Var, ux1 ux1Var) {
        this.a = bd4Var;
        this.b = ux1Var;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        bd4 bd4Var = this.a;
        ViewGroup.LayoutParams layoutParams = bd4Var.getLayoutParams();
        layoutParams.getClass();
        bd4Var.measure(me.l(bd4Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bd4Var.getMeasuredHeight();
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bd4 bd4Var = this.a;
        ViewGroup.LayoutParams layoutParams = bd4Var.getLayoutParams();
        layoutParams.getClass();
        bd4Var.measure(iMakeMeasureSpec, me.l(bd4Var, 0, i, layoutParams.height));
        return bd4Var.getMeasuredWidth();
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        bd4 bd4Var = this.a;
        int childCount = bd4Var.getChildCount();
        a31 a31Var = a31.c;
        if (childCount == 0) {
            return xb2Var.s(um0.j(j), um0.i(j), a31Var, v1.s);
        }
        if (um0.j(j) != 0) {
            bd4Var.getChildAt(0).setMinimumWidth(um0.j(j));
        }
        if (um0.i(j) != 0) {
            bd4Var.getChildAt(0).setMinimumHeight(um0.i(j));
        }
        int iJ = um0.j(j);
        int iH = um0.h(j);
        ViewGroup.LayoutParams layoutParams = bd4Var.getLayoutParams();
        layoutParams.getClass();
        int iL = me.l(bd4Var, iJ, iH, layoutParams.width);
        int i = um0.i(j);
        int iG = um0.g(j);
        ViewGroup.LayoutParams layoutParams2 = bd4Var.getLayoutParams();
        layoutParams2.getClass();
        bd4Var.measure(iL, me.l(bd4Var, i, iG, layoutParams2.height));
        return xb2Var.s(bd4Var.getMeasuredWidth(), bd4Var.getMeasuredHeight(), a31Var, new fe(bd4Var, this.b, 1));
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        bd4 bd4Var = this.a;
        ViewGroup.LayoutParams layoutParams = bd4Var.getLayoutParams();
        layoutParams.getClass();
        bd4Var.measure(me.l(bd4Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bd4Var.getMeasuredHeight();
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        bd4 bd4Var = this.a;
        ViewGroup.LayoutParams layoutParams = bd4Var.getLayoutParams();
        layoutParams.getClass();
        bd4Var.measure(iMakeMeasureSpec, me.l(bd4Var, 0, i, layoutParams.height));
        return bd4Var.getMeasuredWidth();
    }
}
