package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class a01 {
    public static final ly1 a = yo4.H(q22.d, new lg(20));

    public static final ms2 rememberDrawablePainter(Drawable drawable, ck0 ck0Var, int i) {
        Object zz0Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1756822313);
        kk0Var.a0(289266787);
        boolean zH = kk0Var.h(drawable);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            if (drawable == null) {
                objP = c31.n;
            } else {
                if (drawable instanceof ColorDrawable) {
                    zz0Var = new we0(gb2.b(((ColorDrawable) drawable).getColor()));
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    zz0Var = new zz0(drawableMutate);
                }
                objP = zz0Var;
            }
            kk0Var.l0(objP);
        }
        ms2 ms2Var = (ms2) objP;
        kk0Var.r(false);
        kk0Var.r(false);
        return ms2Var;
    }
}
