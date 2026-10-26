package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class na4 extends Animatable2.AnimationCallback {
    public final /* synthetic */ je1 a;
    public final /* synthetic */ je1 b;

    public na4(je1 je1Var, je1 je1Var2) {
        this.a = je1Var;
        this.b = je1Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        je1 je1Var = this.b;
        if (je1Var != null) {
            je1Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        je1 je1Var = this.a;
        if (je1Var != null) {
            je1Var.invoke();
        }
    }
}
