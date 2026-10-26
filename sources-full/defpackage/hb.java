package defpackage;

import ai.notrack.app.R;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class hb implements eg1 {
    public static boolean d = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public ed4 c;

    public hb(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // defpackage.eg1
    public final void a(gg1 gg1Var) {
        synchronized (this.b) {
            if (!gg1Var.s) {
                gg1Var.s = true;
                gg1Var.b();
            }
        }
    }

    @Override // defpackage.eg1
    public final gg1 b() {
        ng1 ng1Var;
        a jg1Var;
        gg1 gg1Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                long uniqueDrawingId = i >= 29 ? androidComposeView.getUniqueDrawingId() : -1L;
                if (i >= 29) {
                    jg1Var = new lg1(uniqueDrawingId);
                } else {
                    if (d) {
                        try {
                            jg1Var = new jg1(this.a, uniqueDrawingId, new b10(), new a10());
                        } catch (Throwable unused) {
                            d = false;
                            ng1Var = new ng1(c(this.a), uniqueDrawingId);
                            jg1Var = ng1Var;
                        }
                    } else {
                        ng1Var = new ng1(c(this.a), uniqueDrawingId);
                    }
                    jg1Var = ng1Var;
                }
                gg1Var = new gg1(jg1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gg1Var;
    }

    public final qz0 c(AndroidComposeView androidComposeView) {
        ed4 ed4Var = this.c;
        if (ed4Var != null) {
            return ed4Var;
        }
        ed4 ed4Var2 = new ed4(androidComposeView.getContext());
        ed4Var2.setClipChildren(false);
        ed4Var2.setClipToPadding(false);
        ed4Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(ed4Var2);
        this.c = ed4Var2;
        return ed4Var2;
    }
}
