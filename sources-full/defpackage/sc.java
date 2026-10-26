package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class sc extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rx2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(rx2 rx2Var, int i) {
        super(1);
        this.c = i;
        this.d = rx2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        rx2 rx2Var = this.d;
        switch (i) {
            case 0:
                cx1 cx1VarJ = ((cx1) obj).j();
                cx1VarJ.getClass();
                rx2Var.e(cx1VarJ);
                break;
            case 1:
                rx2Var.m1806x4a670db2(new qq1(((qq1) obj).a));
                rx2Var.g();
                break;
            default:
                je1 je1Var = (je1) obj;
                Handler handler = rx2Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = rx2Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new k4(je1Var, 3));
                    }
                } else {
                    je1Var.invoke();
                }
                break;
        }
        return w84Var;
    }
}
