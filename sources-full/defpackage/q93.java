package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q93 implements k32 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q93(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.k32
    public final void onStateChanged(n32 n32Var, f32 f32Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                t93 t93Var = (t93) obj;
                t93Var.getClass();
                if (f32Var == f32.ON_START) {
                    t93Var.f = true;
                } else if (f32Var == f32.ON_STOP) {
                    t93Var.f = false;
                }
                break;
            default:
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1((AbstractComposeView) obj, n32Var, f32Var);
                break;
        }
    }
}
