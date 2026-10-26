package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zg0 {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final boolean b(v33 v33Var, w33 w33Var) {
        if (v33Var == null) {
            return true;
        }
        if (!(v33Var instanceof w33)) {
            return false;
        }
        w33 w33Var2 = (w33) v33Var;
        return !w33Var2.getValid() || v33Var == w33Var || kr1.n(w33Var2.getAnchor(), w33Var.getAnchor());
    }

    public static final wg0 rememberComposableLambda(int i, boolean z, Object obj, ck0 ck0Var, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new yg0(i, obj, z);
            kk0Var.l0(objP);
        }
        yg0 yg0Var = (yg0) objP;
        if (!kr1.n(yg0Var.h, obj)) {
            boolean z2 = yg0Var.h == null;
            yg0Var.h = obj;
            if (!z2 && yg0Var.d) {
                w33 w33Var = yg0Var.l;
                if (w33Var != null) {
                    w33Var.invalidate();
                    yg0Var.l = null;
                }
                ArrayList arrayList = yg0Var.m;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((v33) arrayList.get(i3)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
        return yg0Var;
    }
}
