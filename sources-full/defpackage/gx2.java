package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class gx2 {
    public final ux1 a;
    public final fi1 b;
    public final sz0 c = new sz0(23);
    public final ii1 d = new ii1();
    public boolean e;

    public gx2(ux1 ux1Var) {
        this.a = ux1Var;
        this.b = new fi1((xo1) ux1Var.N.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(fp1 fp1Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        Object[] objArr;
        fi1 fi1Var;
        int i2;
        ii1 ii1Var = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            cr1 cr1VarV = this.c.v(fp1Var, androidComposeView);
            j82 j82Var = (j82) cr1VarV.b;
            int iE = j82Var.e();
            while (true) {
                if (i >= iE) {
                    objArr = true;
                    break;
                }
                dx2 dx2Var = (dx2) j82Var.f(i);
                i = (dx2Var.d || dx2Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iE2 = j82Var.e();
            int i3 = 0;
            while (true) {
                fi1Var = this.b;
                if (i3 >= iE2) {
                    break;
                }
                dx2 dx2Var2 = (dx2) j82Var.f(i3);
                if (objArr != false || py.s(dx2Var2)) {
                    this.a.y(dx2Var2.c, this.d, dx2Var2.i, true);
                    if (!ii1Var.c.d()) {
                        fi1Var.a(dx2Var2.a, ii1Var, py.s(dx2Var2));
                        ii1Var.clear();
                    }
                }
                i3++;
            }
            boolean zB = fi1Var.b(cr1VarV, z);
            if (cr1VarV.a) {
                i2 = 0;
            } else {
                int iE3 = j82Var.e();
                for (int i4 = 0; i4 < iE3; i4++) {
                    dx2 dx2Var3 = (dx2) j82Var.f(i4);
                    if (!ln2.c(py.L(dx2Var3, true), 0L) && dx2Var3.b()) {
                        i2 = 1;
                    }
                }
                i2 = 0;
            }
            return (zB ? 1 : 0) | (i2 << 1);
        } finally {
            this.e = false;
        }
    }
}
