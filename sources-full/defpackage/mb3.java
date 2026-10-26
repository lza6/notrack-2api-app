package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb3 {
    public static c a(c cVar, rb3 rb3Var, boolean z) {
        return a.k(cVar, rb3Var, z ? nq2.c : nq2.d, true, false, null, rb3Var.c, true, null).then(new ScrollingLayoutElement(rb3Var, z));
    }

    public static final rb3 rememberScrollState(int i, ck0 ck0Var, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        fp1 fp1Var = rb3.i;
        if ((((i2 & 14) ^ 6) <= 4 || !((kk0) ck0Var).f(i)) && (i2 & 6) != 4) {
            z = false;
        }
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new lb3(i);
            kk0Var.l0(objP);
        }
        return (rb3) d53.rememberSaveable(objArr, (x93) fp1Var, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
    }
}
