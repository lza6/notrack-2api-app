package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class bg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ig4 a;
    public final /* synthetic */ View b;

    public bg4(ig4 ig4Var, View view) {
        this.a = ig4Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ig4 ig4Var = this.a;
        ig4Var.a.c(1.0f);
        dg4.d(ig4Var, this.b);
    }
}
