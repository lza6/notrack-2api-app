package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class j11 extends yh4 {
    @Override // defpackage.yh4
    public void X(cr3 cr3Var, cr3 cr3Var2, Window window, View view, boolean z, boolean z2) {
        bh4 yg4Var;
        cr3Var.getClass();
        cr3Var2.getClass();
        window.getClass();
        view.getClass();
        im4.a(window, false);
        window.setStatusBarColor(z ? cr3Var.b : cr3Var.a);
        window.setNavigationBarColor(z2 ? cr3Var2.b : cr3Var2.a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            yg4Var = new ah4(window);
        } else if (i >= 30) {
            yg4Var = new zg4(window);
        } else {
            yg4Var = i >= 26 ? new yg4(window) : new xg4(window);
        }
        yg4Var.b(!z);
        yg4Var.a(!z2);
    }
}
