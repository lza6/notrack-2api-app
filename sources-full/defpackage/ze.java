package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ze implements gs0 {
    public final boolean a;

    public ze() {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.gs0
    public final is0 a(xl3 xl3Var, jq2 jq2Var) {
        ny nyVarD = xl3Var.a.D();
        if (!nyVarD.G(0L, fs0.b) && !nyVarD.G(0L, fs0.a) && (!nyVarD.G(0L, fs0.c) || !nyVarD.G(8L, fs0.d) || !nyVarD.G(12L, fs0.e) || !nyVarD.j(21L) || ((byte) (nyVarD.q().l(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !nyVarD.G(4L, fs0.f)) {
                return null;
            }
            if (!nyVarD.G(8L, fs0.g) && !nyVarD.G(8L, fs0.h) && !nyVarD.G(8L, fs0.i)) {
                return null;
            }
        }
        return new ef(xl3Var.a, jq2Var, this.a);
    }
}
