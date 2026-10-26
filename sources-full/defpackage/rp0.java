package defpackage;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ tp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp0(tp0 tp0Var, int i) {
        super(0);
        this.c = i;
        this.d = tp0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        SoftwareKeyboardController softwareKeyboardController;
        int i = this.c;
        w84 w84Var = w84.a;
        tp0 tp0Var = this.d;
        switch (i) {
            case 0:
                y64.J(tp0Var);
                return w84Var;
            case 1:
                tp0Var.r.d();
                return Boolean.TRUE;
            case 2:
                tp0Var.r.m();
                return Boolean.TRUE;
            case 3:
                tp0Var.m.w.invoke(new en1(tp0Var.s.e));
                return Boolean.TRUE;
            case 4:
                z22 z22Var = tp0Var.m;
                za1 za1Var = tp0Var.t;
                boolean z = tp0Var.n;
                if (!z22Var.b()) {
                    za1.b(za1Var);
                } else if (!z && (softwareKeyboardController = z22Var.c) != null) {
                    softwareKeyboardController.show();
                }
                return Boolean.TRUE;
            case 5:
                tp0Var.r.f(true);
                return Boolean.TRUE;
            case 6:
                tp0Var.r.b(true);
                return Boolean.TRUE;
            default:
                y64.J(tp0Var);
                return w84Var;
        }
    }
}
