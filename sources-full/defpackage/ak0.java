package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ym3) obj).c(null);
                break;
            case 1:
                xw3 xw3Var = (xw3) obj;
                if (xw3Var != null) {
                    z22 z22Var = xw3Var.d;
                    if (z22Var != null) {
                        z22Var.e(jz3.b);
                    }
                    z22 z22Var2 = xw3Var.d;
                    if (z22Var2 != null) {
                        z22Var2.f(jz3.b);
                        break;
                    }
                }
                break;
            default:
                c cVar = (c) obj;
                ay3 ay3Var = cVar.a;
                ay3Var.b.a().f();
                zt3 zt3Var = ay3Var.b;
                zt3Var.o = null;
                cVar.l(zt3Var);
                ay3.a(ay3Var, true, wu3.c);
                break;
        }
    }
}
