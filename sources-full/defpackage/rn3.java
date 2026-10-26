package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class rn3 implements gs0 {
    public final kf3 a;

    public rn3(kf3 kf3Var) {
        this.a = kf3Var;
    }

    @Override // defpackage.gs0
    public final is0 a(xl3 xl3Var, jq2 jq2Var) {
        ImageDecoder.Source sourceD0;
        Bitmap.Config configA = sm1.a(jq2Var);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceD0 = p23.d0(xl3Var.a, jq2Var, false)) != null) {
            return new ev(sourceD0, xl3Var.a, jq2Var, this.a);
        }
        return null;
    }
}
