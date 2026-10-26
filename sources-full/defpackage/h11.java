package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class h11 {
    public static final int a = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final int b = Color.argb(Uuid.SIZE_BITS, 27, 27, 27);

    public static void a(qg0 qg0Var) {
        yh4 j11Var;
        ba3 ba3Var = ba3.J;
        cr3 cr3Var = new cr3(0, 0, ba3Var);
        cr3 cr3Var2 = new cr3(a, b, ba3Var);
        View decorView = qg0Var.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) ba3Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) ba3Var.invoke(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            j11Var = new m11();
        } else if (i >= 29) {
            j11Var = new l11();
        } else if (i >= 28) {
            j11Var = new k11();
        } else {
            j11Var = i >= 26 ? new j11() : new i11();
        }
        yh4 yh4Var = j11Var;
        Window window = qg0Var.getWindow();
        window.getClass();
        yh4Var.X(cr3Var, cr3Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = qg0Var.getWindow();
        window2.getClass();
        yh4Var.l(window2);
    }
}
