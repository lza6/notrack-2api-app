package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class ad1 extends AnimationSet implements Runnable {
    public final ViewGroup c;
    public boolean d;
    public boolean h;
    public boolean l;

    public ad1(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.l = true;
        this.c = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.l = true;
        if (this.d) {
            return !this.h;
        }
        if (!super.getTransformation(j, transformation)) {
            this.d = true;
            so2.a(this.c, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.l = true;
        if (this.d) {
            return !this.h;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.d = true;
            so2.a(this.c, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.d;
        ViewGroup viewGroup = this.c;
        if (z || !this.l) {
            viewGroup.endViewTransition(null);
            this.h = true;
        } else {
            this.l = false;
            viewGroup.post(this);
        }
    }
}
