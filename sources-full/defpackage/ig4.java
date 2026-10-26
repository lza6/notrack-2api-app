package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ig4 {
    public hg4 a;

    public ig4(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new gg4(g1.j(i, interpolator, j));
        } else {
            this.a = new dg4(interpolator, j);
        }
    }
}
