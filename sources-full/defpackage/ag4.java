package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ag4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ig4 a;
    public final /* synthetic */ wg4 b;
    public final /* synthetic */ wg4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ag4(ig4 ig4Var, wg4 wg4Var, wg4 wg4Var2, int i, View view) {
        this.a = ig4Var;
        this.b = wg4Var;
        this.c = wg4Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ig4 ig4Var = this.a;
        hg4 hg4Var = ig4Var.a;
        hg4Var.c(animatedFraction);
        float fB = hg4Var.b();
        PathInterpolator pathInterpolator = dg4.d;
        int i = Build.VERSION.SDK_INT;
        wg4 wg4Var = this.b;
        ng4 mg4Var = i >= 30 ? new mg4(wg4Var) : i >= 29 ? new lg4(wg4Var) : new jg4(wg4Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            int i3 = this.d & i2;
            tg4 tg4Var = wg4Var.a;
            if (i3 == 0) {
                mg4Var.c(i2, tg4Var.g(i2));
            } else {
                pp1 pp1VarG = tg4Var.g(i2);
                pp1 pp1VarG2 = this.c.a.g(i2);
                float f = 1.0f - fB;
                mg4Var.c(i2, wg4.a(pp1VarG, (int) (((double) ((pp1VarG.a - pp1VarG2.a) * f)) + 0.5d), (int) (((double) ((pp1VarG.b - pp1VarG2.b) * f)) + 0.5d), (int) (((double) ((pp1VarG.c - pp1VarG2.c) * f)) + 0.5d), (int) (((double) ((pp1VarG.d - pp1VarG2.d) * f)) + 0.5d)));
            }
        }
        dg4.f(this.e, mg4Var.b(), Collections.singletonList(ig4Var));
    }
}
