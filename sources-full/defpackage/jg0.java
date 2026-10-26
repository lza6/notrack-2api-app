package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg0 implements k32 {
    public final /* synthetic */ go2 c;
    public final /* synthetic */ qg0 d;

    public /* synthetic */ jg0(go2 go2Var, qg0 qg0Var) {
        this.c = go2Var;
        this.d = qg0Var;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        if (f32Var == f32.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = kg0.a.a(this.d);
            onBackInvokedDispatcherA.getClass();
            go2 go2Var = this.c;
            go2Var.e = onBackInvokedDispatcherA;
            go2Var.d(go2Var.g);
        }
    }
}
