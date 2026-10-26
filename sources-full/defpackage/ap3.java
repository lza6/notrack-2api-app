package defpackage;

import androidx.compose.foundation.text.handwriting.a;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ap3 extends ju0 implements hx2, ga1, ab1 {
    public je1 h;
    public boolean l;
    public final sq3 m;

    public ap3(je1 je1Var) {
        this.h = je1Var;
        q qVar = new q(3, this);
        yw2 yw2Var = oq3.a;
        sq3 sq3Var = new sq3(null, null, null, qVar);
        v0(sq3Var);
        this.m = sq3Var;
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        this.m.D(yw2Var, zw2Var, j);
    }

    @Override // defpackage.ga1
    public final void U(cb1 cb1Var) {
        this.l = cb1Var.b();
    }

    @Override // defpackage.hx2
    public final void h0() {
        this.m.h0();
    }

    @Override // defpackage.hx2
    public final long p() {
        wu0 wu0Var = y64.M(this).G;
        a.a.getClass();
        int i = x44.b;
        return Headers$Companion.pack$ui_release(wu0Var.O(10.0f), wu0Var.O(40.0f), wu0Var.O(10.0f), wu0Var.O(40.0f));
    }
}
