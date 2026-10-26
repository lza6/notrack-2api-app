package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class jc {
    public final PathMeasure a;

    public jc(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, ic icVar) {
        if (icVar == null) {
            j93.k("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, icVar.a, true);
        }
    }
}
