package defpackage;

import ai.notrack.app.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class sc4 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static wg4 b(View view, wg4 wg4Var, Rect rect) {
        WindowInsets windowInsetsB = wg4Var.b();
        if (windowInsetsB != null) {
            return wg4.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return wg4Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static void e(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void f(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void g(View view, float f) {
        view.setElevation(f);
    }

    public static void h(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void i(View view, wn2 wn2Var) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, wn2Var);
        }
        if (wn2Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new rc4(view, wn2Var));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
