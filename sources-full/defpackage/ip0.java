package defpackage;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class ip0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z22 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip0(z22 z22Var, int i) {
        super(1);
        this.c = i;
        this.d = z22Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        le1 le1Var;
        w84 w84Var;
        SoftwareKeyboardController softwareKeyboardController;
        int i = this.c;
        w84 w84Var2 = w84.a;
        z22 z22Var = this.d;
        switch (i) {
            case 0:
                cx1 cx1Var = (cx1) obj;
                yy3 yy3VarD = z22Var.d();
                if (yy3VarD != null) {
                    yy3VarD.c = cx1Var;
                }
                return w84Var2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                z22Var.q.setValue(bool);
                return w84Var2;
            case 2:
                int i2 = ((en1) obj).a;
                uv1 uv1Var = z22Var.r;
                uv1Var.getClass();
                if (i2 == 7) {
                    le1Var = uv1Var.a().a;
                } else {
                    if (i2 == 2 || i2 == 6 || i2 == 5 || i2 == 3 || i2 == 4) {
                        uv1Var.a();
                    } else if (i2 != 1 && i2 != 0) {
                        u41.r("invalid ImeAction");
                        return null;
                    }
                    le1Var = null;
                }
                if (le1Var != null) {
                    le1Var.invoke(uv1Var);
                    w84Var = w84Var2;
                } else {
                    w84Var = null;
                }
                if (w84Var == null) {
                    if (i2 == 6) {
                        pa1 pa1Var = uv1Var.c;
                        if (pa1Var == null) {
                            kr1.n0("focusManager");
                            throw null;
                        }
                        ((va1) pa1Var).f(1);
                    } else if (i2 == 5) {
                        pa1 pa1Var2 = uv1Var.c;
                        if (pa1Var2 == null) {
                            kr1.n0("focusManager");
                            throw null;
                        }
                        ((va1) pa1Var2).f(2);
                    } else if (i2 == 7 && (softwareKeyboardController = uv1Var.a) != null) {
                        softwareKeyboardController.hide();
                    }
                }
                return w84Var2;
            default:
                ey3 ey3Var = (ey3) obj;
                String str = ey3Var.a.d;
                ft2 ft2Var = z22Var.t;
                hg hgVar = z22Var.j;
                if (!kr1.n(str, hgVar != null ? hgVar.d : null)) {
                    z22Var.k.setValue(ch1.c);
                    if (((Boolean) ft2Var.getValue()).booleanValue()) {
                        ft2Var.setValue(Boolean.FALSE);
                    } else {
                        z22Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = jz3.b;
                z22Var.f(j);
                z22Var.e(j);
                z22Var.u.invoke(ey3Var);
                z22Var.b.invalidate();
                return w84Var2;
        }
    }
}
