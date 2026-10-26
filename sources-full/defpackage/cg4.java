package defpackage;

import ai.notrack.app.R;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cg4 implements View.OnApplyWindowInsetsListener {
    public final be0 a;
    public wg4 b;

    public cg4(View view, be0 be0Var) {
        wg4 wg4VarB;
        this.a = be0Var;
        WeakHashMap weakHashMap = zc4.a;
        wg4 wg4VarA = tc4.a(view);
        if (wg4VarA != null) {
            int i = Build.VERSION.SDK_INT;
            wg4VarB = (i >= 30 ? new mg4(wg4VarA) : i >= 29 ? new lg4(wg4VarA) : new jg4(wg4VarA)).b();
        } else {
            wg4VarB = null;
        }
        this.b = wg4VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = wg4.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        wg4 wg4VarC = wg4.c(windowInsets, view);
        tg4 tg4Var = wg4VarC.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = zc4.a;
            this.b = tc4.a(view);
        }
        if (this.b == null) {
            this.b = wg4VarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            be0 be0VarH = dg4.h(view);
            if (be0VarH == null || !Objects.equals((WindowInsets) be0VarH.d, windowInsets)) {
                wg4 wg4Var = this.b;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!tg4Var.g(i2).equals(wg4Var.a.g(i2))) {
                        i |= i2;
                    }
                }
                if (i != 0) {
                    wg4 wg4Var2 = this.b;
                    ig4 ig4Var = new ig4(i, (i & 8) != 0 ? tg4Var.g(8).d > wg4Var2.a.g(8).d ? dg4.d : dg4.e : dg4.f, 160L);
                    ig4Var.a.c(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ig4Var.a.a());
                    pp1 pp1VarG = tg4Var.g(i);
                    pp1 pp1VarG2 = wg4Var2.a.g(i);
                    int iMin = Math.min(pp1VarG.a, pp1VarG2.a);
                    int i3 = pp1VarG.b;
                    int i4 = pp1VarG2.b;
                    int iMin2 = Math.min(i3, i4);
                    int i5 = pp1VarG.c;
                    int i6 = pp1VarG2.c;
                    int iMin3 = Math.min(i5, i6);
                    int i7 = pp1VarG.d;
                    int i8 = i;
                    int i9 = pp1VarG2.d;
                    mi4 mi4Var = new mi4(pp1.b(iMin, iMin2, iMin3, Math.min(i7, i9)), 11, pp1.b(Math.max(pp1VarG.a, pp1VarG2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                    dg4.e(view, ig4Var, windowInsets, false);
                    duration.addUpdateListener(new ag4(ig4Var, wg4VarC, wg4Var2, i8, view));
                    duration.addListener(new bg4(ig4Var, view));
                    so2.a(view, new f20(view, ig4Var, mi4Var, duration));
                    this.b = wg4VarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
