package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.cb4;
import defpackage.ch4;
import defpackage.ck0;
import defpackage.kk0;
import defpackage.le1;
import defpackage.r11;
import defpackage.se;
import defpackage.sg2;
import defpackage.up1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsHolder$Companion {
    public static final se access$systemInsets(int i, String str) {
        WindowInsetsHolder$Companion windowInsetsHolder$Companion = ch4.x;
        return new se(i, str);
    }

    public static final cb4 access$valueInsetsIgnoringVisibility(int i, String str) {
        WindowInsetsHolder$Companion windowInsetsHolder$Companion = ch4.x;
        return new cb4(new up1(0, 0, 0, 0), str);
    }

    public final ch4 current(ck0 ck0Var, int i) {
        ch4 ch4Var;
        kk0 kk0Var = (kk0) ck0Var;
        View view = (View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView());
        WeakHashMap weakHashMap = ch4.y;
        synchronized (weakHashMap) {
            try {
                Object ch4Var2 = weakHashMap.get(view);
                if (ch4Var2 == null) {
                    ch4Var2 = new ch4(view);
                    weakHashMap.put(view, ch4Var2);
                }
                ch4Var = (ch4) ch4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zJ = kk0Var.j(ch4Var) | kk0Var.j(view);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new sg2(ch4Var, 26, view);
            kk0Var.l0(objP);
        }
        r11.DisposableEffect(ch4Var, (le1) objP, kk0Var, 0);
        return ch4Var;
    }
}
