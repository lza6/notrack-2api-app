package defpackage;

import androidx.compose.ui.input.pointer.a;
import java.util.List;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi1 extends of2 implements i64, hx2, wk0 {
    public vx0 c;
    public nc d;
    public boolean h;

    public wi1(nc ncVar, vx0 vx0Var) {
        this.c = vx0Var;
        this.d = ncVar;
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        if (zw2Var == zw2.d) {
            List list = yw2Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (y0(((dx2) list.get(i)).i)) {
                    int i2 = yw2Var.d;
                    if (i2 == 4) {
                        this.h = true;
                        x0();
                        return;
                    } else {
                        if (i2 == 5) {
                            z0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.hx2
    public final void h0() {
        z0();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        z0();
        super.onDetach();
    }

    @Override // defpackage.hx2
    public final long p() {
        if (this.c == null) {
            return x44.a;
        }
        wu0 wu0Var = y64.M(this).G;
        int i = x44.b;
        return Headers$Companion.pack$ui_release(wu0Var.O(10.0f), wu0Var.O(40.0f), wu0Var.O(10.0f), wu0Var.O(40.0f));
    }

    public final void v0() {
        nc ncVar;
        q43 q43Var = new q43();
        gb2.a0(this, new lb4(q43Var));
        wi1 wi1Var = (wi1) q43Var.c;
        if (wi1Var == null || (ncVar = wi1Var.d) == null) {
            ncVar = this.d;
        }
        w0(ncVar);
    }

    public abstract void w0(a aVar);

    public final void x0() {
        l43 l43Var = new l43();
        l43Var.c = true;
        gb2.b0(this, new ed0(l43Var, 1));
        if (l43Var.c) {
            v0();
        }
    }

    public abstract boolean y0(int i);

    public final void z0() {
        w84 w84Var;
        if (this.h) {
            this.h = false;
            if (isAttached()) {
                q43 q43Var = new q43();
                gb2.a0(this, new r91(2, q43Var));
                wi1 wi1Var = (wi1) q43Var.c;
                if (wi1Var != null) {
                    wi1Var.v0();
                    w84Var = w84.a;
                } else {
                    w84Var = null;
                }
                if (w84Var == null) {
                    w0(null);
                }
            }
        }
    }
}
