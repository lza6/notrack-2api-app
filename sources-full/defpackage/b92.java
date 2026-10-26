package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b92 {
    public static final ff3 a = new ff3("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static c b(Modifier$Companion modifier$Companion, le1 le1Var, le1 le1Var2, aw2 aw2Var) {
        return a() ? new MagnifierElement(le1Var, le1Var2, aw2Var) : modifier$Companion;
    }
}
