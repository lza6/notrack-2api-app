package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class gg4 extends hg4 {
    public final WindowInsetsAnimation d;

    public gg4(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.d = windowInsetsAnimation;
    }

    @Override // defpackage.hg4
    public final long a() {
        return this.d.getDurationMillis();
    }

    @Override // defpackage.hg4
    public final float b() {
        return this.d.getInterpolatedFraction();
    }

    @Override // defpackage.hg4
    public final void c(float f) {
        this.d.setFraction(f);
    }
}
