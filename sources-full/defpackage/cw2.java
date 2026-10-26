package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class cw2 implements aw2 {
    public static final cw2 a = new cw2();

    @Override // defpackage.aw2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.aw2
    public final zv2 b(View view, boolean z, long j, float f, float f2, boolean z2, wu0 wu0Var, float f3) {
        return new bw2(new Magnifier(view));
    }
}
