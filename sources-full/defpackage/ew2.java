package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements aw2 {
    public static final ew2 a = new ew2();

    @Override // defpackage.aw2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.aw2
    public final zv2 b(View view, boolean z, long j, float f, float f2, boolean z2, wu0 wu0Var, float f3) {
        if (z) {
            return new dw2(new Magnifier(view));
        }
        long jC0 = wu0Var.c0(j);
        float fW = wu0Var.w(f);
        float fW2 = wu0Var.w(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jC0 != 9205357640488583168L) {
            builder.setSize(gb2.R(Float.intBitsToFloat((int) (jC0 >> 32))), gb2.R(Float.intBitsToFloat((int) (jC0 & 4294967295L))));
        }
        if (!Float.isNaN(fW)) {
            builder.setCornerRadius(fW);
        }
        if (!Float.isNaN(fW2)) {
            builder.setElevation(fW2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new dw2(builder.build());
    }
}
