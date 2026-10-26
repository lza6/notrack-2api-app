package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg4 {
    public float a;
    public final Interpolator b;
    public final long c;

    public hg4(Interpolator interpolator, long j) {
        this.b = interpolator;
        this.c = j;
    }

    public long a() {
        return this.c;
    }

    public float b() {
        float f = this.a;
        Interpolator interpolator = this.b;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public void c(float f) {
        this.a = f;
    }
}
