package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class fd2 {
    public final Context a;
    public final hc2 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public md2 h;
    public dd2 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final ed2 k = new ed2(this);

    public fd2(Context context, hc2 hc2Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = hc2Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final dd2 a() {
        dd2 an3Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                an3Var = new h20(context2, this.e, this.d, this.c);
            } else {
                an3Var = new an3(context2, this.b, this.e, this.d, this.c);
            }
            an3Var.k(this.b);
            an3Var.q(this.k);
            an3Var.m(this.e);
            an3Var.d(this.h);
            an3Var.n(this.g);
            an3Var.o(this.f);
            this.i = an3Var;
        }
        return this.i;
    }

    public final boolean b() {
        dd2 dd2Var = this.i;
        return dd2Var != null && dd2Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        dd2 dd2VarA = a();
        dd2VarA.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            dd2VarA.p(i);
            dd2VarA.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dd2VarA.c = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        dd2VarA.show();
    }
}
