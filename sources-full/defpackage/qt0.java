package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class qt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rt0 c;

    public qt0(ViewGroup viewGroup, boolean z, om3 om3Var, rt0 rt0Var) {
        this.a = viewGroup;
        this.b = z;
        this.c = rt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(null);
        if (!this.b) {
            throw null;
        }
        throw null;
    }
}
