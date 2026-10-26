package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jd2 extends j62 implements lc2 {
    public static final Method K;
    public jb J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.lc2
    public final void f(hc2 hc2Var, MenuItem menuItem) {
        jb jbVar = this.J;
        if (jbVar != null) {
            jbVar.f(hc2Var, menuItem);
        }
    }

    @Override // defpackage.lc2
    public final void h(hc2 hc2Var, mc2 mc2Var) {
        jb jbVar = this.J;
        if (jbVar != null) {
            jbVar.h(hc2Var, mc2Var);
        }
    }

    @Override // defpackage.j62
    public final p01 p(Context context, boolean z) {
        id2 id2Var = new id2(context, z);
        id2Var.setHoverListener(this);
        return id2Var;
    }
}
