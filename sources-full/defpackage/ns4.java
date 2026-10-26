package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ns4 extends ks4 {
    @Override // defpackage.ks4
    public final void i(Bundle bundle) {
        super.i(bundle);
        int i = bundle.getInt("error.code", -2);
        us3 us3Var = this.f;
        if (i != 0) {
            us3Var.a(new wp1(bundle.getInt("error.code", -2)));
        } else {
            us3Var.b(null);
        }
    }
}
