package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class nt0 implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ ot0 b;

    public nt0(om3 om3Var, ViewGroup viewGroup, ot0 ot0Var) {
        this.a = viewGroup;
        this.b = ot0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.a;
        viewGroup.post(new ba(viewGroup, 6, this.b));
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (nd1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
