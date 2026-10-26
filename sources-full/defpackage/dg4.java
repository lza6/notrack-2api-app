package defpackage;

import ai.notrack.app.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dg4 extends hg4 {
    public static final PathInterpolator d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final l61 e = new l61();
    public static final DecelerateInterpolator f = new DecelerateInterpolator();

    public static void d(ig4 ig4Var, View view) {
        be0 be0VarH = h(view);
        if (be0VarH != null) {
            be0VarH.k(ig4Var);
            if (be0VarH.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(ig4Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void e(View view, ig4 ig4Var, WindowInsets windowInsets, boolean z) {
        be0 be0VarH = h(view);
        if (be0VarH != null) {
            be0VarH.d = windowInsets;
            if (!z) {
                be0VarH.l();
                z = be0VarH.c == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), ig4Var, windowInsets, z);
            }
        }
    }

    public static void f(View view, wg4 wg4Var, List list) {
        be0 be0VarH = h(view);
        if (be0VarH != null) {
            wg4Var = be0VarH.m(wg4Var);
            if (be0VarH.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), wg4Var, list);
            }
        }
    }

    public static void g(View view, ig4 ig4Var, mi4 mi4Var) {
        be0 be0VarH = h(view);
        if (be0VarH != null) {
            be0VarH.n(mi4Var);
            if (be0VarH.c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ig4Var, mi4Var);
            }
        }
    }

    public static be0 h(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof cg4) {
            return ((cg4) tag).a;
        }
        return null;
    }
}
